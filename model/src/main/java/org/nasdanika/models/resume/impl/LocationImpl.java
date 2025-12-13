/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.Location;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.LocationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.LocationImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.LocationImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.LocationImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.LocationImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends ModelElementImpl implements Location {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return (String)eDynamicGet(ResumePackage.LOCATION__ADDRESS, ResumePackage.Literals.LOCATION__ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		eDynamicSet(ResumePackage.LOCATION__ADDRESS, ResumePackage.Literals.LOCATION__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return (String)eDynamicGet(ResumePackage.LOCATION__POSTAL_CODE, ResumePackage.Literals.LOCATION__POSTAL_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		eDynamicSet(ResumePackage.LOCATION__POSTAL_CODE, ResumePackage.Literals.LOCATION__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eDynamicGet(ResumePackage.LOCATION__CITY, ResumePackage.Literals.LOCATION__CITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eDynamicSet(ResumePackage.LOCATION__CITY, ResumePackage.Literals.LOCATION__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCode() {
		return (String)eDynamicGet(ResumePackage.LOCATION__COUNTRY_CODE, ResumePackage.Literals.LOCATION__COUNTRY_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(String newCountryCode) {
		eDynamicSet(ResumePackage.LOCATION__COUNTRY_CODE, ResumePackage.Literals.LOCATION__COUNTRY_CODE, newCountryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegion() {
		return (String)eDynamicGet(ResumePackage.LOCATION__REGION, ResumePackage.Literals.LOCATION__REGION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(String newRegion) {
		eDynamicSet(ResumePackage.LOCATION__REGION, ResumePackage.Literals.LOCATION__REGION, newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.LOCATION__ADDRESS:
				return getAddress();
			case ResumePackage.LOCATION__POSTAL_CODE:
				return getPostalCode();
			case ResumePackage.LOCATION__CITY:
				return getCity();
			case ResumePackage.LOCATION__COUNTRY_CODE:
				return getCountryCode();
			case ResumePackage.LOCATION__REGION:
				return getRegion();
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
			case ResumePackage.LOCATION__ADDRESS:
				setAddress((String)newValue);
				return;
			case ResumePackage.LOCATION__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case ResumePackage.LOCATION__CITY:
				setCity((String)newValue);
				return;
			case ResumePackage.LOCATION__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case ResumePackage.LOCATION__REGION:
				setRegion((String)newValue);
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
			case ResumePackage.LOCATION__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ResumePackage.LOCATION__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case ResumePackage.LOCATION__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case ResumePackage.LOCATION__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case ResumePackage.LOCATION__REGION:
				setRegion(REGION_EDEFAULT);
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
			case ResumePackage.LOCATION__ADDRESS:
				return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
			case ResumePackage.LOCATION__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? getPostalCode() != null : !POSTAL_CODE_EDEFAULT.equals(getPostalCode());
			case ResumePackage.LOCATION__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
			case ResumePackage.LOCATION__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? getCountryCode() != null : !COUNTRY_CODE_EDEFAULT.equals(getCountryCode());
			case ResumePackage.LOCATION__REGION:
				return REGION_EDEFAULT == null ? getRegion() != null : !REGION_EDEFAULT.equals(getRegion());
		}
		return super.eIsSet(featureID);
	}

} //LocationImpl
