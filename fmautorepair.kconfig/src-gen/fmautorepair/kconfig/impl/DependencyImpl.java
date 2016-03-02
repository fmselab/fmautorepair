/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig.impl;

import fmautorepair.kconfig.Dependency;
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
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.impl.DependencyImpl#getDeps <em>Deps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The cached value of the '{@link #getDeps() <em>Deps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeps()
   * @generated
   * @ordered
   */
  protected KconfigExpr deps;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return KconfigPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KconfigExpr getDeps()
  {
    return deps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeps(KconfigExpr newDeps, NotificationChain msgs)
  {
    KconfigExpr oldDeps = deps;
    deps = newDeps;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KconfigPackage.DEPENDENCY__DEPS, oldDeps, newDeps);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeps(KconfigExpr newDeps)
  {
    if (newDeps != deps)
    {
      NotificationChain msgs = null;
      if (deps != null)
        msgs = ((InternalEObject)deps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEPENDENCY__DEPS, null, msgs);
      if (newDeps != null)
        msgs = ((InternalEObject)newDeps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KconfigPackage.DEPENDENCY__DEPS, null, msgs);
      msgs = basicSetDeps(newDeps, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KconfigPackage.DEPENDENCY__DEPS, newDeps, newDeps));
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
      case KconfigPackage.DEPENDENCY__DEPS:
        return basicSetDeps(null, msgs);
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
      case KconfigPackage.DEPENDENCY__DEPS:
        return getDeps();
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
      case KconfigPackage.DEPENDENCY__DEPS:
        setDeps((KconfigExpr)newValue);
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
      case KconfigPackage.DEPENDENCY__DEPS:
        setDeps((KconfigExpr)null);
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
      case KconfigPackage.DEPENDENCY__DEPS:
        return deps != null;
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl
