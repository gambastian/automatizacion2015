/**
 */
package org.xtext.jlog.jlogDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.jlog.jlogDsl.ArqStimulus;
import org.xtext.jlog.jlogDsl.Jlog;
import org.xtext.jlog.jlogDsl.JlogDslFactory;
import org.xtext.jlog.jlogDsl.JlogDslPackage;
import org.xtext.jlog.jlogDsl.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JlogDslPackageImpl extends EPackageImpl implements JlogDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jlogEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arqStimulusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleEClass = null;

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
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JlogDslPackageImpl()
  {
    super(eNS_URI, JlogDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link JlogDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JlogDslPackage init()
  {
    if (isInited) return (JlogDslPackage)EPackage.Registry.INSTANCE.getEPackage(JlogDslPackage.eNS_URI);

    // Obtain or create and register package
    JlogDslPackageImpl theJlogDslPackage = (JlogDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JlogDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JlogDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJlogDslPackage.createPackageContents();

    // Initialize created meta-data
    theJlogDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJlogDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JlogDslPackage.eNS_URI, theJlogDslPackage);
    return theJlogDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJlog()
  {
    return jlogEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJlog_Name()
  {
    return (EAttribute)jlogEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJlog_ArquEstimulos()
  {
    return (EReference)jlogEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArqStimulus()
  {
    return arqStimulusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArqStimulus_StimulusName()
  {
    return (EAttribute)arqStimulusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArqStimulus_MinResponseTime()
  {
    return (EAttribute)arqStimulusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArqStimulus_MedResponseTime()
  {
    return (EAttribute)arqStimulusEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArqStimulus_MaxResponseTime()
  {
    return (EAttribute)arqStimulusEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArqStimulus_ErrorPercentage()
  {
    return (EReference)arqStimulusEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArqStimulus_Throughput()
  {
    return (EReference)arqStimulusEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArqStimulus_ThreadNumber()
  {
    return (EAttribute)arqStimulusEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArqStimulus_Latencies()
  {
    return (EReference)arqStimulusEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArqStimulus_Responses()
  {
    return (EReference)arqStimulusEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValues()
  {
    return valuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_Key()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValues_Value()
  {
    return (EAttribute)valuesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDouble()
  {
    return doubleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JlogDslFactory getJlogDslFactory()
  {
    return (JlogDslFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jlogEClass = createEClass(JLOG);
    createEAttribute(jlogEClass, JLOG__NAME);
    createEReference(jlogEClass, JLOG__ARQU_ESTIMULOS);

    arqStimulusEClass = createEClass(ARQ_STIMULUS);
    createEAttribute(arqStimulusEClass, ARQ_STIMULUS__STIMULUS_NAME);
    createEAttribute(arqStimulusEClass, ARQ_STIMULUS__MIN_RESPONSE_TIME);
    createEAttribute(arqStimulusEClass, ARQ_STIMULUS__MED_RESPONSE_TIME);
    createEAttribute(arqStimulusEClass, ARQ_STIMULUS__MAX_RESPONSE_TIME);
    createEReference(arqStimulusEClass, ARQ_STIMULUS__ERROR_PERCENTAGE);
    createEReference(arqStimulusEClass, ARQ_STIMULUS__THROUGHPUT);
    createEAttribute(arqStimulusEClass, ARQ_STIMULUS__THREAD_NUMBER);
    createEReference(arqStimulusEClass, ARQ_STIMULUS__LATENCIES);
    createEReference(arqStimulusEClass, ARQ_STIMULUS__RESPONSES);

    valuesEClass = createEClass(VALUES);
    createEAttribute(valuesEClass, VALUES__KEY);
    createEAttribute(valuesEClass, VALUES__VALUE);

    doubleEClass = createEClass(DOUBLE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(jlogEClass, Jlog.class, "Jlog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJlog_Name(), ecorePackage.getEString(), "name", null, 0, 1, Jlog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJlog_ArquEstimulos(), this.getArqStimulus(), null, "arquEstimulos", null, 0, -1, Jlog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arqStimulusEClass, ArqStimulus.class, "ArqStimulus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArqStimulus_StimulusName(), ecorePackage.getEString(), "stimulusName", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArqStimulus_MinResponseTime(), ecorePackage.getEInt(), "minResponseTime", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArqStimulus_MedResponseTime(), ecorePackage.getEInt(), "medResponseTime", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArqStimulus_MaxResponseTime(), ecorePackage.getEInt(), "maxResponseTime", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArqStimulus_ErrorPercentage(), this.getDouble(), null, "errorPercentage", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArqStimulus_Throughput(), this.getDouble(), null, "throughput", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArqStimulus_ThreadNumber(), ecorePackage.getEInt(), "threadNumber", null, 0, 1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArqStimulus_Latencies(), this.getValues(), null, "latencies", null, 0, -1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArqStimulus_Responses(), this.getValues(), null, "responses", null, 0, -1, ArqStimulus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuesEClass, Values.class, "Values", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValues_Key(), ecorePackage.getEString(), "key", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValues_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleEClass, org.xtext.jlog.jlogDsl.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JlogDslPackageImpl
