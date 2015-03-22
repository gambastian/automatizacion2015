/**
 */
package quality_requirements_metamodel;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.QualityScenario#getResponseMetric <em>Response Metric</em>}</li>
 *   <li>{@link quality_requirements_metamodel.QualityScenario#getService <em>Service</em>}</li>
 *   <li>{@link quality_requirements_metamodel.QualityScenario#getTestResult <em>Test Result</em>}</li>
 *   <li>{@link quality_requirements_metamodel.QualityScenario#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getQualityScenario()
 * @model
 * @generated
 */
public interface QualityScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Metric</em>' reference.
	 * @see #setResponseMetric(ResponseMetric)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getQualityScenario_ResponseMetric()
	 * @model required="true"
	 * @generated
	 */
	ResponseMetric getResponseMetric();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.QualityScenario#getResponseMetric <em>Response Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Metric</em>' reference.
	 * @see #getResponseMetric()
	 * @generated
	 */
	void setResponseMetric(ResponseMetric value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Stimulus)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getQualityScenario_Service()
	 * @model required="true"
	 * @generated
	 */
	Stimulus getService();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.QualityScenario#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Stimulus value);

	/**
	 * Returns the value of the '<em><b>Test Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Result</em>' attribute.
	 * @see #setTestResult(BigDecimal)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getQualityScenario_TestResult()
	 * @model
	 * @generated
	 */
	BigDecimal getTestResult();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.QualityScenario#getTestResult <em>Test Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Result</em>' attribute.
	 * @see #getTestResult()
	 * @generated
	 */
	void setTestResult(BigDecimal value);

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
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getQualityScenario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.QualityScenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QualityScenario
