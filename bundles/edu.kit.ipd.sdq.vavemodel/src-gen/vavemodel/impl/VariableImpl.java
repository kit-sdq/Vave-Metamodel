/**
 */
package vavemodel.impl;

import org.eclipse.emf.ecore.EClass;
import vavemodel.Option;
import vavemodel.Variable;
import vavemodel.VavemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VariableImpl<T extends Option> extends ExpressionImpl<T> implements Variable<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VavemodelPackage.Literals.VARIABLE;
	}

} //VariableImpl
