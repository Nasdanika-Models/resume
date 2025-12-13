/**
 */
package org.nasdanika.models.resume.impl;

import java.util.function.Consumer;
import java.util.function.Function;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.json.JSONObject;
import org.nasdanika.common.Section;
import org.nasdanika.models.resume.Award;
import org.nasdanika.models.resume.Basics;
import org.nasdanika.models.resume.Certificate;
import org.nasdanika.models.resume.Education;
import org.nasdanika.models.resume.Engagement;
import org.nasdanika.models.resume.Interest;
import org.nasdanika.models.resume.Language;
import org.nasdanika.models.resume.Location;
import org.nasdanika.models.resume.Meta;
import org.nasdanika.models.resume.ModelElement;
import org.nasdanika.models.resume.Named;
import org.nasdanika.models.resume.Profile;
import org.nasdanika.models.resume.Project;
import org.nasdanika.models.resume.Publication;
import org.nasdanika.models.resume.Reference;
import org.nasdanika.models.resume.Resource;
import org.nasdanika.models.resume.Resume;
import org.nasdanika.models.resume.ResumeFactory;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.models.resume.Skill;
import org.nasdanika.models.resume.Volunteer;
import org.nasdanika.models.resume.Work;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResumePackageImpl extends EPackageImpl implements ResumePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engagementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volunteerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awardEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType functionEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType consumerEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonObjectEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sectionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.resume.ResumePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResumePackageImpl() {
		super(eNS_URI, ResumeFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ResumePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResumePackage init() {
		if (isInited) return (ResumePackage)EPackage.Registry.INSTANCE.getEPackage(ResumePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResumePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResumePackageImpl theResumePackage = registeredResumePackage instanceof ResumePackageImpl ? (ResumePackageImpl)registeredResumePackage : new ResumePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theResumePackage.createPackageContents();

		// Initialize created meta-data
		theResumePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResumePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResumePackage.eNS_URI, theResumePackage);
		return theResumePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__Load__JSONObject() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__LoadYaml__String() {
		return modelElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__Load__Function() {
		return modelElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__ToJSON() {
		return modelElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__Save__Function() {
		return modelElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Url() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResume() {
		return resumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Basics() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Work() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Volunteer() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Education() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Awards() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Certificates() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Publications() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Skills() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Languages() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Interests() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_References() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Projects() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResume_Meta() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResume__ToSection() {
		return resumeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasics() {
		return basicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasics_Location() {
		return (EReference)basicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasics_Profiles() {
		return (EReference)basicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasics_Label() {
		return (EAttribute)basicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasics_Image() {
		return (EAttribute)basicsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasics_Email() {
		return (EAttribute)basicsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasics_Phone() {
		return (EAttribute)basicsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasics_Summary() {
		return (EAttribute)basicsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Address() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_PostalCode() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_City() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_CountryCode() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Region() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfile_Network() {
		return (EAttribute)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfile_Username() {
		return (EAttribute)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngagement() {
		return engagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagement_Highlights() {
		return (EAttribute)engagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagement_Summary() {
		return (EAttribute)engagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagement_StartDate() {
		return (EAttribute)engagementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagement_EndDate() {
		return (EAttribute)engagementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEngagement_Position() {
		return (EAttribute)engagementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWork() {
		return workEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Location() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWork_Description() {
		return (EAttribute)workEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolunteer() {
		return volunteerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolunteer_Organization() {
		return (EAttribute)volunteerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEducation() {
		return educationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Institution() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Area() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_StudyType() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_StartDate() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_EndDate() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Score() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducation_Courses() {
		return (EAttribute)educationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAward() {
		return awardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAward_Title() {
		return (EAttribute)awardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAward_Date() {
		return (EAttribute)awardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAward_Awarder() {
		return (EAttribute)awardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAward_Summary() {
		return (EAttribute)awardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificate() {
		return certificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificate_Date() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificate_Issuer() {
		return (EAttribute)certificateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublication() {
		return publicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_Publisher() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_ReleaseDate() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublication_Summary() {
		return (EAttribute)publicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkill_Level() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkill_Keywords() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Language() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Fluency() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterest() {
		return interestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterest_Keywords() {
		return (EAttribute)interestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Reference() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Highlights() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Keywords() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_StartDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EndDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Roles() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Entity() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Type() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_Canonical() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_Version() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_LastModified() {
		return (EAttribute)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFunction() {
		return functionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getConsumer() {
		return consumerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJSONObject() {
		return jsonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSection() {
		return sectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResumeFactory getResumeFactory() {
		return (ResumeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEOperation(modelElementEClass, MODEL_ELEMENT___LOAD__JSONOBJECT);
		createEOperation(modelElementEClass, MODEL_ELEMENT___LOAD_YAML__STRING);
		createEOperation(modelElementEClass, MODEL_ELEMENT___LOAD__FUNCTION);
		createEOperation(modelElementEClass, MODEL_ELEMENT___TO_JSON);
		createEOperation(modelElementEClass, MODEL_ELEMENT___SAVE__FUNCTION);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__URL);

		resumeEClass = createEClass(RESUME);
		createEReference(resumeEClass, RESUME__BASICS);
		createEReference(resumeEClass, RESUME__WORK);
		createEReference(resumeEClass, RESUME__VOLUNTEER);
		createEReference(resumeEClass, RESUME__EDUCATION);
		createEReference(resumeEClass, RESUME__AWARDS);
		createEReference(resumeEClass, RESUME__CERTIFICATES);
		createEReference(resumeEClass, RESUME__PUBLICATIONS);
		createEReference(resumeEClass, RESUME__SKILLS);
		createEReference(resumeEClass, RESUME__LANGUAGES);
		createEReference(resumeEClass, RESUME__INTERESTS);
		createEReference(resumeEClass, RESUME__REFERENCES);
		createEReference(resumeEClass, RESUME__PROJECTS);
		createEReference(resumeEClass, RESUME__META);
		createEOperation(resumeEClass, RESUME___TO_SECTION);

		basicsEClass = createEClass(BASICS);
		createEReference(basicsEClass, BASICS__LOCATION);
		createEReference(basicsEClass, BASICS__PROFILES);
		createEAttribute(basicsEClass, BASICS__LABEL);
		createEAttribute(basicsEClass, BASICS__IMAGE);
		createEAttribute(basicsEClass, BASICS__EMAIL);
		createEAttribute(basicsEClass, BASICS__PHONE);
		createEAttribute(basicsEClass, BASICS__SUMMARY);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ADDRESS);
		createEAttribute(locationEClass, LOCATION__POSTAL_CODE);
		createEAttribute(locationEClass, LOCATION__CITY);
		createEAttribute(locationEClass, LOCATION__COUNTRY_CODE);
		createEAttribute(locationEClass, LOCATION__REGION);

		profileEClass = createEClass(PROFILE);
		createEAttribute(profileEClass, PROFILE__NETWORK);
		createEAttribute(profileEClass, PROFILE__USERNAME);

		engagementEClass = createEClass(ENGAGEMENT);
		createEAttribute(engagementEClass, ENGAGEMENT__HIGHLIGHTS);
		createEAttribute(engagementEClass, ENGAGEMENT__SUMMARY);
		createEAttribute(engagementEClass, ENGAGEMENT__START_DATE);
		createEAttribute(engagementEClass, ENGAGEMENT__END_DATE);
		createEAttribute(engagementEClass, ENGAGEMENT__POSITION);

		workEClass = createEClass(WORK);
		createEAttribute(workEClass, WORK__LOCATION);
		createEAttribute(workEClass, WORK__DESCRIPTION);

		volunteerEClass = createEClass(VOLUNTEER);
		createEAttribute(volunteerEClass, VOLUNTEER__ORGANIZATION);

		educationEClass = createEClass(EDUCATION);
		createEAttribute(educationEClass, EDUCATION__INSTITUTION);
		createEAttribute(educationEClass, EDUCATION__AREA);
		createEAttribute(educationEClass, EDUCATION__STUDY_TYPE);
		createEAttribute(educationEClass, EDUCATION__START_DATE);
		createEAttribute(educationEClass, EDUCATION__END_DATE);
		createEAttribute(educationEClass, EDUCATION__SCORE);
		createEAttribute(educationEClass, EDUCATION__COURSES);

		awardEClass = createEClass(AWARD);
		createEAttribute(awardEClass, AWARD__TITLE);
		createEAttribute(awardEClass, AWARD__DATE);
		createEAttribute(awardEClass, AWARD__AWARDER);
		createEAttribute(awardEClass, AWARD__SUMMARY);

		certificateEClass = createEClass(CERTIFICATE);
		createEAttribute(certificateEClass, CERTIFICATE__DATE);
		createEAttribute(certificateEClass, CERTIFICATE__ISSUER);

		publicationEClass = createEClass(PUBLICATION);
		createEAttribute(publicationEClass, PUBLICATION__PUBLISHER);
		createEAttribute(publicationEClass, PUBLICATION__RELEASE_DATE);
		createEAttribute(publicationEClass, PUBLICATION__SUMMARY);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__LEVEL);
		createEAttribute(skillEClass, SKILL__KEYWORDS);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__FLUENCY);

		interestEClass = createEClass(INTEREST);
		createEAttribute(interestEClass, INTEREST__KEYWORDS);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__HIGHLIGHTS);
		createEAttribute(projectEClass, PROJECT__KEYWORDS);
		createEAttribute(projectEClass, PROJECT__START_DATE);
		createEAttribute(projectEClass, PROJECT__END_DATE);
		createEAttribute(projectEClass, PROJECT__ROLES);
		createEAttribute(projectEClass, PROJECT__ENTITY);
		createEAttribute(projectEClass, PROJECT__TYPE);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__CANONICAL);
		createEAttribute(metaEClass, META__VERSION);
		createEAttribute(metaEClass, META__LAST_MODIFIED);

		// Create data types
		functionEDataType = createEDataType(FUNCTION);
		consumerEDataType = createEDataType(CONSUMER);
		jsonObjectEDataType = createEDataType(JSON_OBJECT);
		sectionEDataType = createEDataType(SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(functionEDataType, "T");
		addETypeParameter(functionEDataType, "R");
		addETypeParameter(consumerEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		modelElementEClass.getESuperTypes().add(theNcorePackage.getDocumented());
		namedEClass.getESuperTypes().add(this.getModelElement());
		resourceEClass.getESuperTypes().add(this.getModelElement());
		resumeEClass.getESuperTypes().add(this.getModelElement());
		resumeEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		basicsEClass.getESuperTypes().add(this.getNamed());
		basicsEClass.getESuperTypes().add(this.getResource());
		locationEClass.getESuperTypes().add(this.getModelElement());
		profileEClass.getESuperTypes().add(this.getResource());
		engagementEClass.getESuperTypes().add(this.getResource());
		workEClass.getESuperTypes().add(this.getEngagement());
		workEClass.getESuperTypes().add(this.getNamed());
		volunteerEClass.getESuperTypes().add(this.getEngagement());
		educationEClass.getESuperTypes().add(this.getResource());
		awardEClass.getESuperTypes().add(this.getModelElement());
		certificateEClass.getESuperTypes().add(this.getNamed());
		certificateEClass.getESuperTypes().add(this.getResource());
		publicationEClass.getESuperTypes().add(this.getNamed());
		publicationEClass.getESuperTypes().add(this.getResource());
		skillEClass.getESuperTypes().add(this.getNamed());
		languageEClass.getESuperTypes().add(this.getModelElement());
		interestEClass.getESuperTypes().add(this.getNamed());
		referenceEClass.getESuperTypes().add(this.getNamed());
		projectEClass.getESuperTypes().add(this.getNamed());
		projectEClass.getESuperTypes().add(this.getResource());
		metaEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getModelElement__Load__JSONObject(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJSONObject(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelElement__LoadYaml__String(), null, "loadYaml", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "yamlString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelElement__Load__Function(), null, "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getFunction());
		EGenericType g2 = createEGenericType(ecorePackage.getEStructuralFeature());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "contentProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelElement__ToJSON(), this.getJSONObject(), "toJSON", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getModelElement__Save__Function(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getFunction());
		g2 = createEGenericType(ecorePackage.getEStructuralFeature());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getConsumer());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(ecorePackage.getEJavaObject());
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "contentConsumerProvider", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Url(), ecorePackage.getEString(), "url", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resumeEClass, Resume.class, "Resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResume_Basics(), this.getBasics(), null, "basics", null, 0, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Work(), this.getWork(), null, "work", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Volunteer(), this.getVolunteer(), null, "volunteer", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Education(), this.getEducation(), null, "education", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Awards(), this.getAward(), null, "awards", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Certificates(), this.getCertificate(), null, "certificates", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Publications(), this.getPublication(), null, "publications", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Skills(), this.getSkill(), null, "skills", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Languages(), this.getLanguage(), null, "languages", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Interests(), this.getInterest(), null, "interests", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_References(), this.getReference(), null, "references", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Projects(), this.getProject(), null, "projects", null, 0, -1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Meta(), this.getMeta(), null, "meta", null, 0, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResume__ToSection(), this.getSection(), "toSection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basicsEClass, Basics.class, "Basics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasics_Location(), this.getLocation(), null, "location", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasics_Profiles(), this.getProfile(), null, "profiles", null, 0, -1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasics_Label(), ecorePackage.getEString(), "label", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasics_Image(), ecorePackage.getEString(), "image", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasics_Email(), ecorePackage.getEString(), "email", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasics_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasics_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Basics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Address(), ecorePackage.getEString(), "address", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_City(), ecorePackage.getEString(), "city", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Region(), ecorePackage.getEString(), "region", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfile_Network(), ecorePackage.getEString(), "network", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfile_Username(), ecorePackage.getEString(), "username", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engagementEClass, Engagement.class, "Engagement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEngagement_Highlights(), ecorePackage.getEString(), "highlights", null, 0, -1, Engagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngagement_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Engagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngagement_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Engagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngagement_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Engagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEngagement_Position(), ecorePackage.getEString(), "position", null, 0, 1, Engagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEClass, Work.class, "Work", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWork_Location(), ecorePackage.getEString(), "location", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWork_Description(), ecorePackage.getEString(), "description", null, 0, 1, Work.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volunteerEClass, Volunteer.class, "Volunteer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolunteer_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, Volunteer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(educationEClass, Education.class, "Education", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEducation_Institution(), ecorePackage.getEString(), "institution", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_Area(), ecorePackage.getEString(), "area", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_StudyType(), ecorePackage.getEString(), "studyType", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_Score(), ecorePackage.getEString(), "score", null, 0, 1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducation_Courses(), ecorePackage.getEString(), "courses", null, 0, -1, Education.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awardEClass, Award.class, "Award", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAward_Title(), ecorePackage.getEString(), "title", null, 0, 1, Award.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAward_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Award.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAward_Awarder(), ecorePackage.getEString(), "awarder", null, 0, 1, Award.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAward_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Award.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateEClass, Certificate.class, "Certificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificate_Issuer(), ecorePackage.getEString(), "issuer", null, 0, 1, Certificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationEClass, Publication.class, "Publication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublication_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublication_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Publication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Level(), ecorePackage.getEString(), "level", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_Keywords(), ecorePackage.getEString(), "keywords", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Language(), ecorePackage.getEString(), "language", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Fluency(), ecorePackage.getEString(), "fluency", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interestEClass, Interest.class, "Interest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterest_Keywords(), ecorePackage.getEString(), "keywords", null, 0, -1, Interest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Highlights(), ecorePackage.getEString(), "highlights", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Keywords(), ecorePackage.getEString(), "keywords", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Roles(), ecorePackage.getEString(), "roles", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Entity(), ecorePackage.getEString(), "entity", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Type(), ecorePackage.getEString(), "type", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Canonical(), ecorePackage.getEString(), "canonical", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_Version(), ecorePackage.getEString(), "version", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeta_LastModified(), ecorePackage.getEString(), "lastModified", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(functionEDataType, Function.class, "Function", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(consumerEDataType, Consumer.class, "Consumer", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonObjectEDataType, JSONObject.class, "JSONObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sectionEDataType, Section.class, "Section", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (functionEDataType,
		   source,
		   new String[] {
			   "documentation", "[Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. \nIf instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.\nOtherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.\n\nExamples:\n\n* ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``\n* ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.\n\n"
		   });
		addAnnotation
		  (consumerEDataType,
		   source,
		   new String[] {
			   "documentation", "[Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. \nIf instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.\nOtherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.\n\nExamples:\n\n* ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``\n* ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.\n\n"
		   });
		addAnnotation
		  (jsonObjectEDataType,
		   source,
		   new String[] {
			   "documentation", "[Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. \nIf instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.\nOtherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.\n\nExamples:\n\n* ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``\n* ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.\n\n"
		   });
		addAnnotation
		  (sectionEDataType,
		   source,
		   new String[] {
			   "documentation", "[Instant](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html) is a single instantaneous point on the time-line. \nIf instant specification contains ``Z``, then it is parsed using [Instant.parse()](https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html#parse-java.lang.CharSequence-) method.\nOtherwise the specification is used to construct ``java.util.Date`` which is then converted to instant.\n\nExamples:\n\n* ``2021-12-03T10:15:30.00Z`` - loaded using ``Instant.parse()``\n* ``10/1/2021`` - loaded using ``new Date()`` and then converted to instant.\n\n"
		   });
		addAnnotation
		  (namedEClass,
		   source,
		   new String[] {
			   "documentation", "Interface implemented by classes with a name"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "Interface implemented by classes with a URL"
		   });
		addAnnotation
		  (getResource_Url(),
		   source,
		   new String[] {
			   "documentation", "Resource location"
		   });
		addAnnotation
		  (getResume_Awards(),
		   source,
		   new String[] {
			   "documentation", "Specify any awards you have received throughout your professional career"
		   });
		addAnnotation
		  (getResume_Certificates(),
		   source,
		   new String[] {
			   "documentation", "Specify any certificates you have received throughout your professional career"
		   });
		addAnnotation
		  (getResume_Publications(),
		   source,
		   new String[] {
			   "documentation", "Specify your publications through your career"
		   });
		addAnnotation
		  (getResume_Skills(),
		   source,
		   new String[] {
			   "documentation", "List out your professional skill-set"
		   });
		addAnnotation
		  (getResume_Languages(),
		   source,
		   new String[] {
			   "documentation", "List any other languages you speak"
		   });
		addAnnotation
		  (getResume_References(),
		   source,
		   new String[] {
			   "documentation", "List references you have received"
		   });
		addAnnotation
		  (getResume_Projects(),
		   source,
		   new String[] {
			   "documentation", "Specify career projects"
		   });
		addAnnotation
		  (getBasics_Profiles(),
		   source,
		   new String[] {
			   "documentation", "Specify any number of social networks that you participate in"
		   });
		addAnnotation
		  (getBasics_Label(),
		   source,
		   new String[] {
			   "documentation", "e.g. Web Developer"
		   });
		addAnnotation
		  (getBasics_Image(),
		   source,
		   new String[] {
			   "documentation", "URL (as per RFC 3986) to a image in JPEG or PNG format"
		   });
		addAnnotation
		  (getBasics_Email(),
		   source,
		   new String[] {
			   "documentation", "e.g. thomas@gmail.com"
		   });
		addAnnotation
		  (getBasics_Phone(),
		   source,
		   new String[] {
			   "documentation", "Phone numbers are stored as strings so use any format you like, e.g. 712-117-2923"
		   });
		addAnnotation
		  (getBasics_Summary(),
		   source,
		   new String[] {
			   "documentation", "Write a short 2-3 sentence biography about yourself"
		   });
		addAnnotation
		  (getLocation_Address(),
		   source,
		   new String[] {
			   "documentation", "To add multiple address lines, use \\n. For example, 1234 Gl\ufffdcklichkeit Stra\ufffde\\nHinterhaus 5. Etage li."
		   });
		addAnnotation
		  (getLocation_CountryCode(),
		   source,
		   new String[] {
			   "documentation", "code as per ISO-3166-1 ALPHA-2, e.g. US, AU, IN"
		   });
		addAnnotation
		  (getLocation_Region(),
		   source,
		   new String[] {
			   "documentation", "The general region where you live. Can be a US state, or a province, for instance."
		   });
		addAnnotation
		  (getProfile_Network(),
		   source,
		   new String[] {
			   "documentation", "e.g. Facebook or Twitter"
		   });
		addAnnotation
		  (getProfile_Username(),
		   source,
		   new String[] {
			   "documentation", "e.g. neutralthoughts"
		   });
		addAnnotation
		  (engagementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for Work and Volunteer"
		   });
		addAnnotation
		  (getEngagement_Highlights(),
		   source,
		   new String[] {
			   "documentation", "Specify multiple accomplishments.\ne.g. Increased profits by 20% from 2011-2012 through viral advertising\n"
		   });
		addAnnotation
		  (getEngagement_Summary(),
		   source,
		   new String[] {
			   "documentation", "Give an overview of your responsibilities at the company"
		   });
		addAnnotation
		  (getEngagement_Position(),
		   source,
		   new String[] {
			   "documentation", "e.g. Software Engineer"
		   });
		addAnnotation
		  (getWork_Location(),
		   source,
		   new String[] {
			   "documentation", "To add multiple address lines, use \\n. For example, 1234 Gl\ufffdcklichkeit Stra\ufffde\\nHinterhaus 5. Etage li."
		   });
		addAnnotation
		  (getWork_Description(),
		   source,
		   new String[] {
			   "documentation", "e.g. Menlo Park, CA"
		   });
		addAnnotation
		  (getVolunteer_Organization(),
		   source,
		   new String[] {
			   "documentation", "e.g. Facebook"
		   });
		addAnnotation
		  (getEducation_Institution(),
		   source,
		   new String[] {
			   "documentation", "e.g. Massachusetts Institute of Technology"
		   });
		addAnnotation
		  (getEducation_Area(),
		   source,
		   new String[] {
			   "documentation", "e.g. Arts"
		   });
		addAnnotation
		  (getEducation_StudyType(),
		   source,
		   new String[] {
			   "documentation", "e.g. Bachelor"
		   });
		addAnnotation
		  (getEducation_Score(),
		   source,
		   new String[] {
			   "documentation", "grade point average, e.g. 3.67/4.0"
		   });
		addAnnotation
		  (getEducation_Courses(),
		   source,
		   new String[] {
			   "documentation", "List notable courses/subjects\ne.g. H1302 - Introduction to American history"
		   });
		addAnnotation
		  (getAward_Title(),
		   source,
		   new String[] {
			   "documentation", "e.g. One of the 100 greatest minds of the century"
		   });
		addAnnotation
		  (getAward_Awarder(),
		   source,
		   new String[] {
			   "documentation", "e.g. Time Magazine"
		   });
		addAnnotation
		  (getAward_Summary(),
		   source,
		   new String[] {
			   "documentation", "e.g. Received for my work with Quantum Physics"
		   });
		addAnnotation
		  (getCertificate_Issuer(),
		   source,
		   new String[] {
			   "documentation", "e.g. CNCF"
		   });
		addAnnotation
		  (getPublication_Publisher(),
		   source,
		   new String[] {
			   "documentation", "e.g. IEEE, Computer Magazine"
		   });
		addAnnotation
		  (getPublication_Summary(),
		   source,
		   new String[] {
			   "documentation", "Short summary of publication. e.g. Discussion of the World Wide Web, HTTP, HTML."
		   });
		addAnnotation
		  (getSkill_Level(),
		   source,
		   new String[] {
			   "documentation", "e.g. Master"
		   });
		addAnnotation
		  (getSkill_Keywords(),
		   source,
		   new String[] {
			   "documentation", "List some keywords pertaining to this skill, e.g. HTML"
		   });
		addAnnotation
		  (getLanguage_Language(),
		   source,
		   new String[] {
			   "documentation", "e.g. English, Spanish"
		   });
		addAnnotation
		  (getLanguage_Fluency(),
		   source,
		   new String[] {
			   "documentation", "e.g. Fluent, Beginner"
		   });
		addAnnotation
		  (getInterest_Keywords(),
		   source,
		   new String[] {
			   "documentation", "e.g. Friedrich Nietzsche"
		   });
		addAnnotation
		  (getReference_Reference(),
		   source,
		   new String[] {
			   "documentation", "e.g. Joe blogs was a great employee, who turned up to work at least once a week.\nHe exceeded my expectations when it came to doing nothing."
		   });
		addAnnotation
		  (getProject_Description(),
		   source,
		   new String[] {
			   "documentation", "Short summary of project. e.g. Collated works of 2017."
		   });
		addAnnotation
		  (getProject_Highlights(),
		   source,
		   new String[] {
			   "documentation", "Specify multiple features\ne.g. Directs you close but not quite there"
		   });
		addAnnotation
		  (getProject_Keywords(),
		   source,
		   new String[] {
			   "documentation", "Specify special elements involved,\ne.g. AngularJS"
		   });
		addAnnotation
		  (getProject_Roles(),
		   source,
		   new String[] {
			   "documentation", "Specify your role on this project or in company\ne.g. Team Lead, Speaker, Writer"
		   });
		addAnnotation
		  (getProject_Entity(),
		   source,
		   new String[] {
			   "documentation", "Specify the relevant company/entity affiliations e.g. \'greenpeace\', \'corporationXYZ\'"
		   });
		addAnnotation
		  (getProject_Type(),
		   source,
		   new String[] {
			   "documentation", "e.g. \'volunteering\', \'presentation\', \'talk\', \'application\', \'conference\'"
		   });
		addAnnotation
		  (getMeta_Canonical(),
		   source,
		   new String[] {
			   "documentation", "URL (as per RFC 3986) to latest version of this document"
		   });
		addAnnotation
		  (getMeta_Version(),
		   source,
		   new String[] {
			   "documentation", "A version field which follows semver - e.g. v1.0.0"
		   });
		addAnnotation
		  (getMeta_LastModified(),
		   source,
		   new String[] {
			   "documentation", "Using ISO 8601 with YYYY-MM-DDThh:mm:ss"
		   });
	}

} //ResumePackageImpl
