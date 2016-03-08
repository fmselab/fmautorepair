/**
 */
package feature.model.name.space.impl;

import feature.model.name.space.DocumentRoot;
import feature.model.name.space.FeatureModelType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;
import feature.model.name.space.SpacePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getDefaultValueCondition <em>Default Value Condition</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#isPrompt <em>Prompt</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link feature.model.name.space.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * This is true if the Default Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

	/**
	 * The default value of the '{@link #getDefaultValueCondition() <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDefaultValueCondition() <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueCondition()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueCondition = DEFAULT_VALUE_CONDITION_EDEFAULT;

	/**
	 * This is true if the Default Value Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueConditionESet;

	/**
	 * The default value of the '{@link #getDepends() <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected String depends = DEPENDS_EDEFAULT;

	/**
	 * This is true if the Depends attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dependsESet;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * This is true if the Feature Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean featureNameESet;

	/**
	 * The default value of the '{@link #isPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrompt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROMPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrompt() <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrompt()
	 * @generated
	 * @ordered
	 */
	protected boolean prompt = PROMPT_EDEFAULT;

	/**
	 * This is true if the Prompt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean promptESet;

	/**
	 * The default value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected String revision = REVISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectCondition() <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECT_CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSelectCondition() <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectCondition()
	 * @generated
	 * @ordered
	 */
	protected String selectCondition = SELECT_CONDITION_EDEFAULT;

	/**
	 * This is true if the Select Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selectConditionESet;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * This is true if the Target attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

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
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpacePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SpacePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType getFeature() {
		return (FeatureType)getMixed().get(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(FeatureType newFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE, newFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(FeatureType newFeature) {
		((FeatureMap.Internal)getMixed()).set(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelType getFeatureModel() {
		return (FeatureModelType)getMixed().get(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureModel(FeatureModelType newFeatureModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, newFeatureModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureModel(FeatureModelType newFeatureModel) {
		((FeatureMap.Internal)getMixed()).set(SpacePackage.Literals.DOCUMENT_ROOT__FEATURE_MODEL, newFeatureModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType getSelect() {
		return (SelectType)getMixed().get(SpacePackage.Literals.DOCUMENT_ROOT__SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(SelectType newSelect, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SpacePackage.Literals.DOCUMENT_ROOT__SELECT, newSelect, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(SelectType newSelect) {
		((FeatureMap.Internal)getMixed()).set(SpacePackage.Literals.DOCUMENT_ROOT__SELECT, newSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		String oldDefaultValue = defaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValue = DEFAULT_VALUE_EDEFAULT;
		defaultValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValue() {
		return defaultValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueCondition() {
		return defaultValueCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueCondition(String newDefaultValueCondition) {
		String oldDefaultValueCondition = defaultValueCondition;
		defaultValueCondition = newDefaultValueCondition;
		boolean oldDefaultValueConditionESet = defaultValueConditionESet;
		defaultValueConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION, oldDefaultValueCondition, defaultValueCondition, !oldDefaultValueConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValueCondition() {
		String oldDefaultValueCondition = defaultValueCondition;
		boolean oldDefaultValueConditionESet = defaultValueConditionESet;
		defaultValueCondition = DEFAULT_VALUE_CONDITION_EDEFAULT;
		defaultValueConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION, oldDefaultValueCondition, DEFAULT_VALUE_CONDITION_EDEFAULT, oldDefaultValueConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValueCondition() {
		return defaultValueConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(String newDepends) {
		String oldDepends = depends;
		depends = newDepends;
		boolean oldDependsESet = dependsESet;
		dependsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__DEPENDS, oldDepends, depends, !oldDependsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDepends() {
		String oldDepends = depends;
		boolean oldDependsESet = dependsESet;
		depends = DEPENDS_EDEFAULT;
		dependsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__DEPENDS, oldDepends, DEPENDS_EDEFAULT, oldDependsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDepends() {
		return dependsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		boolean oldFeatureNameESet = featureNameESet;
		featureNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__FEATURE_NAME, oldFeatureName, featureName, !oldFeatureNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeatureName() {
		String oldFeatureName = featureName;
		boolean oldFeatureNameESet = featureNameESet;
		featureName = FEATURE_NAME_EDEFAULT;
		featureNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__FEATURE_NAME, oldFeatureName, FEATURE_NAME_EDEFAULT, oldFeatureNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureName() {
		return featureNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(boolean newPrompt) {
		boolean oldPrompt = prompt;
		prompt = newPrompt;
		boolean oldPromptESet = promptESet;
		promptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__PROMPT, oldPrompt, prompt, !oldPromptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrompt() {
		boolean oldPrompt = prompt;
		boolean oldPromptESet = promptESet;
		prompt = PROMPT_EDEFAULT;
		promptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__PROMPT, oldPrompt, PROMPT_EDEFAULT, oldPromptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrompt() {
		return promptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision() {
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision(String newRevision) {
		String oldRevision = revision;
		revision = newRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__REVISION, oldRevision, revision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectCondition() {
		return selectCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectCondition(String newSelectCondition) {
		String oldSelectCondition = selectCondition;
		selectCondition = newSelectCondition;
		boolean oldSelectConditionESet = selectConditionESet;
		selectConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION, oldSelectCondition, selectCondition, !oldSelectConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSelectCondition() {
		String oldSelectCondition = selectCondition;
		boolean oldSelectConditionESet = selectConditionESet;
		selectCondition = SELECT_CONDITION_EDEFAULT;
		selectConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION, oldSelectCondition, SELECT_CONDITION_EDEFAULT, oldSelectConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSelectCondition() {
		return selectConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		boolean oldTargetESet = targetESet;
		targetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__TARGET, oldTarget, target, !oldTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTarget() {
		String oldTarget = target;
		boolean oldTargetESet = targetESet;
		target = TARGET_EDEFAULT;
		targetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__TARGET, oldTarget, TARGET_EDEFAULT, oldTargetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
		return targetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpacePackage.DOCUMENT_ROOT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SpacePackage.DOCUMENT_ROOT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpacePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SpacePackage.DOCUMENT_ROOT__FEATURE:
				return basicSetFeature(null, msgs);
			case SpacePackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return basicSetFeatureModel(null, msgs);
			case SpacePackage.DOCUMENT_ROOT__SELECT:
				return basicSetSelect(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpacePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SpacePackage.DOCUMENT_ROOT__FEATURE:
				return getFeature();
			case SpacePackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return getFeatureModel();
			case SpacePackage.DOCUMENT_ROOT__SELECT:
				return getSelect();
			case SpacePackage.DOCUMENT_ROOT__ARCHITECTURE:
				return getArchitecture();
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE:
				return getDefaultValue();
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION:
				return getDefaultValueCondition();
			case SpacePackage.DOCUMENT_ROOT__DEPENDS:
				return getDepends();
			case SpacePackage.DOCUMENT_ROOT__FEATURE_NAME:
				return getFeatureName();
			case SpacePackage.DOCUMENT_ROOT__PROMPT:
				return isPrompt();
			case SpacePackage.DOCUMENT_ROOT__REVISION:
				return getRevision();
			case SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION:
				return getSelectCondition();
			case SpacePackage.DOCUMENT_ROOT__TARGET:
				return getTarget();
			case SpacePackage.DOCUMENT_ROOT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpacePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE:
				setFeature((FeatureType)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE_MODEL:
				setFeatureModel((FeatureModelType)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__SELECT:
				setSelect((SelectType)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION:
				setDefaultValueCondition((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__DEPENDS:
				setDepends((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__PROMPT:
				setPrompt((Boolean)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__REVISION:
				setRevision((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION:
				setSelectCondition((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__TARGET:
				setTarget((String)newValue);
				return;
			case SpacePackage.DOCUMENT_ROOT__TYPE:
				setType((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpacePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE:
				setFeature((FeatureType)null);
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE_MODEL:
				setFeatureModel((FeatureModelType)null);
				return;
			case SpacePackage.DOCUMENT_ROOT__SELECT:
				setSelect((SelectType)null);
				return;
			case SpacePackage.DOCUMENT_ROOT__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE:
				unsetDefaultValue();
				return;
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION:
				unsetDefaultValueCondition();
				return;
			case SpacePackage.DOCUMENT_ROOT__DEPENDS:
				unsetDepends();
				return;
			case SpacePackage.DOCUMENT_ROOT__FEATURE_NAME:
				unsetFeatureName();
				return;
			case SpacePackage.DOCUMENT_ROOT__PROMPT:
				unsetPrompt();
				return;
			case SpacePackage.DOCUMENT_ROOT__REVISION:
				setRevision(REVISION_EDEFAULT);
				return;
			case SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION:
				unsetSelectCondition();
				return;
			case SpacePackage.DOCUMENT_ROOT__TARGET:
				unsetTarget();
				return;
			case SpacePackage.DOCUMENT_ROOT__TYPE:
				unsetType();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpacePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SpacePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SpacePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SpacePackage.DOCUMENT_ROOT__FEATURE:
				return getFeature() != null;
			case SpacePackage.DOCUMENT_ROOT__FEATURE_MODEL:
				return getFeatureModel() != null;
			case SpacePackage.DOCUMENT_ROOT__SELECT:
				return getSelect() != null;
			case SpacePackage.DOCUMENT_ROOT__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE:
				return isSetDefaultValue();
			case SpacePackage.DOCUMENT_ROOT__DEFAULT_VALUE_CONDITION:
				return isSetDefaultValueCondition();
			case SpacePackage.DOCUMENT_ROOT__DEPENDS:
				return isSetDepends();
			case SpacePackage.DOCUMENT_ROOT__FEATURE_NAME:
				return isSetFeatureName();
			case SpacePackage.DOCUMENT_ROOT__PROMPT:
				return isSetPrompt();
			case SpacePackage.DOCUMENT_ROOT__REVISION:
				return REVISION_EDEFAULT == null ? revision != null : !REVISION_EDEFAULT.equals(revision);
			case SpacePackage.DOCUMENT_ROOT__SELECT_CONDITION:
				return isSetSelectCondition();
			case SpacePackage.DOCUMENT_ROOT__TARGET:
				return isSetTarget();
			case SpacePackage.DOCUMENT_ROOT__TYPE:
				return isSetType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", defaultValueCondition: ");
		if (defaultValueConditionESet) result.append(defaultValueCondition); else result.append("<unset>");
		result.append(", depends: ");
		if (dependsESet) result.append(depends); else result.append("<unset>");
		result.append(", featureName: ");
		if (featureNameESet) result.append(featureName); else result.append("<unset>");
		result.append(", prompt: ");
		if (promptESet) result.append(prompt); else result.append("<unset>");
		result.append(", revision: ");
		result.append(revision);
		result.append(", selectCondition: ");
		if (selectConditionESet) result.append(selectCondition); else result.append("<unset>");
		result.append(", target: ");
		if (targetESet) result.append(target); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
