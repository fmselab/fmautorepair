/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig.impl;

import fmautorepair.kconfig.Default;
import fmautorepair.kconfig.KconfigExpr;
import fmautorepair.kconfig.KconfigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.impl.DefaultImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.DefaultImpl#getTrival <em>Trival</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.DefaultImpl#getHex <em>Hex</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.DefaultImpl#getInt <em>Int</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.DefaultImpl#getKconfigExpr <em>Kconfig Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultImpl extends MinimalEObjectImpl.Container implements Default
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected KconfigExpr value;

  /**
   * The default value of the '{@link #getTrival() <em>Trival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrival()
   * @generated
   * @ordered
   */
  protected static final String TRIVAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrival() <em>Trival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrival()
   * @generated
   * @ordered
   */
  protected String trival = TRIVAL_EDEFAULT;

  /**
   * The default value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected static final String HEX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHex() <em>Hex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHex()
   * @generated
   * @ordered
   */
  protected String hex = HEX_EDEFAULT;

  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final int INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected int int_ = INT_EDEFAULT;

  /**
   * The cached value of the '{@link #getKconfigExpr() <em>Kconfig Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKconfigExpr()
   * @generated
   * @ordered
   */
  protected KconfigExpr kconfigExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultImpl()
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
    return KconfigPackage.Literals.DEFAULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KconfigExpr getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(KconfigExpr newValue, NotificationChain msgs)
  {
    KconfigExpr oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(KconfigExpr newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEFAULT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEFAULT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrival()
  {
    return trival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrival(String newTrival)
  {
    String oldTrival = trival;
    trival = newTrival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__TRIVAL, oldTrival, trival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHex()
  {
    return hex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHex(String newHex)
  {
    String oldHex = hex;
    hex = newHex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__HEX, oldHex, hex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(int newInt)
  {
    int oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KconfigExpr getKconfigExpr()
  {
    return kconfigExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKconfigExpr(KconfigExpr newKconfigExpr, NotificationChain msgs)
  {
    KconfigExpr oldKconfigExpr = kconfigExpr;
    kconfigExpr = newKconfigExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__KCONFIG_EXPR, oldKconfigExpr, newKconfigExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKconfigExpr(KconfigExpr newKconfigExpr)
  {
    if (newKconfigExpr != kconfigExpr)
    {
      NotificationChain msgs = null;
      if (kconfigExpr != null)
        msgs = ((InternalEObject)kconfigExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEFAULT__KCONFIG_EXPR, null, msgs);
      if (newKconfigExpr != null)
        msgs = ((InternalEObject)newKconfigExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEFAULT__KCONFIG_EXPR, null, msgs);
      msgs = basicSetKconfigExpr(newKconfigExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEFAULT__KCONFIG_EXPR, newKconfigExpr, newKconfigExpr));
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
      case KconfigPackage.DEFAULT__VALUE:
        return basicSetValue(null, msgs);
      case KconfigPackage.DEFAULT__KCONFIG_EXPR:
        return basicSetKconfigExpr(null, msgs);
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
      case KconfigPackage.DEFAULT__VALUE:
        return getValue();
      case KconfigPackage.DEFAULT__TRIVAL:
        return getTrival();
      case KconfigPackage.DEFAULT__HEX:
        return getHex();
      case KconfigPackage.DEFAULT__INT:
        return getInt();
      case KconfigPackage.DEFAULT__KCONFIG_EXPR:
        return getKconfigExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KconfigPackage.DEFAULT__VALUE:
        setValue((KconfigExpr)newValue);
        return;
      case KconfigPackage.DEFAULT__TRIVAL:
        setTrival((String)newValue);
        return;
      case KconfigPackage.DEFAULT__HEX:
        setHex((String)newValue);
        return;
      case KconfigPackage.DEFAULT__INT:
        setInt((Integer)newValue);
        return;
      case KconfigPackage.DEFAULT__KCONFIG_EXPR:
        setKconfigExpr((KconfigExpr)newValue);
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
      case KconfigPackage.DEFAULT__VALUE:
        setValue((KconfigExpr)null);
        return;
      case KconfigPackage.DEFAULT__TRIVAL:
        setTrival(TRIVAL_EDEFAULT);
        return;
      case KconfigPackage.DEFAULT__HEX:
        setHex(HEX_EDEFAULT);
        return;
      case KconfigPackage.DEFAULT__INT:
        setInt(INT_EDEFAULT);
        return;
      case KconfigPackage.DEFAULT__KCONFIG_EXPR:
        setKconfigExpr((KconfigExpr)null);
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
      case KconfigPackage.DEFAULT__VALUE:
        return value != null;
      case KconfigPackage.DEFAULT__TRIVAL:
        return TRIVAL_EDEFAULT == null ? trival != null : !TRIVAL_EDEFAULT.equals(trival);
      case KconfigPackage.DEFAULT__HEX:
        return HEX_EDEFAULT == null ? hex != null : !HEX_EDEFAULT.equals(hex);
      case KconfigPackage.DEFAULT__INT:
        return int_ != INT_EDEFAULT;
      case KconfigPackage.DEFAULT__KCONFIG_EXPR:
        return kconfigExpr != null;
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
    result.append(" (trival: ");
    result.append(trival);
    result.append(", hex: ");
    result.append(hex);
    result.append(", int: ");
    result.append(int_);
    result.append(')');
    return result.toString();
  }

} //DefaultImpl
