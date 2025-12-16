package org.nasdanika.models.resume.tests;

import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Section;
import org.nasdanika.common.Transformer;
import org.nasdanika.emf.JsonSchemaEcoreFactory;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLPage;
import org.nasdanika.html.Tag;
import org.nasdanika.models.resume.Resume;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import com.vladsch.flexmark.pdf.converter.PdfConverterExtension;

public class ResumeTests {
		
	@Test
	@Disabled("Anonymous types not supported yet")
	public void testGenerateModel() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
	
		File ecoreFile = new File("model/resume.ecore").getCanonicalFile();
		Resource ecoreResource = resourceSet.getResource(URI.createFileURI(ecoreFile.getAbsolutePath()), true);
		EPackage ePackage = (EPackage) ecoreResource.getContents().get(0);
		ePackage.getEClassifiers().clear();
		
		try (InputStream in = new FileInputStream(new File("schema.json"))) {
			JSONObject schema = new JSONObject(new JSONTokener(in));
			JSONObject defs = schema.getJSONObject("$defs");
			
			JsonSchemaEcoreFactory factory = new JsonSchemaEcoreFactory(ePackage, defs, new File("doc"));
			Transformer<String, EClassifier> transformer = new Transformer<>(factory);
			Map<String, EClassifier> eClassifiers = transformer.transform(defs.keySet(), false, progressMonitor);
			System.out.println(eClassifiers.size());			
		}
		
		ecoreResource.save(null);
	}	
		
	@Test
	public void testLoadModelFromJSON() throws Exception {
		InputStream sampeResumeStream = getClass().getResourceAsStream("sample.resume.json");
		JSONObject jResume = DefaultConverter.INSTANCE.toJSONObject(sampeResumeStream);
		Resume resume = Resume.create(jResume);	
		
		System.out.println(resume.getBasics().getSummary());
		
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		// Saving for manual inspection
		URI xmiURI = URI.createFileURI(new File("../docs/demos/sample.resume.xml").getAbsolutePath());
		Resource xmiResource = resourceSet.createResource(xmiURI);
		xmiResource.getContents().add(resume);
		xmiResource.save(null);		
	}	
		
	@Test
	public void testSaveToJSON() throws Exception {
		InputStream sampeResumeStream = getClass().getResourceAsStream("sample.resume.json");
		JSONObject jResume = DefaultConverter.INSTANCE.toJSONObject(sampeResumeStream);
		Resume resume = Resume.create(jResume);	
		
		System.out.println(resume.getBasics().getSummary());
		
		JSONObject saved = resume.toJSON();		
		System.out.println(saved.toString(2));
		
		assertEquals(jResume, saved);
	}
	
    private void assertEquals(JSONObject obj1, JSONObject obj2) {
        if (obj1 == obj2) {
        	return;
        }
        if (obj1 == null || obj2 == null) {
        	fail("One of the objects is null while the other is not");
        }
        
        Assertions.assertEquals(obj1.keySet(), obj2.keySet());

        for (String key : obj1.keySet()) {
            Object val1 = obj1.get(key);
            Object val2 = obj2.get(key);

            if (val1 instanceof JSONObject && val2 instanceof JSONObject) {
                assertEquals((JSONObject) val1, (JSONObject) val2);
            } else if (val1 instanceof JSONArray && val2 instanceof JSONArray) {
                assertEquals((JSONArray) val1, (JSONArray) val2);
            } else {
            	Assertions.assertEquals(val1, val2);
            }
        }
    }

    private void assertEquals(JSONArray arr1, JSONArray arr2) {
        Assertions.assertEquals(arr1.length(), arr2.length());
        for (int i = 0; i < arr1.length(); i++) {
            Object val1 = arr1.get(i);
            Object val2 = arr2.get(i);

            if (val1 instanceof JSONObject && val2 instanceof JSONObject) {
                assertEquals((JSONObject) val1, (JSONObject) val2);
            } else if (val1 instanceof JSONArray && val2 instanceof JSONArray) {
                assertEquals((JSONArray) val1, (JSONArray) val2);
            } else {
            	Assertions.assertEquals(val1, val2);
            }
        }
    }
    
	@Test
	public void testSection() throws Exception {
		InputStream sampeResumeStream = getClass().getResourceAsStream("sample.resume.json");
		JSONObject jResume = DefaultConverter.INSTANCE.toJSONObject(sampeResumeStream);
		Resume resume = Resume.create(jResume);	
		
		Section section = resume.toSection();
		String html = section.toHtml(1);
		
		HTMLPage htmlPage = HTMLFactory.INSTANCE.page();
		htmlPage.stylesheet("https://cdn.jsdelivr.net/npm/github-markdown-css@5.1.0/github-markdown.min.css");
		Tag contentDiv = HTMLFactory.INSTANCE.div(html).addClass("markdown-body");
		htmlPage.body(contentDiv);		
		File htmlFile = new File("../docs/demos/sample.resume.html").getCanonicalFile();
		Files.writeString(htmlFile.toPath(), htmlPage.toString());
		
//		PdfRendererBuilder pdfBuilder = new PdfRendererBuilder();
//        try (OutputStream os = new FileOutputStream("target/sample.resume.pdf")) {
//			pdfBuilder
//				.useFastMode()
//				.withHtmlContent(html, null)
//				.toStream(null)
//				.run();
//        }
        
        try (FileOutputStream fos = new FileOutputStream("../docs/demos/sample.resume.pdf")) {
            PdfConverterExtension.exportToPdf(fos, html, "", PdfRendererBuilder.TextDirection.LTR);
        }
		
		Desktop.getDesktop().browse(htmlFile.toURI());
	}			       
	
}
