/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.SelectType;
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
 * An implementation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.impl.SelectTypeImpl#getSelectConditionReferences <em>Select Condition References</em>}</li>
 *   <li>{@link feature.model.name.space.impl.SelectTypeImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.impl.SelectTypeImpl#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link feature.model.name.space.impl.SelectTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectTypeImpl extends MinimalEObjectImpl.Container implements SelectType {
	/**
	 * The cached value of the '{@link #getSelectConditionReferences() <em>Select Condition References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectConditionReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> selectConditionReferences;

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
	 * The default value of the '{@link #getSelectCondition() <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectCondition() <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCondition()
	 * @generated
	 * @ordered
	 */
	protected String selectCondition = SELECT_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacePackage.Literals.SELECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSelectConditionReferences() {
		if (selectConditionReferences == null) {
			selectConditionReferences = new EDataTypeEList<String>(String.class, this, SpacePackage.SELECT_TYPE__SELECT_CONDITION_REFERENCES);
		}
		return selectConditionReferences;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.SELECT_TYPE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectCondition() {
		return selectCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectCondition(String newSelectCondition) {
		String oldSelectCondition = selectCondition;
		selectCondition = newSelectCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.SELECT_TYPE__SELECT_CONDITION, oldSelectCondition, selectCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.SELECT_TYPE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION_REFERENCES:
				return getSelectConditionReferences();
			case SpacePackage.SELECT_TYPE__FEATURE_NAME:
				return getFeatureName();
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION:
				return getSelectCondition();
			case SpacePackage.SELECT_TYPE__TARGET:
				return getTarget();
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
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION_REFERENCES:
				getSelectConditionReferences().clear();
				getSelectConditionReferences().addAll((Collection<? extends String>)newValue);
				return;
			case SpacePackage.SELECT_TYPE__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION:
				setSelectCondition((String)newValue);
				return;
			case SpacePackage.SELECT_TYPE__TARGET:
				setTarget((String)newValue);
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
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION_REFERENCES:
				getSelectConditionReferences().clear();
				return;
			case SpacePackage.SELECT_TYPE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION:
				setSelectCondition(SELECT_CONDITION_EDEFAULT);
				return;
			case SpacePackage.SELECT_TYPE__TARGET:
				setTarget(TARGET_EDEFAULT);
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
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION_REFERENCES:
				return selectConditionReferences != null && !selectConditionReferences.isEmpty();
			case SpacePackage.SELECT_TYPE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case SpacePackage.SELECT_TYPE__SELECT_CONDITION:
				return SELECT_CONDITION_EDEFAULT == null ? selectCondition != null : !SELECT_CONDITION_EDEFAULT.equals(selectCondition);
			case SpacePackage.SELECT_TYPE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
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
		result.append(" (selectConditionReferences: ");
		result.append(selectConditionReferences);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", selectCondition: ");
		result.append(selectCondition);
		result.append(", target: ");
		result.append(target);
		result.append(')');
		return result.toString();
	}

} //SelectTypeImpl
