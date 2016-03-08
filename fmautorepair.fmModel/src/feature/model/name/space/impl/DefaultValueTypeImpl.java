/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.SpacePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.impl.DefaultValueTypeImpl#getDefaultConditionReferences <em>Default Condition References</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DefaultValueTypeImpl#getDefaultValueReferences <em>Default Value References</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DefaultValueTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DefaultValueTypeImpl#getDefaultValueCondition <em>Default Value Condition</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DefaultValueTypeImpl#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultValueTypeImpl extends MinimalEObjectImpl.Container implements DefaultValueType {
	/**
	 * The cached value of the '{@link #getDefaultConditionReferences() <em>Default Condition References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConditionReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultConditionReferences;

	/**
	 * The cached value of the '{@link #getDefaultValueReferences() <em>Default Value References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> defaultValueReferences;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueCondition() <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueCondition() <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCondition()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueCondition = DEFAULT_VALUE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacePackage.Literals.DEFAULT_VALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultConditionReferences() {
		if (defaultConditionReferences == null) {
			defaultConditionReferences = new EDataTypeEList<String>(String.class, this, SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES);
		}
		return defaultConditionReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefaultValueReferences() {
		if (defaultValueReferences == null) {
			defaultValueReferences = new EDataTypeEList<String>(String.class, this, SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES);
		}
		return defaultValueReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueCondition() {
		return defaultValueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueCondition(String newDefaultValueCondition) {
		String oldDefaultValueCondition = defaultValueCondition;
		defaultValueCondition = newDefaultValueCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION, oldDefaultValueCondition, defaultValueCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DEFAULT_VALUE_TYPE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES:
				return getDefaultConditionReferences();
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES:
				return getDefaultValueReferences();
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION:
				return getDefaultValueCondition();
			case SpacePackage.DEFAULT_VALUE_TYPE__FEATURE_NAME:
				return getFeatureName();
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
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES:
				getDefaultConditionReferences().clear();
				getDefaultConditionReferences().addAll((Collection<? extends String>)newValue);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES:
				getDefaultValueReferences().clear();
				getDefaultValueReferences().addAll((Collection<? extends String>)newValue);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION:
				setDefaultValueCondition((String)newValue);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__FEATURE_NAME:
				setFeatureName((String)newValue);
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
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES:
				getDefaultConditionReferences().clear();
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES:
				getDefaultValueReferences().clear();
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION:
				setDefaultValueCondition(DEFAULT_VALUE_CONDITION_EDEFAULT);
				return;
			case SpacePackage.DEFAULT_VALUE_TYPE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
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
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES:
				return defaultConditionReferences != null && !defaultConditionReferences.isEmpty();
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES:
				return defaultValueReferences != null && !defaultValueReferences.isEmpty();
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case SpacePackage.DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION:
				return DEFAULT_VALUE_CONDITION_EDEFAULT == null ? defaultValueCondition != null : !DEFAULT_VALUE_CONDITION_EDEFAULT.equals(defaultValueCondition);
			case SpacePackage.DEFAULT_VALUE_TYPE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultConditionReferences: ");
		result.append(defaultConditionReferences);
		result.append(", defaultValueReferences: ");
		result.append(defaultValueReferences);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", defaultValueCondition: ");
		result.append(defaultValueCondition);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(')');
		return result.toString();
	}

} //DefaultValueTypeImpl
