/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Content;
import org.nasdanika.common.Section;
import org.nasdanika.common.Util;
import org.nasdanika.models.resume.Named;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.models.resume.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.WorkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.WorkImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.WorkImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkImpl extends EngagementImpl implements Work {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ResumePackage.WORK__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.WORK__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(ResumePackage.WORK__LOCATION, ResumePackage.Literals.WORK__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(ResumePackage.WORK__LOCATION, ResumePackage.Literals.WORK__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ResumePackage.WORK__DESCRIPTION, ResumePackage.Literals.WORK__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ResumePackage.WORK__DESCRIPTION, ResumePackage.Literals.WORK__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.WORK__NAME:
				return getName();
			case ResumePackage.WORK__LOCATION:
				return getLocation();
			case ResumePackage.WORK__DESCRIPTION:
				return getDescription();
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
			case ResumePackage.WORK__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.WORK__LOCATION:
				setLocation((String)newValue);
				return;
			case ResumePackage.WORK__DESCRIPTION:
				setDescription((String)newValue);
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
			case ResumePackage.WORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.WORK__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ResumePackage.WORK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ResumePackage.WORK__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.WORK__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case ResumePackage.WORK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
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
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case ResumePackage.WORK__NAME: return ResumePackage.NAMED__NAME;
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
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case ResumePackage.NAMED__NAME: return ResumePackage.WORK__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	@Override
	public Section toSection() {
		Section ret = new Section(getPosition(), null);
		StringBuilder contentBuilder = new StringBuilder();
		String name = getName();
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
		
		String location = getLocation();
		if (!Util.isBlank(location)) {
			contentBuilder
				.append("**Location:** ")
				.append(location)
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
		
		String description = getDescription();
		if (!Util.isBlank(description)) {
			contentBuilder
				.append(description)
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

} //WorkImpl
