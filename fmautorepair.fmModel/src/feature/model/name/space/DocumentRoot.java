/**
 */
package feature.model.name.space;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getFeature <em>Feature</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getFeatureModel <em>Feature Model</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getSelect <em>Select</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getDefaultValueCondition <em>Default Value Condition</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getDepends <em>Depends</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#isPrompt <em>Prompt</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getRevision <em>Revision</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getTarget <em>Target</em>}</li>
 *   <li>{@link feature.model.name.space.DocumentRoot#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see feature.model.name.space.SpacePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureType)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Feature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureType getFeature();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(FeatureType value);

	/**
	 * Returns the value of the '<em><b>Feature Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Model</em>' containment reference.
	 * @see #setFeatureModel(FeatureModelType)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_FeatureModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureModel' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureModelType getFeatureModel();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getFeatureModel <em>Feature Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Model</em>' containment reference.
	 * @see #getFeatureModel()
	 * @generated
	 */
	void setFeatureModel(FeatureModelType value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(SelectType)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Select()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Select' namespace='##targetNamespace'"
	 * @generated
	 */
	SelectType getSelect();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(SelectType value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Architecture()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Architecture' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_DefaultValue()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	boolean isSetDefaultValue();

	/**
	 * Returns the value of the '<em><b>Default Value Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Condition</em>' attribute.
	 * @see #isSetDefaultValueCondition()
	 * @see #unsetDefaultValueCondition()
	 * @see #setDefaultValueCondition(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_DefaultValueCondition()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DefaultValueCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValueCondition();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValueCondition <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Condition</em>' attribute.
	 * @see #isSetDefaultValueCondition()
	 * @see #unsetDefaultValueCondition()
	 * @see #getDefaultValueCondition()
	 * @generated
	 */
	void setDefaultValueCondition(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValueCondition <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValueCondition()
	 * @see #getDefaultValueCondition()
	 * @see #setDefaultValueCondition(String)
	 * @generated
	 */
	void unsetDefaultValueCondition();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getDefaultValueCondition <em>Default Value Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value Condition</em>' attribute is set.
	 * @see #unsetDefaultValueCondition()
	 * @see #getDefaultValueCondition()
	 * @see #setDefaultValueCondition(String)
	 * @generated
	 */
	boolean isSetDefaultValueCondition();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' attribute.
	 * @see #isSetDepends()
	 * @see #unsetDepends()
	 * @see #setDepends(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Depends()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Depends' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepends();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getDepends <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' attribute.
	 * @see #isSetDepends()
	 * @see #unsetDepends()
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getDepends <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDepends()
	 * @see #getDepends()
	 * @see #setDepends(String)
	 * @generated
	 */
	void unsetDepends();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getDepends <em>Depends</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Depends</em>' attribute is set.
	 * @see #unsetDepends()
	 * @see #getDepends()
	 * @see #setDepends(String)
	 * @generated
	 */
	boolean isSetDepends();

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #isSetFeatureName()
	 * @see #unsetFeatureName()
	 * @see #setFeatureName(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_FeatureName()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FeatureName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #isSetFeatureName()
	 * @see #unsetFeatureName()
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureName()
	 * @see #getFeatureName()
	 * @see #setFeatureName(String)
	 * @generated
	 */
	void unsetFeatureName();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getFeatureName <em>Feature Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Name</em>' attribute is set.
	 * @see #unsetFeatureName()
	 * @see #getFeatureName()
	 * @see #setFeatureName(String)
	 * @generated
	 */
	boolean isSetFeatureName();

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' attribute.
	 * @see #isSetPrompt()
	 * @see #unsetPrompt()
	 * @see #setPrompt(boolean)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Prompt()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Prompt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPrompt();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#isPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' attribute.
	 * @see #isSetPrompt()
	 * @see #unsetPrompt()
	 * @see #isPrompt()
	 * @generated
	 */
	void setPrompt(boolean value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#isPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrompt()
	 * @see #isPrompt()
	 * @see #setPrompt(boolean)
	 * @generated
	 */
	void unsetPrompt();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#isPrompt <em>Prompt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prompt</em>' attribute is set.
	 * @see #unsetPrompt()
	 * @see #isPrompt()
	 * @see #setPrompt(boolean)
	 * @generated
	 */
	boolean isSetPrompt();

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Revision' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

	/**
	 * Returns the value of the '<em><b>Select Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Condition</em>' attribute.
	 * @see #isSetSelectCondition()
	 * @see #unsetSelectCondition()
	 * @see #setSelectCondition(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_SelectCondition()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SelectCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSelectCondition();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getSelectCondition <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Condition</em>' attribute.
	 * @see #isSetSelectCondition()
	 * @see #unsetSelectCondition()
	 * @see #getSelectCondition()
	 * @generated
	 */
	void setSelectCondition(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getSelectCondition <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectCondition()
	 * @see #getSelectCondition()
	 * @see #setSelectCondition(String)
	 * @generated
	 */
	void unsetSelectCondition();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getSelectCondition <em>Select Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Condition</em>' attribute is set.
	 * @see #unsetSelectCondition()
	 * @see #getSelectCondition()
	 * @see #setSelectCondition(String)
	 * @generated
	 */
	boolean isSetSelectCondition();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #setTarget(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Target()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTarget()
	 * @see #getTarget()
	 * @see #setTarget(String)
	 * @generated
	 */
	void unsetTarget();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getTarget <em>Target</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target</em>' attribute is set.
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @see #setTarget(String)
	 * @generated
	 */
	boolean isSetTarget();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see feature.model.name.space.SpacePackage#getDocumentRoot_Type()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link feature.model.name.space.DocumentRoot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.DocumentRoot#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // DocumentRoot
