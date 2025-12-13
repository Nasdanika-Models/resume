/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.Project;
import org.nasdanika.models.resume.Resource;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getHighlights <em>Highlights</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ProjectImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends ModelElementImpl implements Project {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
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
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ResumePackage.PROJECT__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.PROJECT__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.PROJECT__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.PROJECT__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ResumePackage.PROJECT__DESCRIPTION, ResumePackage.Literals.PROJECT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ResumePackage.PROJECT__DESCRIPTION, ResumePackage.Literals.PROJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getHighlights() {
		return (EList<String>)eDynamicGet(ResumePackage.PROJECT__HIGHLIGHTS, ResumePackage.Literals.PROJECT__HIGHLIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getKeywords() {
		return (EList<String>)eDynamicGet(ResumePackage.PROJECT__KEYWORDS, ResumePackage.Literals.PROJECT__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(ResumePackage.PROJECT__START_DATE, ResumePackage.Literals.PROJECT__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(ResumePackage.PROJECT__START_DATE, ResumePackage.Literals.PROJECT__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(ResumePackage.PROJECT__END_DATE, ResumePackage.Literals.PROJECT__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(ResumePackage.PROJECT__END_DATE, ResumePackage.Literals.PROJECT__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getRoles() {
		return (EList<String>)eDynamicGet(ResumePackage.PROJECT__ROLES, ResumePackage.Literals.PROJECT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntity() {
		return (String)eDynamicGet(ResumePackage.PROJECT__ENTITY, ResumePackage.Literals.PROJECT__ENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(String newEntity) {
		eDynamicSet(ResumePackage.PROJECT__ENTITY, ResumePackage.Literals.PROJECT__ENTITY, newEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(ResumePackage.PROJECT__TYPE, ResumePackage.Literals.PROJECT__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(ResumePackage.PROJECT__TYPE, ResumePackage.Literals.PROJECT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.PROJECT__NAME:
				return getName();
			case ResumePackage.PROJECT__URL:
				return getUrl();
			case ResumePackage.PROJECT__DESCRIPTION:
				return getDescription();
			case ResumePackage.PROJECT__HIGHLIGHTS:
				return getHighlights();
			case ResumePackage.PROJECT__KEYWORDS:
				return getKeywords();
			case ResumePackage.PROJECT__START_DATE:
				return getStartDate();
			case ResumePackage.PROJECT__END_DATE:
				return getEndDate();
			case ResumePackage.PROJECT__ROLES:
				return getRoles();
			case ResumePackage.PROJECT__ENTITY:
				return getEntity();
			case ResumePackage.PROJECT__TYPE:
				return getType();
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
			case ResumePackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.PROJECT__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ResumePackage.PROJECT__HIGHLIGHTS:
				getHighlights().clear();
				getHighlights().addAll((Collection<? extends String>)newValue);
				return;
			case ResumePackage.PROJECT__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case ResumePackage.PROJECT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ResumePackage.PROJECT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ResumePackage.PROJECT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case ResumePackage.PROJECT__ENTITY:
				setEntity((String)newValue);
				return;
			case ResumePackage.PROJECT__TYPE:
				setType((String)newValue);
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
			case ResumePackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.PROJECT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ResumePackage.PROJECT__HIGHLIGHTS:
				getHighlights().clear();
				return;
			case ResumePackage.PROJECT__KEYWORDS:
				getKeywords().clear();
				return;
			case ResumePackage.PROJECT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ResumePackage.PROJECT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ResumePackage.PROJECT__ROLES:
				getRoles().clear();
				return;
			case ResumePackage.PROJECT__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case ResumePackage.PROJECT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ResumePackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.PROJECT__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ResumePackage.PROJECT__HIGHLIGHTS:
				return !getHighlights().isEmpty();
			case ResumePackage.PROJECT__KEYWORDS:
				return !getKeywords().isEmpty();
			case ResumePackage.PROJECT__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case ResumePackage.PROJECT__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case ResumePackage.PROJECT__ROLES:
				return !getRoles().isEmpty();
			case ResumePackage.PROJECT__ENTITY:
				return ENTITY_EDEFAULT == null ? getEntity() != null : !ENTITY_EDEFAULT.equals(getEntity());
			case ResumePackage.PROJECT__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
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
				case ResumePackage.PROJECT__URL: return ResumePackage.RESOURCE__URL;
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
				case ResumePackage.RESOURCE__URL: return ResumePackage.PROJECT__URL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProjectImpl
