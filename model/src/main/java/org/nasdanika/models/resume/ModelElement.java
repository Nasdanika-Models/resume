/**
 */
package org.nasdanika.models.resume;

import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.json.JSONObject;

import org.nasdanika.ncore.Documented;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.resume.ResumePackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends Documented {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonObjectDataType="org.nasdanika.models.resume.JSONObject"
	 * @generated
	 */
	void load(JSONObject jsonObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void loadYaml(String yamlString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contentProviderDataType="org.nasdanika.models.resume.Function&lt;org.eclipse.emf.ecore.EStructuralFeature, ?&gt;"
	 * @generated
	 */
	void load(Function<EStructuralFeature, ?> contentProvider);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.resume.JSONObject"
	 * @generated
	 */
	JSONObject toJSON();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toYAML();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contentConsumerProviderDataType="org.nasdanika.models.resume.Function&lt;org.eclipse.emf.ecore.EStructuralFeature, org.nasdanika.models.resume.Consumer&lt;?&gt;&gt;"
	 * @generated
	 */
	void save(Function<EStructuralFeature, Consumer<?>> contentConsumerProvider);

} // ModelElement
