/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.KconfigExpr#getConfslit <em>Confslit</em>}</li>
 *   <li>{@link fmautorepair.kconfig.KconfigExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link fmautorepair.kconfig.KconfigExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fmautorepair.kconfig.KconfigPackage#getKconfigExpr()
 * @model
 * @generated
 */
public interface KconfigExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Confslit</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.ConfigLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Confslit</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Confslit</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getKconfigExpr_Confslit()
   * @model containment="true"
   * @generated
   */
  EList<ConfigLiteral> getConfslit();

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(KconfigExpr)
   * @see fmautorepair.kconfig.KconfigPackage#getKconfigExpr_Left()
   * @model containment="true"
   * @generated
   */
  KconfigExpr getLeft();

  /**
   * Sets the value of the '{@link fmautorepair.kconfig.KconfigExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(KconfigExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(KconfigExpr)
   * @see fmautorepair.kconfig.KconfigPackage#getKconfigExpr_Right()
   * @model containment="true"
   * @generated
   */
  KconfigExpr getRight();

  /**
   * Sets the value of the '{@link fmautorepair.kconfig.KconfigExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(KconfigExpr value);

} // KconfigExpr