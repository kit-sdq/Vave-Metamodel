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
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getSystem_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Variant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // System
