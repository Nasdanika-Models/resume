import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.resume.util.ResumeEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.resume {
	exports org.nasdanika.models.resume;
	exports org.nasdanika.models.resume.impl;
	exports org.nasdanika.models.resume.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.capability;
	requires org.nasdanika.emf; // For generation
	
	opens org.nasdanika.models.resume.util;
	
	provides CapabilityFactory with 
		ResumeEPackageResourceSetCapabilityFactory;
}