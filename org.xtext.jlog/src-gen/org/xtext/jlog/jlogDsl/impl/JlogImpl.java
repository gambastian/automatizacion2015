/**
 */
package org.xtext.jlog.jlogDsl.impl;

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

import org.xtext.jlog.jlogDsl.ArqStimulus;
import org.xtext.jlog.jlogDsl.Jlog;
import org.xtext.jlog.jlogDsl.JlogDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jlog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.JlogImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.JlogImpl#getArquEstimulos <em>Arqu Estimulos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JlogImpl extends MinimalEObjectImpl.Container implements Jlog
{
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
   * The cached value of the '{@link #getArquEstimulos() <em>Arqu Estimulos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArquEstimulos()
   * @generated
   * @ordered
   */
  protected EList<ArqStimulus> arquEstimulos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JlogImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JlogDslPackage.Literals.JLOG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.JLOG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArqStimulus> getArquEstimulos()
  {
    if (arquEstimulos == null)
    {
      arquEstimulos = new EObjectContainmentEList<ArqStimulus>(ArqStimulus.class, this, JlogDslPackage.JLOG__ARQU_ESTIMULOS);
    }
    return arquEstimulos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JlogDslPackage.JLOG__ARQU_ESTIMULOS:
        return ((InternalEList<?>)getArquEstimulos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JlogDslPackage.JLOG__NAME:
        return getName();
      case JlogDslPackage.JLOG__ARQU_ESTIMULOS:
        return getArquEstimulos();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JlogDslPackage.JLOG__NAME:
        setName((String)newValue);
        return;
      case JlogDslPackage.JLOG__ARQU_ESTIMULOS:
        getArquEstimulos().clear();
        getArquEstimulos().addAll((Collection<? extends ArqStimulus>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JlogDslPackage.JLOG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JlogDslPackage.JLOG__ARQU_ESTIMULOS:
        getArquEstimulos().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JlogDslPackage.JLOG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JlogDslPackage.JLOG__ARQU_ESTIMULOS:
        return arquEstimulos != null && !arquEstimulos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //JlogImpl
