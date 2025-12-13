/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.Meta;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.MetaImpl#getCanonical <em>Canonical</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.MetaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.MetaImpl#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaImpl extends ModelElementImpl implements Meta {
	/**
	 * The default value of the '{@link #getCanonical() <em>Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCanonical() {
		return (String)eDynamicGet(ResumePackage.META__CANONICAL, ResumePackage.Literals.META__CANONICAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanonical(String newCanonical) {
		eDynamicSet(ResumePackage.META__CANONICAL, ResumePackage.Literals.META__CANONICAL, newCanonical);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return (String)eDynamicGet(ResumePackage.META__VERSION, ResumePackage.Literals.META__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		eDynamicSet(ResumePackage.META__VERSION, ResumePackage.Literals.META__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModified() {
		return (String)eDynamicGet(ResumePackage.META__LAST_MODIFIED, ResumePackage.Literals.META__LAST_MODIFIED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(String newLastModified) {
		eDynamicSet(ResumePackage.META__LAST_MODIFIED, ResumePackage.Literals.META__LAST_MODIFIED, newLastModified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.META__CANONICAL:
				return getCanonical();
			case ResumePackage.META__VERSION:
				return getVersion();
			case ResumePackage.META__LAST_MODIFIED:
				return getLastModified();
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
			case ResumePackage.META__CANONICAL:
				setCanonical((String)newValue);
				return;
			case ResumePackage.META__VERSION:
				setVersion((String)newValue);
				return;
			case ResumePackage.META__LAST_MODIFIED:
				setLastModified((String)newValue);
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
			case ResumePackage.META__CANONICAL:
				setCanonical(CANONICAL_EDEFAULT);
				return;
			case ResumePackage.META__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ResumePackage.META__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
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
			case ResumePackage.META__CANONICAL:
				return CANONICAL_EDEFAULT == null ? getCanonical() != null : !CANONICAL_EDEFAULT.equals(getCanonical());
			case ResumePackage.META__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case ResumePackage.META__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? getLastModified() != null : !LAST_MODIFIED_EDEFAULT.equals(getLastModified());
		}
		return super.eIsSet(featureID);
	}

} //MetaImpl
