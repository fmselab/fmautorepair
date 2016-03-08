/**
 */
package feature.model.name.space;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see feature.model.name.space.SpacePackage
 * @generated
 */
public interface SpaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpaceFactory eINSTANCE = feature.model.name.space.impl.SpaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Default Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Value Type</em>'.
	 * @generated
	 */
	DefaultValueType createDefaultValueType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Feature Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model Type</em>'.
	 * @generated
	 */
	FeatureModelType createFeatureModelType();

	/**
	 * Returns a new object of class '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Type</em>'.
	 * @generated
	 */
	FeatureType createFeatureType();

	/**
	 * Returns a new object of class '<em>Select Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Type</em>'.
	 * @generated
	 */
	SelectType createSelectType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpacePackage getSpacePackage();

} //SpaceFactory
