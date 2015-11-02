/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodRequest.java
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
public final class RatePeriodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RatePeriodRequest (String request, RatePeriodRequestMethod method) {
    initialize(request, "RatePeriod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RatePeriodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRatePeriodForRatePeriodCreate(RPObjectData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(data, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
  public void setRatePeriodForRatePeriodDelete(RPObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectKeyHelper.toMap(data, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
  public void setRatePeriodForRatePeriodFind(RPObjectFilter data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(data, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
  public void setRatePeriodForRatePeriodGet(RPObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectKeyHelper.toMap(data, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
  public void setRatePeriodForRatePeriodUpdate(RPObjectData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(data, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
  public RPObjectData getRPObjectDataRatePeriodFromRatePeriodCreate() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
  public RPObjectData getRPObjectDataRatePeriodFromRatePeriodDelete() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
  public RPObjectDataList getRPObjectDataRatePeriodFromRatePeriodFind() {
    return RPObjectHelper.fromMapList(outputMap, "RatePeriodList");
  }
  public RPObjectData getRPObjectDataRatePeriodFromRatePeriodGet() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
  public RPObjectData getRPObjectDataRatePeriodFromRatePeriodUpdate() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
  /**
   @deprecated
   */
  public void setRPObjectFilter(RPObjectFilter data) {
    if (data != null) {
      addInput("RP", RPObjectHelper.toMap(data, new HashMap()).get("RPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRPObjectData(RPObjectData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectHelper.toMap(data, new HashMap()).get("RPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRPObjectKeyData(RPObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriod", RPObjectKeyHelper.toMap(data, new HashMap()).get("RPObject"));
    }
  }
  /**
   @deprecated
   */
  public RPObjectDataList getRPObjectDataList() {
    return RPObjectHelper.fromMapList(outputMap, "RPList");
  }
  /**
   @deprecated
   */
  public RPObjectData getRPObjectData() {
    return RPObjectHelper.fromMap(outputMap, "RatePeriod");
  }
}
