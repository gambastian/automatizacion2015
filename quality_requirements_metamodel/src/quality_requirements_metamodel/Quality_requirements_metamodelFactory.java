/**
 */
package quality_requirements_metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage
 * @generated
 */
public interface Quality_requirements_metamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Quality_requirements_metamodelFactory eINSTANCE = quality_requirements_metamodel.impl.Quality_requirements_metamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quality Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Scenario</em>'.
	 * @generated
	 */
	QualityScenario createQualityScenario();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns a new object of class '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dashboard</em>'.
	 * @generated
	 */
	Dashboard createDashboard();

	/**
	 * Returns a new object of class '<em>Stimulus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stimulus</em>'.
	 * @generated
	 */
	Stimulus createStimulus();

	/**
	 * Returns a new object of class '<em>Response Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Metric</em>'.
	 * @generated
	 */
	ResponseMetric createResponseMetric();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Quality_requirements_metamodelPackage getQuality_requirements_metamodelPackage();

} //Quality_requirements_metamodelFactory
