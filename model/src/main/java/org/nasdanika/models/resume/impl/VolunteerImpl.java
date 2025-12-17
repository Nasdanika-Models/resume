/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Content;
import org.nasdanika.common.Section;
import org.nasdanika.common.Util;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.models.resume.Volunteer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volunteer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.VolunteerImpl#getOrganization <em>Organization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolunteerImpl extends EngagementImpl implements Volunteer {
	/**
	 * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolunteerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.VOLUNTEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganization() {
		return (String)eDynamicGet(ResumePackage.VOLUNTEER__ORGANIZATION, ResumePackage.Literals.VOLUNTEER__ORGANIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(String newOrganization) {
		eDynamicSet(ResumePackage.VOLUNTEER__ORGANIZATION, ResumePackage.Literals.VOLUNTEER__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.VOLUNTEER__ORGANIZATION:
				return getOrganization();
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
			case ResumePackage.VOLUNTEER__ORGANIZATION:
				setOrganization((String)newValue);
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
			case ResumePackage.VOLUNTEER__ORGANIZATION:
				setOrganization(ORGANIZATION_EDEFAULT);
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
			case ResumePackage.VOLUNTEER__ORGANIZATION:
				return ORGANIZATION_EDEFAULT == null ? getOrganization() != null : !ORGANIZATION_EDEFAULT.equals(getOrganization());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Section toSection() {
		Section ret = new Section(getPosition(), null);
		StringBuilder contentBuilder = new StringBuilder();
		String name = getOrganization();
		String url = getUrl();
		if (!Util.isBlank(url) && !Util.isBlank(name)) {
			name = "[" + name + "](" + url + ")";
		}
				
		if (!Util.isBlank(name)) {
			contentBuilder.append(name);
		}
		
		String period = renderPeriod(getStartDate(), getEndDate());
		if (!Util.isBlank(period)) {
			if (!contentBuilder.isEmpty()) {
				contentBuilder.append(", ");
			}
			contentBuilder.append(period);
		}
		
		if (!contentBuilder.isEmpty()) {
			contentBuilder
				.append(System.lineSeparator())
				.append(System.lineSeparator());
		}
				
		String summary = getSummary();
		if (!Util.isBlank(summary)) {
			contentBuilder
				.append(summary)
				.append(System.lineSeparator())
				.append(System.lineSeparator());
		}
	
		EList<String> highlights = getHighlights();
		if (!highlights.isEmpty()) {
			highlights.forEach(h -> contentBuilder
				.append("* ")
				.append(h)
				.append(System.lineSeparator()));
			
			contentBuilder.append(System.lineSeparator());
		}		
		
		if (!contentBuilder.isEmpty()) {		
			ret.getContents().add(new Content(contentBuilder.toString(), Content.MARKDOWN));			
		}		
		return ret;
	}

} //VolunteerImpl
