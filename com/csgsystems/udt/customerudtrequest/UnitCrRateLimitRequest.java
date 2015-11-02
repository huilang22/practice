/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitRequest.java
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
public final class UnitCrRateLimitRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitCrRateLimitRequest (String request, UnitCrRateLimitRequestMethod method) {
    initialize(request, "UnitCrRateLimit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitCrRateLimitRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitCrRateLimitForUnitCrRateLimitCreate(UnitCrRateLimitsObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
  public void setUnitCrRateLimitForUnitCrRateLimitDelete(UnitCrRateLimitsObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(data, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
  public void setUnitCrRateLimitForUnitCrRateLimitFind(UnitCrRateLimitsObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
  public void setUnitCrRateLimitForUnitCrRateLimitGet(UnitCrRateLimitsObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(data, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
  public void setUnitCrRateLimitForUnitCrRateLimitUpdate(UnitCrRateLimitsObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimit").get("UnitCrRateLimit"));
    }
  }
  public UnitCrRateLimitsObjectData getUnitCrRateLimitsObjectDataUnitCrRateLimitFromUnitCrRateLimitCreate() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
  public UnitCrRateLimitsObjectData getUnitCrRateLimitsObjectDataUnitCrRateLimitFromUnitCrRateLimitDelete() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
  public UnitCrRateLimitsObjectDataList getUnitCrRateLimitsObjectDataUnitCrRateLimitFromUnitCrRateLimitFind() {
    return UnitCrRateLimitsObjectHelper.fromMapList(outputMap, "UnitCrRateLimitList");
  }
  public UnitCrRateLimitsObjectData getUnitCrRateLimitsObjectDataUnitCrRateLimitFromUnitCrRateLimitGet() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
  public UnitCrRateLimitsObjectData getUnitCrRateLimitsObjectDataUnitCrRateLimitFromUnitCrRateLimitUpdate() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitsObjectFilter(UnitCrRateLimitsObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(data, new HashMap()).get("UnitCrRateLimitsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitsObjectData(UnitCrRateLimitsObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectHelper.toMap(data, new HashMap()).get("UnitCrRateLimitsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitsObjectKeyData(UnitCrRateLimitsObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimit", UnitCrRateLimitsObjectKeyHelper.toMap(data, new HashMap()).get("UnitCrRateLimitsObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitCrRateLimitsObjectDataList getUnitCrRateLimitsObjectDataList() {
    return UnitCrRateLimitsObjectHelper.fromMapList(outputMap, "UnitCrRateLimitList");
  }
  /**
   @deprecated
   */
  public UnitCrRateLimitsObjectData getUnitCrRateLimitsObjectData() {
    return UnitCrRateLimitsObjectHelper.fromMap(outputMap, "UnitCrRateLimit");
  }
}
