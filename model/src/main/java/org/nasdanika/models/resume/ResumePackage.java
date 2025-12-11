/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link org.nasdanika.models.resume.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.Named
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.Resource
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URL = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ResumeImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 2;

	/**
	 * The feature id for the '<em><b>Basics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__BASICS = 0;

	/**
	 * The feature id for the '<em><b>Work</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__WORK = 1;

	/**
	 * The feature id for the '<em><b>Volunteer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__VOLUNTEER = 2;

	/**
	 * The feature id for the '<em><b>Education</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__EDUCATION = 3;

	/**
	 * The feature id for the '<em><b>Awards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__AWARDS = 4;

	/**
	 * The feature id for the '<em><b>Certificates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__CERTIFICATES = 5;

	/**
	 * The feature id for the '<em><b>Publications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__PUBLICATIONS = 6;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__SKILLS = 7;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__LANGUAGES = 8;

	/**
	 * The feature id for the '<em><b>Interests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__INTERESTS = 9;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__REFERENCES = 10;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__PROJECTS = 11;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__META = 12;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.BasicsImpl <em>Basics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.BasicsImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getBasics()
	 * @generated
	 */
	int BASICS = 3;

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
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSTAL_CODE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__REGION = 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.ProfileImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 5;

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
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.WorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.WorkImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getWork()
	 * @generated
	 */
	int WORK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK__URL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.VolunteerImpl <em>Volunteer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.VolunteerImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getVolunteer()
	 * @generated
	 */
	int VOLUNTEER = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER__URL = RESOURCE__URL;

	/**
	 * The number of structural features of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Volunteer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUNTEER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.EducationImpl <em>Education</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.EducationImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEducation()
	 * @generated
	 */
	int EDUCATION = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION__URL = RESOURCE__URL;

	/**
	 * The number of structural features of the '<em>Education</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

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
	int AWARD = 9;

	/**
	 * The number of structural features of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Award</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.CertificateImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 10;

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
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

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
	int PUBLICATION = 11;

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
	 * The number of structural features of the '<em>Publication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

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
	int SKILL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = NAMED__NAME;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

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
	int LANGUAGE = 13;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.resume.impl.InterestImpl <em>Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.resume.impl.InterestImpl
	 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getInterest()
	 * @generated
	 */
	int INTEREST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST__NAME = NAMED__NAME;

	/**
	 * The number of structural features of the '<em>Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

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
	int REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED__NAME;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 0;

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
	int PROJECT = 16;

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
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_FEATURE_COUNT + 1;

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
	int META = 17;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 0;


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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Work <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see org.nasdanika.models.resume.Work
	 * @generated
	 */
	EClass getWork();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Education <em>Education</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Education</em>'.
	 * @see org.nasdanika.models.resume.Education
	 * @generated
	 */
	EClass getEducation();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see org.nasdanika.models.resume.Certificate
	 * @generated
	 */
	EClass getCertificate();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.models.resume.Skill
	 * @generated
	 */
	EClass getSkill();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Interest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest</em>'.
	 * @see org.nasdanika.models.resume.Interest
	 * @generated
	 */
	EClass getInterest();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.resume.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.resume.Project
	 * @generated
	 */
	EClass getProject();

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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.WorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.WorkImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getWork()
		 * @generated
		 */
		EClass WORK = eINSTANCE.getWork();
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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.EducationImpl <em>Education</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.EducationImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getEducation()
		 * @generated
		 */
		EClass EDUCATION = eINSTANCE.getEducation();
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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.CertificateImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();
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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.SkillImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();
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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.InterestImpl <em>Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.InterestImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getInterest()
		 * @generated
		 */
		EClass INTEREST = eINSTANCE.getInterest();
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
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.ProjectImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.resume.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.resume.impl.MetaImpl
		 * @see org.nasdanika.models.resume.impl.ResumePackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

	}

} //ResumePackage
