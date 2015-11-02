/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdCreditRequest.java
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
public final class PlanIdCreditRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PlanIdCreditRequest (String request, PlanIdCreditRequestMethod method) {
    initialize(request, "PlanIdCredit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PlanIdCreditRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPlanIdCreditForPlanIdCreditCreate(PlanIdCreditObjectData data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(data, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
  public void setPlanIdCreditForPlanIdCreditFind(PlanIdCreditObjectFilter data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(data, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
  public void setPlanIdCreditForPlanIdCreditGet(PlanIdCreditObjectKeyData data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectKeyHelper.toMap(data, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
  public void setPlanIdCreditForPlanIdCreditUpdate(PlanIdCreditObjectData data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(data, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }
  public PlanIdCreditObjectData getPlanIdCreditObjectDataPlanIdCreditFromPlanIdCreditCreate() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
  public PlanIdCreditObjectDataList getPlanIdCreditObjectDataPlanIdCreditFromPlanIdCreditFind() {
    return PlanIdCreditObjectHelper.fromMapList(outputMap, "PlanIdCreditList");
  }
  public PlanIdCreditObjectData getPlanIdCreditObjectDataPlanIdCreditFromPlanIdCreditGet() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
  public PlanIdCreditObjectData getPlanIdCreditObjectDataPlanIdCreditFromPlanIdCreditUpdate() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
  /**
   @deprecated
   */
  public void setPlanIdCreditObjectFilter(PlanIdCreditObjectFilter data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(data, new HashMap()).get("PlanIdCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPlanIdCreditObjectData(PlanIdCreditObjectData data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(data, new HashMap()).get("PlanIdCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPlanIdCreditObjectKeyData(PlanIdCreditObjectKeyData data) {
    if (data != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectKeyHelper.toMap(data, new HashMap()).get("PlanIdCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public PlanIdCreditObjectDataList getPlanIdCreditObjectDataList() {
    return PlanIdCreditObjectHelper.fromMapList(outputMap, "PlanIdCreditList");
  }
  /**
   @deprecated
   */
  public PlanIdCreditObjectData getPlanIdCreditObjectData() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
}
