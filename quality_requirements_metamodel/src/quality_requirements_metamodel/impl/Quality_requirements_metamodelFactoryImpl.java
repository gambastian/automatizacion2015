/**
 */
package quality_requirements_metamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import quality_requirements_metamodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Quality_requirements_metamodelFactoryImpl extends EFactoryImpl implements Quality_requirements_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Quality_requirements_metamodelFactory init() {
		try {
			Quality_requirements_metamodelFactory theQuality_requirements_metamodelFactory = (Quality_requirements_metamodelFactory)EPackage.Registry.INSTANCE.getEFactory(Quality_requirements_metamodelPackage.eNS_URI);
			if (theQuality_requirements_metamodelFactory != null) {
				return theQuality_requirements_metamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Quality_requirements_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality_requirements_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO: return createQualityScenario();
			case Quality_requirements_metamodelPackage.ARCHITECTURE: return createArchitecture();
			case Quality_requirements_metamodelPackage.DASHBOARD: return createDashboard();
			case Quality_requirements_metamodelPackage.STIMULUS: return createStimulus();
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC: return createResponseMetric();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Quality_requirements_metamodelPackage.METRICS:
				return createMetricsFromString(eDataType, initialValue);
			case Quality_requirements_metamodelPackage.RELATIONAL_OPERATORS:
				return createRelationalOperatorsFromString(eDataType, initialValue);
			case Quality_requirements_metamodelPackage.UNITS:
				return createUnitsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Quality_requirements_metamodelPackage.METRICS:
				return convertMetricsToString(eDataType, instanceValue);
			case Quality_requirements_metamodelPackage.RELATIONAL_OPERATORS:
				return convertRelationalOperatorsToString(eDataType, instanceValue);
			case Quality_requirements_metamodelPackage.UNITS:
				return convertUnitsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityScenario createQualityScenario() {
		QualityScenarioImpl qualityScenario = new QualityScenarioImpl();
		return qualityScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus createStimulus() {
		StimulusImpl stimulus = new StimulusImpl();
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMetric createResponseMetric() {
		ResponseMetricImpl responseMetric = new ResponseMetricImpl();
		return responseMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics createMetricsFromString(EDataType eDataType, String initialValue) {
		Metrics result = Metrics.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperators createRelationalOperatorsFromString(EDataType eDataType, String initialValue) {
		RelationalOperators result = RelationalOperators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnitsFromString(EDataType eDataType, String initialValue) {
		Units result = Units.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality_requirements_metamodelPackage getQuality_requirements_metamodelPackage() {
		return (Quality_requirements_metamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Quality_requirements_metamodelPackage getPackage() {
		return Quality_requirements_metamodelPackage.eINSTANCE;
	}

} //Quality_requirements_metamodelFactoryImpl
