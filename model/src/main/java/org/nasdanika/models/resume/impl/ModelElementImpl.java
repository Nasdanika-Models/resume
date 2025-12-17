/**
 */
package org.nasdanika.models.resume.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.common.Content;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.Section;
import org.nasdanika.common.Util;
import org.nasdanika.models.resume.ModelElement;
import org.nasdanika.models.resume.ResumePackage;
import org.nasdanika.ncore.NcorePackage;
import org.yaml.snakeyaml.Yaml;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.resume.impl.ModelElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.resume.impl.ModelElementImpl#getContextHelp <em>Context Help</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementImpl extends MinimalEObjectImpl.Container implements ModelElement {
	
	public static final String MONTH_YEAR_DATE_PATTERN = "MMM YYYY";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResumePackage.Literals.MODEL_ELEMENT;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getDocumentation() {
		return (EList<EObject>)eDynamicGet(ResumePackage.MODEL_ELEMENT__DOCUMENTATION, NcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getContextHelp() {
		return (EList<EObject>)eDynamicGet(ResumePackage.MODEL_ELEMENT__CONTEXT_HELP, NcorePackage.Literals.DOCUMENTED__CONTEXT_HELP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void load(JSONObject jsonObject) {
		Map<String, Object> jMap = jsonObject.toMap();
		load(sf -> jMap.get(sf.getName()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void loadYaml(String yamlString) {
		Yaml yaml = new Yaml();
		@SuppressWarnings("unchecked")
		Map<String, Object> yMap = ((Map<String,Object>) yaml.load(yamlString));
		load(sf -> yMap.get(sf.getName()));
	}
	
	public static final String JSON_DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void load(Function<EStructuralFeature, ?> contentProvider) {
		for (EStructuralFeature sf: eClass().getEAllStructuralFeatures()) {
			Object value = contentProvider.apply(sf);
			if (value != null) {
				if (sf.isMany()) {
					Collection<Object> avc = (Collection<Object>) eGet(sf);
					for (Object e: (Iterable<?>) value) {
						if (sf instanceof EAttribute) {
							Object av = convert(e, sf.getEType());
							avc.add(av);							
						} else {
							EClass refType = ((EReference) sf).getEReferenceType();
							ModelElement re = (ModelElement) refType.getEPackage().getEFactoryInstance().create(refType);							
							re.load(ef -> ((Map<String,?>) e).get(ef.getName()));
							avc.add(re);							
						}						
					}					
				} else {
					if (sf instanceof EAttribute) {
						Object av = convert(value, sf.getEType());
						eSet(sf, av);
					} else {
						EClass refType = ((EReference) sf).getEReferenceType();
						ModelElement re = (ModelElement) refType.getEPackage().getEFactoryInstance().create(refType);							
						re.load(ef -> ((Map<String,?>) value).get(ef.getName()));
						eSet(sf, re);
					}					
				}
			}
		}
	}

	private Object convert(Object value, EClassifier eType) {
		if (eType == EcorePackage.Literals.EDATE &&  value instanceof String) {
            try {
				return new SimpleDateFormat(JSON_DATE_FORMAT).parse((String) value);
			} catch (ParseException e) {
				throw new NasdanikaException("Cannot parse date " + value + ": " + e, e);
			}
		}
		
		Object converted = DefaultConverter.INSTANCE.convert(value, eType.getInstanceClass());
		return Objects.requireNonNull(converted, "Cannot convert '" + value + "' to  " + eType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONObject toJSON() {
		JSONObject ret = new JSONObject();
		
		@SuppressWarnings("unchecked")
		Function<EStructuralFeature, Consumer<Object>> contentConsumerProvider = sf -> value -> {			
			if (sf.isMany()) {
				Collection<Object> valueCollection = (Collection<Object>) value;
				if (!valueCollection.isEmpty()) {
					JSONArray jValueArray = new JSONArray();
					ret.put(sf.getName(), jValueArray);
					for (Object valueElement: valueCollection) {
						if (sf instanceof EAttribute) {
							EClassifier aType = sf.getEType();
							if (aType == EcorePackage.Literals.EDATE &&  valueElement instanceof Date) {
								jValueArray.put(new SimpleDateFormat(JSON_DATE_FORMAT).format((Date) valueElement));
							} else {
								jValueArray.put(valueElement);
							}
						} else if (valueElement instanceof ModelElement) {
							JSONObject jValue = ((ModelElement) valueElement).toJSON();
							jValueArray.put(jValue);
						}						
					}
				}
			} else {
				if (sf instanceof EAttribute) {
					EClassifier aType = sf.getEType();
					if (aType == EcorePackage.Literals.EDATE &&  value instanceof Date) {
						ret.put(sf.getName(), new SimpleDateFormat(JSON_DATE_FORMAT).format((Date) value));
					} else {
						ret.put(sf.getName(), value);
					}
				} else if (value instanceof ModelElement) {
					JSONObject jValue = ((ModelElement) value).toJSON();
					ret.put(sf.getName(), jValue);
				}						
			}
		};		
		
		save(contentConsumerProvider);		
		return ret;
	}
				
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void save(Function<EStructuralFeature, Consumer<Object>> contentConsumerProvider) {
		for (EStructuralFeature sf: eClass().getEAllStructuralFeatures()) {
			if (eIsSet(sf)) {
				Consumer<Object> contentConsumer = contentConsumerProvider.apply(sf);
				if (contentConsumer != null) {
					contentConsumer.accept(eGet(sf));
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Section toSection() {
		Section ret = new Section(eClass().getName(), null);
		StringBuilder contentBuilder = new StringBuilder();
		
		for (EAttribute attr: eClass().getEAllAttributes()) {
			if (eIsSet(attr)) {
				Object aVal = eGet(attr);
				if (aVal != null) {
					if (aVal instanceof Date) {
						aVal = new SimpleDateFormat(JSON_DATE_FORMAT).format((Date) aVal);
					}
					contentBuilder
						.append("* **")
						.append(Util.nameToLabel(attr.getName()))
						.append(":** ")
						.append(aVal)
						.append(System.lineSeparator());
				}
			}
		}
		
		if (!contentBuilder.isEmpty()) {		
			ret.getContents().add(new Content(contentBuilder.toString(), Content.MARKDOWN));			
		}		
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
			case ResumePackage.MODEL_ELEMENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case ResumePackage.MODEL_ELEMENT__CONTEXT_HELP:
				return ((InternalEList<?>)getContextHelp()).basicRemove(otherEnd, msgs);
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
			case ResumePackage.MODEL_ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case ResumePackage.MODEL_ELEMENT__CONTEXT_HELP:
				return getContextHelp();
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
			case ResumePackage.MODEL_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends EObject>)newValue);
				return;
			case ResumePackage.MODEL_ELEMENT__CONTEXT_HELP:
				getContextHelp().clear();
				getContextHelp().addAll((Collection<? extends EObject>)newValue);
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
			case ResumePackage.MODEL_ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case ResumePackage.MODEL_ELEMENT__CONTEXT_HELP:
				getContextHelp().clear();
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
			case ResumePackage.MODEL_ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case ResumePackage.MODEL_ELEMENT__CONTEXT_HELP:
				return !getContextHelp().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ResumePackage.MODEL_ELEMENT___LOAD__JSONOBJECT:
				load((JSONObject)arguments.get(0));
				return null;
			case ResumePackage.MODEL_ELEMENT___LOAD_YAML__STRING:
				loadYaml((String)arguments.get(0));
				return null;
			case ResumePackage.MODEL_ELEMENT___LOAD__FUNCTION:
				load((Function<EStructuralFeature, ?>)arguments.get(0));
				return null;
			case ResumePackage.MODEL_ELEMENT___TO_JSON:
				return toJSON();
			case ResumePackage.MODEL_ELEMENT___SAVE__FUNCTION:
				save((Function<EStructuralFeature, Consumer<Object>>)arguments.get(0));
				return null;
			case ResumePackage.MODEL_ELEMENT___TO_SECTION:
				return toSection();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	public static String renderDate(Date date) {
		if (date == null) {
			return "";		
		}
		
		return new SimpleDateFormat(MONTH_YEAR_DATE_PATTERN).format(date);
	}
		
	public static String renderPeriod(Date start, Date end) {
		if (start == null && end == null) {
			return "";		
		}
		
		String rStart = renderDate(start);
		if (end == null) {
			return rStart + " - Present"; 
		}
		
		String rEnd = renderDate(end);
		if (start == null) {
			return "Until " + rEnd; 
		}
		
		return Objects.equals(rStart, rEnd) ? rStart : rStart + " - " + rEnd; 
	}
	

} //ModelElementImpl
