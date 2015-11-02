/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.cf.data.*;
public final class PlanIdDiscountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PlanIdDiscountRequest (String request, PlanIdDiscountRequestMethod method) {
    initialize(request, "PlanIdDiscount", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PlanIdDiscountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPlanIdDiscountForPlanIdDiscountCreate(PIDObjectData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(data, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
  public void setPlanIdDiscountForPlanIdDiscountDelete(PIDObjectKeyData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(data, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
  public void setPlanIdDiscountForPlanIdDiscountFind(PIDObjectFilter data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(data, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
  public void setPlanIdDiscountForPlanIdDiscountGet(PIDObjectKeyData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(data, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
  public void setPlanIdDiscountForPlanIdDiscountUpdate(PIDObjectData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(data, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
  public PIDObjectData getPIDObjectDataPlanIdDiscountFromPlanIdDiscountCreate() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
  public PIDObjectData getPIDObjectDataPlanIdDiscountFromPlanIdDiscountDelete() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
  public PIDObjectDataList getPIDObjectDataPlanIdDiscountFromPlanIdDiscountFind() {
    return PIDObjectHelper.fromMapList(outputMap, "PlanIdDiscountList");
  }
  public PIDObjectData getPIDObjectDataPlanIdDiscountFromPlanIdDiscountGet() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
  public PIDObjectData getPIDObjectDataPlanIdDiscountFromPlanIdDiscountUpdate() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
  /**
   @deprecated
   */
  public void setPIDObjectFilter(PIDObjectFilter data) {
    if (data != null) {
      addInput("PID", PIDObjectHelper.toMap(data, new HashMap()).get("PIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPIDObjectData(PIDObjectData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(data, new HashMap()).get("PIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPIDObjectKeyData(PIDObjectKeyData data) {
    if (data != null) {
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(data, new HashMap()).get("PIDObject"));
    }
  }
  /**
   @deprecated
   */
  public PIDObjectDataList getPIDObjectDataList() {
    return PIDObjectHelper.fromMapList(outputMap, "PIDList");
  }
  /**
   @deprecated
   */
  public PIDObjectData getPIDObjectData() {
    return PIDObjectHelper.fromMap(outputMap, "PlanIdDiscount");
  }
}
