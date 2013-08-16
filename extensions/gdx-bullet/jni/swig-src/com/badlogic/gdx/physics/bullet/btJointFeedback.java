/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btJointFeedback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btJointFeedback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btJointFeedback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btJointFeedback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_appliedForceBodyA(btVector3 value) {
    gdxBulletJNI.btJointFeedback_m_appliedForceBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_appliedForceBodyA() {
    long cPtr = gdxBulletJNI.btJointFeedback_m_appliedForceBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_appliedTorqueBodyA(btVector3 value) {
    gdxBulletJNI.btJointFeedback_m_appliedTorqueBodyA_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_appliedTorqueBodyA() {
    long cPtr = gdxBulletJNI.btJointFeedback_m_appliedTorqueBodyA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_appliedForceBodyB(btVector3 value) {
    gdxBulletJNI.btJointFeedback_m_appliedForceBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_appliedForceBodyB() {
    long cPtr = gdxBulletJNI.btJointFeedback_m_appliedForceBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setM_appliedTorqueBodyB(btVector3 value) {
    gdxBulletJNI.btJointFeedback_m_appliedTorqueBodyB_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getM_appliedTorqueBodyB() {
    long cPtr = gdxBulletJNI.btJointFeedback_m_appliedTorqueBodyB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btJointFeedback() {
    this(gdxBulletJNI.new_btJointFeedback(), true);
  }

}