/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.Config#getName <em>Name</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getType <em>Type</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getPrompts <em>Prompts</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getRanges <em>Ranges</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getSelects <em>Selects</em>}</li>
 *   <li>{@link fmautorepair.kconfig.Config#getDefaults <em>Defaults</em>}</li>
 * </ul>
 *
 * @see fmautorepair.kconfig.KconfigPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fmautorepair.kconfig.Config#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link fmautorepair.kconfig.Config#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Prompts</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.Prompt}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prompts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prompts</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Prompts()
   * @model containment="true"
   * @generated
   */
  EList<Prompt> getPrompts();

  /**
   * Returns the value of the '<em><b>Ranges</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.Range}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ranges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranges</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Ranges()
   * @model containment="true"
   * @generated
   */
  EList<Range> getRanges();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

  /**
   * Returns the value of the '<em><b>Selects</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.Select}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selects</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Selects()
   * @model containment="true"
   * @generated
   */
  EList<Select> getSelects();

  /**
   * Returns the value of the '<em><b>Defaults</b></em>' containment reference list.
   * The list contents are of type {@link fmautorepair.kconfig.Default}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defaults</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defaults</em>' containment reference list.
   * @see fmautorepair.kconfig.KconfigPackage#getConfig_Defaults()
   * @model containment="true"
   * @generated
   */
  EList<Default> getDefaults();

} // Config