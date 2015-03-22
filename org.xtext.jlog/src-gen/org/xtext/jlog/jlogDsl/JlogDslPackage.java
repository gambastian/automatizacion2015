/**
 */
package org.xtext.jlog.jlogDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.jlog.jlogDsl.JlogDslFactory
 * @model kind="package"
 * @generated
 */
public interface JlogDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jlogDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/jlog/JlogDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jlogDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JlogDslPackage eINSTANCE = org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.jlog.jlogDsl.impl.JlogImpl <em>Jlog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.jlog.jlogDsl.impl.JlogImpl
   * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getJlog()
   * @generated
   */
  int JLOG = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLOG__NAME = 0;

  /**
   * The feature id for the '<em><b>Arqu Estimulos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLOG__ARQU_ESTIMULOS = 1;

  /**
   * The number of structural features of the '<em>Jlog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JLOG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl <em>Arq Stimulus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl
   * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getArqStimulus()
   * @generated
   */
  int ARQ_STIMULUS = 1;

  /**
   * The feature id for the '<em><b>Stimulus Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__STIMULUS_NAME = 0;

  /**
   * The feature id for the '<em><b>Min Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__MIN_RESPONSE_TIME = 1;

  /**
   * The feature id for the '<em><b>Med Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__MED_RESPONSE_TIME = 2;

  /**
   * The feature id for the '<em><b>Max Response Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__MAX_RESPONSE_TIME = 3;

  /**
   * The feature id for the '<em><b>Error Percentage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__ERROR_PERCENTAGE = 4;

  /**
   * The feature id for the '<em><b>Throughput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__THROUGHPUT = 5;

  /**
   * The feature id for the '<em><b>Thread Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__THREAD_NUMBER = 6;

  /**
   * The feature id for the '<em><b>Latencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__LATENCIES = 7;

  /**
   * The feature id for the '<em><b>Responses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS__RESPONSES = 8;

  /**
   * The number of structural features of the '<em>Arq Stimulus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARQ_STIMULUS_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.xtext.jlog.jlogDsl.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.jlog.jlogDsl.impl.ValuesImpl
   * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getValues()
   * @generated
   */
  int VALUES = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES__VALUE = 1;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.jlog.jlogDsl.impl.DoubleImpl <em>Double</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.jlog.jlogDsl.impl.DoubleImpl
   * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getDouble()
   * @generated
   */
  int DOUBLE = 3;

  /**
   * The number of structural features of the '<em>Double</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.xtext.jlog.jlogDsl.Jlog <em>Jlog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jlog</em>'.
   * @see org.xtext.jlog.jlogDsl.Jlog
   * @generated
   */
  EClass getJlog();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.Jlog#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.jlog.jlogDsl.Jlog#getName()
   * @see #getJlog()
   * @generated
   */
  EAttribute getJlog_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.jlog.jlogDsl.Jlog#getArquEstimulos <em>Arqu Estimulos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arqu Estimulos</em>'.
   * @see org.xtext.jlog.jlogDsl.Jlog#getArquEstimulos()
   * @see #getJlog()
   * @generated
   */
  EReference getJlog_ArquEstimulos();

  /**
   * Returns the meta object for class '{@link org.xtext.jlog.jlogDsl.ArqStimulus <em>Arq Stimulus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arq Stimulus</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus
   * @generated
   */
  EClass getArqStimulus();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getStimulusName <em>Stimulus Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stimulus Name</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getStimulusName()
   * @see #getArqStimulus()
   * @generated
   */
  EAttribute getArqStimulus_StimulusName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMinResponseTime <em>Min Response Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Response Time</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getMinResponseTime()
   * @see #getArqStimulus()
   * @generated
   */
  EAttribute getArqStimulus_MinResponseTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMedResponseTime <em>Med Response Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Med Response Time</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getMedResponseTime()
   * @see #getArqStimulus()
   * @generated
   */
  EAttribute getArqStimulus_MedResponseTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getMaxResponseTime <em>Max Response Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Response Time</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getMaxResponseTime()
   * @see #getArqStimulus()
   * @generated
   */
  EAttribute getArqStimulus_MaxResponseTime();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getErrorPercentage <em>Error Percentage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Percentage</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getErrorPercentage()
   * @see #getArqStimulus()
   * @generated
   */
  EReference getArqStimulus_ErrorPercentage();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThroughput <em>Throughput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throughput</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getThroughput()
   * @see #getArqStimulus()
   * @generated
   */
  EReference getArqStimulus_Throughput();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getThreadNumber <em>Thread Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thread Number</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getThreadNumber()
   * @see #getArqStimulus()
   * @generated
   */
  EAttribute getArqStimulus_ThreadNumber();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getLatencies <em>Latencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Latencies</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getLatencies()
   * @see #getArqStimulus()
   * @generated
   */
  EReference getArqStimulus_Latencies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.jlog.jlogDsl.ArqStimulus#getResponses <em>Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Responses</em>'.
   * @see org.xtext.jlog.jlogDsl.ArqStimulus#getResponses()
   * @see #getArqStimulus()
   * @generated
   */
  EReference getArqStimulus_Responses();

  /**
   * Returns the meta object for class '{@link org.xtext.jlog.jlogDsl.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see org.xtext.jlog.jlogDsl.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.Values#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see org.xtext.jlog.jlogDsl.Values#getKey()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_Key();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.jlog.jlogDsl.Values#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.jlog.jlogDsl.Values#getValue()
   * @see #getValues()
   * @generated
   */
  EAttribute getValues_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.jlog.jlogDsl.Double <em>Double</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double</em>'.
   * @see org.xtext.jlog.jlogDsl.Double
   * @generated
   */
  EClass getDouble();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JlogDslFactory getJlogDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.jlog.jlogDsl.impl.JlogImpl <em>Jlog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.jlog.jlogDsl.impl.JlogImpl
     * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getJlog()
     * @generated
     */
    EClass JLOG = eINSTANCE.getJlog();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JLOG__NAME = eINSTANCE.getJlog_Name();

    /**
     * The meta object literal for the '<em><b>Arqu Estimulos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JLOG__ARQU_ESTIMULOS = eINSTANCE.getJlog_ArquEstimulos();

    /**
     * The meta object literal for the '{@link org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl <em>Arq Stimulus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.jlog.jlogDsl.impl.ArqStimulusImpl
     * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getArqStimulus()
     * @generated
     */
    EClass ARQ_STIMULUS = eINSTANCE.getArqStimulus();

    /**
     * The meta object literal for the '<em><b>Stimulus Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARQ_STIMULUS__STIMULUS_NAME = eINSTANCE.getArqStimulus_StimulusName();

    /**
     * The meta object literal for the '<em><b>Min Response Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARQ_STIMULUS__MIN_RESPONSE_TIME = eINSTANCE.getArqStimulus_MinResponseTime();

    /**
     * The meta object literal for the '<em><b>Med Response Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARQ_STIMULUS__MED_RESPONSE_TIME = eINSTANCE.getArqStimulus_MedResponseTime();

    /**
     * The meta object literal for the '<em><b>Max Response Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARQ_STIMULUS__MAX_RESPONSE_TIME = eINSTANCE.getArqStimulus_MaxResponseTime();

    /**
     * The meta object literal for the '<em><b>Error Percentage</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARQ_STIMULUS__ERROR_PERCENTAGE = eINSTANCE.getArqStimulus_ErrorPercentage();

    /**
     * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARQ_STIMULUS__THROUGHPUT = eINSTANCE.getArqStimulus_Throughput();

    /**
     * The meta object literal for the '<em><b>Thread Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARQ_STIMULUS__THREAD_NUMBER = eINSTANCE.getArqStimulus_ThreadNumber();

    /**
     * The meta object literal for the '<em><b>Latencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARQ_STIMULUS__LATENCIES = eINSTANCE.getArqStimulus_Latencies();

    /**
     * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARQ_STIMULUS__RESPONSES = eINSTANCE.getArqStimulus_Responses();

    /**
     * The meta object literal for the '{@link org.xtext.jlog.jlogDsl.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.jlog.jlogDsl.impl.ValuesImpl
     * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__KEY = eINSTANCE.getValues_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUES__VALUE = eINSTANCE.getValues_Value();

    /**
     * The meta object literal for the '{@link org.xtext.jlog.jlogDsl.impl.DoubleImpl <em>Double</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.jlog.jlogDsl.impl.DoubleImpl
     * @see org.xtext.jlog.jlogDsl.impl.JlogDslPackageImpl#getDouble()
     * @generated
     */
    EClass DOUBLE = eINSTANCE.getDouble();

  }

} //JlogDslPackage
