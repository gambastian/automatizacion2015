/**
 */
package quality_requirements_metamodel.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quality_requirements_metamodel.QualityScenario;
import quality_requirements_metamodel.Quality_requirements_metamodelPackage;
import quality_requirements_metamodel.ResponseMetric;
import quality_requirements_metamodel.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.impl.QualityScenarioImpl#getResponseMetric <em>Response Metric</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.QualityScenarioImpl#getService <em>Service</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.QualityScenarioImpl#getTestResult <em>Test Result</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.QualityScenarioImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualityScenarioImpl extends MinimalEObjectImpl.Container implements QualityScenario {
	/**
	 * The cached value of the '{@link #getResponseMetric() <em>Response Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMetric()
	 * @generated
	 * @ordered
	 */
	protected ResponseMetric responseMetric;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Stimulus service;

	/**
	 * The default value of the '{@link #getTestResult() <em>Test Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResult()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEST_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestResult() <em>Test Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResult()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal testResult = TEST_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Quality_requirements_metamodelPackage.Literals.QUALITY_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMetric getResponseMetric() {
		if (responseMetric != null && responseMetric.eIsProxy()) {
			InternalEObject oldResponseMetric = (InternalEObject)responseMetric;
			responseMetric = (ResponseMetric)eResolveProxy(oldResponseMetric);
			if (responseMetric != oldResponseMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC, oldResponseMetric, responseMetric));
			}
		}
		return responseMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMetric basicGetResponseMetric() {
		return responseMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseMetric(ResponseMetric newResponseMetric) {
		ResponseMetric oldResponseMetric = responseMetric;
		responseMetric = newResponseMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC, oldResponseMetric, responseMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Stimulus)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Stimulus newService) {
		Stimulus oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTestResult() {
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestResult(BigDecimal newTestResult) {
		BigDecimal oldTestResult = testResult;
		testResult = newTestResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__TEST_RESULT, oldTestResult, testResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.QUALITY_SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC:
				if (resolve) return getResponseMetric();
				return basicGetResponseMetric();
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__TEST_RESULT:
				return getTestResult();
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC:
				setResponseMetric((ResponseMetric)newValue);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE:
				setService((Stimulus)newValue);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__TEST_RESULT:
				setTestResult((BigDecimal)newValue);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC:
				setResponseMetric((ResponseMetric)null);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE:
				setService((Stimulus)null);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__TEST_RESULT:
				setTestResult(TEST_RESULT_EDEFAULT);
				return;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__RESPONSE_METRIC:
				return responseMetric != null;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__SERVICE:
				return service != null;
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__TEST_RESULT:
				return TEST_RESULT_EDEFAULT == null ? testResult != null : !TEST_RESULT_EDEFAULT.equals(testResult);
			case Quality_requirements_metamodelPackage.QUALITY_SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (testResult: ");
		result.append(testResult);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QualityScenarioImpl
