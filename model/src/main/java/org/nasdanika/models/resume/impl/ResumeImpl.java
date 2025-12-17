/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONObject;
import org.nasdanika.common.Adaptable;
import org.nasdanika.common.Content;
import org.nasdanika.common.Section;
import org.nasdanika.common.Util;
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
import org.nasdanika.ncore.Marker;
import org.nasdanika.ncore.ModelElement;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.ncore.Property;
import org.nasdanika.persistence.Marked;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getUris <em>Uris</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getLabelPrototype <em>Label Prototype</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getRepresentations <em>Representations</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ResumeImpl#getAnnotations <em>Annotations</em>}</li>
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
public class ResumeImpl extends ModelElementImpl implements Resume {
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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(ResumePackage.RESUME__MARKERS, NcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getUris() {
		return (EList<String>)eDynamicGet(ResumePackage.RESUME__URIS, NcorePackage.Literals.MODEL_ELEMENT__URIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(ResumePackage.RESUME__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ResumePackage.RESUME__DESCRIPTION, NcorePackage.Literals.MODEL_ELEMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return (String)eDynamicGet(ResumePackage.RESUME__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		eDynamicSet(ResumePackage.RESUME__UUID, NcorePackage.Literals.MODEL_ELEMENT__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getLabelPrototype() {
		return (EObject)eDynamicGet(ResumePackage.RESUME__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelPrototype(EObject newLabelPrototype, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabelPrototype, ResumePackage.RESUME__LABEL_PROTOTYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrototype(EObject newLabelPrototype) {
		eDynamicSet(ResumePackage.RESUME__LABEL_PROTOTYPE, NcorePackage.Literals.MODEL_ELEMENT__LABEL_PROTOTYPE, newLabelPrototype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getRepresentations() {
		return (EMap<String, String>)eDynamicGet(ResumePackage.RESUME__REPRESENTATIONS, NcorePackage.Literals.MODEL_ELEMENT__REPRESENTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getAnnotations() {
		return (EList<Property>)eDynamicGet(ResumePackage.RESUME__ANNOTATIONS, NcorePackage.Literals.MODEL_ELEMENT__ANNOTATIONS, true, true);
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
	 * @generated NOT
	 */
	@Override
	public Section toSection() {
		Basics basics = getBasics();		
		Section ret = new Section(basics == null ? "(Unknown)" : basics.getName(), null);
		if (basics != null) {
			StringBuilder basicsContentBuilder = new StringBuilder();
			
			String image = basics.getImage();
			if (!Util.isBlank(image)) {
				basicsContentBuilder.append(
					"""
					![Image](%s)		
					
					
					""".formatted(image));
			}		
			
			String label = basics.getLabel();
			if (!Util.isBlank(label)) {
				basicsContentBuilder
					.append("*" + label + "*")
					.append(System.lineSeparator())
					.append(System.lineSeparator());				
			}
			
			String eMail = basics.getEmail();
			if (!Util.isBlank(eMail)) {
				basicsContentBuilder
					.append("* **E-mail:** " + eMail)
					.append(System.lineSeparator());
			}
			
			String phone = basics.getPhone();
			if (!Util.isBlank(phone)) {
				basicsContentBuilder
					.append("* **Phone:** " + phone)
					.append(System.lineSeparator())
					.append(System.lineSeparator());				
			}
			
			String summary = basics.getSummary();
			if (!Util.isBlank(phone)) {
				basicsContentBuilder
					.append(summary)
					.append(System.lineSeparator())
					.append(System.lineSeparator());				
			}						
	
			if (!basicsContentBuilder.isEmpty()) {
				ret.getContents().add(new Content(basicsContentBuilder.toString(), Content.MARKDOWN));
			}
		}
		
		EList<Work> work = getWork();
		if (!work.isEmpty()) {
			Section workSection = new Section("Work", null);
			ret.getChildren().add(workSection);
			for (Work we: work) {
				workSection.getChildren().add(we.toSection());
			}
		}
		
		EList<Volunteer> volunteer = getVolunteer();
		if (!volunteer.isEmpty()) {
			Section volunteerSection = new Section("Volunteer", null);
			ret.getChildren().add(volunteerSection);
			for (Volunteer ve: volunteer) {
				volunteerSection.getChildren().add(ve.toSection());
			}
		}

		EList<Education> education = getEducation();
		if (!education.isEmpty()) {
			Section educationSection = new Section("Education", null);
			ret.getChildren().add(educationSection);
			for (Education ed: education) {
				educationSection.getChildren().add(ed.toSection());
			}
		}
		
		
//		getCertificates()
		
//		getAwards()
		
//		getProjects()				
		
//		getSkills() - table

//		getReferences()
		
//		getPublications()

//		getLanguages()		
		
//		getInterests()
		
//		getMeta()
		
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResumePackage.RESUME__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__LABEL_PROTOTYPE:
				return basicSetLabelPrototype(null, msgs);
			case ResumePackage.RESUME__REPRESENTATIONS:
				return ((InternalEList<?>)getRepresentations()).basicRemove(otherEnd, msgs);
			case ResumePackage.RESUME__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case ResumePackage.RESUME__MARKERS:
				return getMarkers();
			case ResumePackage.RESUME__URIS:
				return getUris();
			case ResumePackage.RESUME__DESCRIPTION:
				return getDescription();
			case ResumePackage.RESUME__UUID:
				return getUuid();
			case ResumePackage.RESUME__LABEL_PROTOTYPE:
				return getLabelPrototype();
			case ResumePackage.RESUME__REPRESENTATIONS:
				if (coreType) return getRepresentations();
				else return getRepresentations().map();
			case ResumePackage.RESUME__ANNOTATIONS:
				return getAnnotations();
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
			case ResumePackage.RESUME__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case ResumePackage.RESUME__URIS:
				getUris().clear();
				getUris().addAll((Collection<? extends String>)newValue);
				return;
			case ResumePackage.RESUME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ResumePackage.RESUME__UUID:
				setUuid((String)newValue);
				return;
			case ResumePackage.RESUME__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)newValue);
				return;
			case ResumePackage.RESUME__REPRESENTATIONS:
				((EStructuralFeature.Setting)getRepresentations()).set(newValue);
				return;
			case ResumePackage.RESUME__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Property>)newValue);
				return;
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
			case ResumePackage.RESUME__MARKERS:
				getMarkers().clear();
				return;
			case ResumePackage.RESUME__URIS:
				getUris().clear();
				return;
			case ResumePackage.RESUME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ResumePackage.RESUME__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ResumePackage.RESUME__LABEL_PROTOTYPE:
				setLabelPrototype((EObject)null);
				return;
			case ResumePackage.RESUME__REPRESENTATIONS:
				getRepresentations().clear();
				return;
			case ResumePackage.RESUME__ANNOTATIONS:
				getAnnotations().clear();
				return;
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
			case ResumePackage.RESUME__MARKERS:
				return !getMarkers().isEmpty();
			case ResumePackage.RESUME__URIS:
				return !getUris().isEmpty();
			case ResumePackage.RESUME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case ResumePackage.RESUME__UUID:
				return UUID_EDEFAULT == null ? getUuid() != null : !UUID_EDEFAULT.equals(getUuid());
			case ResumePackage.RESUME__LABEL_PROTOTYPE:
				return getLabelPrototype() != null;
			case ResumePackage.RESUME__REPRESENTATIONS:
				return !getRepresentations().isEmpty();
			case ResumePackage.RESUME__ANNOTATIONS:
				return !getAnnotations().isEmpty();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.ncore.Marked.class) {
			switch (derivedFeatureID) {
				case ResumePackage.RESUME__MARKERS: return NcorePackage.MARKED__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case ResumePackage.RESUME__URIS: return NcorePackage.MODEL_ELEMENT__URIS;
				case ResumePackage.RESUME__DESCRIPTION: return NcorePackage.MODEL_ELEMENT__DESCRIPTION;
				case ResumePackage.RESUME__UUID: return NcorePackage.MODEL_ELEMENT__UUID;
				case ResumePackage.RESUME__LABEL_PROTOTYPE: return NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE;
				case ResumePackage.RESUME__REPRESENTATIONS: return NcorePackage.MODEL_ELEMENT__REPRESENTATIONS;
				case ResumePackage.RESUME__ANNOTATIONS: return NcorePackage.MODEL_ELEMENT__ANNOTATIONS;
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
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.ncore.Marked.class) {
			switch (baseFeatureID) {
				case NcorePackage.MARKED__MARKERS: return ResumePackage.RESUME__MARKERS;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case NcorePackage.MODEL_ELEMENT__URIS: return ResumePackage.RESUME__URIS;
				case NcorePackage.MODEL_ELEMENT__DESCRIPTION: return ResumePackage.RESUME__DESCRIPTION;
				case NcorePackage.MODEL_ELEMENT__UUID: return ResumePackage.RESUME__UUID;
				case NcorePackage.MODEL_ELEMENT__LABEL_PROTOTYPE: return ResumePackage.RESUME__LABEL_PROTOTYPE;
				case NcorePackage.MODEL_ELEMENT__REPRESENTATIONS: return ResumePackage.RESUME__REPRESENTATIONS;
				case NcorePackage.MODEL_ELEMENT__ANNOTATIONS: return ResumePackage.RESUME__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public JSONObject toJSON() {
		JSONObject jResume = super.toJSON();
		jResume.put("$schema", "https://raw.githubusercontent.com/jsonresume/resume-schema/v1.0.0/schema.json");
		return jResume;
	}

} //ResumeImpl
