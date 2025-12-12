/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Resume#getBasics <em>Basics</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getEducation <em>Education</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getAwards <em>Awards</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getPublications <em>Publications</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getInterests <em>Interests</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Resume#getMeta <em>Meta</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getResume()
 * @model
 * @generated
 */
public interface Resume extends EObject {

	/**
	 * Returns the value of the '<em><b>Basics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basics</em>' containment reference.
	 * @see #setBasics(Basics)
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Basics()
	 * @model containment="true"
	 * @generated
	 */
	Basics getBasics();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Resume#getBasics <em>Basics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basics</em>' containment reference.
	 * @see #getBasics()
	 * @generated
	 */
	void setBasics(Basics value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Work}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Work()
	 * @model containment="true"
	 * @generated
	 */
	EList<Work> getWork();

	/**
	 * Returns the value of the '<em><b>Volunteer</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Volunteer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volunteer</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Volunteer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volunteer> getVolunteer();

	/**
	 * Returns the value of the '<em><b>Education</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Education}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Education()
	 * @model containment="true"
	 * @generated
	 */
	EList<Education> getEducation();

	/**
	 * Returns the value of the '<em><b>Awards</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Award}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify any awards you have received throughout your professional career
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Awards</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Awards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Award> getAwards();

	/**
	 * Returns the value of the '<em><b>Certificates</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Certificate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify any certificates you have received throughout your professional career
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificates</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Certificates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Certificate> getCertificates();

	/**
	 * Returns the value of the '<em><b>Publications</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Publication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify your publications through your career
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publications</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Publications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publication> getPublications();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List out your professional skill-set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List any other languages you speak
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Languages</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Languages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getLanguages();

	/**
	 * Returns the value of the '<em><b>Interests</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Interest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interests</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Interests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interest> getInterests();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List references you have received
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.resume.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify career projects
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(Meta)
	 * @see org.nasdanika.models.resume.ResumePackage#getResume_Meta()
	 * @model containment="true"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Resume#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);
} // Resume
