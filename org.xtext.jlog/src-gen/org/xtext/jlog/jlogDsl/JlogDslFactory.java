/**
 */
package org.xtext.jlog.jlogDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.jlog.jlogDsl.JlogDslPackage
 * @generated
 */
public interface JlogDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JlogDslFactory eINSTANCE = org.xtext.jlog.jlogDsl.impl.JlogDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Jlog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jlog</em>'.
   * @generated
   */
  Jlog createJlog();

  /**
   * Returns a new object of class '<em>Arq Stimulus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arq Stimulus</em>'.
   * @generated
   */
  ArqStimulus createArqStimulus();

  /**
   * Returns a new object of class '<em>Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Values</em>'.
   * @generated
   */
  Values createValues();

  /**
   * Returns a new object of class '<em>Double</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double</em>'.
   * @generated
   */
  Double createDouble();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JlogDslPackage getJlogDslPackage();

} //JlogDslFactory
