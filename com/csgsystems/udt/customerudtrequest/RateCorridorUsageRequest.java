/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageRequest.java
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
public final class RateCorridorUsageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateCorridorUsageRequest (String request, RateCorridorUsageRequestMethod method) {
    initialize(request, "RateCorridorUsage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateCorridorUsageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateCorridorUsageForRateCorridorUsageCreate(RCUsageObjectData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(data, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
  public void setRateCorridorUsageForRateCorridorUsageDelete(RCUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(data, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
  public void setRateCorridorUsageForRateCorridorUsageFind(RCUsageObjectFilter data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(data, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
  public void setRateCorridorUsageForRateCorridorUsageGet(RCUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(data, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
  public void setRateCorridorUsageForRateCorridorUsageUpdate(RCUsageObjectData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(data, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
  public RCUsageObjectData getRCUsageObjectDataRateCorridorUsageFromRateCorridorUsageCreate() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
  public RCUsageObjectDataList getRCUsageObjectDataRateCorridorUsageFromRateCorridorUsageFind() {
    return RCUsageObjectHelper.fromMapList(outputMap, "RateCorridorUsageList");
  }
  public RCUsageObjectData getRCUsageObjectDataRateCorridorUsageFromRateCorridorUsageGet() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
  public RCUsageObjectData getRCUsageObjectDataRateCorridorUsageFromRateCorridorUsageUpdate() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
  /**
   @deprecated
   */
  public void setRCUsageObjectFilter(RCUsageObjectFilter data) {
    if (data != null) {
      addInput("RCUsage", RCUsageObjectHelper.toMap(data, new HashMap()).get("RCUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRCUsageObjectData(RCUsageObjectData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(data, new HashMap()).get("RCUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRCUsageObjectKeyData(RCUsageObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsage", RCUsageObjectKeyHelper.toMap(data, new HashMap()).get("RCUsageObject"));
    }
  }
  /**
   @deprecated
   */
  public RCUsageObjectDataList getRCUsageObjectDataList() {
    return RCUsageObjectHelper.fromMapList(outputMap, "RCUsageList");
  }
  /**
   @deprecated
   */
  public RCUsageObjectData getRCUsageObjectData() {
    return RCUsageObjectHelper.fromMap(outputMap, "RateCorridorUsage");
  }
}
