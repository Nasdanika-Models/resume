/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.resume.Certificate;
import org.nasdanika.models.resume.Resource;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.CertificateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.CertificateImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.CertificateImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.CertificateImpl#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateImpl extends MinimalEObjectImpl.Container implements Certificate {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIssuer() <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuer()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.CERTIFICATE;
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
	public String getName() {
		return (String)eDynamicGet(ResumePackage.CERTIFICATE__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.CERTIFICATE__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.CERTIFICATE__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.CERTIFICATE__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(ResumePackage.CERTIFICATE__DATE, ResumePackage.Literals.CERTIFICATE__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(ResumePackage.CERTIFICATE__DATE, ResumePackage.Literals.CERTIFICATE__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuer() {
		return (String)eDynamicGet(ResumePackage.CERTIFICATE__ISSUER, ResumePackage.Literals.CERTIFICATE__ISSUER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuer(String newIssuer) {
		eDynamicSet(ResumePackage.CERTIFICATE__ISSUER, ResumePackage.Literals.CERTIFICATE__ISSUER, newIssuer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.CERTIFICATE__NAME:
				return getName();
			case ResumePackage.CERTIFICATE__URL:
				return getUrl();
			case ResumePackage.CERTIFICATE__DATE:
				return getDate();
			case ResumePackage.CERTIFICATE__ISSUER:
				return getIssuer();
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
			case ResumePackage.CERTIFICATE__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.CERTIFICATE__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.CERTIFICATE__DATE:
				setDate((Date)newValue);
				return;
			case ResumePackage.CERTIFICATE__ISSUER:
				setIssuer((String)newValue);
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
			case ResumePackage.CERTIFICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.CERTIFICATE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.CERTIFICATE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ResumePackage.CERTIFICATE__ISSUER:
				setIssuer(ISSUER_EDEFAULT);
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
			case ResumePackage.CERTIFICATE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.CERTIFICATE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.CERTIFICATE__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case ResumePackage.CERTIFICATE__ISSUER:
				return ISSUER_EDEFAULT == null ? getIssuer() != null : !ISSUER_EDEFAULT.equals(getIssuer());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Resource.class) {
			switch (derivedFeatureID) {
				case ResumePackage.CERTIFICATE__URL: return ResumePackage.RESOURCE__URL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Resource.class) {
			switch (baseFeatureID) {
				case ResumePackage.RESOURCE__URL: return ResumePackage.CERTIFICATE__URL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CertificateImpl
