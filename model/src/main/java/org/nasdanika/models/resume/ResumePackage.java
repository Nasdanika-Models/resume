/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.resume.ResumeFactory
 * @model kind="package"
 * @generated
 */
public interface ResumePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resume";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/resume";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.resume";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResumePackage eINSTANCE = org.nasdanika.models.resume.impl.ResumePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ModelElementImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = NcorePackage.DOCUMENTED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONTEXT_HELP = NcorePackage.DOCUMENTED__CONTEXT_HELP;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = NcorePackage.DOCUMENTED_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___LOAD__JSONOBJECT = NcorePackage.DOCUMENTED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___LOAD_YAML__STRING = NcorePackage.DOCUMENTED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___LOAD__FUNCTION = NcorePackage.DOCUMENTED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___TO_JSON = NcorePackage.DOCUMENTED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___SAVE__FUNCTION = NcorePackage.DOCUMENTED_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = NcorePackage.DOCUMENTED_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.Named
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.Resource
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ResumeImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__MARKERS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__URIS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__DESCRIPTION = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__UUID = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__LABEL_PROTOTYPE = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Representations</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__REPRESENTATIONS = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__ANNOTATIONS = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Basics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__BASICS = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__WORK = MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__VOLUNTEER = MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Education</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__EDUCATION = MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Awards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__AWARDS = MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__CERTIFICATES = MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Publications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__PUBLICATIONS = MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__SKILLS = MODEL_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__LANGUAGES = MODEL_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Interests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__INTERESTS = MODEL_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__REFERENCES = MODEL_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__PROJECTS = MODEL_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__META = MODEL_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The operation id for the '<em>To Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME___TO_SECTION = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.BasicsImpl <em>Basics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.BasicsImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getBasics()
	 * @generated
	 */
	int BASICS = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__URL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__LOCATION = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__PROFILES = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__LABEL = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__IMAGE = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__EMAIL = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__PHONE = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS__SUMMARY = NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Basics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS_FEATURE_COUNT = NAMED_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Basics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASICS_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.LocationImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSTAL_CODE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY_CODE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REGION = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ProfileImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__DOCUMENTATION = RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__CONTEXT_HELP = RESOURCE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__URL = RESOURCE__URL;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__NETWORK = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__USERNAME = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___LOAD__JSONOBJECT = RESOURCE___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___LOAD_YAML__STRING = RESOURCE___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___LOAD__FUNCTION = RESOURCE___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___TO_JSON = RESOURCE___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE___SAVE__FUNCTION = RESOURCE___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.EngagementImpl <em>Engagement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.EngagementImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEngagement()
	 * @generated
	 */
	int ENGAGEMENT = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__DOCUMENTATION = RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__CONTEXT_HELP = RESOURCE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__URL = RESOURCE__URL;

	/**
	 * The feature id for the '<em><b>Highlights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__HIGHLIGHTS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__SUMMARY = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__START_DATE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__END_DATE = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT__POSITION = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Engagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT___LOAD__JSONOBJECT = RESOURCE___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT___LOAD_YAML__STRING = RESOURCE___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT___LOAD__FUNCTION = RESOURCE___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT___TO_JSON = RESOURCE___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT___SAVE__FUNCTION = RESOURCE___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Engagement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGAGEMENT_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.WorkImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getWork()
	 * @generated
	 */
	int WORK = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__DOCUMENTATION = ENGAGEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__CONTEXT_HELP = ENGAGEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__URL = ENGAGEMENT__URL;

	/**
	 * The feature id for the '<em><b>Highlights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__HIGHLIGHTS = ENGAGEMENT__HIGHLIGHTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__SUMMARY = ENGAGEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__START_DATE = ENGAGEMENT__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__END_DATE = ENGAGEMENT__END_DATE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__POSITION = ENGAGEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__NAME = ENGAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__LOCATION = ENGAGEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__DESCRIPTION = ENGAGEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = ENGAGEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK___LOAD__JSONOBJECT = ENGAGEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK___LOAD_YAML__STRING = ENGAGEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK___LOAD__FUNCTION = ENGAGEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK___TO_JSON = ENGAGEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK___SAVE__FUNCTION = ENGAGEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION_COUNT = ENGAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.VolunteerImpl <em>Volunteer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.VolunteerImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getVolunteer()
	 * @generated
	 */
	int VOLUNTEER = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__DOCUMENTATION = ENGAGEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__CONTEXT_HELP = ENGAGEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__URL = ENGAGEMENT__URL;

	/**
	 * The feature id for the '<em><b>Highlights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__HIGHLIGHTS = ENGAGEMENT__HIGHLIGHTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__SUMMARY = ENGAGEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__START_DATE = ENGAGEMENT__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__END_DATE = ENGAGEMENT__END_DATE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__POSITION = ENGAGEMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__ORGANIZATION = ENGAGEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_FEATURE_COUNT = ENGAGEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER___LOAD__JSONOBJECT = ENGAGEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER___LOAD_YAML__STRING = ENGAGEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER___LOAD__FUNCTION = ENGAGEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER___TO_JSON = ENGAGEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER___SAVE__FUNCTION = ENGAGEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_OPERATION_COUNT = ENGAGEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.EducationImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__DOCUMENTATION = RESOURCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__CONTEXT_HELP = RESOURCE__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__URL = RESOURCE__URL;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__INSTITUTION = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__AREA = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Study Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__STUDY_TYPE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__START_DATE = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__END_DATE = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__SCORE = RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__COURSES = RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION___LOAD__JSONOBJECT = RESOURCE___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION___LOAD_YAML__STRING = RESOURCE___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION___LOAD__FUNCTION = RESOURCE___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION___TO_JSON = RESOURCE___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION___SAVE__FUNCTION = RESOURCE___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.AwardImpl <em>Award</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.AwardImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getAward()
	 * @generated
	 */
	int AWARD = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__TITLE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__DATE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Awarder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__AWARDER = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD__SUMMARY = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.CertificateImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__URL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__DATE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__ISSUER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.PublicationImpl <em>Publication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.PublicationImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getPublication()
	 * @generated
	 */
	int PUBLICATION = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__URL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__PUBLISHER = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__RELEASE_DATE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION__SUMMARY = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.SkillImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__LEVEL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__KEYWORDS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.LanguageImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fluency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__FLUENCY = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.InterestImpl <em>Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.InterestImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__KEYWORDS = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ReferenceImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ProjectImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DOCUMENTATION = NAMED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTEXT_HELP = NAMED__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__URL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Highlights</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HIGHLIGHTS = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KEYWORDS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__START_DATE = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__END_DATE = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ROLES = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ENTITY = NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TYPE = NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___LOAD__JSONOBJECT = NAMED___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___LOAD_YAML__STRING = NAMED___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___LOAD__FUNCTION = NAMED___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___TO_JSON = NAMED___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___SAVE__FUNCTION = NAMED___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.MetaImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getMeta()
	 * @generated
	 */
	int META = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Context Help</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CONTEXT_HELP = MODEL_ELEMENT__CONTEXT_HELP;

	/**
	 * The feature id for the '<em><b>Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__CANONICAL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__VERSION = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__LAST_MODIFIED = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___LOAD__JSONOBJECT = MODEL_ELEMENT___LOAD__JSONOBJECT;

	/**
	 * The operation id for the '<em>Load Yaml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___LOAD_YAML__STRING = MODEL_ELEMENT___LOAD_YAML__STRING;

	/**
	 * The operation id for the '<em>Load</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___LOAD__FUNCTION = MODEL_ELEMENT___LOAD__FUNCTION;

	/**
	 * The operation id for the '<em>To JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___TO_JSON = MODEL_ELEMENT___TO_JSON;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META___SAVE__FUNCTION = MODEL_ELEMENT___SAVE__FUNCTION;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '<em>Function</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Function
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 20;

	/**
	 * The meta object id for the '<em>Consumer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.function.Consumer
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 21;

	/**
	 * The meta object id for the '<em>JSON Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Section</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.common.Section
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 23;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.models.resume.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.ModelElement#load(org.json.JSONObject) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see org.nasdanika.models.resume.ModelElement#load(org.json.JSONObject)
	 * @generated
	 */
	EOperation getModelElement__Load__JSONObject();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.ModelElement#loadYaml(java.lang.String) <em>Load Yaml</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Yaml</em>' operation.
	 * @see org.nasdanika.models.resume.ModelElement#loadYaml(java.lang.String)
	 * @generated
	 */
	EOperation getModelElement__LoadYaml__String();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.ModelElement#load(java.util.function.Function) <em>Load</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load</em>' operation.
	 * @see org.nasdanika.models.resume.ModelElement#load(java.util.function.Function)
	 * @generated
	 */
	EOperation getModelElement__Load__Function();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.ModelElement#toJSON() <em>To JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To JSON</em>' operation.
	 * @see org.nasdanika.models.resume.ModelElement#toJSON()
	 * @generated
	 */
	EOperation getModelElement__ToJSON();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.ModelElement#save(java.util.function.Function) <em>Save</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save</em>' operation.
	 * @see org.nasdanika.models.resume.ModelElement#save(java.util.function.Function)
	 * @generated
	 */
	EOperation getModelElement__Save__Function();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see org.nasdanika.models.resume.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.resume.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.resume.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Resource#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.resume.Resource#getUrl()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Url();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume</em>'.
	 * @see org.nasdanika.models.resume.Resume
	 * @generated
	 */
	EClass getResume();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.resume.Resume#getBasics <em>Basics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basics</em>'.
	 * @see org.nasdanika.models.resume.Resume#getBasics()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Basics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work</em>'.
	 * @see org.nasdanika.models.resume.Resume#getWork()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Work();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getVolunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volunteer</em>'.
	 * @see org.nasdanika.models.resume.Resume#getVolunteer()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Volunteer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getEducation <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Education</em>'.
	 * @see org.nasdanika.models.resume.Resume#getEducation()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Education();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getAwards <em>Awards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Awards</em>'.
	 * @see org.nasdanika.models.resume.Resume#getAwards()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Awards();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getCertificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Certificates</em>'.
	 * @see org.nasdanika.models.resume.Resume#getCertificates()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Certificates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getPublications <em>Publications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publications</em>'.
	 * @see org.nasdanika.models.resume.Resume#getPublications()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Publications();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.resume.Resume#getSkills()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Skills();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Languages</em>'.
	 * @see org.nasdanika.models.resume.Resume#getLanguages()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getInterests <em>Interests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interests</em>'.
	 * @see org.nasdanika.models.resume.Resume#getInterests()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Interests();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.nasdanika.models.resume.Resume#getReferences()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_References();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Resume#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.nasdanika.models.resume.Resume#getProjects()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Projects();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.resume.Resume#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see org.nasdanika.models.resume.Resume#getMeta()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Meta();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.resume.Resume#toSection() <em>To Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Section</em>' operation.
	 * @see org.nasdanika.models.resume.Resume#toSection()
	 * @generated
	 */
	EOperation getResume__ToSection();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Basics <em>Basics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basics</em>'.
	 * @see org.nasdanika.models.resume.Basics
	 * @generated
	 */
	EClass getBasics();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.resume.Basics#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.nasdanika.models.resume.Basics#getLocation()
	 * @see #getBasics()
	 * @generated
	 */
	EReference getBasics_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.resume.Basics#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see org.nasdanika.models.resume.Basics#getProfiles()
	 * @see #getBasics()
	 * @generated
	 */
	EReference getBasics_Profiles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Basics#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.models.resume.Basics#getLabel()
	 * @see #getBasics()
	 * @generated
	 */
	EAttribute getBasics_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Basics#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.nasdanika.models.resume.Basics#getImage()
	 * @see #getBasics()
	 * @generated
	 */
	EAttribute getBasics_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Basics#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.nasdanika.models.resume.Basics#getEmail()
	 * @see #getBasics()
	 * @generated
	 */
	EAttribute getBasics_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Basics#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see org.nasdanika.models.resume.Basics#getPhone()
	 * @see #getBasics()
	 * @generated
	 */
	EAttribute getBasics_Phone();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Basics#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.resume.Basics#getSummary()
	 * @see #getBasics()
	 * @generated
	 */
	EAttribute getBasics_Summary();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.nasdanika.models.resume.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.nasdanika.models.resume.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Location#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.nasdanika.models.resume.Location#getPostalCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.nasdanika.models.resume.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Location#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.nasdanika.models.resume.Location#getCountryCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Location#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see org.nasdanika.models.resume.Location#getRegion()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Region();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.nasdanika.models.resume.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Profile#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see org.nasdanika.models.resume.Profile#getNetwork()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Network();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Profile#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.nasdanika.models.resume.Profile#getUsername()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Username();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Engagement <em>Engagement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engagement</em>'.
	 * @see org.nasdanika.models.resume.Engagement
	 * @generated
	 */
	EClass getEngagement();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Engagement#getHighlights <em>Highlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Highlights</em>'.
	 * @see org.nasdanika.models.resume.Engagement#getHighlights()
	 * @see #getEngagement()
	 * @generated
	 */
	EAttribute getEngagement_Highlights();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Engagement#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.resume.Engagement#getSummary()
	 * @see #getEngagement()
	 * @generated
	 */
	EAttribute getEngagement_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Engagement#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.resume.Engagement#getStartDate()
	 * @see #getEngagement()
	 * @generated
	 */
	EAttribute getEngagement_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Engagement#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.models.resume.Engagement#getEndDate()
	 * @see #getEngagement()
	 * @generated
	 */
	EAttribute getEngagement_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Engagement#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.models.resume.Engagement#getPosition()
	 * @see #getEngagement()
	 * @generated
	 */
	EAttribute getEngagement_Position();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see org.nasdanika.models.resume.Work
	 * @generated
	 */
	EClass getWork();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Work#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.resume.Work#getLocation()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Work#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.resume.Work#getDescription()
	 * @see #getWork()
	 * @generated
	 */
	EAttribute getWork_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Volunteer <em>Volunteer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volunteer</em>'.
	 * @see org.nasdanika.models.resume.Volunteer
	 * @generated
	 */
	EClass getVolunteer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Volunteer#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.nasdanika.models.resume.Volunteer#getOrganization()
	 * @see #getVolunteer()
	 * @generated
	 */
	EAttribute getVolunteer_Organization();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education</em>'.
	 * @see org.nasdanika.models.resume.Education
	 * @generated
	 */
	EClass getEducation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institution</em>'.
	 * @see org.nasdanika.models.resume.Education#getInstitution()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Institution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.nasdanika.models.resume.Education#getArea()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getStudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Study Type</em>'.
	 * @see org.nasdanika.models.resume.Education#getStudyType()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_StudyType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.resume.Education#getStartDate()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.models.resume.Education#getEndDate()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Education#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.nasdanika.models.resume.Education#getScore()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Score();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Education#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Courses</em>'.
	 * @see org.nasdanika.models.resume.Education#getCourses()
	 * @see #getEducation()
	 * @generated
	 */
	EAttribute getEducation_Courses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Award <em>Award</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Award</em>'.
	 * @see org.nasdanika.models.resume.Award
	 * @generated
	 */
	EClass getAward();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Award#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.resume.Award#getTitle()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Award#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.resume.Award#getDate()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Award#getAwarder <em>Awarder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Awarder</em>'.
	 * @see org.nasdanika.models.resume.Award#getAwarder()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Awarder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Award#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.resume.Award#getSummary()
	 * @see #getAward()
	 * @generated
	 */
	EAttribute getAward_Summary();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see org.nasdanika.models.resume.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Certificate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.resume.Certificate#getDate()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Certificate#getIssuer <em>Issuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer</em>'.
	 * @see org.nasdanika.models.resume.Certificate#getIssuer()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_Issuer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Publication <em>Publication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication</em>'.
	 * @see org.nasdanika.models.resume.Publication
	 * @generated
	 */
	EClass getPublication();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Publication#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.nasdanika.models.resume.Publication#getPublisher()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Publication#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.nasdanika.models.resume.Publication#getReleaseDate()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Publication#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.models.resume.Publication#getSummary()
	 * @see #getPublication()
	 * @generated
	 */
	EAttribute getPublication_Summary();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.models.resume.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.nasdanika.models.resume.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Level();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Skill#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.nasdanika.models.resume.Skill#getKeywords()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Keywords();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see org.nasdanika.models.resume.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Language#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.models.resume.Language#getLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Language#getFluency <em>Fluency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fluency</em>'.
	 * @see org.nasdanika.models.resume.Language#getFluency()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Fluency();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest</em>'.
	 * @see org.nasdanika.models.resume.Interest
	 * @generated
	 */
	EClass getInterest();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Interest#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.nasdanika.models.resume.Interest#getKeywords()
	 * @see #getInterest()
	 * @generated
	 */
	EAttribute getInterest_Keywords();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.models.resume.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Reference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.resume.Reference#getReference()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Reference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.resume.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.resume.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Project#getHighlights <em>Highlights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Highlights</em>'.
	 * @see org.nasdanika.models.resume.Project#getHighlights()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Highlights();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Project#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.nasdanika.models.resume.Project#getKeywords()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Project#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.resume.Project#getStartDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Project#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.models.resume.Project#getEndDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EndDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.resume.Project#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.nasdanika.models.resume.Project#getRoles()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Project#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity</em>'.
	 * @see org.nasdanika.models.resume.Project#getEntity()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Project#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.resume.Project#getType()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see org.nasdanika.models.resume.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Meta#getCanonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Canonical</em>'.
	 * @see org.nasdanika.models.resume.Meta#getCanonical()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Canonical();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Meta#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.models.resume.Meta#getVersion()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.resume.Meta#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.nasdanika.models.resume.Meta#getLastModified()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_LastModified();

	/**
	 * Returns the meta object for data type '{@link java.util.function.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. 
     * If instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.
     * Otherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.
     * 
     * Examples:
     * 
     * * ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``
     * * ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Function</em>'.
	 * @see java.util.function.Function
	 * @model instanceClass="java.util.function.Function" serializeable="false" typeParameters="T R"
	 * @generated
	 */
	EDataType getFunction();

	/**
	 * Returns the meta object for data type '{@link java.util.function.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. 
     * If instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.
     * Otherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.
     * 
     * Examples:
     * 
     * * ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``
     * * ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Consumer</em>'.
	 * @see java.util.function.Consumer
	 * @model instanceClass="java.util.function.Consumer" serializeable="false" typeParameters="T"
	 * @generated
	 */
	EDataType getConsumer();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. 
     * If instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.
     * Otherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.
     * 
     * Examples:
     * 
     * * ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``
     * * ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>JSON Object</em>'.
	 * @see org.json.JSONObject
	 * @model instanceClass="org.json.JSONObject"
	 * @generated
	 */
	EDataType getJSONObject();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.common.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * [Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. 
     * If instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.
     * Otherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.
     * 
     * Examples:
     * 
     * * ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``
     * * ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.
     * 
     * 
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Section</em>'.
	 * @see org.nasdanika.common.Section
	 * @model instanceClass="org.nasdanika.common.Section" serializeable="false"
	 * @generated
	 */
	EDataType getSection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResumeFactory getResumeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ModelElementImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();
		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___LOAD__JSONOBJECT = eINSTANCE.getModelElement__Load__JSONObject();
		/**
		 * The meta object literal for the '<em><b>Load Yaml</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___LOAD_YAML__STRING = eINSTANCE.getModelElement__LoadYaml__String();
		/**
		 * The meta object literal for the '<em><b>Load</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___LOAD__FUNCTION = eINSTANCE.getModelElement__Load__Function();
		/**
		 * The meta object literal for the '<em><b>To JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___TO_JSON = eINSTANCE.getModelElement__ToJSON();
		/**
		 * The meta object literal for the '<em><b>Save</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___SAVE__FUNCTION = eINSTANCE.getModelElement__Save__Function();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.Named
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.Resource <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.Resource
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__URL = eINSTANCE.getResource_Url();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ResumeImpl <em>Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ResumeImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResume()
		 * @generated
		 */
		EClass RESUME = eINSTANCE.getResume();
		/**
		 * The meta object literal for the '<em><b>Basics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__BASICS = eINSTANCE.getResume_Basics();
		/**
		 * The meta object literal for the '<em><b>Work</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__WORK = eINSTANCE.getResume_Work();
		/**
		 * The meta object literal for the '<em><b>Volunteer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__VOLUNTEER = eINSTANCE.getResume_Volunteer();
		/**
		 * The meta object literal for the '<em><b>Education</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__EDUCATION = eINSTANCE.getResume_Education();
		/**
		 * The meta object literal for the '<em><b>Awards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__AWARDS = eINSTANCE.getResume_Awards();
		/**
		 * The meta object literal for the '<em><b>Certificates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__CERTIFICATES = eINSTANCE.getResume_Certificates();
		/**
		 * The meta object literal for the '<em><b>Publications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__PUBLICATIONS = eINSTANCE.getResume_Publications();
		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__SKILLS = eINSTANCE.getResume_Skills();
		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__LANGUAGES = eINSTANCE.getResume_Languages();
		/**
		 * The meta object literal for the '<em><b>Interests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__INTERESTS = eINSTANCE.getResume_Interests();
		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__REFERENCES = eINSTANCE.getResume_References();
		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__PROJECTS = eINSTANCE.getResume_Projects();
		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__META = eINSTANCE.getResume_Meta();
		/**
		 * The meta object literal for the '<em><b>To Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESUME___TO_SECTION = eINSTANCE.getResume__ToSection();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.BasicsImpl <em>Basics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.BasicsImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getBasics()
		 * @generated
		 */
		EClass BASICS = eINSTANCE.getBasics();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASICS__LOCATION = eINSTANCE.getBasics_Location();
		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASICS__PROFILES = eINSTANCE.getBasics_Profiles();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASICS__LABEL = eINSTANCE.getBasics_Label();
		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASICS__IMAGE = eINSTANCE.getBasics_Image();
		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASICS__EMAIL = eINSTANCE.getBasics_Email();
		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASICS__PHONE = eINSTANCE.getBasics_Phone();
		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASICS__SUMMARY = eINSTANCE.getBasics_Summary();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.LocationImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();
		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ADDRESS = eINSTANCE.getLocation_Address();
		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__POSTAL_CODE = eINSTANCE.getLocation_PostalCode();
		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();
		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY_CODE = eINSTANCE.getLocation_CountryCode();
		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__REGION = eINSTANCE.getLocation_Region();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ProfileImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();
		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__NETWORK = eINSTANCE.getProfile_Network();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__USERNAME = eINSTANCE.getProfile_Username();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.EngagementImpl <em>Engagement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.EngagementImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEngagement()
		 * @generated
		 */
		EClass ENGAGEMENT = eINSTANCE.getEngagement();
		/**
		 * The meta object literal for the '<em><b>Highlights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGAGEMENT__HIGHLIGHTS = eINSTANCE.getEngagement_Highlights();
		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGAGEMENT__SUMMARY = eINSTANCE.getEngagement_Summary();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGAGEMENT__START_DATE = eINSTANCE.getEngagement_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGAGEMENT__END_DATE = eINSTANCE.getEngagement_EndDate();
		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENGAGEMENT__POSITION = eINSTANCE.getEngagement_Position();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.WorkImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = eINSTANCE.getWork();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__LOCATION = eINSTANCE.getWork_Location();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK__DESCRIPTION = eINSTANCE.getWork_Description();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.VolunteerImpl <em>Volunteer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.VolunteerImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getVolunteer()
		 * @generated
		 */
		EClass VOLUNTEER = eINSTANCE.getVolunteer();
		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUNTEER__ORGANIZATION = eINSTANCE.getVolunteer_Organization();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.EducationImpl <em>Education</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.EducationImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEducation()
		 * @generated
		 */
		EClass EDUCATION = eINSTANCE.getEducation();
		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__INSTITUTION = eINSTANCE.getEducation_Institution();
		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__AREA = eINSTANCE.getEducation_Area();
		/**
		 * The meta object literal for the '<em><b>Study Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__STUDY_TYPE = eINSTANCE.getEducation_StudyType();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__START_DATE = eINSTANCE.getEducation_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__END_DATE = eINSTANCE.getEducation_EndDate();
		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__SCORE = eINSTANCE.getEducation_Score();
		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION__COURSES = eINSTANCE.getEducation_Courses();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.AwardImpl <em>Award</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.AwardImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getAward()
		 * @generated
		 */
		EClass AWARD = eINSTANCE.getAward();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__TITLE = eINSTANCE.getAward_Title();
		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__DATE = eINSTANCE.getAward_Date();
		/**
		 * The meta object literal for the '<em><b>Awarder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__AWARDER = eINSTANCE.getAward_Awarder();
		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARD__SUMMARY = eINSTANCE.getAward_Summary();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.CertificateImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();
		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__DATE = eINSTANCE.getCertificate_Date();
		/**
		 * The meta object literal for the '<em><b>Issuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__ISSUER = eINSTANCE.getCertificate_Issuer();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.PublicationImpl <em>Publication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.PublicationImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getPublication()
		 * @generated
		 */
		EClass PUBLICATION = eINSTANCE.getPublication();
		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__PUBLISHER = eINSTANCE.getPublication_Publisher();
		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__RELEASE_DATE = eINSTANCE.getPublication_ReleaseDate();
		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICATION__SUMMARY = eINSTANCE.getPublication_Summary();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.SkillImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();
		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__LEVEL = eINSTANCE.getSkill_Level();
		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__KEYWORDS = eINSTANCE.getSkill_Keywords();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.LanguageImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();
		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE = eINSTANCE.getLanguage_Language();
		/**
		 * The meta object literal for the '<em><b>Fluency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__FLUENCY = eINSTANCE.getLanguage_Fluency();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.InterestImpl <em>Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.InterestImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getInterest()
		 * @generated
		 */
		EClass INTEREST = eINSTANCE.getInterest();
		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEREST__KEYWORDS = eINSTANCE.getInterest_Keywords();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ReferenceImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();
		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE = eINSTANCE.getReference_Reference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ProjectImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();
		/**
		 * The meta object literal for the '<em><b>Highlights</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__HIGHLIGHTS = eINSTANCE.getProject_Highlights();
		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__KEYWORDS = eINSTANCE.getProject_Keywords();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__START_DATE = eINSTANCE.getProject_StartDate();
		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__END_DATE = eINSTANCE.getProject_EndDate();
		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ROLES = eINSTANCE.getProject_Roles();
		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ENTITY = eINSTANCE.getProject_Entity();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TYPE = eINSTANCE.getProject_Type();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.MetaImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();
		/**
		 * The meta object literal for the '<em><b>Canonical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__CANONICAL = eINSTANCE.getMeta_Canonical();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__VERSION = eINSTANCE.getMeta_Version();
		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__LAST_MODIFIED = eINSTANCE.getMeta_LastModified();
		/**
		 * The meta object literal for the '<em>Function</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Function
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getFunction()
		 * @generated
		 */
		EDataType FUNCTION = eINSTANCE.getFunction();
		/**
		 * The meta object literal for the '<em>Consumer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.function.Consumer
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getConsumer()
		 * @generated
		 */
		EDataType CONSUMER = eINSTANCE.getConsumer();
		/**
		 * The meta object literal for the '<em>JSON Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONObject
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getJSONObject()
		 * @generated
		 */
		EDataType JSON_OBJECT = eINSTANCE.getJSONObject();
		/**
		 * The meta object literal for the '<em>Section</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.common.Section
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getSection()
		 * @generated
		 */
		EDataType SECTION = eINSTANCE.getSection();

	}

} //ResumePackage
