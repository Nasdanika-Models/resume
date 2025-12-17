/**
 */
package org.nasdanika.models.resume.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.common.Content;
import org.nasdanika.common.Section;
import org.nasdanika.common.Util;
import org.nasdanika.models.resume.Education;
import org.nasdanika.models.resume.ResumePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getStudyType <em>Study Type</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.EducationImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationImpl extends ModelElementImpl implements Education {
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
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStudyType() <em>Study Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyType()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDY_TYPE_EDEFAULT = null;
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
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final String SCORE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.EDUCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(ResumePackage.EDUCATION__URL, ResumePackage.Literals.RESOURCE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(ResumePackage.EDUCATION__URL, ResumePackage.Literals.RESOURCE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitution() {
		return (String)eDynamicGet(ResumePackage.EDUCATION__INSTITUTION, ResumePackage.Literals.EDUCATION__INSTITUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(String newInstitution) {
		eDynamicSet(ResumePackage.EDUCATION__INSTITUTION, ResumePackage.Literals.EDUCATION__INSTITUTION, newInstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArea() {
		return (String)eDynamicGet(ResumePackage.EDUCATION__AREA, ResumePackage.Literals.EDUCATION__AREA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArea(String newArea) {
		eDynamicSet(ResumePackage.EDUCATION__AREA, ResumePackage.Literals.EDUCATION__AREA, newArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStudyType() {
		return (String)eDynamicGet(ResumePackage.EDUCATION__STUDY_TYPE, ResumePackage.Literals.EDUCATION__STUDY_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyType(String newStudyType) {
		eDynamicSet(ResumePackage.EDUCATION__STUDY_TYPE, ResumePackage.Literals.EDUCATION__STUDY_TYPE, newStudyType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(ResumePackage.EDUCATION__START_DATE, ResumePackage.Literals.EDUCATION__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(ResumePackage.EDUCATION__START_DATE, ResumePackage.Literals.EDUCATION__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return (Date)eDynamicGet(ResumePackage.EDUCATION__END_DATE, ResumePackage.Literals.EDUCATION__END_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		eDynamicSet(ResumePackage.EDUCATION__END_DATE, ResumePackage.Literals.EDUCATION__END_DATE, newEndDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScore() {
		return (String)eDynamicGet(ResumePackage.EDUCATION__SCORE, ResumePackage.Literals.EDUCATION__SCORE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(String newScore) {
		eDynamicSet(ResumePackage.EDUCATION__SCORE, ResumePackage.Literals.EDUCATION__SCORE, newScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getCourses() {
		return (EList<String>)eDynamicGet(ResumePackage.EDUCATION__COURSES, ResumePackage.Literals.EDUCATION__COURSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResumePackage.EDUCATION__URL:
				return getUrl();
			case ResumePackage.EDUCATION__INSTITUTION:
				return getInstitution();
			case ResumePackage.EDUCATION__AREA:
				return getArea();
			case ResumePackage.EDUCATION__STUDY_TYPE:
				return getStudyType();
			case ResumePackage.EDUCATION__START_DATE:
				return getStartDate();
			case ResumePackage.EDUCATION__END_DATE:
				return getEndDate();
			case ResumePackage.EDUCATION__SCORE:
				return getScore();
			case ResumePackage.EDUCATION__COURSES:
				return getCourses();
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
			case ResumePackage.EDUCATION__URL:
				setUrl((String)newValue);
				return;
			case ResumePackage.EDUCATION__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case ResumePackage.EDUCATION__AREA:
				setArea((String)newValue);
				return;
			case ResumePackage.EDUCATION__STUDY_TYPE:
				setStudyType((String)newValue);
				return;
			case ResumePackage.EDUCATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ResumePackage.EDUCATION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ResumePackage.EDUCATION__SCORE:
				setScore((String)newValue);
				return;
			case ResumePackage.EDUCATION__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends String>)newValue);
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
			case ResumePackage.EDUCATION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__STUDY_TYPE:
				setStudyType(STUDY_TYPE_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case ResumePackage.EDUCATION__COURSES:
				getCourses().clear();
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
			case ResumePackage.EDUCATION__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case ResumePackage.EDUCATION__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? getInstitution() != null : !INSTITUTION_EDEFAULT.equals(getInstitution());
			case ResumePackage.EDUCATION__AREA:
				return AREA_EDEFAULT == null ? getArea() != null : !AREA_EDEFAULT.equals(getArea());
			case ResumePackage.EDUCATION__STUDY_TYPE:
				return STUDY_TYPE_EDEFAULT == null ? getStudyType() != null : !STUDY_TYPE_EDEFAULT.equals(getStudyType());
			case ResumePackage.EDUCATION__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case ResumePackage.EDUCATION__END_DATE:
				return END_DATE_EDEFAULT == null ? getEndDate() != null : !END_DATE_EDEFAULT.equals(getEndDate());
			case ResumePackage.EDUCATION__SCORE:
				return SCORE_EDEFAULT == null ? getScore() != null : !SCORE_EDEFAULT.equals(getScore());
			case ResumePackage.EDUCATION__COURSES:
				return !getCourses().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Section toSection() {
		Section ret = new Section(getStudyType() + " in " + getArea(), null);
		StringBuilder contentBuilder = new StringBuilder();
		String name = getInstitution();
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
								
		String score = getScore();
		if (!Util.isBlank(score)) {
			contentBuilder
				.append("**Score:** ")
				.append(score)
				.append(System.lineSeparator())
				.append(System.lineSeparator());
		}
		
		if (!contentBuilder.isEmpty()) {		
			ret.getContents().add(new Content(contentBuilder.toString(), Content.MARKDOWN));			
		}
		
		
		EList<String> courses = getCourses();
		if (!courses.isEmpty()) {
			Section coursesSection = new Section("Courses", null);
			ret.getChildren().add(coursesSection);
			
			StringBuilder coursesContentBuilder = new StringBuilder();
			
			courses.forEach(h -> coursesContentBuilder
				.append("* ")
				.append(h)
				.append(System.lineSeparator()));
			
			coursesContentBuilder.append(System.lineSeparator());			
			coursesSection.getContents().add(new Content(coursesContentBuilder.toString(), Content.MARKDOWN));						
		}		
		
		return ret;
	}

} //EducationImpl
