/*
 * Generated code DO NOT EDIT
 * Generated file: UsageCreditRateRequest.java
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

import com.csgsystems.bp.data.*;
public final class UsageCreditRateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageCreditRateRequest (String request, UsageCreditRateRequestMethod method) {
    initialize(request, "UsageCreditRate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageCreditRateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageCreditRateForUsageCreditRateFind(RUCreditObjectFilter data) {
    if (data != null) {
      addInput("UsageCreditRate", RUCreditObjectHelper.toMap(data, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }
  public void setUsageCreditRateForUsageCreditRateGet(RUCreditObjectKeyData data) {
    if (data != null) {
      addInput("UsageCreditRate", RUCreditObjectKeyHelper.toMap(data, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }
  public RUCreditObjectDataList getRUCreditObjectDataUsageCreditRateFromUsageCreditRateFind() {
    return RUCreditObjectHelper.fromMapList(outputMap, "UsageCreditRateList");
  }
  public RUCreditObjectData getRUCreditObjectDataUsageCreditRateFromUsageCreditRateGet() {
    return RUCreditObjectHelper.fromMap(outputMap, "UsageCreditRate");
  }
  /**
   @deprecated
   */
  public void setRUCreditObjectFilter(RUCreditObjectFilter data) {
    if (data != null) {
      addInput("RUCredit", RUCreditObjectHelper.toMap(data, new HashMap()).get("RUCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUCreditObjectKeyData(RUCreditObjectKeyData data) {
    if (data != null) {
      addInput("UsageCreditRate", RUCreditObjectKeyHelper.toMap(data, new HashMap()).get("RUCreditObject"));
    }
  }
  /**
   @deprecated
   */
  public RUCreditObjectDataList getRUCreditObjectDataList() {
    return RUCreditObjectHelper.fromMapList(outputMap, "RUCreditList");
  }
  /**
   @deprecated
   */
  public RUCreditObjectData getRUCreditObjectData() {
    return RUCreditObjectHelper.fromMap(outputMap, "UsageCreditRate");
  }
}
