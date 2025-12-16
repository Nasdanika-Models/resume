/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Util;
import org.nasdanika.models.resume.Engagement;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engagement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getHighlights <em>Highlights</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EngagementImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EngagementImpl extends ModelElementImpl implements Engagement {
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
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.ENGAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.ENGAGEMENT__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.ENGAGEMENT__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getHighlights() {
		return (EList<String>)eDynamicGet(ResumePackage.ENGAGEMENT__HIGHLIGHTS, ResumePackage.Literals.ENGAGEMENT__HIGHLIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return (String)eDynamicGet(ResumePackage.ENGAGEMENT__SUMMARY, ResumePackage.Literals.ENGAGEMENT__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		eDynamicSet(ResumePackage.ENGAGEMENT__SUMMARY, ResumePackage.Literals.ENGAGEMENT__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(ResumePackage.ENGAGEMENT__START_DATE, ResumePackage.Literals.ENGAGEMENT__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(ResumePackage.ENGAGEMENT__START_DATE, ResumePackage.Literals.ENGAGEMENT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(ResumePackage.ENGAGEMENT__END_DATE, ResumePackage.Literals.ENGAGEMENT__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(ResumePackage.ENGAGEMENT__END_DATE, ResumePackage.Literals.ENGAGEMENT__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return (String)eDynamicGet(ResumePackage.ENGAGEMENT__POSITION, ResumePackage.Literals.ENGAGEMENT__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		eDynamicSet(ResumePackage.ENGAGEMENT__POSITION, ResumePackage.Literals.ENGAGEMENT__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.ENGAGEMENT__URL:
				return getUrl();
			case ResumePackage.ENGAGEMENT__HIGHLIGHTS:
				return getHighlights();
			case ResumePackage.ENGAGEMENT__SUMMARY:
				return getSummary();
			case ResumePackage.ENGAGEMENT__START_DATE:
				return getStartDate();
			case ResumePackage.ENGAGEMENT__END_DATE:
				return getEndDate();
			case ResumePackage.ENGAGEMENT__POSITION:
				return getPosition();
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
			case ResumePackage.ENGAGEMENT__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.ENGAGEMENT__HIGHLIGHTS:
				getHighlights().clear();
				getHighlights().addAll((Collection<? extends String>)newValue);
				return;
			case ResumePackage.ENGAGEMENT__SUMMARY:
				setSummary((String)newValue);
				return;
			case ResumePackage.ENGAGEMENT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ResumePackage.ENGAGEMENT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ResumePackage.ENGAGEMENT__POSITION:
				setPosition((String)newValue);
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
			case ResumePackage.ENGAGEMENT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.ENGAGEMENT__HIGHLIGHTS:
				getHighlights().clear();
				return;
			case ResumePackage.ENGAGEMENT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case ResumePackage.ENGAGEMENT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ResumePackage.ENGAGEMENT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ResumePackage.ENGAGEMENT__POSITION:
				setPosition(POSITION_EDEFAULT);
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
			case ResumePackage.ENGAGEMENT__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.ENGAGEMENT__HIGHLIGHTS:
				return !getHighlights().isEmpty();
			case ResumePackage.ENGAGEMENT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case ResumePackage.ENGAGEMENT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case ResumePackage.ENGAGEMENT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case ResumePackage.ENGAGEMENT__POSITION:
				return POSITION_EDEFAULT == null ? getPosition() != null : !POSITION_EDEFAULT.equals(getPosition());
		}
		return super.eIsSet(featureID);
	}
	
	protected String getContent() {
		StringBuilder contentBuilder = new StringBuilder();

		addBullet(contentBuilder, "Position", getPosition());
		// TODO - dates. Present if end date is null
		
		
				
		return contentBuilder.toString();
	}

	protected void addBullet(StringBuilder contentBuilder, String label, String value) {
		if (!Util.isBlank(value)) {
			contentBuilder
				.append("* **" + label +"**: ")
				.append(value)
				.append(System.lineSeparator());
		}
	}

} //EngagementImpl
