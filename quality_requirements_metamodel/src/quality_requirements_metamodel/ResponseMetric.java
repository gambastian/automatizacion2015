/**
 */
package quality_requirements_metamodel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.ResponseMetric#getMetric <em>Metric</em>}</li>
 *   <li>{@link quality_requirements_metamodel.ResponseMetric#getOperator <em>Operator</em>}</li>
 *   <li>{@link quality_requirements_metamodel.ResponseMetric#getValue <em>Value</em>}</li>
 *   <li>{@link quality_requirements_metamodel.ResponseMetric#getUnit <em>Unit</em>}</li>
 *   <li>{@link quality_requirements_metamodel.ResponseMetric#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric()
 * @model
 * @generated
 */
public interface ResponseMetric extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link quality_requirements_metamodel.Metrics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see quality_requirements_metamodel.Metrics
	 * @see #setMetric(Metrics)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric_Metric()
	 * @model
	 * @generated
	 */
	Metrics getMetric();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.ResponseMetric#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see quality_requirements_metamodel.Metrics
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metrics value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link quality_requirements_metamodel.RelationalOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see quality_requirements_metamodel.RelationalOperators
	 * @see #setOperator(RelationalOperators)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric_Operator()
	 * @model
	 * @generated
	 */
	RelationalOperators getOperator();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.ResponseMetric#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see quality_requirements_metamodel.RelationalOperators
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperators value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric_Value()
	 * @model
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.ResponseMetric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link quality_requirements_metamodel.Units}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see quality_requirements_metamodel.Units
	 * @see #setUnit(Units)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric_Unit()
	 * @model
	 * @generated
	 */
	Units getUnit();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.ResponseMetric#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see quality_requirements_metamodel.Units
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Units value);

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
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getResponseMetric_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.ResponseMetric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ResponseMetric
