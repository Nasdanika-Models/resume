/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.models.resume.Skill;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.SkillImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.SkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.SkillImpl#getKeywords <em>Keywords</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends ModelElementImpl implements Skill {
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
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ResumePackage.SKILL__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.SKILL__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevel() {
		return (String)eDynamicGet(ResumePackage.SKILL__LEVEL, ResumePackage.Literals.SKILL__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(String newLevel) {
		eDynamicSet(ResumePackage.SKILL__LEVEL, ResumePackage.Literals.SKILL__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getKeywords() {
		return (EList<String>)eDynamicGet(ResumePackage.SKILL__KEYWORDS, ResumePackage.Literals.SKILL__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.SKILL__NAME:
				return getName();
			case ResumePackage.SKILL__LEVEL:
				return getLevel();
			case ResumePackage.SKILL__KEYWORDS:
				return getKeywords();
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
			case ResumePackage.SKILL__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.SKILL__LEVEL:
				setLevel((String)newValue);
				return;
			case ResumePackage.SKILL__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
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
			case ResumePackage.SKILL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case ResumePackage.SKILL__KEYWORDS:
				getKeywords().clear();
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
			case ResumePackage.SKILL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.SKILL__LEVEL:
				return LEVEL_EDEFAULT == null ? getLevel() != null : !LEVEL_EDEFAULT.equals(getLevel());
			case ResumePackage.SKILL__KEYWORDS:
				return !getKeywords().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SkillImpl
