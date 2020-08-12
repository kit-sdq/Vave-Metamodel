/**
 */
package vavemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Expression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Feature)
	 * @see vavemodel.VavemodelPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	Feature getName();

	/**
	 * Sets the value of the '{@link vavemodel.Variable#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Feature value);

} // Variable
