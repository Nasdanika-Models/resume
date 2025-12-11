/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.resume.Basics;
import org.nasdanika.models.resume.Location;
import org.nasdanika.models.resume.Profile;
import org.nasdanika.models.resume.Resource;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.BasicsImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicsImpl extends MinimalEObjectImpl.Container implements Basics {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.BASICS;
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
		return (String)eDynamicGet(ResumePackage.BASICS__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.BASICS__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.BASICS__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.BASICS__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return (Location)eDynamicGet(ResumePackage.BASICS__LOCATION, ResumePackage.Literals.BASICS__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLocation, ResumePackage.BASICS__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		eDynamicSet(ResumePackage.BASICS__LOCATION, ResumePackage.Literals.BASICS__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Profile> getProfiles() {
		return (EList<Profile>)eDynamicGet(ResumePackage.BASICS__PROFILES, ResumePackage.Literals.BASICS__PROFILES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return (String)eDynamicGet(ResumePackage.BASICS__LABEL, ResumePackage.Literals.BASICS__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		eDynamicSet(ResumePackage.BASICS__LABEL, ResumePackage.Literals.BASICS__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return (String)eDynamicGet(ResumePackage.BASICS__IMAGE, ResumePackage.Literals.BASICS__IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		eDynamicSet(ResumePackage.BASICS__IMAGE, ResumePackage.Literals.BASICS__IMAGE, newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return (String)eDynamicGet(ResumePackage.BASICS__EMAIL, ResumePackage.Literals.BASICS__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		eDynamicSet(ResumePackage.BASICS__EMAIL, ResumePackage.Literals.BASICS__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhone() {
		return (String)eDynamicGet(ResumePackage.BASICS__PHONE, ResumePackage.Literals.BASICS__PHONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhone(String newPhone) {
		eDynamicSet(ResumePackage.BASICS__PHONE, ResumePackage.Literals.BASICS__PHONE, newPhone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(ResumePackage.BASICS__SUMMARY, ResumePackage.Literals.BASICS__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(ResumePackage.BASICS__SUMMARY, ResumePackage.Literals.BASICS__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResumePackage.BASICS__LOCATION:
				return basicSetLocation(null, msgs);
			case ResumePackage.BASICS__PROFILES:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.BASICS__NAME:
				return getName();
			case ResumePackage.BASICS__URL:
				return getUrl();
			case ResumePackage.BASICS__LOCATION:
				return getLocation();
			case ResumePackage.BASICS__PROFILES:
				return getProfiles();
			case ResumePackage.BASICS__LABEL:
				return getLabel();
			case ResumePackage.BASICS__IMAGE:
				return getImage();
			case ResumePackage.BASICS__EMAIL:
				return getEmail();
			case ResumePackage.BASICS__PHONE:
				return getPhone();
			case ResumePackage.BASICS__SUMMARY:
				return getSummary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResumePackage.BASICS__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.BASICS__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.BASICS__LOCATION:
				setLocation((Location)newValue);
				return;
			case ResumePackage.BASICS__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends Profile>)newValue);
				return;
			case ResumePackage.BASICS__LABEL:
				setLabel((String)newValue);
				return;
			case ResumePackage.BASICS__IMAGE:
				setImage((String)newValue);
				return;
			case ResumePackage.BASICS__EMAIL:
				setEmail((String)newValue);
				return;
			case ResumePackage.BASICS__PHONE:
				setPhone((String)newValue);
				return;
			case ResumePackage.BASICS__SUMMARY:
				setSummary((String)newValue);
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
			case ResumePackage.BASICS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.BASICS__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.BASICS__LOCATION:
				setLocation((Location)null);
				return;
			case ResumePackage.BASICS__PROFILES:
				getProfiles().clear();
				return;
			case ResumePackage.BASICS__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ResumePackage.BASICS__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case ResumePackage.BASICS__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ResumePackage.BASICS__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ResumePackage.BASICS__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
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
			case ResumePackage.BASICS__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.BASICS__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.BASICS__LOCATION:
				return getLocation() != null;
			case ResumePackage.BASICS__PROFILES:
				return !getProfiles().isEmpty();
			case ResumePackage.BASICS__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case ResumePackage.BASICS__IMAGE:
				return IMAGE_EDEFAULT == null ? getImage() != null : !IMAGE_EDEFAULT.equals(getImage());
			case ResumePackage.BASICS__EMAIL:
				return EMAIL_EDEFAULT == null ? getEmail() != null : !EMAIL_EDEFAULT.equals(getEmail());
			case ResumePackage.BASICS__PHONE:
				return PHONE_EDEFAULT == null ? getPhone() != null : !PHONE_EDEFAULT.equals(getPhone());
			case ResumePackage.BASICS__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
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
				case ResumePackage.BASICS__URL: return ResumePackage.RESOURCE__URL;
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
				case ResumePackage.RESOURCE__URL: return ResumePackage.BASICS__URL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BasicsImpl
