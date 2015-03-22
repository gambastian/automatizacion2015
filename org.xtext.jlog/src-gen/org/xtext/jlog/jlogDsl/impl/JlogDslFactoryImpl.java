/**
 */
package org.xtext.jlog.jlogDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.jlog.jlogDsl.ArqStimulus;
import org.xtext.jlog.jlogDsl.Jlog;
import org.xtext.jlog.jlogDsl.JlogDslFactory;
import org.xtext.jlog.jlogDsl.JlogDslPackage;
import org.xtext.jlog.jlogDsl.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JlogDslFactoryImpl extends EFactoryImpl implements JlogDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JlogDslFactory init()
  {
    try
    {
      JlogDslFactory theJlogDslFactory = (JlogDslFactory)EPackage.Registry.INSTANCE.getEFactory(JlogDslPackage.eNS_URI);
      if (theJlogDslFactory != null)
      {
        return theJlogDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JlogDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JlogDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JlogDslPackage.JLOG: return createJlog();
      case JlogDslPackage.ARQ_STIMULUS: return createArqStimulus();
      case JlogDslPackage.VALUES: return createValues();
      case JlogDslPackage.DOUBLE: return createDouble();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jlog createJlog()
  {
    JlogImpl jlog = new JlogImpl();
    return jlog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArqStimulus createArqStimulus()
  {
    ArqStimulusImpl arqStimulus = new ArqStimulusImpl();
    return arqStimulus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Values createValues()
  {
    ValuesImpl values = new ValuesImpl();
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.jlog.jlogDsl.Double createDouble()
  {
    DoubleImpl double_ = new DoubleImpl();
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JlogDslPackage getJlogDslPackage()
  {
    return (JlogDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JlogDslPackage getPackage()
  {
    return JlogDslPackage.eINSTANCE;
  }

} //JlogDslFactoryImpl
