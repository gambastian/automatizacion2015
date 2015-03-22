/**
 */
package quality_requirements_metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import quality_requirements_metamodel.Architecture;
import quality_requirements_metamodel.Dashboard;
import quality_requirements_metamodel.QualityScenario;
import quality_requirements_metamodel.Quality_requirements_metamodelPackage;
import quality_requirements_metamodel.ResponseMetric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link quality_requirements_metamodel.impl.DashboardImpl#getArchitectures <em>Architectures</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.DashboardImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.DashboardImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link quality_requirements_metamodel.impl.DashboardImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DashboardImpl extends MinimalEObjectImpl.Container implements Dashboard {
	/**
	 * The cached value of the '{@link #getArchitectures() <em>Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<Architecture> architectures;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponseMetric> metrics;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityScenario> scenarios;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Quality_requirements_metamodelPackage.Literals.DASHBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Architecture> getArchitectures() {
		if (architectures == null) {
			architectures = new EObjectContainmentEList<Architecture>(Architecture.class, this, Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES);
		}
		return architectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponseMetric> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectContainmentEList<ResponseMetric>(ResponseMetric.class, this, Quality_requirements_metamodelPackage.DASHBOARD__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityScenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<QualityScenario>(QualityScenario.class, this, Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Quality_requirements_metamodelPackage.DASHBOARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES:
				return ((InternalEList<?>)getArchitectures()).basicRemove(otherEnd, msgs);
			case Quality_requirements_metamodelPackage.DASHBOARD__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
			case Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES:
				return getArchitectures();
			case Quality_requirements_metamodelPackage.DASHBOARD__METRICS:
				return getMetrics();
			case Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS:
				return getScenarios();
			case Quality_requirements_metamodelPackage.DASHBOARD__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES:
				getArchitectures().clear();
				getArchitectures().addAll((Collection<? extends Architecture>)newValue);
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends ResponseMetric>)newValue);
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends QualityScenario>)newValue);
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__ID:
				setId((String)newValue);
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
			case Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES:
				getArchitectures().clear();
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__METRICS:
				getMetrics().clear();
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS:
				getScenarios().clear();
				return;
			case Quality_requirements_metamodelPackage.DASHBOARD__ID:
				setId(ID_EDEFAULT);
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
			case Quality_requirements_metamodelPackage.DASHBOARD__ARCHITECTURES:
				return architectures != null && !architectures.isEmpty();
			case Quality_requirements_metamodelPackage.DASHBOARD__METRICS:
				return metrics != null && !metrics.isEmpty();
			case Quality_requirements_metamodelPackage.DASHBOARD__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case Quality_requirements_metamodelPackage.DASHBOARD__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DashboardImpl
