/**
 */
package org.nasdanika.models.resume.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Content;
import org.nasdanika.common.Section;
import org.nasdanika.models.resume.Reference;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ReferenceImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends ModelElementImpl implements Reference {
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
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(ResumePackage.REFERENCE__NAME, ResumePackage.Literals.NAMED__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(ResumePackage.REFERENCE__NAME, ResumePackage.Literals.NAMED__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReference() {
		return (String)eDynamicGet(ResumePackage.REFERENCE__REFERENCE, ResumePackage.Literals.REFERENCE__REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(String newReference) {
		eDynamicSet(ResumePackage.REFERENCE__REFERENCE, ResumePackage.Literals.REFERENCE__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.REFERENCE__NAME:
				return getName();
			case ResumePackage.REFERENCE__REFERENCE:
				return getReference();
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
			case ResumePackage.REFERENCE__NAME:
				setName((String)newValue);
				return;
			case ResumePackage.REFERENCE__REFERENCE:
				setReference((String)newValue);
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
			case ResumePackage.REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResumePackage.REFERENCE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
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
			case ResumePackage.REFERENCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ResumePackage.REFERENCE__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Section toSection() {
		Section ret = new Section(getName(), null);
		ret.getContents().add(new Content(getReference(), Content.MARKDOWN));			
		return ret;
	}

} //ReferenceImpl
