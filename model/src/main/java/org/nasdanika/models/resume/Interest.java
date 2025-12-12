/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Interest#getKeywords <em>Keywords</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getInterest()
 * @model
 * @generated
 */
public interface Interest extends Named {

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Friedrich Nietzsche
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see org.nasdanika.models.resume.ResumePackage#getInterest_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();
} // Interest
