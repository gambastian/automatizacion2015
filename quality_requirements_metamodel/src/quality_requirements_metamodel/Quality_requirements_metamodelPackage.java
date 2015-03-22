/**
 */
package quality_requirements_metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see quality_requirements_metamodel.Quality_requirements_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Quality_requirements_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quality_requirements_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/quality_requirements_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quality_requirements_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Quality_requirements_metamodelPackage eINSTANCE = quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.impl.QualityScenarioImpl <em>Quality Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.impl.QualityScenarioImpl
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getQualityScenario()
	 * @generated
	 */
	int QUALITY_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Response Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO__RESPONSE_METRIC = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Test Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO__TEST_RESULT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO__NAME = 3;

	/**
	 * The number of structural features of the '<em>Quality Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Quality Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.impl.ArchitectureImpl
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.impl.DashboardImpl
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 2;

	/**
	 * The feature id for the '<em><b>Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__ARCHITECTURES = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__SCENARIOS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__ID = 3;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.impl.StimulusImpl
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.impl.ResponseMetricImpl <em>Response Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.impl.ResponseMetricImpl
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getResponseMetric()
	 * @generated
	 */
	int RESPONSE_METRIC = 4;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC__NAME = 4;

	/**
	 * The number of structural features of the '<em>Response Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Response Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.Metrics <em>Metrics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.Metrics
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getMetrics()
	 * @generated
	 */
	int METRICS = 5;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.RelationalOperators <em>Relational Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.RelationalOperators
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getRelationalOperators()
	 * @generated
	 */
	int RELATIONAL_OPERATORS = 6;

	/**
	 * The meta object id for the '{@link quality_requirements_metamodel.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see quality_requirements_metamodel.Units
	 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 7;


	/**
	 * Returns the meta object for class '{@link quality_requirements_metamodel.QualityScenario <em>Quality Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Scenario</em>'.
	 * @see quality_requirements_metamodel.QualityScenario
	 * @generated
	 */
	EClass getQualityScenario();

	/**
	 * Returns the meta object for the reference '{@link quality_requirements_metamodel.QualityScenario#getResponseMetric <em>Response Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Metric</em>'.
	 * @see quality_requirements_metamodel.QualityScenario#getResponseMetric()
	 * @see #getQualityScenario()
	 * @generated
	 */
	EReference getQualityScenario_ResponseMetric();

	/**
	 * Returns the meta object for the reference '{@link quality_requirements_metamodel.QualityScenario#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see quality_requirements_metamodel.QualityScenario#getService()
	 * @see #getQualityScenario()
	 * @generated
	 */
	EReference getQualityScenario_Service();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.QualityScenario#getTestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Result</em>'.
	 * @see quality_requirements_metamodel.QualityScenario#getTestResult()
	 * @see #getQualityScenario()
	 * @generated
	 */
	EAttribute getQualityScenario_TestResult();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.QualityScenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see quality_requirements_metamodel.QualityScenario#getName()
	 * @see #getQualityScenario()
	 * @generated
	 */
	EAttribute getQualityScenario_Name();

	/**
	 * Returns the meta object for class '{@link quality_requirements_metamodel.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see quality_requirements_metamodel.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link quality_requirements_metamodel.Architecture#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see quality_requirements_metamodel.Architecture#getServices()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Services();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see quality_requirements_metamodel.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for class '{@link quality_requirements_metamodel.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see quality_requirements_metamodel.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the containment reference list '{@link quality_requirements_metamodel.Dashboard#getArchitectures <em>Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectures</em>'.
	 * @see quality_requirements_metamodel.Dashboard#getArchitectures()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Architectures();

	/**
	 * Returns the meta object for the containment reference list '{@link quality_requirements_metamodel.Dashboard#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see quality_requirements_metamodel.Dashboard#getMetrics()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link quality_requirements_metamodel.Dashboard#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see quality_requirements_metamodel.Dashboard#getScenarios()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Scenarios();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.Dashboard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see quality_requirements_metamodel.Dashboard#getId()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Id();

	/**
	 * Returns the meta object for class '{@link quality_requirements_metamodel.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see quality_requirements_metamodel.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.Stimulus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see quality_requirements_metamodel.Stimulus#getName()
	 * @see #getStimulus()
	 * @generated
	 */
	EAttribute getStimulus_Name();

	/**
	 * Returns the meta object for class '{@link quality_requirements_metamodel.ResponseMetric <em>Response Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Metric</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric
	 * @generated
	 */
	EClass getResponseMetric();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.ResponseMetric#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric#getMetric()
	 * @see #getResponseMetric()
	 * @generated
	 */
	EAttribute getResponseMetric_Metric();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.ResponseMetric#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric#getOperator()
	 * @see #getResponseMetric()
	 * @generated
	 */
	EAttribute getResponseMetric_Operator();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.ResponseMetric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric#getValue()
	 * @see #getResponseMetric()
	 * @generated
	 */
	EAttribute getResponseMetric_Value();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.ResponseMetric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric#getUnit()
	 * @see #getResponseMetric()
	 * @generated
	 */
	EAttribute getResponseMetric_Unit();

	/**
	 * Returns the meta object for the attribute '{@link quality_requirements_metamodel.ResponseMetric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see quality_requirements_metamodel.ResponseMetric#getName()
	 * @see #getResponseMetric()
	 * @generated
	 */
	EAttribute getResponseMetric_Name();

	/**
	 * Returns the meta object for enum '{@link quality_requirements_metamodel.Metrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metrics</em>'.
	 * @see quality_requirements_metamodel.Metrics
	 * @generated
	 */
	EEnum getMetrics();

	/**
	 * Returns the meta object for enum '{@link quality_requirements_metamodel.RelationalOperators <em>Relational Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operators</em>'.
	 * @see quality_requirements_metamodel.RelationalOperators
	 * @generated
	 */
	EEnum getRelationalOperators();

	/**
	 * Returns the meta object for enum '{@link quality_requirements_metamodel.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see quality_requirements_metamodel.Units
	 * @generated
	 */
	EEnum getUnits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Quality_requirements_metamodelFactory getQuality_requirements_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.impl.QualityScenarioImpl <em>Quality Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.impl.QualityScenarioImpl
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getQualityScenario()
		 * @generated
		 */
		EClass QUALITY_SCENARIO = eINSTANCE.getQualityScenario();

		/**
		 * The meta object literal for the '<em><b>Response Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_SCENARIO__RESPONSE_METRIC = eINSTANCE.getQualityScenario_ResponseMetric();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_SCENARIO__SERVICE = eINSTANCE.getQualityScenario_Service();

		/**
		 * The meta object literal for the '<em><b>Test Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_SCENARIO__TEST_RESULT = eINSTANCE.getQualityScenario_TestResult();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_SCENARIO__NAME = eINSTANCE.getQualityScenario_Name();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.impl.ArchitectureImpl
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__SERVICES = eINSTANCE.getArchitecture_Services();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.impl.DashboardImpl
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__ARCHITECTURES = eINSTANCE.getDashboard_Architectures();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__METRICS = eINSTANCE.getDashboard_Metrics();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__SCENARIOS = eINSTANCE.getDashboard_Scenarios();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__ID = eINSTANCE.getDashboard_Id();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.impl.StimulusImpl
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STIMULUS__NAME = eINSTANCE.getStimulus_Name();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.impl.ResponseMetricImpl <em>Response Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.impl.ResponseMetricImpl
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getResponseMetric()
		 * @generated
		 */
		EClass RESPONSE_METRIC = eINSTANCE.getResponseMetric();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METRIC__METRIC = eINSTANCE.getResponseMetric_Metric();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METRIC__OPERATOR = eINSTANCE.getResponseMetric_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METRIC__VALUE = eINSTANCE.getResponseMetric_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METRIC__UNIT = eINSTANCE.getResponseMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_METRIC__NAME = eINSTANCE.getResponseMetric_Name();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.Metrics <em>Metrics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.Metrics
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getMetrics()
		 * @generated
		 */
		EEnum METRICS = eINSTANCE.getMetrics();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.RelationalOperators <em>Relational Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.RelationalOperators
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getRelationalOperators()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATORS = eINSTANCE.getRelationalOperators();

		/**
		 * The meta object literal for the '{@link quality_requirements_metamodel.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see quality_requirements_metamodel.Units
		 * @see quality_requirements_metamodel.impl.Quality_requirements_metamodelPackageImpl#getUnits()
		 * @generated
		 */
		EEnum UNITS = eINSTANCE.getUnits();

	}

} //Quality_requirements_metamodelPackage
