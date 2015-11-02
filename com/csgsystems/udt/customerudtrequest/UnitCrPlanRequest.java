/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrPlanRequest.java
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
public final class UnitCrPlanRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitCrPlanRequest (String request, UnitCrPlanRequestMethod method) {
    initialize(request, "UnitCrPlan", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitCrPlanRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitCrPlanForUnitCrPlanCreate(UnitCrPlanObjectData data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(data, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
  public void setUnitCrPlanForUnitCrPlanFind(UnitCrPlanObjectFilter data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(data, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
  public void setUnitCrPlanForUnitCrPlanGet(UnitCrPlanObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectKeyHelper.toMap(data, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
  public void setUnitCrPlanForUnitCrPlanUpdate(UnitCrPlanObjectData data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(data, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }
  public void setUnitCrPlanUpdateFilterForUnitCrPlanUpdate(UnitCrPlanObjectFilter data) {
    if (data != null) {
      addInput("UnitCrPlanUpdateFilter", UnitCrPlanObjectHelper.toMap(data, new HashMap(), "UnitCrPlanUpdateFilter").get("UnitCrPlanUpdateFilter"));
    }
  }
  public void setUnitCrPlanUpdateGetForUnitCrPlanUpdate(UnitCrPlanObjectData data) {
    if (data != null) {
      addInput("UnitCrPlanUpdateGet", UnitCrPlanObjectHelper.toMap(data, new HashMap(), "UnitCrPlanUpdateGet").get("UnitCrPlanUpdateGet"));
    }
  }
  public UnitCrPlanObjectData getUnitCrPlanObjectDataUnitCrPlanFromUnitCrPlanCreate() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
  public UnitCrPlanObjectDataList getUnitCrPlanObjectDataUnitCrPlanFromUnitCrPlanFind() {
    return UnitCrPlanObjectHelper.fromMapList(outputMap, "UnitCrPlanList");
  }
  public UnitCrPlanObjectData getUnitCrPlanObjectDataUnitCrPlanFromUnitCrPlanGet() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
  public UnitCrPlanObjectData getUnitCrPlanObjectDataUnitCrPlanFromUnitCrPlanUpdate() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
  /**
   @deprecated
   */
  public void setUnitCrPlanObjectFilter(UnitCrPlanObjectFilter data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(data, new HashMap()).get("UnitCrPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrPlanObjectData(UnitCrPlanObjectData data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(data, new HashMap()).get("UnitCrPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrPlanObjectKeyData(UnitCrPlanObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectKeyHelper.toMap(data, new HashMap()).get("UnitCrPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitCrPlanObjectDataList getUnitCrPlanObjectDataList() {
    return UnitCrPlanObjectHelper.fromMapList(outputMap, "UnitCrPlanList");
  }
  /**
   @deprecated
   */
  public UnitCrPlanObjectData getUnitCrPlanObjectData() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
}
