/*
 * Generated code DO NOT EDIT
 * Generated file: RateNrcRequest.java
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
public final class RateNrcRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateNrcRequest (String request, RateNrcRequestMethod method) {
    initialize(request, "RateNrc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateNrcRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateNrcForRateNrcCreate(RateNrcObjectData data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(data, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
  public void setRateNrcForRateNrcFind(RateNrcObjectFilter data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(data, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
  public void setRateNrcForRateNrcGet(RateNrcObjectKeyData data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectKeyHelper.toMap(data, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
  public void setRateNrcForRateNrcUpdate(RateNrcObjectData data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(data, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
  public void setRnrcUpdateFilterForRateNrcUpdate(RateNrcObjectFilter data) {
    if (data != null) {
      addInput("RnrcUpdateFilter", RateNrcObjectHelper.toMap(data, new HashMap(), "RnrcUpdateFilter").get("RnrcUpdateFilter"));
    }
  }
  public void setRnrcUpdateGetForRateNrcUpdate(RateNrcObjectData data) {
    if (data != null) {
      addInput("RnrcUpdateGet", RateNrcObjectHelper.toMap(data, new HashMap(), "RnrcUpdateGet").get("RnrcUpdateGet"));
    }
  }
  public RateNrcObjectData getRateNrcObjectDataRateNrcFromRateNrcCreate() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
  public RateNrcObjectDataList getRateNrcObjectDataRateNrcFromRateNrcFind() {
    return RateNrcObjectHelper.fromMapList(outputMap, "RateNrcList");
  }
  public RateNrcObjectData getRateNrcObjectDataRateNrcFromRateNrcGet() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
  public RateNrcObjectData getRateNrcObjectDataRateNrcFromRateNrcUpdate() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
  /**
   @deprecated
   */
  public void setRateNrcObjectFilter(RateNrcObjectFilter data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(data, new HashMap()).get("RateNrcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateNrcObjectData(RateNrcObjectData data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectHelper.toMap(data, new HashMap()).get("RateNrcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateNrcObjectKeyData(RateNrcObjectKeyData data) {
    if (data != null) {
      addInput("RateNrc", RateNrcObjectKeyHelper.toMap(data, new HashMap()).get("RateNrcObject"));
    }
  }
  /**
   @deprecated
   */
  public RateNrcObjectDataList getRateNrcObjectDataList() {
    return RateNrcObjectHelper.fromMapList(outputMap, "RateNrcList");
  }
  /**
   @deprecated
   */
  public RateNrcObjectData getRateNrcObjectData() {
    return RateNrcObjectHelper.fromMap(outputMap, "RateNrc");
  }
}
