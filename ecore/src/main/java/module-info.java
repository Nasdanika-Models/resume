import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.resume.ecore.ECoreGenResumeProcessorsCapabilityFactory;

module org.nasdanika.models.resume.ecore {
		
	requires transitive org.nasdanika.models.resume;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.resume.ecore;
	opens org.nasdanika.models.resume.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenResumeProcessorsCapabilityFactory; 		
	
}
