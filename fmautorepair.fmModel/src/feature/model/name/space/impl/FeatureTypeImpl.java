/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;
import feature.model.name.space.SpacePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getDependsReferences <em>Depends References</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getDefaultValues <em>Default Values</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#isPrompt <em>Prompt</em>}</li>
 *   <li>{@link feature.model.name.space.impl.FeatureTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureTypeImpl extends MinimalEObjectImpl.Container implements FeatureType {
	/**
	 * The cached value of the '{@link #getDependsReferences() <em>Depends References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dependsReferences;

	/**
	 * The cached value of the '{@link #getDefaultValues() <em>Default Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultValueType> defaultValues;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectType> select;

	/**
	 * The default value of the '{@link #getDepends() <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected String depends = DEPENDS_EDEFAULT;

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
	 * The default value of the '{@link #isPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrompt()
	 * @generated
	 * @ordered
	 */
	protected boolean prompt = PROMPT_EDEFAULT;

	/**
	 * This is true if the Prompt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean promptESet;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacePackage.Literals.FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDependsReferences() {
		if (dependsReferences == null) {
			dependsReferences = new EDataTypeEList<String>(String.class, this, SpacePackage.FEATURE_TYPE__DEPENDS_REFERENCES);
		}
		return dependsReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefaultValueType> getDefaultValues() {
		if (defaultValues == null) {
			defaultValues = new EObjectContainmentEList<DefaultValueType>(DefaultValueType.class, this, SpacePackage.FEATURE_TYPE__DEFAULT_VALUES);
		}
		return defaultValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<SelectType>(SelectType.class, this, SpacePackage.FEATURE_TYPE__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(String newDepends) {
		String oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.FEATURE_TYPE__DEPENDS, oldDepends, depends));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.FEATURE_TYPE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(boolean newPrompt) {
		boolean oldPrompt = prompt;
		prompt = newPrompt;
		boolean oldPromptESet = promptESet;
		promptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.FEATURE_TYPE__PROMPT, oldPrompt, prompt, !oldPromptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrompt() {
		boolean oldPrompt = prompt;
		boolean oldPromptESet = promptESet;
		prompt = PROMPT_EDEFAULT;
		promptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.FEATURE_TYPE__PROMPT, oldPrompt, PROMPT_EDEFAULT, oldPromptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrompt() {
		return promptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.FEATURE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpacePackage.FEATURE_TYPE__DEFAULT_VALUES:
				return ((InternalEList<?>)getDefaultValues()).basicRemove(otherEnd, msgs);
			case SpacePackage.FEATURE_TYPE__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
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
			case SpacePackage.FEATURE_TYPE__DEPENDS_REFERENCES:
				return getDependsReferences();
			case SpacePackage.FEATURE_TYPE__DEFAULT_VALUES:
				return getDefaultValues();
			case SpacePackage.FEATURE_TYPE__SELECT:
				return getSelect();
			case SpacePackage.FEATURE_TYPE__DEPENDS:
				return getDepends();
			case SpacePackage.FEATURE_TYPE__FEATURE_NAME:
				return getFeatureName();
			case SpacePackage.FEATURE_TYPE__PROMPT:
				return isPrompt();
			case SpacePackage.FEATURE_TYPE__TYPE:
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
			case SpacePackage.FEATURE_TYPE__DEPENDS_REFERENCES:
				getDependsReferences().clear();
				getDependsReferences().addAll((Collection<? extends String>)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__DEFAULT_VALUES:
				getDefaultValues().clear();
				getDefaultValues().addAll((Collection<? extends DefaultValueType>)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends SelectType>)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__DEPENDS:
				setDepends((String)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__PROMPT:
				setPrompt((Boolean)newValue);
				return;
			case SpacePackage.FEATURE_TYPE__TYPE:
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
			case SpacePackage.FEATURE_TYPE__DEPENDS_REFERENCES:
				getDependsReferences().clear();
				return;
			case SpacePackage.FEATURE_TYPE__DEFAULT_VALUES:
				getDefaultValues().clear();
				return;
			case SpacePackage.FEATURE_TYPE__SELECT:
				getSelect().clear();
				return;
			case SpacePackage.FEATURE_TYPE__DEPENDS:
				setDepends(DEPENDS_EDEFAULT);
				return;
			case SpacePackage.FEATURE_TYPE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case SpacePackage.FEATURE_TYPE__PROMPT:
				unsetPrompt();
				return;
			case SpacePackage.FEATURE_TYPE__TYPE:
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
			case SpacePackage.FEATURE_TYPE__DEPENDS_REFERENCES:
				return dependsReferences != null && !dependsReferences.isEmpty();
			case SpacePackage.FEATURE_TYPE__DEFAULT_VALUES:
				return defaultValues != null && !defaultValues.isEmpty();
			case SpacePackage.FEATURE_TYPE__SELECT:
				return select != null && !select.isEmpty();
			case SpacePackage.FEATURE_TYPE__DEPENDS:
				return DEPENDS_EDEFAULT == null ? depends != null : !DEPENDS_EDEFAULT.equals(depends);
			case SpacePackage.FEATURE_TYPE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case SpacePackage.FEATURE_TYPE__PROMPT:
				return isSetPrompt();
			case SpacePackage.FEATURE_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (dependsReferences: ");
		result.append(dependsReferences);
		result.append(", depends: ");
		result.append(depends);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", prompt: ");
		if (promptESet) result.append(prompt); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FeatureTypeImpl
