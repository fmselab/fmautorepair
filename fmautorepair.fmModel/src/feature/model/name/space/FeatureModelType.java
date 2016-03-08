/**
 */
package feature.model.name.space;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link feature.model.name.space.FeatureModelType#getFeature <em>Feature</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureModelType#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link feature.model.name.space.FeatureModelType#getRevision <em>Revision</em>}</li>
 * </ul>
 *
 * @see feature.model.name.space.SpacePackage#getFeatureModelType()
 * @model extendedMetaData="name='FeatureModelType' kind='elementOnly'"
 * @generated
 */
public interface FeatureModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link feature.model.name.space.FeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see feature.model.name.space.SpacePackage#getFeatureModelType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureType> getFeature();

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
	 * @see feature.model.name.space.SpacePackage#getFeatureModelType_Architecture()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Architecture' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureModelType#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

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
	 * @see feature.model.name.space.SpacePackage#getFeatureModelType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Revision' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevision();

	/**
	 * Sets the value of the '{@link feature.model.name.space.FeatureModelType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(String value);

} // FeatureModelType
