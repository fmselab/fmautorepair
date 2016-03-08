/**
 */
package feature.model.name.space;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.FeatureType#getDependsReferences <em>Depends References</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#getDefaultValues <em>Default Values</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#getSelect <em>Select</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#getDepends <em>Depends</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#isPrompt <em>Prompt</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see feature.model.name.space.SpacePackage#getFeatureType()
 * @model extendedMetaData="name='FeatureType' kind='elementOnly'"
 * @generated
 */
public interface FeatureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Depends References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends References</em>' attribute list.
	 * @see feature.model.name.space.SpacePackage#getFeatureType_DependsReferences()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DependsReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getDependsReferences();

	/**
	 * Returns the value of the '<em><b>Default Values</b></em>' containment reference list.
	 * The list contents are of type {@link feature.model.name.space.DefaultValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Values</em>' containment reference list.
	 * @see feature.model.name.space.SpacePackage#getFeatureType_DefaultValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DefaultValues' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DefaultValueType> getDefaultValues();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link feature.model.name.space.SelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see feature.model.name.space.SpacePackage#getFeatureType_Select()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Select' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SelectType> getSelect();

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' attribute.
	 * @see #setDepends(String)
	 * @see feature.model.name.space.SpacePackage#getFeatureType_Depends()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Depends' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDepends();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureType#getDepends <em>Depends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' attribute.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(String value);

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
	 * @see feature.model.name.space.SpacePackage#getFeatureType_FeatureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FeatureName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureType#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

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
	 * @see feature.model.name.space.SpacePackage#getFeatureType_Prompt()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='Prompt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPrompt();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureType#isPrompt <em>Prompt</em>}' attribute.
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
	 * Unsets the value of the '{@link feature.model.name.space.FeatureType#isPrompt <em>Prompt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrompt()
	 * @see #isPrompt()
	 * @see #setPrompt(boolean)
	 * @generated
	 */
	void unsetPrompt();

	/**
	 * Returns whether the value of the '{@link feature.model.name.space.FeatureType#isPrompt <em>Prompt</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see feature.model.name.space.SpacePackage#getFeatureType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // FeatureType
