/**
 */
package org.nasdanika.models.resume;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.Skill#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.Skill#getKeywords <em>Keywords</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.resume.ResumePackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends Named {

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * e.g. Master
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.nasdanika.models.resume.ResumePackage#getSkill_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.resume.Skill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List some keywords pertaining to this skill, e.g. HTML
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see org.nasdanika.models.resume.ResumePackage#getSkill_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();
} // Skill
