/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageImpliedDecimalRequest.java
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
public final class RateUsageImpliedDecimalRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateUsageImpliedDecimalRequest (String request, RateUsageImpliedDecimalRequestMethod method) {
    initialize(request, "RateUsageImpliedDecimal", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateUsageImpliedDecimalRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateUsageImpliedDecimalForRateUsageImpliedDecimalCreate(RateUsageImpliedDecimalObjectData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(data, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
  public void setRateUsageImpliedDecimalForRateUsageImpliedDecimalDelete(RateUsageImpliedDecimalObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(data, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
  public void setRateUsageImpliedDecimalForRateUsageImpliedDecimalFind(RateUsageImpliedDecimalObjectFilter data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(data, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
  public void setRateUsageImpliedDecimalForRateUsageImpliedDecimalGet(RateUsageImpliedDecimalObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(data, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
  public void setRateUsageImpliedDecimalForRateUsageImpliedDecimalUpdate(RateUsageImpliedDecimalObjectData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(data, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimalObjectDataRateUsageImpliedDecimalFromRateUsageImpliedDecimalCreate() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
  public RateUsageImpliedDecimalObjectDataList getRateUsageImpliedDecimalObjectDataRateUsageImpliedDecimalFromRateUsageImpliedDecimalFind() {
    return RateUsageImpliedDecimalObjectHelper.fromMapList(outputMap, "RateUsageImpliedDecimalList");
  }
  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimalObjectDataRateUsageImpliedDecimalFromRateUsageImpliedDecimalGet() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimalObjectDataRateUsageImpliedDecimalFromRateUsageImpliedDecimalUpdate() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
  /**
   @deprecated
   */
  public void setRateUsageImpliedDecimalObjectFilter(RateUsageImpliedDecimalObjectFilter data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(data, new HashMap()).get("RateUsageImpliedDecimalObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageImpliedDecimalObjectData(RateUsageImpliedDecimalObjectData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(data, new HashMap()).get("RateUsageImpliedDecimalObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageImpliedDecimalObjectKeyData(RateUsageImpliedDecimalObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(data, new HashMap()).get("RateUsageImpliedDecimalObject"));
    }
  }
  /**
   @deprecated
   */
  public RateUsageImpliedDecimalObjectDataList getRateUsageImpliedDecimalObjectDataList() {
    return RateUsageImpliedDecimalObjectHelper.fromMapList(outputMap, "RateUsageImpliedDecimalList");
  }
  /**
   @deprecated
   */
  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimalObjectData() {
    return RateUsageImpliedDecimalObjectHelper.fromMap(outputMap, "RateUsageImpliedDecimal");
  }
}
