/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.resume.Language;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.LanguageImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.LanguageImpl#getFluency <em>Fluency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends MinimalEObjectImpl.Container implements Language {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getFluency() <em>Fluency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluency()
	 * @generated
	 * @ordered
	 */
	protected static final String FLUENCY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(ResumePackage.LANGUAGE__LANGUAGE, ResumePackage.Literals.LANGUAGE__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(ResumePackage.LANGUAGE__LANGUAGE, ResumePackage.Literals.LANGUAGE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFluency() {
		return (String)eDynamicGet(ResumePackage.LANGUAGE__FLUENCY, ResumePackage.Literals.LANGUAGE__FLUENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFluency(String newFluency) {
		eDynamicSet(ResumePackage.LANGUAGE__FLUENCY, ResumePackage.Literals.LANGUAGE__FLUENCY, newFluency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.LANGUAGE__LANGUAGE:
				return getLanguage();
			case ResumePackage.LANGUAGE__FLUENCY:
				return getFluency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResumePackage.LANGUAGE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ResumePackage.LANGUAGE__FLUENCY:
				setFluency((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResumePackage.LANGUAGE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ResumePackage.LANGUAGE__FLUENCY:
				setFluency(FLUENCY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResumePackage.LANGUAGE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case ResumePackage.LANGUAGE__FLUENCY:
				return FLUENCY_EDEFAULT == null ? getFluency() != null : !FLUENCY_EDEFAULT.equals(getFluency());
		}
		return super.eIsSet(featureID);
	}

} //LanguageImpl
