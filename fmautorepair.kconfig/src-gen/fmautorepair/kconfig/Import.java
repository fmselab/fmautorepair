/**
 * generated by Xtext 2.9.1
 */
package fmautorepair.kconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fmautorepair.kconfig.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see fmautorepair.kconfig.KconfigPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute list.
   * @see fmautorepair.kconfig.KconfigPackage#getImport_ImportedNamespace()
   * @model unique="false"
   * @generated
   */
  EList<String> getImportedNamespace();

} // Import
