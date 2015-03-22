/**
 */
package quality_requirements_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.Dashboard#getArchitectures <em>Architectures</em>}</li>
 *   <li>{@link quality_requirements_metamodel.Dashboard#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link quality_requirements_metamodel.Dashboard#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link quality_requirements_metamodel.Dashboard#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link quality_requirements_metamodel.Architecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectures</em>' containment reference list.
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getDashboard_Architectures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Architecture> getArchitectures();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link quality_requirements_metamodel.ResponseMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getDashboard_Metrics()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResponseMetric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link quality_requirements_metamodel.QualityScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getDashboard_Scenarios()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QualityScenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#getDashboard_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link quality_requirements_metamodel.Dashboard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Dashboard
