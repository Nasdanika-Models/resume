/**
 */
package org.nasdanika.models.resume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Language#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Language#getFluency <em>Fluency</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends ModelElement {

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. English, Spanish
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getLanguage_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Language#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Fluency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Fluent, Beginner
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fluency</em>' attribute.
	 * @see #setFluency(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getLanguage_Fluency()
	 * @model
	 * @generated
	 */
	String getFluency();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Language#getFluency <em>Fluency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fluency</em>' attribute.
	 * @see #getFluency()
	 * @generated
	 */
	void setFluency(String value);
} // Language
