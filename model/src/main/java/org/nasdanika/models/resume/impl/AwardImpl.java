/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.Award;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Award</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.AwardImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.AwardImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.AwardImpl#getAwarder <em>Awarder</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.AwardImpl#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwardImpl extends ModelElementImpl implements Award {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
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
	 * The default value of the '{@link #getAwarder() <em>Awarder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwarder()
	 * @generated
	 * @ordered
	 */
	protected static final String AWARDER_EDEFAULT = null;
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
	protected AwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.AWARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(ResumePackage.AWARD__TITLE, ResumePackage.Literals.AWARD__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(ResumePackage.AWARD__TITLE, ResumePackage.Literals.AWARD__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(ResumePackage.AWARD__DATE, ResumePackage.Literals.AWARD__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(ResumePackage.AWARD__DATE, ResumePackage.Literals.AWARD__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAwarder() {
		return (String)eDynamicGet(ResumePackage.AWARD__AWARDER, ResumePackage.Literals.AWARD__AWARDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwarder(String newAwarder) {
		eDynamicSet(ResumePackage.AWARD__AWARDER, ResumePackage.Literals.AWARD__AWARDER, newAwarder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(ResumePackage.AWARD__SUMMARY, ResumePackage.Literals.AWARD__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(ResumePackage.AWARD__SUMMARY, ResumePackage.Literals.AWARD__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.AWARD__TITLE:
				return getTitle();
			case ResumePackage.AWARD__DATE:
				return getDate();
			case ResumePackage.AWARD__AWARDER:
				return getAwarder();
			case ResumePackage.AWARD__SUMMARY:
				return getSummary();
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
			case ResumePackage.AWARD__TITLE:
				setTitle((String)newValue);
				return;
			case ResumePackage.AWARD__DATE:
				setDate((Date)newValue);
				return;
			case ResumePackage.AWARD__AWARDER:
				setAwarder((String)newValue);
				return;
			case ResumePackage.AWARD__SUMMARY:
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
			case ResumePackage.AWARD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ResumePackage.AWARD__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ResumePackage.AWARD__AWARDER:
				setAwarder(AWARDER_EDEFAULT);
				return;
			case ResumePackage.AWARD__SUMMARY:
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
			case ResumePackage.AWARD__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case ResumePackage.AWARD__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case ResumePackage.AWARD__AWARDER:
				return AWARDER_EDEFAULT == null ? getAwarder() != null : !AWARDER_EDEFAULT.equals(getAwarder());
			case ResumePackage.AWARD__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
		}
		return super.eIsSet(featureID);
	}

} //AwardImpl
