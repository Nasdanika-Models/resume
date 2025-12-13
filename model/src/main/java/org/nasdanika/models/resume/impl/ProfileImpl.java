/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.Profile;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ProfileImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProfileImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProfileImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends ModelElementImpl implements Profile {
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
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.PROFILE__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.PROFILE__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetwork() {
		return (String)eDynamicGet(ResumePackage.PROFILE__NETWORK, ResumePackage.Literals.PROFILE__NETWORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(String newNetwork) {
		eDynamicSet(ResumePackage.PROFILE__NETWORK, ResumePackage.Literals.PROFILE__NETWORK, newNetwork);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return (String)eDynamicGet(ResumePackage.PROFILE__USERNAME, ResumePackage.Literals.PROFILE__USERNAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		eDynamicSet(ResumePackage.PROFILE__USERNAME, ResumePackage.Literals.PROFILE__USERNAME, newUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.PROFILE__URL:
				return getUrl();
			case ResumePackage.PROFILE__NETWORK:
				return getNetwork();
			case ResumePackage.PROFILE__USERNAME:
				return getUsername();
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
			case ResumePackage.PROFILE__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.PROFILE__NETWORK:
				setNetwork((String)newValue);
				return;
			case ResumePackage.PROFILE__USERNAME:
				setUsername((String)newValue);
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
			case ResumePackage.PROFILE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.PROFILE__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case ResumePackage.PROFILE__USERNAME:
				setUsername(USERNAME_EDEFAULT);
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
			case ResumePackage.PROFILE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.PROFILE__NETWORK:
				return NETWORK_EDEFAULT == null ? getNetwork() != null : !NETWORK_EDEFAULT.equals(getNetwork());
			case ResumePackage.PROFILE__USERNAME:
				return USERNAME_EDEFAULT == null ? getUsername() != null : !USERNAME_EDEFAULT.equals(getUsername());
		}
		return super.eIsSet(featureID);
	}

} //ProfileImpl
