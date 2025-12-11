/**
 */
package org.nasdanika.models.resume;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Profile#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Profile#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends Resource {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Facebook or Twitter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getProfile_Network()
	 * @model
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Profile#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. neutralthoughts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getProfile_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Profile#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // Profile
