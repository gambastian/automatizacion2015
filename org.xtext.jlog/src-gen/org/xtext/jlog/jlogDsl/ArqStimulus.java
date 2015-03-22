/**
 */
package org.xtext.jlog.jlogDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arq Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getStimulusName <em>Stimulus Name</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMinResponseTime <em>Min Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMedResponseTime <em>Med Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getErrorPercentage <em>Error Percentage</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThreadNumber <em>Thread Number</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getLatencies <em>Latencies</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.ArqStimulus#getResponses <em>Responses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus()
 * @model
 * @generated
 */
public interface ArqStimulus extends EObject
{
  /**
   * Returns the value of the '<em><b>Stimulus Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stimulus Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stimulus Name</em>' attribute.
   * @see #setStimulusName(String)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_StimulusName()
   * @model
   * @generated
   */
  String getStimulusName();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getStimulusName <em>Stimulus Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stimulus Name</em>' attribute.
   * @see #getStimulusName()
   * @generated
   */
  void setStimulusName(String value);

  /**
   * Returns the value of the '<em><b>Min Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Response Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Response Time</em>' attribute.
   * @see #setMinResponseTime(int)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_MinResponseTime()
   * @model
   * @generated
   */
  int getMinResponseTime();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMinResponseTime <em>Min Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Response Time</em>' attribute.
   * @see #getMinResponseTime()
   * @generated
   */
  void setMinResponseTime(int value);

  /**
   * Returns the value of the '<em><b>Med Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Med Response Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Med Response Time</em>' attribute.
   * @see #setMedResponseTime(int)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_MedResponseTime()
   * @model
   * @generated
   */
  int getMedResponseTime();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMedResponseTime <em>Med Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Med Response Time</em>' attribute.
   * @see #getMedResponseTime()
   * @generated
   */
  void setMedResponseTime(int value);

  /**
   * Returns the value of the '<em><b>Max Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Response Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Response Time</em>' attribute.
   * @see #setMaxResponseTime(int)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_MaxResponseTime()
   * @model
   * @generated
   */
  int getMaxResponseTime();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMaxResponseTime <em>Max Response Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Response Time</em>' attribute.
   * @see #getMaxResponseTime()
   * @generated
   */
  void setMaxResponseTime(int value);

  /**
   * Returns the value of the '<em><b>Error Percentage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Percentage</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Percentage</em>' containment reference.
   * @see #setErrorPercentage(org.xtext.jlog.jlogDsl.Double)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_ErrorPercentage()
   * @model containment="true"
   * @generated
   */
  org.xtext.jlog.jlogDsl.Double getErrorPercentage();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getErrorPercentage <em>Error Percentage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Percentage</em>' containment reference.
   * @see #getErrorPercentage()
   * @generated
   */
  void setErrorPercentage(org.xtext.jlog.jlogDsl.Double value);

  /**
   * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throughput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throughput</em>' containment reference.
   * @see #setThroughput(org.xtext.jlog.jlogDsl.Double)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_Throughput()
   * @model containment="true"
   * @generated
   */
  org.xtext.jlog.jlogDsl.Double getThroughput();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThroughput <em>Throughput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throughput</em>' containment reference.
   * @see #getThroughput()
   * @generated
   */
  void setThroughput(org.xtext.jlog.jlogDsl.Double value);

  /**
   * Returns the value of the '<em><b>Thread Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thread Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thread Number</em>' attribute.
   * @see #setThreadNumber(int)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_ThreadNumber()
   * @model
   * @generated
   */
  int getThreadNumber();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThreadNumber <em>Thread Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thread Number</em>' attribute.
   * @see #getThreadNumber()
   * @generated
   */
  void setThreadNumber(int value);

  /**
   * Returns the value of the '<em><b>Latencies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jlog.jlogDsl.Values}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Latencies</em>' containment reference list.
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_Latencies()
   * @model containment="true"
   * @generated
   */
  EList<Values> getLatencies();

  /**
   * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jlog.jlogDsl.Values}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responses</em>' containment reference list.
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getArqStimulus_Responses()
   * @model containment="true"
   * @generated
   */
  EList<Values> getResponses();

} // ArqStimulus
