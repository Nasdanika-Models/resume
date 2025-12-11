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
import org.nasdanika.models.resume.Award;
import org.nasdanika.models.resume.Basics;
import org.nasdanika.models.resume.Certificate;
import org.nasdanika.models.resume.Education;
import org.nasdanika.models.resume.Interest;
import org.nasdanika.models.resume.Language;
import org.nasdanika.models.resume.Meta;
import org.nasdanika.models.resume.Project;
import org.nasdanika.models.resume.Publication;
import org.nasdanika.models.resume.Reference;
import org.nasdanika.models.resume.Resume;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.models.resume.Skill;
import org.nasdanika.models.resume.Volunteer;
import org.nasdanika.models.resume.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getBasics <em>Basics</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getWork <em>Work</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getVolunteer <em>Volunteer</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getEducation <em>Education</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getAwards <em>Awards</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getPublications <em>Publications</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getInterests <em>Interests</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getMeta <em>Meta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResumeImpl extends MinimalEObjectImpl.Container implements Resume {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.RESUME;
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
	public Basics getBasics() {
		return (Basics)eDynamicGet(ResumePackage.RESUME__BASICS, ResumePackage.Literals.RESUME__BASICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasics(Basics newBasics, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBasics, ResumePackage.RESUME__BASICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasics(Basics newBasics) {
		eDynamicSet(ResumePackage.RESUME__BASICS, ResumePackage.Literals.RESUME__BASICS, newBasics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Work> getWork() {
		return (EList<Work>)eDynamicGet(ResumePackage.RESUME__WORK, ResumePackage.Literals.RESUME__WORK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Volunteer> getVolunteer() {
		return (EList<Volunteer>)eDynamicGet(ResumePackage.RESUME__VOLUNTEER, ResumePackage.Literals.RESUME__VOLUNTEER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Education> getEducation() {
		return (EList<Education>)eDynamicGet(ResumePackage.RESUME__EDUCATION, ResumePackage.Literals.RESUME__EDUCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Award> getAwards() {
		return (EList<Award>)eDynamicGet(ResumePackage.RESUME__AWARDS, ResumePackage.Literals.RESUME__AWARDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Certificate> getCertificates() {
		return (EList<Certificate>)eDynamicGet(ResumePackage.RESUME__CERTIFICATES, ResumePackage.Literals.RESUME__CERTIFICATES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Publication> getPublications() {
		return (EList<Publication>)eDynamicGet(ResumePackage.RESUME__PUBLICATIONS, ResumePackage.Literals.RESUME__PUBLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(ResumePackage.RESUME__SKILLS, ResumePackage.Literals.RESUME__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Language> getLanguages() {
		return (EList<Language>)eDynamicGet(ResumePackage.RESUME__LANGUAGES, ResumePackage.Literals.RESUME__LANGUAGES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Interest> getInterests() {
		return (EList<Interest>)eDynamicGet(ResumePackage.RESUME__INTERESTS, ResumePackage.Literals.RESUME__INTERESTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Reference> getReferences() {
		return (EList<Reference>)eDynamicGet(ResumePackage.RESUME__REFERENCES, ResumePackage.Literals.RESUME__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getProjects() {
		return (EList<Project>)eDynamicGet(ResumePackage.RESUME__PROJECTS, ResumePackage.Literals.RESUME__PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getMeta() {
		return (Meta)eDynamicGet(ResumePackage.RESUME__META, ResumePackage.Literals.RESUME__META, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(Meta newMeta, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMeta, ResumePackage.RESUME__META, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeta(Meta newMeta) {
		eDynamicSet(ResumePackage.RESUME__META, ResumePackage.Literals.RESUME__META, newMeta);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResumePackage.RESUME__BASICS:
				return basicSetBasics(null, msgs);
			case ResumePackage.RESUME__WORK:
				return ((InternalEList<?>)getWork()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__VOLUNTEER:
				return ((InternalEList<?>)getVolunteer()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__EDUCATION:
				return ((InternalEList<?>)getEducation()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__AWARDS:
				return ((InternalEList<?>)getAwards()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__CERTIFICATES:
				return ((InternalEList<?>)getCertificates()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__PUBLICATIONS:
				return ((InternalEList<?>)getPublications()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__LANGUAGES:
				return ((InternalEList<?>)getLanguages()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__INTERESTS:
				return ((InternalEList<?>)getInterests()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__META:
				return basicSetMeta(null, msgs);
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
			case ResumePackage.RESUME__BASICS:
				return getBasics();
			case ResumePackage.RESUME__WORK:
				return getWork();
			case ResumePackage.RESUME__VOLUNTEER:
				return getVolunteer();
			case ResumePackage.RESUME__EDUCATION:
				return getEducation();
			case ResumePackage.RESUME__AWARDS:
				return getAwards();
			case ResumePackage.RESUME__CERTIFICATES:
				return getCertificates();
			case ResumePackage.RESUME__PUBLICATIONS:
				return getPublications();
			case ResumePackage.RESUME__SKILLS:
				return getSkills();
			case ResumePackage.RESUME__LANGUAGES:
				return getLanguages();
			case ResumePackage.RESUME__INTERESTS:
				return getInterests();
			case ResumePackage.RESUME__REFERENCES:
				return getReferences();
			case ResumePackage.RESUME__PROJECTS:
				return getProjects();
			case ResumePackage.RESUME__META:
				return getMeta();
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
			case ResumePackage.RESUME__BASICS:
				setBasics((Basics)newValue);
				return;
			case ResumePackage.RESUME__WORK:
				getWork().clear();
				getWork().addAll((Collection<? extends Work>)newValue);
				return;
			case ResumePackage.RESUME__VOLUNTEER:
				getVolunteer().clear();
				getVolunteer().addAll((Collection<? extends Volunteer>)newValue);
				return;
			case ResumePackage.RESUME__EDUCATION:
				getEducation().clear();
				getEducation().addAll((Collection<? extends Education>)newValue);
				return;
			case ResumePackage.RESUME__AWARDS:
				getAwards().clear();
				getAwards().addAll((Collection<? extends Award>)newValue);
				return;
			case ResumePackage.RESUME__CERTIFICATES:
				getCertificates().clear();
				getCertificates().addAll((Collection<? extends Certificate>)newValue);
				return;
			case ResumePackage.RESUME__PUBLICATIONS:
				getPublications().clear();
				getPublications().addAll((Collection<? extends Publication>)newValue);
				return;
			case ResumePackage.RESUME__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case ResumePackage.RESUME__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case ResumePackage.RESUME__INTERESTS:
				getInterests().clear();
				getInterests().addAll((Collection<? extends Interest>)newValue);
				return;
			case ResumePackage.RESUME__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResumePackage.RESUME__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case ResumePackage.RESUME__META:
				setMeta((Meta)newValue);
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
			case ResumePackage.RESUME__BASICS:
				setBasics((Basics)null);
				return;
			case ResumePackage.RESUME__WORK:
				getWork().clear();
				return;
			case ResumePackage.RESUME__VOLUNTEER:
				getVolunteer().clear();
				return;
			case ResumePackage.RESUME__EDUCATION:
				getEducation().clear();
				return;
			case ResumePackage.RESUME__AWARDS:
				getAwards().clear();
				return;
			case ResumePackage.RESUME__CERTIFICATES:
				getCertificates().clear();
				return;
			case ResumePackage.RESUME__PUBLICATIONS:
				getPublications().clear();
				return;
			case ResumePackage.RESUME__SKILLS:
				getSkills().clear();
				return;
			case ResumePackage.RESUME__LANGUAGES:
				getLanguages().clear();
				return;
			case ResumePackage.RESUME__INTERESTS:
				getInterests().clear();
				return;
			case ResumePackage.RESUME__REFERENCES:
				getReferences().clear();
				return;
			case ResumePackage.RESUME__PROJECTS:
				getProjects().clear();
				return;
			case ResumePackage.RESUME__META:
				setMeta((Meta)null);
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
			case ResumePackage.RESUME__BASICS:
				return getBasics() != null;
			case ResumePackage.RESUME__WORK:
				return !getWork().isEmpty();
			case ResumePackage.RESUME__VOLUNTEER:
				return !getVolunteer().isEmpty();
			case ResumePackage.RESUME__EDUCATION:
				return !getEducation().isEmpty();
			case ResumePackage.RESUME__AWARDS:
				return !getAwards().isEmpty();
			case ResumePackage.RESUME__CERTIFICATES:
				return !getCertificates().isEmpty();
			case ResumePackage.RESUME__PUBLICATIONS:
				return !getPublications().isEmpty();
			case ResumePackage.RESUME__SKILLS:
				return !getSkills().isEmpty();
			case ResumePackage.RESUME__LANGUAGES:
				return !getLanguages().isEmpty();
			case ResumePackage.RESUME__INTERESTS:
				return !getInterests().isEmpty();
			case ResumePackage.RESUME__REFERENCES:
				return !getReferences().isEmpty();
			case ResumePackage.RESUME__PROJECTS:
				return !getProjects().isEmpty();
			case ResumePackage.RESUME__META:
				return getMeta() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResumeImpl
