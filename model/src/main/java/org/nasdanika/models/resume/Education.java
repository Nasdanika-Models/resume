/**
 */
package org.nasdanika.models.resume;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Education#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getArea <em>Area</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Education#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getEducation()
 * @model
 * @generated
 */
public interface Education extends Resource {

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Massachusetts Institute of Technology
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Institution</em>' attribute.
	 * @see #setInstitution(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_Institution()
	 * @model
	 * @generated
	 */
	String getInstitution();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getInstitution <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' attribute.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(String value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Arts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_Area()
	 * @model
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Study Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Bachelor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Type</em>' attribute.
	 * @see #setStudyType(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_StudyType()
	 * @model
	 * @generated
	 */
	String getStudyType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getStudyType <em>Study Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Type</em>' attribute.
	 * @see #getStudyType()
	 * @generated
	 */
	void setStudyType(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * grade point average, e.g. 3.67/4.0
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_Score()
	 * @model
	 * @generated
	 */
	String getScore();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Education#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List notable courses/subjects
	 * e.g. H1302 - Introduction to American history
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Courses</em>' attribute list.
	 * @see org.nasdanika.models.resume.ResumePackage#getEducation_Courses()
	 * @model
	 * @generated
	 */
	EList<String> getCourses();
} // Education
