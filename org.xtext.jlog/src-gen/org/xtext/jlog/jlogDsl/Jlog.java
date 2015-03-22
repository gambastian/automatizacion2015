/**
 */
package org.xtext.jlog.jlogDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jlog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.jlog.jlogDsl.Jlog#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.jlog.jlogDsl.Jlog#getArquEstimulos <em>Arqu Estimulos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getJlog()
 * @model
 * @generated
 */
public interface Jlog extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getJlog_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.jlog.jlogDsl.Jlog#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arqu Estimulos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jlog.jlogDsl.ArqStimulus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arqu Estimulos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arqu Estimulos</em>' containment reference list.
   * @see org.xtext.jlog.jlogDsl.JlogDslPackage#getJlog_ArquEstimulos()
   * @model containment="true"
   * @generated
   */
  EList<ArqStimulus> getArquEstimulos();

} // Jlog
