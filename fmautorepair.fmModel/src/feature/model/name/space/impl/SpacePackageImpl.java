/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.DocumentRoot;
import feature.model.name.space.FeatureModelType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;
import feature.model.name.space.SpaceFactory;
import feature.model.name.space.SpacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacePackageImpl extends EPackageImpl implements SpacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see feature.model.name.space.SpacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpacePackageImpl() {
		super(eNS_URI, SpaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpacePackage init() {
		if (isInited) return (SpacePackage)EPackage.Registry.INSTANCE.getEPackage(SpacePackage.eNS_URI);

		// Obtain or create and register package
		SpacePackageImpl theSpacePackage = (SpacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSpacePackage.createPackageContents();

		// Initialize created meta-data
		theSpacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpacePackage.eNS_URI, theSpacePackage);
		return theSpacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValueType() {
		return defaultValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueType_DefaultConditionReferences() {
		return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueType_DefaultValueReferences() {
		return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueType_DefaultValue() {
		return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueType_DefaultValueCondition() {
		return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultValueType_FeatureName() {
		return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Feature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FeatureModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Select() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Architecture() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DefaultValue() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_DefaultValueCondition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Depends() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_FeatureName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Prompt() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Revision() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_SelectCondition() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Target() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Type() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureModelType() {
		return featureModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureModelType_Feature() {
		return (EReference)featureModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureModelType_Architecture() {
		return (EAttribute)featureModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureModelType_Revision() {
		return (EAttribute)featureModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureType() {
		return featureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_DependsReferences() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_DefaultValues() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_Select() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Depends() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_FeatureName() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Prompt() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Type() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectType() {
		return selectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_SelectConditionReferences() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_FeatureName() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_SelectCondition() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectType_Target() {
		return (EAttribute)selectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceFactory getSpaceFactory() {
		return (SpaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		defaultValueTypeEClass = createEClass(DEFAULT_VALUE_TYPE);
		createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES);
		createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES);
		createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__DEFAULT_VALUE);
		createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION);
		createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__FEATURE_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SELECT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__ARCHITECTURE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEFAULT_VALUE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DEPENDS);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FEATURE_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROMPT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__REVISION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SELECT_CONDITION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TARGET);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);

		featureModelTypeEClass = createEClass(FEATURE_MODEL_TYPE);
		createEReference(featureModelTypeEClass, FEATURE_MODEL_TYPE__FEATURE);
		createEAttribute(featureModelTypeEClass, FEATURE_MODEL_TYPE__ARCHITECTURE);
		createEAttribute(featureModelTypeEClass, FEATURE_MODEL_TYPE__REVISION);

		featureTypeEClass = createEClass(FEATURE_TYPE);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__DEPENDS_REFERENCES);
		createEReference(featureTypeEClass, FEATURE_TYPE__DEFAULT_VALUES);
		createEReference(featureTypeEClass, FEATURE_TYPE__SELECT);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__DEPENDS);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__FEATURE_NAME);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__PROMPT);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__TYPE);

		selectTypeEClass = createEClass(SELECT_TYPE);
		createEAttribute(selectTypeEClass, SELECT_TYPE__SELECT_CONDITION_REFERENCES);
		createEAttribute(selectTypeEClass, SELECT_TYPE__FEATURE_NAME);
		createEAttribute(selectTypeEClass, SELECT_TYPE__SELECT_CONDITION);
		createEAttribute(selectTypeEClass, SELECT_TYPE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(defaultValueTypeEClass, DefaultValueType.class, "DefaultValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultValueType_DefaultConditionReferences(), theXMLTypePackage.getString(), "defaultConditionReferences", null, 0, -1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueType_DefaultValueReferences(), theXMLTypePackage.getString(), "defaultValueReferences", null, 0, -1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueType_DefaultValueCondition(), theXMLTypePackage.getString(), "defaultValueCondition", null, 0, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultValueType_FeatureName(), theXMLTypePackage.getString(), "featureName", null, 0, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Feature(), this.getFeatureType(), null, "feature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureModel(), this.getFeatureModelType(), null, "featureModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Select(), this.getSelectType(), null, "select", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Architecture(), theXMLTypePackage.getString(), "architecture", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_DefaultValueCondition(), theXMLTypePackage.getString(), "defaultValueCondition", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Depends(), theXMLTypePackage.getString(), "depends", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_FeatureName(), theXMLTypePackage.getString(), "featureName", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Prompt(), theXMLTypePackage.getBoolean(), "prompt", "false", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Revision(), theXMLTypePackage.getString(), "revision", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_SelectCondition(), theXMLTypePackage.getString(), "selectCondition", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Target(), theXMLTypePackage.getString(), "target", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Type(), theXMLTypePackage.getString(), "type", "", 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureModelTypeEClass, FeatureModelType.class, "FeatureModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureModelType_Feature(), this.getFeatureType(), null, "feature", null, 0, -1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureModelType_Architecture(), theXMLTypePackage.getString(), "architecture", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureModelType_Revision(), theXMLTypePackage.getString(), "revision", null, 0, 1, FeatureModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureTypeEClass, FeatureType.class, "FeatureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureType_DependsReferences(), theXMLTypePackage.getString(), "dependsReferences", null, 0, -1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_DefaultValues(), this.getDefaultValueType(), null, "defaultValues", null, 0, -1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_Select(), this.getSelectType(), null, "select", null, 0, -1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Depends(), theXMLTypePackage.getString(), "depends", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_FeatureName(), theXMLTypePackage.getString(), "featureName", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Prompt(), theXMLTypePackage.getBoolean(), "prompt", "false", 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectTypeEClass, SelectType.class, "SelectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectType_SelectConditionReferences(), theXMLTypePackage.getString(), "selectConditionReferences", null, 0, -1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectType_FeatureName(), theXMLTypePackage.getString(), "featureName", null, 0, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectType_SelectCondition(), theXMLTypePackage.getString(), "selectCondition", null, 0, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectType_Target(), theXMLTypePackage.getString(), "target", null, 0, 1, SelectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (defaultValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DefaultValueType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDefaultValueType_DefaultConditionReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DefaultConditionReferences",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDefaultValueType_DefaultValueReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DefaultValueReferences",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDefaultValueType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DefaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDefaultValueType_DefaultValueCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DefaultValueCondition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDefaultValueType_FeatureName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FeatureName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FeatureModel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FeatureModel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Select(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Select",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Architecture(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Architecture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DefaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_DefaultValueCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DefaultValueCondition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Depends(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Depends",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_FeatureName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FeatureName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Prompt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Prompt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Revision(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Revision",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_SelectCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SelectCondition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (featureModelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FeatureModelType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFeatureModelType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureModelType_Architecture(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Architecture",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureModelType_Revision(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Revision",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (featureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FeatureType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFeatureType_DependsReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DependsReferences",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_DefaultValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DefaultValues",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_Select(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Select",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_Depends(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Depends",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_FeatureName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FeatureName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_Prompt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Prompt",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFeatureType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (selectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SelectType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSelectType_SelectConditionReferences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SelectConditionReferences",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSelectType_FeatureName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FeatureName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSelectType_SelectCondition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SelectCondition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSelectType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });
	}

} //SpacePackageImpl
