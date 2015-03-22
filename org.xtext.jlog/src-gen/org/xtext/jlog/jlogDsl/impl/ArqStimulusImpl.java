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
import org.xtext.jlog.jlogDsl.JlogDslPackage;
import org.xtext.jlog.jlogDsl.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arq Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getStimulusName <em>Stimulus Name</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getMinResponseTime <em>Min Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getMedResponseTime <em>Med Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getErrorPercentage <em>Error Percentage</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getThreadNumber <em>Thread Number</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getLatencies <em>Latencies</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl#getResponses <em>Responses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArqStimulusImpl extends MinimalEObjectImpl.Container implements ArqStimulus
{
  /**
   * The default value of the '{@link #getStimulusName() <em>Stimulus Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStimulusName()
   * @generated
   * @ordered
   */
  protected static final String STIMULUS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStimulusName() <em>Stimulus Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStimulusName()
   * @generated
   * @ordered
   */
  protected String stimulusName = STIMULUS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMinResponseTime() <em>Min Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinResponseTime()
   * @generated
   * @ordered
   */
  protected static final int MIN_RESPONSE_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinResponseTime() <em>Min Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinResponseTime()
   * @generated
   * @ordered
   */
  protected int minResponseTime = MIN_RESPONSE_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getMedResponseTime() <em>Med Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedResponseTime()
   * @generated
   * @ordered
   */
  protected static final int MED_RESPONSE_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMedResponseTime() <em>Med Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedResponseTime()
   * @generated
   * @ordered
   */
  protected int medResponseTime = MED_RESPONSE_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxResponseTime()
   * @generated
   * @ordered
   */
  protected static final int MAX_RESPONSE_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxResponseTime()
   * @generated
   * @ordered
   */
  protected int maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getErrorPercentage() <em>Error Percentage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorPercentage()
   * @generated
   * @ordered
   */
  protected org.xtext.jlog.jlogDsl.Double errorPercentage;

  /**
   * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThroughput()
   * @generated
   * @ordered
   */
  protected org.xtext.jlog.jlogDsl.Double throughput;

  /**
   * The default value of the '{@link #getThreadNumber() <em>Thread Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadNumber()
   * @generated
   * @ordered
   */
  protected static final int THREAD_NUMBER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getThreadNumber() <em>Thread Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreadNumber()
   * @generated
   * @ordered
   */
  protected int threadNumber = THREAD_NUMBER_EDEFAULT;

  /**
   * The cached value of the '{@link #getLatencies() <em>Latencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatencies()
   * @generated
   * @ordered
   */
  protected EList<Values> latencies;

  /**
   * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponses()
   * @generated
   * @ordered
   */
  protected EList<Values> responses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArqStimulusImpl()
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
    return JlogDslPackage.Literals.ARQ_STIMULUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStimulusName()
  {
    return stimulusName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStimulusName(String newStimulusName)
  {
    String oldStimulusName = stimulusName;
    stimulusName = newStimulusName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__STIMULUS_NAME, oldStimulusName, stimulusName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinResponseTime()
  {
    return minResponseTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinResponseTime(int newMinResponseTime)
  {
    int oldMinResponseTime = minResponseTime;
    minResponseTime = newMinResponseTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__MIN_RESPONSE_TIME, oldMinResponseTime, minResponseTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMedResponseTime()
  {
    return medResponseTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMedResponseTime(int newMedResponseTime)
  {
    int oldMedResponseTime = medResponseTime;
    medResponseTime = newMedResponseTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__MED_RESPONSE_TIME, oldMedResponseTime, medResponseTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxResponseTime()
  {
    return maxResponseTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxResponseTime(int newMaxResponseTime)
  {
    int oldMaxResponseTime = maxResponseTime;
    maxResponseTime = newMaxResponseTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__MAX_RESPONSE_TIME, oldMaxResponseTime, maxResponseTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.jlog.jlogDsl.Double getErrorPercentage()
  {
    return errorPercentage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorPercentage(org.xtext.jlog.jlogDsl.Double newErrorPercentage, NotificationChain msgs)
  {
    org.xtext.jlog.jlogDsl.Double oldErrorPercentage = errorPercentage;
    errorPercentage = newErrorPercentage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE, oldErrorPercentage, newErrorPercentage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorPercentage(org.xtext.jlog.jlogDsl.Double newErrorPercentage)
  {
    if (newErrorPercentage != errorPercentage)
    {
      NotificationChain msgs = null;
      if (errorPercentage != null)
        msgs = ((InternalEObject)errorPercentage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE, null, msgs);
      if (newErrorPercentage != null)
        msgs = ((InternalEObject)newErrorPercentage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE, null, msgs);
      msgs = basicSetErrorPercentage(newErrorPercentage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE, newErrorPercentage, newErrorPercentage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.jlog.jlogDsl.Double getThroughput()
  {
    return throughput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThroughput(org.xtext.jlog.jlogDsl.Double newThroughput, NotificationChain msgs)
  {
    org.xtext.jlog.jlogDsl.Double oldThroughput = throughput;
    throughput = newThroughput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__THROUGHPUT, oldThroughput, newThroughput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThroughput(org.xtext.jlog.jlogDsl.Double newThroughput)
  {
    if (newThroughput != throughput)
    {
      NotificationChain msgs = null;
      if (throughput != null)
        msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JlogDslPackage.ARQ_STIMULUS__THROUGHPUT, null, msgs);
      if (newThroughput != null)
        msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JlogDslPackage.ARQ_STIMULUS__THROUGHPUT, null, msgs);
      msgs = basicSetThroughput(newThroughput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__THROUGHPUT, newThroughput, newThroughput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getThreadNumber()
  {
    return threadNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreadNumber(int newThreadNumber)
  {
    int oldThreadNumber = threadNumber;
    threadNumber = newThreadNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JlogDslPackage.ARQ_STIMULUS__THREAD_NUMBER, oldThreadNumber, threadNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Values> getLatencies()
  {
    if (latencies == null)
    {
      latencies = new EObjectContainmentEList<Values>(Values.class, this, JlogDslPackage.ARQ_STIMULUS__LATENCIES);
    }
    return latencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Values> getResponses()
  {
    if (responses == null)
    {
      responses = new EObjectContainmentEList<Values>(Values.class, this, JlogDslPackage.ARQ_STIMULUS__RESPONSES);
    }
    return responses;
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
      case JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE:
        return basicSetErrorPercentage(null, msgs);
      case JlogDslPackage.ARQ_STIMULUS__THROUGHPUT:
        return basicSetThroughput(null, msgs);
      case JlogDslPackage.ARQ_STIMULUS__LATENCIES:
        return ((InternalEList<?>)getLatencies()).basicRemove(otherEnd, msgs);
      case JlogDslPackage.ARQ_STIMULUS__RESPONSES:
        return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
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
      case JlogDslPackage.ARQ_STIMULUS__STIMULUS_NAME:
        return getStimulusName();
      case JlogDslPackage.ARQ_STIMULUS__MIN_RESPONSE_TIME:
        return getMinResponseTime();
      case JlogDslPackage.ARQ_STIMULUS__MED_RESPONSE_TIME:
        return getMedResponseTime();
      case JlogDslPackage.ARQ_STIMULUS__MAX_RESPONSE_TIME:
        return getMaxResponseTime();
      case JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE:
        return getErrorPercentage();
      case JlogDslPackage.ARQ_STIMULUS__THROUGHPUT:
        return getThroughput();
      case JlogDslPackage.ARQ_STIMULUS__THREAD_NUMBER:
        return getThreadNumber();
      case JlogDslPackage.ARQ_STIMULUS__LATENCIES:
        return getLatencies();
      case JlogDslPackage.ARQ_STIMULUS__RESPONSES:
        return getResponses();
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
      case JlogDslPackage.ARQ_STIMULUS__STIMULUS_NAME:
        setStimulusName((String)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MIN_RESPONSE_TIME:
        setMinResponseTime((Integer)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MED_RESPONSE_TIME:
        setMedResponseTime((Integer)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MAX_RESPONSE_TIME:
        setMaxResponseTime((Integer)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE:
        setErrorPercentage((org.xtext.jlog.jlogDsl.Double)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__THROUGHPUT:
        setThroughput((org.xtext.jlog.jlogDsl.Double)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__THREAD_NUMBER:
        setThreadNumber((Integer)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__LATENCIES:
        getLatencies().clear();
        getLatencies().addAll((Collection<? extends Values>)newValue);
        return;
      case JlogDslPackage.ARQ_STIMULUS__RESPONSES:
        getResponses().clear();
        getResponses().addAll((Collection<? extends Values>)newValue);
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
      case JlogDslPackage.ARQ_STIMULUS__STIMULUS_NAME:
        setStimulusName(STIMULUS_NAME_EDEFAULT);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MIN_RESPONSE_TIME:
        setMinResponseTime(MIN_RESPONSE_TIME_EDEFAULT);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MED_RESPONSE_TIME:
        setMedResponseTime(MED_RESPONSE_TIME_EDEFAULT);
        return;
      case JlogDslPackage.ARQ_STIMULUS__MAX_RESPONSE_TIME:
        setMaxResponseTime(MAX_RESPONSE_TIME_EDEFAULT);
        return;
      case JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE:
        setErrorPercentage((org.xtext.jlog.jlogDsl.Double)null);
        return;
      case JlogDslPackage.ARQ_STIMULUS__THROUGHPUT:
        setThroughput((org.xtext.jlog.jlogDsl.Double)null);
        return;
      case JlogDslPackage.ARQ_STIMULUS__THREAD_NUMBER:
        setThreadNumber(THREAD_NUMBER_EDEFAULT);
        return;
      case JlogDslPackage.ARQ_STIMULUS__LATENCIES:
        getLatencies().clear();
        return;
      case JlogDslPackage.ARQ_STIMULUS__RESPONSES:
        getResponses().clear();
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
      case JlogDslPackage.ARQ_STIMULUS__STIMULUS_NAME:
        return STIMULUS_NAME_EDEFAULT == null ? stimulusName != null : !STIMULUS_NAME_EDEFAULT.equals(stimulusName);
      case JlogDslPackage.ARQ_STIMULUS__MIN_RESPONSE_TIME:
        return minResponseTime != MIN_RESPONSE_TIME_EDEFAULT;
      case JlogDslPackage.ARQ_STIMULUS__MED_RESPONSE_TIME:
        return medResponseTime != MED_RESPONSE_TIME_EDEFAULT;
      case JlogDslPackage.ARQ_STIMULUS__MAX_RESPONSE_TIME:
        return maxResponseTime != MAX_RESPONSE_TIME_EDEFAULT;
      case JlogDslPackage.ARQ_STIMULUS__ERROR_PERCENTAGE:
        return errorPercentage != null;
      case JlogDslPackage.ARQ_STIMULUS__THROUGHPUT:
        return throughput != null;
      case JlogDslPackage.ARQ_STIMULUS__THREAD_NUMBER:
        return threadNumber != THREAD_NUMBER_EDEFAULT;
      case JlogDslPackage.ARQ_STIMULUS__LATENCIES:
        return latencies != null && !latencies.isEmpty();
      case JlogDslPackage.ARQ_STIMULUS__RESPONSES:
        return responses != null && !responses.isEmpty();
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
    result.append(" (stimulusName: ");
    result.append(stimulusName);
    result.append(", minResponseTime: ");
    result.append(minResponseTime);
    result.append(", medResponseTime: ");
    result.append(medResponseTime);
    result.append(", maxResponseTime: ");
    result.append(maxResponseTime);
    result.append(", threadNumber: ");
    result.append(threadNumber);
    result.append(')');
    return result.toString();
  }

} //ArqStimulusImpl
