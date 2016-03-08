/**
 */
package feature.model.name.space;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.DefaultValueType#getDefaultConditionReferences <em>Default Condition References</em>}</li>
 *   <li>{@link feature.model.name.space.DefaultValueType#getDefaultValueReferences <em>Default Value References</em>}</li>
 *   <li>{@link feature.model.name.space.DefaultValueType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link feature.model.name.space.DefaultValueType#getDefaultValueCondition <em>Default Value Condition</em>}</li>
 *   <li>{@link feature.model.name.space.DefaultValueType#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @see feature.model.name.space.SpacePackage#getDefaultValueType()
 * @model extendedMetaData="name='DefaultValueType' kind='elementOnly'"
 * @generated
 */
public interface DefaultValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Condition References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Condition References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Condition References</em>' attribute list.
	 * @see feature.model.name.space.SpacePackage#getDefaultValueType_DefaultConditionReferences()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultConditionReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDefaultConditionReferences();

	/**
	 * Returns the value of the '<em><b>Default Value References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value References</em>' attribute list.
	 * @see feature.model.name.space.SpacePackage#getDefaultValueType_DefaultValueReferences()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultValueReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDefaultValueReferences();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see feature.model.name.space.SpacePackage#getDefaultValueType_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DefaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DefaultValueType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Value Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Condition</em>' attribute.
	 * @see #setDefaultValueCondition(String)
	 * @see feature.model.name.space.SpacePackage#getDefaultValueType_DefaultValueCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DefaultValueCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDefaultValueCondition();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DefaultValueType#getDefaultValueCondition <em>Default Value Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Condition</em>' attribute.
	 * @see #getDefaultValueCondition()
	 * @generated
	 */
	void setDefaultValueCondition(String value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see feature.model.name.space.SpacePackage#getDefaultValueType_FeatureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FeatureName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link feature.model.name.space.DefaultValueType#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // DefaultValueType
