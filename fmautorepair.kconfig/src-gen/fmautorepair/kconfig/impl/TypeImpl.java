/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig.impl;

import fmautorepair.kconfig.KconfigExpr;
import fmautorepair.kconfig.KconfigPackage;
import fmautorepair.kconfig.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.impl.TypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.TypeImpl#getTprompt <em>Tprompt</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.TypeImpl#getKconfigExpr <em>Kconfig Expr</em>}</li>
 *   <li>{@link fmautorepair.kconfig.impl.TypeImpl#getDef <em>Def</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
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
   * The default value of the '{@link #getTprompt() <em>Tprompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTprompt()
   * @generated
   * @ordered
   */
  protected static final String TPROMPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTprompt() <em>Tprompt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTprompt()
   * @generated
   * @ordered
   */
  protected String tprompt = TPROMPT_EDEFAULT;

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
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected KconfigExpr def;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return KconfigPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTprompt()
  {
    return tprompt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTprompt(String newTprompt)
  {
    String oldTprompt = tprompt;
    tprompt = newTprompt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__TPROMPT, oldTprompt, tprompt));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__KCONFIG_EXPR, oldKconfigExpr, newKconfigExpr);
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
        msgs = ((InternalEObject)kconfigExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.TYPE__KCONFIG_EXPR, null, msgs);
      if (newKconfigExpr != null)
        msgs = ((InternalEObject)newKconfigExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.TYPE__KCONFIG_EXPR, null, msgs);
      msgs = basicSetKconfigExpr(newKconfigExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__KCONFIG_EXPR, newKconfigExpr, newKconfigExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KconfigExpr getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(KconfigExpr newDef, NotificationChain msgs)
  {
    KconfigExpr oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(KconfigExpr newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.TYPE__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.TYPE__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.TYPE__DEF, newDef, newDef));
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
      case KconfigPackage.TYPE__KCONFIG_EXPR:
        return basicSetKconfigExpr(null, msgs);
      case KconfigPackage.TYPE__DEF:
        return basicSetDef(null, msgs);
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
      case KconfigPackage.TYPE__TYPE:
        return getType();
      case KconfigPackage.TYPE__TPROMPT:
        return getTprompt();
      case KconfigPackage.TYPE__KCONFIG_EXPR:
        return getKconfigExpr();
      case KconfigPackage.TYPE__DEF:
        return getDef();
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
      case KconfigPackage.TYPE__TYPE:
        setType((String)newValue);
        return;
      case KconfigPackage.TYPE__TPROMPT:
        setTprompt((String)newValue);
        return;
      case KconfigPackage.TYPE__KCONFIG_EXPR:
        setKconfigExpr((KconfigExpr)newValue);
        return;
      case KconfigPackage.TYPE__DEF:
        setDef((KconfigExpr)newValue);
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
      case KconfigPackage.TYPE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case KconfigPackage.TYPE__TPROMPT:
        setTprompt(TPROMPT_EDEFAULT);
        return;
      case KconfigPackage.TYPE__KCONFIG_EXPR:
        setKconfigExpr((KconfigExpr)null);
        return;
      case KconfigPackage.TYPE__DEF:
        setDef((KconfigExpr)null);
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
      case KconfigPackage.TYPE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case KconfigPackage.TYPE__TPROMPT:
        return TPROMPT_EDEFAULT == null ? tprompt != null : !TPROMPT_EDEFAULT.equals(tprompt);
      case KconfigPackage.TYPE__KCONFIG_EXPR:
        return kconfigExpr != null;
      case KconfigPackage.TYPE__DEF:
        return def != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", tprompt: ");
    result.append(tprompt);
    result.append(')');
    return result.toString();
  }

} //TypeImpl