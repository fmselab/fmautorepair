/**
 */
package feature.model.name.space;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.SelectType#getSelectConditionReferences <em>Select Condition References</em>}</li>
 *   <li>{@link feature.model.name.space.SelectType#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link feature.model.name.space.SelectType#getSelectCondition <em>Select Condition</em>}</li>
 *   <li>{@link feature.model.name.space.SelectType#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see feature.model.name.space.SpacePackage#getSelectType()
 * @model extendedMetaData="name='SelectType' kind='elementOnly'"
 * @generated
 */
public interface SelectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Select Condition References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Condition References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Condition References</em>' attribute list.
	 * @see feature.model.name.space.SpacePackage#getSelectType_SelectConditionReferences()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SelectConditionReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getSelectConditionReferences();

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
	 * @see feature.model.name.space.SpacePackage#getSelectType_FeatureName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FeatureName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link feature.model.name.space.SelectType#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Select Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Condition</em>' attribute.
	 * @see #setSelectCondition(String)
	 * @see feature.model.name.space.SpacePackage#getSelectType_SelectCondition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SelectCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSelectCondition();

	/**
	 * Sets the value of the '{@link feature.model.name.space.SelectType#getSelectCondition <em>Select Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Condition</em>' attribute.
	 * @see #getSelectCondition()
	 * @generated
	 */
	void setSelectCondition(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see feature.model.name.space.SpacePackage#getSelectType_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link feature.model.name.space.SelectType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // SelectType
