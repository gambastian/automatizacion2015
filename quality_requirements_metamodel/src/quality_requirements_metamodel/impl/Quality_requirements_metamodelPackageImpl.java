/**
 */
package quality_requirements_metamodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import quality_requirements_metamodel.Architecture;
import quality_requirements_metamodel.Dashboard;
import quality_requirements_metamodel.Metrics;
import quality_requirements_metamodel.QualityScenario;
import quality_requirements_metamodel.Quality_requirements_metamodelFactory;
import quality_requirements_metamodel.Quality_requirements_metamodelPackage;
import quality_requirements_metamodel.RelationalOperators;
import quality_requirements_metamodel.ResponseMetric;
import quality_requirements_metamodel.Stimulus;
import quality_requirements_metamodel.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Quality_requirements_metamodelPackageImpl extends EPackageImpl implements Quality_requirements_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimulusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see quality_requirements_metamodel.Quality_requirements_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Quality_requirements_metamodelPackageImpl() {
		super(eNS_URI, Quality_requirements_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Quality_requirements_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Quality_requirements_metamodelPackage init() {
		if (isInited) return (Quality_requirements_metamodelPackage)EPackage.Registry.INSTANCE.getEPackage(Quality_requirements_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Quality_requirements_metamodelPackageImpl theQuality_requirements_metamodelPackage = (Quality_requirements_metamodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Quality_requirements_metamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Quality_requirements_metamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuality_requirements_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theQuality_requirements_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuality_requirements_metamodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Quality_requirements_metamodelPackage.eNS_URI, theQuality_requirements_metamodelPackage);
		return theQuality_requirements_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityScenario() {
		return qualityScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityScenario_ResponseMetric() {
		return (EReference)qualityScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityScenario_Service() {
		return (EReference)qualityScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityScenario_TestResult() {
		return (EAttribute)qualityScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityScenario_Name() {
		return (EAttribute)qualityScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_Services() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitecture_Name() {
		return (EAttribute)architectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDashboard() {
		return dashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Architectures() {
		return (EReference)dashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Metrics() {
		return (EReference)dashboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Scenarios() {
		return (EReference)dashboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDashboard_Id() {
		return (EAttribute)dashboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimulus() {
		return stimulusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStimulus_Name() {
		return (EAttribute)stimulusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseMetric() {
		return responseMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMetric_Metric() {
		return (EAttribute)responseMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMetric_Operator() {
		return (EAttribute)responseMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMetric_Value() {
		return (EAttribute)responseMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMetric_Unit() {
		return (EAttribute)responseMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMetric_Name() {
		return (EAttribute)responseMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetrics() {
		return metricsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperators() {
		return relationalOperatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnits() {
		return unitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality_requirements_metamodelFactory getQuality_requirements_metamodelFactory() {
		return (Quality_requirements_metamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		qualityScenarioEClass = createEClass(QUALITY_SCENARIO);
		createEReference(qualityScenarioEClass, QUALITY_SCENARIO__RESPONSE_METRIC);
		createEReference(qualityScenarioEClass, QUALITY_SCENARIO__SERVICE);
		createEAttribute(qualityScenarioEClass, QUALITY_SCENARIO__TEST_RESULT);
		createEAttribute(qualityScenarioEClass, QUALITY_SCENARIO__NAME);

		architectureEClass = createEClass(ARCHITECTURE);
		createEReference(architectureEClass, ARCHITECTURE__SERVICES);
		createEAttribute(architectureEClass, ARCHITECTURE__NAME);

		dashboardEClass = createEClass(DASHBOARD);
		createEReference(dashboardEClass, DASHBOARD__ARCHITECTURES);
		createEReference(dashboardEClass, DASHBOARD__METRICS);
		createEReference(dashboardEClass, DASHBOARD__SCENARIOS);
		createEAttribute(dashboardEClass, DASHBOARD__ID);

		stimulusEClass = createEClass(STIMULUS);
		createEAttribute(stimulusEClass, STIMULUS__NAME);

		responseMetricEClass = createEClass(RESPONSE_METRIC);
		createEAttribute(responseMetricEClass, RESPONSE_METRIC__METRIC);
		createEAttribute(responseMetricEClass, RESPONSE_METRIC__OPERATOR);
		createEAttribute(responseMetricEClass, RESPONSE_METRIC__VALUE);
		createEAttribute(responseMetricEClass, RESPONSE_METRIC__UNIT);
		createEAttribute(responseMetricEClass, RESPONSE_METRIC__NAME);

		// Create enums
		metricsEEnum = createEEnum(METRICS);
		relationalOperatorsEEnum = createEEnum(RELATIONAL_OPERATORS);
		unitsEEnum = createEEnum(UNITS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(qualityScenarioEClass, QualityScenario.class, "QualityScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityScenario_ResponseMetric(), this.getResponseMetric(), null, "responseMetric", null, 1, 1, QualityScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityScenario_Service(), this.getStimulus(), null, "service", null, 1, 1, QualityScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityScenario_TestResult(), ecorePackage.getEBigDecimal(), "testResult", null, 0, 1, QualityScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityScenario_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualityScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitecture_Services(), this.getStimulus(), null, "services", null, 1, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchitecture_Name(), ecorePackage.getEString(), "name", null, 0, 1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dashboardEClass, Dashboard.class, "Dashboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDashboard_Architectures(), this.getArchitecture(), null, "architectures", null, 1, -1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Metrics(), this.getResponseMetric(), null, "metrics", null, 1, -1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Scenarios(), this.getQualityScenario(), null, "scenarios", null, 1, -1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Id(), ecorePackage.getEString(), "id", null, 1, 1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stimulusEClass, Stimulus.class, "Stimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStimulus_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseMetricEClass, ResponseMetric.class, "ResponseMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseMetric_Metric(), this.getMetrics(), "metric", null, 0, 1, ResponseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetric_Operator(), this.getRelationalOperators(), "operator", null, 0, 1, ResponseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetric_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, ResponseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetric_Unit(), this.getUnits(), "unit", null, 0, 1, ResponseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResponseMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(metricsEEnum, Metrics.class, "Metrics");
		addEEnumLiteral(metricsEEnum, Metrics.RESPONSE_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.AVERAGE_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.MAX_RESPONSE_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.RESPONSE_TIME_90);
		addEEnumLiteral(metricsEEnum, Metrics.MEDIAN);
		addEEnumLiteral(metricsEEnum, Metrics.ERROR_PERCENTAGE);
		addEEnumLiteral(metricsEEnum, Metrics.TROUGHPUT);
		addEEnumLiteral(metricsEEnum, Metrics.BANDWIDTH);
		addEEnumLiteral(metricsEEnum, Metrics.STANDARD_VARIATION);
		addEEnumLiteral(metricsEEnum, Metrics.THREAD_NUMBER);
		addEEnumLiteral(metricsEEnum, Metrics.TEST_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.LATENCY);
		addEEnumLiteral(metricsEEnum, Metrics.SERVICE);
		addEEnumLiteral(metricsEEnum, Metrics.ELAPSED_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.CODE_TIMES);
		addEEnumLiteral(metricsEEnum, Metrics.THREAD_RESPONSE_TIME);
		addEEnumLiteral(metricsEEnum, Metrics.THREAD_RESPONSE_PERC);

		initEEnum(relationalOperatorsEEnum, RelationalOperators.class, "RelationalOperators");
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.FEWER_THAN);
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.GREATER_THAN);
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.GREATER_EQ_THAN);
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.FEWER_EQ_THAN);
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.DIFFERENT);
		addEEnumLiteral(relationalOperatorsEEnum, RelationalOperators.EQUAL);

		initEEnum(unitsEEnum, Units.class, "Units");
		addEEnumLiteral(unitsEEnum, Units.MILLISECONDS);
		addEEnumLiteral(unitsEEnum, Units.REQUESTS_PER_SEC);

		// Create resource
		createResource(eNS_URI);
	}

} //Quality_requirements_metamodelPackageImpl
