/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.semester_Project_Dsl.impl;

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

import org.xtext.example.mydsl.semester_Project_Dsl.Credentials;
import org.xtext.example.mydsl.semester_Project_Dsl.Model;
import org.xtext.example.mydsl.semester_Project_Dsl.Semester_Project_DslPackage;
import org.xtext.example.mydsl.semester_Project_Dsl.Sensor;
import org.xtext.example.mydsl.semester_Project_Dsl.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.semester_Project_Dsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.semester_Project_Dsl.impl.ModelImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.semester_Project_Dsl.impl.ModelImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.semester_Project_Dsl.impl.ModelImpl#getCredentials <em>Credentials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSensors()
   * @generated
   * @ordered
   */
  protected EList<Sensor> sensors;

  /**
   * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredentials()
   * @generated
   * @ordered
   */
  protected EList<Credentials> credentials;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return Semester_Project_DslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Semester_Project_DslPackage.MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, Semester_Project_DslPackage.MODEL__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Sensor> getSensors()
  {
    if (sensors == null)
    {
      sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, Semester_Project_DslPackage.MODEL__SENSORS);
    }
    return sensors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Credentials> getCredentials()
  {
    if (credentials == null)
    {
      credentials = new EObjectContainmentEList<Credentials>(Credentials.class, this, Semester_Project_DslPackage.MODEL__CREDENTIALS);
    }
    return credentials;
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
      case Semester_Project_DslPackage.MODEL__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case Semester_Project_DslPackage.MODEL__SENSORS:
        return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
      case Semester_Project_DslPackage.MODEL__CREDENTIALS:
        return ((InternalEList<?>)getCredentials()).basicRemove(otherEnd, msgs);
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
      case Semester_Project_DslPackage.MODEL__NAME:
        return getName();
      case Semester_Project_DslPackage.MODEL__VARIABLES:
        return getVariables();
      case Semester_Project_DslPackage.MODEL__SENSORS:
        return getSensors();
      case Semester_Project_DslPackage.MODEL__CREDENTIALS:
        return getCredentials();
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
      case Semester_Project_DslPackage.MODEL__NAME:
        setName((String)newValue);
        return;
      case Semester_Project_DslPackage.MODEL__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case Semester_Project_DslPackage.MODEL__SENSORS:
        getSensors().clear();
        getSensors().addAll((Collection<? extends Sensor>)newValue);
        return;
      case Semester_Project_DslPackage.MODEL__CREDENTIALS:
        getCredentials().clear();
        getCredentials().addAll((Collection<? extends Credentials>)newValue);
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
      case Semester_Project_DslPackage.MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case Semester_Project_DslPackage.MODEL__VARIABLES:
        getVariables().clear();
        return;
      case Semester_Project_DslPackage.MODEL__SENSORS:
        getSensors().clear();
        return;
      case Semester_Project_DslPackage.MODEL__CREDENTIALS:
        getCredentials().clear();
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
      case Semester_Project_DslPackage.MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case Semester_Project_DslPackage.MODEL__VARIABLES:
        return variables != null && !variables.isEmpty();
      case Semester_Project_DslPackage.MODEL__SENSORS:
        return sensors != null && !sensors.isEmpty();
      case Semester_Project_DslPackage.MODEL__CREDENTIALS:
        return credentials != null && !credentials.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
