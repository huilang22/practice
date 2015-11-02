/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodUsageRequest.java
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
public final class RatePeriodUsageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RatePeriodUsageRequest (String request, RatePeriodUsageRequestMethod method) {
    initialize(request, "RatePeriodUsage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RatePeriodUsageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRatePeriodUsageForRatePeriodUsageCreate(RatePeriodUsagesObjectData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(data, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
  public void setRatePeriodUsageForRatePeriodUsageDelete(RatePeriodUsagesObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(data, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
  public void setRatePeriodUsageForRatePeriodUsageFind(RatePeriodUsagesObjectFilter data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(data, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
  public void setRatePeriodUsageForRatePeriodUsageGet(RatePeriodUsagesObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(data, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
  public void setRatePeriodUsageForRatePeriodUsageUpdate(RatePeriodUsagesObjectData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(data, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
  public RatePeriodUsagesObjectData getRatePeriodUsagesObjectDataRatePeriodUsageFromRatePeriodUsageCreate() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
  public RatePeriodUsagesObjectData getRatePeriodUsagesObjectDataRatePeriodUsageFromRatePeriodUsageDelete() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
  public RatePeriodUsagesObjectDataList getRatePeriodUsagesObjectDataRatePeriodUsageFromRatePeriodUsageFind() {
    return RatePeriodUsagesObjectHelper.fromMapList(outputMap, "RatePeriodUsageList");
  }
  public RatePeriodUsagesObjectData getRatePeriodUsagesObjectDataRatePeriodUsageFromRatePeriodUsageGet() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
  public RatePeriodUsagesObjectData getRatePeriodUsagesObjectDataRatePeriodUsageFromRatePeriodUsageUpdate() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
  /**
   @deprecated
   */
  public void setRatePeriodUsagesObjectFilter(RatePeriodUsagesObjectFilter data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(data, new HashMap()).get("RatePeriodUsagesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRatePeriodUsagesObjectData(RatePeriodUsagesObjectData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(data, new HashMap()).get("RatePeriodUsagesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRatePeriodUsagesObjectKeyData(RatePeriodUsagesObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriodUsage", RatePeriodUsagesObjectKeyHelper.toMap(data, new HashMap()).get("RatePeriodUsagesObject"));
    }
  }
  /**
   @deprecated
   */
  public RatePeriodUsagesObjectDataList getRatePeriodUsagesObjectDataList() {
    return RatePeriodUsagesObjectHelper.fromMapList(outputMap, "RatePeriodUsageList");
  }
  /**
   @deprecated
   */
  public RatePeriodUsagesObjectData getRatePeriodUsagesObjectData() {
    return RatePeriodUsagesObjectHelper.fromMap(outputMap, "RatePeriodUsage");
  }
}
