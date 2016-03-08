/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceFactoryImpl extends EFactoryImpl implements SpaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpaceFactory init() {
		try {
			SpaceFactory theSpaceFactory = (SpaceFactory)EPackage.Registry.INSTANCE.getEFactory(SpacePackage.eNS_URI);
			if (theSpaceFactory != null) {
				return theSpaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpacePackage.DEFAULT_VALUE_TYPE: return createDefaultValueType();
			case SpacePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SpacePackage.FEATURE_MODEL_TYPE: return createFeatureModelType();
			case SpacePackage.FEATURE_TYPE: return createFeatureType();
			case SpacePackage.SELECT_TYPE: return createSelectType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultValueType createDefaultValueType() {
		DefaultValueTypeImpl defaultValueType = new DefaultValueTypeImpl();
		return defaultValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelType createFeatureModelType() {
		FeatureModelTypeImpl featureModelType = new FeatureModelTypeImpl();
		return featureModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType createFeatureType() {
		FeatureTypeImpl featureType = new FeatureTypeImpl();
		return featureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType createSelectType() {
		SelectTypeImpl selectType = new SelectTypeImpl();
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacePackage getSpacePackage() {
		return (SpacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpacePackage getPackage() {
		return SpacePackage.eINSTANCE;
	}

} //SpaceFactoryImpl
