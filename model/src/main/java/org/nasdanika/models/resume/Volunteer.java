/**
 */
package org.nasdanika.models.resume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volunteer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Volunteer#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getVolunteer()
 * @model
 * @generated
 */
public interface Volunteer extends Engagement {

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Facebook
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getVolunteer_Organization()
	 * @model
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Volunteer#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);
} // Volunteer
