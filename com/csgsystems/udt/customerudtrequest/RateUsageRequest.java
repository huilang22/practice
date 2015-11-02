/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageRequest.java
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
public final class RateUsageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateUsageRequest (String request, RateUsageRequestMethod method) {
    initialize(request, "RateUsage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateUsageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateUsageForRateUsageCreate(RateUsageObjectData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(data, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
  public void setRateUsageForRateUsageDelete(RateUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(data, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
  public void setRateUsageForRateUsageFind(RateUsageObjectFilter data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(data, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
  public void setRateUsageForRateUsageGet(RateUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(data, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
  public void setRateUsageForRateUsageUpdate(RateUsageObjectData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(data, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
  public RateUsageObjectData getRateUsageObjectDataRateUsageFromRateUsageCreate() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
  public RateUsageObjectDataList getRateUsageObjectDataRateUsageFromRateUsageFind() {
    return RateUsageObjectHelper.fromMapList(outputMap, "RateUsageList");
  }
  public RateUsageObjectData getRateUsageObjectDataRateUsageFromRateUsageGet() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
  public RateUsageObjectData getRateUsageObjectDataRateUsageFromRateUsageUpdate() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
  /**
   @deprecated
   */
  public void setRateUsageObjectFilter(RateUsageObjectFilter data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(data, new HashMap()).get("RateUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageObjectData(RateUsageObjectData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectHelper.toMap(data, new HashMap()).get("RateUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageObjectKeyData(RateUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateUsage", RateUsageObjectKeyHelper.toMap(data, new HashMap()).get("RateUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public RateUsageObjectDataList getRateUsageObjectDataList() {
    return RateUsageObjectHelper.fromMapList(outputMap, "RateUsageList");
  }
  /**
   @deprecated
   */
  public RateUsageObjectData getRateUsageObjectData() {
    return RateUsageObjectHelper.fromMap(outputMap, "RateUsage");
  }
}
