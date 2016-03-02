/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig.impl;

import fmautorepair.kconfig.Config;
import fmautorepair.kconfig.Default;
import fmautorepair.kconfig.Dependency;
import fmautorepair.kconfig.KconfigPackage;
import fmautorepair.kconfig.Prompt;
import fmautorepair.kconfig.Range;
import fmautorepair.kconfig.Select;
import fmautorepair.kconfig.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getType <em>Type</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getPrompts <em>Prompts</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getSelects <em>Selects</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.ConfigImpl#getDefaults <em>Defaults</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config
{
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
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getPrompts() <em>Prompts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrompts()
   * @generated
   * @ordered
   */
  protected EList<Prompt> prompts;

  /**
   * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanges()
   * @generated
   * @ordered
   */
  protected EList<Range> ranges;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * The cached value of the '{@link #getSelects() <em>Selects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelects()
   * @generated
   * @ordered
   */
  protected EList<Select> selects;

  /**
   * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaults()
   * @generated
   * @ordered
   */
  protected EList<Default> defaults;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KconfigPackage.Literals.CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.CONFIG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.CONFIG__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.CONFIG__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.CONFIG__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.CONFIG__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Prompt> getPrompts()
  {
    if (prompts == null)
    {
      prompts = new EObjectContainmentEList<Prompt>(Prompt.class, this, KconfigPackage.CONFIG__PROMPTS);
    }
    return prompts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Range> getRanges()
  {
    if (ranges == null)
    {
      ranges = new EObjectContainmentEList<Range>(Range.class, this, KconfigPackage.CONFIG__RANGES);
    }
    return ranges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, KconfigPackage.CONFIG__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Select> getSelects()
  {
    if (selects == null)
    {
      selects = new EObjectContainmentEList<Select>(Select.class, this, KconfigPackage.CONFIG__SELECTS);
    }
    return selects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Default> getDefaults()
  {
    if (defaults == null)
    {
      defaults = new EObjectContainmentEList<Default>(Default.class, this, KconfigPackage.CONFIG__DEFAULTS);
    }
    return defaults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KconfigPackage.CONFIG__TYPE:
        return basicSetType(null, msgs);
      case KconfigPackage.CONFIG__PROMPTS:
        return ((InternalEList<?>)getPrompts()).basicRemove(otherEnd, msgs);
      case KconfigPackage.CONFIG__RANGES:
        return ((InternalEList<?>)getRanges()).basicRemove(otherEnd, msgs);
      case KconfigPackage.CONFIG__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case KconfigPackage.CONFIG__SELECTS:
        return ((InternalEList<?>)getSelects()).basicRemove(otherEnd, msgs);
      case KconfigPackage.CONFIG__DEFAULTS:
        return ((InternalEList<?>)getDefaults()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KconfigPackage.CONFIG__NAME:
        return getName();
      case KconfigPackage.CONFIG__TYPE:
        return getType();
      case KconfigPackage.CONFIG__PROMPTS:
        return getPrompts();
      case KconfigPackage.CONFIG__RANGES:
        return getRanges();
      case KconfigPackage.CONFIG__DEPENDENCIES:
        return getDependencies();
      case KconfigPackage.CONFIG__SELECTS:
        return getSelects();
      case KconfigPackage.CONFIG__DEFAULTS:
        return getDefaults();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KconfigPackage.CONFIG__NAME:
        setName((String)newValue);
        return;
      case KconfigPackage.CONFIG__TYPE:
        setType((Type)newValue);
        return;
      case KconfigPackage.CONFIG__PROMPTS:
        getPrompts().clear();
        getPrompts().addAll((Collection<? extends Prompt>)newValue);
        return;
      case KconfigPackage.CONFIG__RANGES:
        getRanges().clear();
        getRanges().addAll((Collection<? extends Range>)newValue);
        return;
      case KconfigPackage.CONFIG__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case KconfigPackage.CONFIG__SELECTS:
        getSelects().clear();
        getSelects().addAll((Collection<? extends Select>)newValue);
        return;
      case KconfigPackage.CONFIG__DEFAULTS:
        getDefaults().clear();
        getDefaults().addAll((Collection<? extends Default>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KconfigPackage.CONFIG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KconfigPackage.CONFIG__TYPE:
        setType((Type)null);
        return;
      case KconfigPackage.CONFIG__PROMPTS:
        getPrompts().clear();
        return;
      case KconfigPackage.CONFIG__RANGES:
        getRanges().clear();
        return;
      case KconfigPackage.CONFIG__DEPENDENCIES:
        getDependencies().clear();
        return;
      case KconfigPackage.CONFIG__SELECTS:
        getSelects().clear();
        return;
      case KconfigPackage.CONFIG__DEFAULTS:
        getDefaults().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KconfigPackage.CONFIG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KconfigPackage.CONFIG__TYPE:
        return type != null;
      case KconfigPackage.CONFIG__PROMPTS:
        return prompts != null && !prompts.isEmpty();
      case KconfigPackage.CONFIG__RANGES:
        return ranges != null && !ranges.isEmpty();
      case KconfigPackage.CONFIG__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case KconfigPackage.CONFIG__SELECTS:
        return selects != null && !selects.isEmpty();
      case KconfigPackage.CONFIG__DEFAULTS:
        return defaults != null && !defaults.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConfigImpl
