/**
 */
package quality_requirements_metamodel.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quality_requirements_metamodel.Metrics;
import quality_requirements_metamodel.Quality_requirements_metamodelPackage;
import quality_requirements_metamodel.RelationalOperators;
import quality_requirements_metamodel.ResponseMetric;
import quality_requirements_metamodel.Units;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.impl.ResponseMetricImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.ResponseMetricImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.ResponseMetricImpl#getValue <em>Value</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.ResponseMetricImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.ResponseMetricImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseMetricImpl extends MinimalEObjectImpl.Container implements ResponseMetric {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final Metrics METRIC_EDEFAULT = Metrics.RESPONSE_TIME;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected Metrics metric = METRIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperators OPERATOR_EDEFAULT = RelationalOperators.FEWER_THAN;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperators operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Units UNIT_EDEFAULT = Units.MILLISECONDS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Units unit = UNIT_EDEFAULT;

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
	protected ResponseMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Quality_requirements_metamodelPackage.Literals.RESPONSE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metrics newMetric) {
		Metrics oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.RESPONSE_METRIC__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperators getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(RelationalOperators newOperator) {
		RelationalOperators oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.RESPONSE_METRIC__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.RESPONSE_METRIC__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Units newUnit) {
		Units oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.RESPONSE_METRIC__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.RESPONSE_METRIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__METRIC:
				return getMetric();
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__OPERATOR:
				return getOperator();
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__VALUE:
				return getValue();
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__UNIT:
				return getUnit();
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__NAME:
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
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__METRIC:
				setMetric((Metrics)newValue);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__OPERATOR:
				setOperator((RelationalOperators)newValue);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__UNIT:
				setUnit((Units)newValue);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__NAME:
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
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__NAME:
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
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__METRIC:
				return metric != METRIC_EDEFAULT;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__UNIT:
				return unit != UNIT_EDEFAULT;
			case Quality_requirements_metamodelPackage.RESPONSE_METRIC__NAME:
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(", operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResponseMetricImpl
