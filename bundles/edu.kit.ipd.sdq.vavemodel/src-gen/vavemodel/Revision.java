/**
 */
package vavemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vavemodel.Revision#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link vavemodel.Revision#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 *
 * @see vavemodel.VavemodelPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends Option {
	/**
	 * Returns the value of the '<em><b>Successor</b></em>' containment reference list.
	 * The list contents are of type {@link vavemodel.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' containment reference list.
	 * @see vavemodel.VavemodelPackage#getRevision_Successor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision> getSuccessor();

	/**
	 * Returns the value of the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision ID</em>' attribute.
	 * @see #setRevisionID(String)
	 * @see vavemodel.VavemodelPackage#getRevision_RevisionID()
	 * @model
	 * @generated
	 */
	String getRevisionID();

	/**
	 * Sets the value of the '{@link vavemodel.Revision#getRevisionID <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision ID</em>' attribute.
	 * @see #getRevisionID()
	 * @generated
	 */
	void setRevisionID(String value);

} // Revision
