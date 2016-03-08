/**
 */
package feature.model.name.space;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see feature.model.name.space.SpaceFactory
 * @model kind="package"
 * @generated
 */
public interface SpacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "space";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FeatureModelNameSpace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "space";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpacePackage eINSTANCE = feature.model.name.space.impl.SpacePackageImpl.init();

	/**
	 * The meta object id for the '{@link feature.model.name.space.impl.DefaultValueTypeImpl <em>Default Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.model.name.space.impl.DefaultValueTypeImpl
	 * @see feature.model.name.space.impl.SpacePackageImpl#getDefaultValueType()
	 * @generated
	 */
	int DEFAULT_VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Default Condition References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Default Value References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Default Value Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE__FEATURE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.model.name.space.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.model.name.space.impl.DocumentRootImpl
	 * @see feature.model.name.space.impl.SpacePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECT = 5;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCHITECTURE = 6;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Default Value Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDS = 9;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_NAME = 10;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROMPT = 11;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REVISION = 12;

	/**
	 * The feature id for the '<em><b>Select Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SELECT_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 15;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.model.name.space.impl.FeatureModelTypeImpl <em>Feature Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.model.name.space.impl.FeatureModelTypeImpl
	 * @see feature.model.name.space.impl.SpacePackageImpl#getFeatureModelType()
	 * @generated
	 */
	int FEATURE_MODEL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE__REVISION = 2;

	/**
	 * The number of structural features of the '<em>Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.model.name.space.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.model.name.space.impl.FeatureTypeImpl
	 * @see feature.model.name.space.impl.SpacePackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Depends References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__DEPENDS_REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__DEFAULT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__SELECT = 2;

	/**
	 * The feature id for the '<em><b>Depends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__DEPENDS = 3;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__FEATURE_NAME = 4;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__PROMPT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__TYPE = 6;

	/**
	 * The number of structural features of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link feature.model.name.space.impl.SelectTypeImpl <em>Select Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see feature.model.name.space.impl.SelectTypeImpl
	 * @see feature.model.name.space.impl.SpacePackageImpl#getSelectType()
	 * @generated
	 */
	int SELECT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Select Condition References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__SELECT_CONDITION_REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__FEATURE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Select Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__SELECT_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Select Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Select Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link feature.model.name.space.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value Type</em>'.
	 * @see feature.model.name.space.DefaultValueType
	 * @generated
	 */
	EClass getDefaultValueType();

	/**
	 * Returns the meta object for the attribute list '{@link feature.model.name.space.DefaultValueType#getDefaultConditionReferences <em>Default Condition References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Condition References</em>'.
	 * @see feature.model.name.space.DefaultValueType#getDefaultConditionReferences()
	 * @see #getDefaultValueType()
	 * @generated
	 */
	EAttribute getDefaultValueType_DefaultConditionReferences();

	/**
	 * Returns the meta object for the attribute list '{@link feature.model.name.space.DefaultValueType#getDefaultValueReferences <em>Default Value References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default Value References</em>'.
	 * @see feature.model.name.space.DefaultValueType#getDefaultValueReferences()
	 * @see #getDefaultValueType()
	 * @generated
	 */
	EAttribute getDefaultValueType_DefaultValueReferences();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DefaultValueType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see feature.model.name.space.DefaultValueType#getDefaultValue()
	 * @see #getDefaultValueType()
	 * @generated
	 */
	EAttribute getDefaultValueType_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DefaultValueType#getDefaultValueCondition <em>Default Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Condition</em>'.
	 * @see feature.model.name.space.DefaultValueType#getDefaultValueCondition()
	 * @see #getDefaultValueType()
	 * @generated
	 */
	EAttribute getDefaultValueType_DefaultValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DefaultValueType#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see feature.model.name.space.DefaultValueType#getFeatureName()
	 * @see #getDefaultValueType()
	 * @generated
	 */
	EAttribute getDefaultValueType_FeatureName();

	/**
	 * Returns the meta object for class '{@link feature.model.name.space.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see feature.model.name.space.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link feature.model.name.space.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see feature.model.name.space.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link feature.model.name.space.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see feature.model.name.space.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link feature.model.name.space.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see feature.model.name.space.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link feature.model.name.space.DocumentRoot#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see feature.model.name.space.DocumentRoot#getFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link feature.model.name.space.DocumentRoot#getFeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Model</em>'.
	 * @see feature.model.name.space.DocumentRoot#getFeatureModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureModel();

	/**
	 * Returns the meta object for the containment reference '{@link feature.model.name.space.DocumentRoot#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see feature.model.name.space.DocumentRoot#getSelect()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Select();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see feature.model.name.space.DocumentRoot#getArchitecture()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see feature.model.name.space.DocumentRoot#getDefaultValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getDefaultValueCondition <em>Default Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Condition</em>'.
	 * @see feature.model.name.space.DocumentRoot#getDefaultValueCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DefaultValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends</em>'.
	 * @see feature.model.name.space.DocumentRoot#getDepends()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Depends();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see feature.model.name.space.DocumentRoot#getFeatureName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#isPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see feature.model.name.space.DocumentRoot#isPrompt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Prompt();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see feature.model.name.space.DocumentRoot#getRevision()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Revision();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getSelectCondition <em>Select Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Condition</em>'.
	 * @see feature.model.name.space.DocumentRoot#getSelectCondition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SelectCondition();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see feature.model.name.space.DocumentRoot#getTarget()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Target();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see feature.model.name.space.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Type();

	/**
	 * Returns the meta object for class '{@link feature.model.name.space.FeatureModelType <em>Feature Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model Type</em>'.
	 * @see feature.model.name.space.FeatureModelType
	 * @generated
	 */
	EClass getFeatureModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link feature.model.name.space.FeatureModelType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see feature.model.name.space.FeatureModelType#getFeature()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EReference getFeatureModelType_Feature();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureModelType#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see feature.model.name.space.FeatureModelType#getArchitecture()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EAttribute getFeatureModelType_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureModelType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see feature.model.name.space.FeatureModelType#getRevision()
	 * @see #getFeatureModelType()
	 * @generated
	 */
	EAttribute getFeatureModelType_Revision();

	/**
	 * Returns the meta object for class '{@link feature.model.name.space.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type</em>'.
	 * @see feature.model.name.space.FeatureType
	 * @generated
	 */
	EClass getFeatureType();

	/**
	 * Returns the meta object for the attribute list '{@link feature.model.name.space.FeatureType#getDependsReferences <em>Depends References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Depends References</em>'.
	 * @see feature.model.name.space.FeatureType#getDependsReferences()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_DependsReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link feature.model.name.space.FeatureType#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Values</em>'.
	 * @see feature.model.name.space.FeatureType#getDefaultValues()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_DefaultValues();

	/**
	 * Returns the meta object for the containment reference list '{@link feature.model.name.space.FeatureType#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see feature.model.name.space.FeatureType#getSelect()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_Select();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureType#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depends</em>'.
	 * @see feature.model.name.space.FeatureType#getDepends()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Depends();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureType#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see feature.model.name.space.FeatureType#getFeatureName()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureType#isPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see feature.model.name.space.FeatureType#isPrompt()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Prompt();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.FeatureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see feature.model.name.space.FeatureType#getType()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Type();

	/**
	 * Returns the meta object for class '{@link feature.model.name.space.SelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Type</em>'.
	 * @see feature.model.name.space.SelectType
	 * @generated
	 */
	EClass getSelectType();

	/**
	 * Returns the meta object for the attribute list '{@link feature.model.name.space.SelectType#getSelectConditionReferences <em>Select Condition References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Select Condition References</em>'.
	 * @see feature.model.name.space.SelectType#getSelectConditionReferences()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_SelectConditionReferences();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.SelectType#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see feature.model.name.space.SelectType#getFeatureName()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.SelectType#getSelectCondition <em>Select Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Condition</em>'.
	 * @see feature.model.name.space.SelectType#getSelectCondition()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_SelectCondition();

	/**
	 * Returns the meta object for the attribute '{@link feature.model.name.space.SelectType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see feature.model.name.space.SelectType#getTarget()
	 * @see #getSelectType()
	 * @generated
	 */
	EAttribute getSelectType_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpaceFactory getSpaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link feature.model.name.space.impl.DefaultValueTypeImpl <em>Default Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.model.name.space.impl.DefaultValueTypeImpl
		 * @see feature.model.name.space.impl.SpacePackageImpl#getDefaultValueType()
		 * @generated
		 */
		EClass DEFAULT_VALUE_TYPE = eINSTANCE.getDefaultValueType();

		/**
		 * The meta object literal for the '<em><b>Default Condition References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_TYPE__DEFAULT_CONDITION_REFERENCES = eINSTANCE.getDefaultValueType_DefaultConditionReferences();

		/**
		 * The meta object literal for the '<em><b>Default Value References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_TYPE__DEFAULT_VALUE_REFERENCES = eINSTANCE.getDefaultValueType_DefaultValueReferences();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_TYPE__DEFAULT_VALUE = eINSTANCE.getDefaultValueType_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Default Value Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_TYPE__DEFAULT_VALUE_CONDITION = eINSTANCE.getDefaultValueType_DefaultValueCondition();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_TYPE__FEATURE_NAME = eINSTANCE.getDefaultValueType_FeatureName();

		/**
		 * The meta object literal for the '{@link feature.model.name.space.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.model.name.space.impl.DocumentRootImpl
		 * @see feature.model.name.space.impl.SpacePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE = eINSTANCE.getDocumentRoot_Feature();

		/**
		 * The meta object literal for the '<em><b>Feature Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_MODEL = eINSTANCE.getDocumentRoot_FeatureModel();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SELECT = eINSTANCE.getDocumentRoot_Select();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ARCHITECTURE = eINSTANCE.getDocumentRoot_Architecture();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEFAULT_VALUE = eINSTANCE.getDocumentRoot_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Default Value Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION = eINSTANCE.getDocumentRoot_DefaultValueCondition();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEPENDS = eINSTANCE.getDocumentRoot_Depends();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FEATURE_NAME = eINSTANCE.getDocumentRoot_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROMPT = eINSTANCE.getDocumentRoot_Prompt();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REVISION = eINSTANCE.getDocumentRoot_Revision();

		/**
		 * The meta object literal for the '<em><b>Select Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SELECT_CONDITION = eINSTANCE.getDocumentRoot_SelectCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TARGET = eINSTANCE.getDocumentRoot_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '{@link feature.model.name.space.impl.FeatureModelTypeImpl <em>Feature Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.model.name.space.impl.FeatureModelTypeImpl
		 * @see feature.model.name.space.impl.SpacePackageImpl#getFeatureModelType()
		 * @generated
		 */
		EClass FEATURE_MODEL_TYPE = eINSTANCE.getFeatureModelType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL_TYPE__FEATURE = eINSTANCE.getFeatureModelType_Feature();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL_TYPE__ARCHITECTURE = eINSTANCE.getFeatureModelType_Architecture();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL_TYPE__REVISION = eINSTANCE.getFeatureModelType_Revision();

		/**
		 * The meta object literal for the '{@link feature.model.name.space.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.model.name.space.impl.FeatureTypeImpl
		 * @see feature.model.name.space.impl.SpacePackageImpl#getFeatureType()
		 * @generated
		 */
		EClass FEATURE_TYPE = eINSTANCE.getFeatureType();

		/**
		 * The meta object literal for the '<em><b>Depends References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__DEPENDS_REFERENCES = eINSTANCE.getFeatureType_DependsReferences();

		/**
		 * The meta object literal for the '<em><b>Default Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__DEFAULT_VALUES = eINSTANCE.getFeatureType_DefaultValues();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__SELECT = eINSTANCE.getFeatureType_Select();

		/**
		 * The meta object literal for the '<em><b>Depends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__DEPENDS = eINSTANCE.getFeatureType_Depends();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__FEATURE_NAME = eINSTANCE.getFeatureType_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__PROMPT = eINSTANCE.getFeatureType_Prompt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__TYPE = eINSTANCE.getFeatureType_Type();

		/**
		 * The meta object literal for the '{@link feature.model.name.space.impl.SelectTypeImpl <em>Select Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see feature.model.name.space.impl.SelectTypeImpl
		 * @see feature.model.name.space.impl.SpacePackageImpl#getSelectType()
		 * @generated
		 */
		EClass SELECT_TYPE = eINSTANCE.getSelectType();

		/**
		 * The meta object literal for the '<em><b>Select Condition References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__SELECT_CONDITION_REFERENCES = eINSTANCE.getSelectType_SelectConditionReferences();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__FEATURE_NAME = eINSTANCE.getSelectType_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Select Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__SELECT_CONDITION = eINSTANCE.getSelectType_SelectCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_TYPE__TARGET = eINSTANCE.getSelectType_Target();

	}

} //SpacePackage
