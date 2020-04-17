/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.System#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link vavemodel.System#getVariant <em>Variant</em>}</li>
 *   <li>{@link vavemodel.System#getName <em>Name</em>}</li>
 *   <li>{@link vavemodel.System#getMapping <em>Mapping</em>}</li>
 *   <li>{@link vavemodel.System#getDeltamodule <em>Deltamodule</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.CrossTreeConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossTreeConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Variant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variant> getVariant();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vavemodel.VavemodelPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vavemodel.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMapping();

	/**
	 * Returns the value of the '<em><b>Deltamodule</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.DeltaModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltamodule</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Deltamodule()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeltaModule> getDeltamodule();

} // System
