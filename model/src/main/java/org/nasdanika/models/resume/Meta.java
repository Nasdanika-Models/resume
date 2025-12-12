/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Meta#getCanonical <em>Canonical</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Meta#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Meta#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getMeta()
 * @model
 * @generated
 */
public interface Meta extends EObject {

	/**
	 * Returns the value of the '<em><b>Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL (as per RFC 3986) to latest version of this document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canonical</em>' attribute.
	 * @see #setCanonical(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getMeta_Canonical()
	 * @model
	 * @generated
	 */
	String getCanonical();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Meta#getCanonical <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonical</em>' attribute.
	 * @see #getCanonical()
	 * @generated
	 */
	void setCanonical(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A version field which follows semver - e.g. v1.0.0
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getMeta_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Meta#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Using ISO 8601 with YYYY-MM-DDThh:mm:ss
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getMeta_LastModified()
	 * @model
	 * @generated
	 */
	String getLastModified();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Meta#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(String value);
} // Meta
