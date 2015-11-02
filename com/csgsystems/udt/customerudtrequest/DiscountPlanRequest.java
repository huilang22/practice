/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanRequest.java
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
public final class DiscountPlanRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscountPlanRequest (String request, DiscountPlanRequestMethod method) {
    initialize(request, "DiscountPlan", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscountPlanRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscountPlanForDiscountPlanCreate(DPObjectData data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(data, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
  public void setDiscountPlanForDiscountPlanDelete(DPObjectKeyData data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(data, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
  public void setDiscountPlanForDiscountPlanFind(DPObjectFilter data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(data, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
  public void setDiscountPlanForDiscountPlanGet(DPObjectKeyData data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(data, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
  public void setDPUpdateFilterForDiscountPlanUpdate(DPObjectFilter data) {
    if (data != null) {
      addInput("DPUpdateFilter", DPObjectHelper.toMap(data, new HashMap(), "DPUpdateFilter").get("DPUpdateFilter"));
    }
  }
  public void setDPUpdateGetForDiscountPlanUpdate(DPObjectData data) {
    if (data != null) {
      addInput("DPUpdateGet", DPObjectHelper.toMap(data, new HashMap(), "DPUpdateGet").get("DPUpdateGet"));
    }
  }
  public void setDiscountPlanForDiscountPlanUpdate(DPObjectData data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(data, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
  public DPObjectData getDPObjectDataDiscountPlanFromDiscountPlanCreate() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
  public DPObjectData getDPObjectDataDiscountPlanFromDiscountPlanDelete() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
  public DPObjectDataList getDPObjectDataDiscountPlanFromDiscountPlanFind() {
    return DPObjectHelper.fromMapList(outputMap, "DiscountPlanList");
  }
  public DPObjectData getDPObjectDataDiscountPlanFromDiscountPlanGet() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
  public DPObjectData getDPObjectDataDiscountPlanFromDiscountPlanUpdate() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
  /**
   @deprecated
   */
  public void setDPObjectFilter(DPObjectFilter data) {
    if (data != null) {
      addInput("DP", DPObjectHelper.toMap(data, new HashMap()).get("DPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDPObjectData(DPObjectData data) {
    if (data != null) {
      addInput("DP", DPObjectHelper.toMap(data, new HashMap()).get("DPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDPObjectKeyData(DPObjectKeyData data) {
    if (data != null) {
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(data, new HashMap()).get("DPObject"));
    }
  }
  /**
   @deprecated
   */
  public DPObjectDataList getDPObjectDataList() {
    return DPObjectHelper.fromMapList(outputMap, "DPList");
  }
  /**
   @deprecated
   */
  public DPObjectData getDPObjectData() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
