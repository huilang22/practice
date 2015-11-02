/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiRequest.java
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
public final class RateEpiRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateEpiRequest (String request, RateEpiRequestMethod method) {
    initialize(request, "RateEpi", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateEpiRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateEpiForRateEpiCreate(RateEpiObjectData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
  public void setRateEpiForRateEpiDelete(RateEpiObjectData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
  public void setRateEpiForRateEpiFind(RateEpiObjectFilter data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
  public void setRateEpiForRateEpiGet(RateEpiObjectKeyData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectKeyHelper.toMap(data, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
  public void setRateEpiForRateEpiUpdate(RateEpiObjectData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
  public RateEpiObjectData getRateEpiObjectDataRateEpiFromRateEpiCreate() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
  public RateEpiObjectData getRateEpiObjectDataRateEpiFromRateEpiDelete() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
  public RateEpiObjectDataList getRateEpiObjectDataRateEpiFromRateEpiFind() {
    return RateEpiObjectHelper.fromMapList(outputMap, "RateEpiList");
  }
  public RateEpiObjectData getRateEpiObjectDataRateEpiFromRateEpiGet() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
  public RateEpiObjectData getRateEpiObjectDataRateEpiFromRateEpiUpdate() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
  /**
   @deprecated
   */
  public void setRateEpiObjectFilter(RateEpiObjectFilter data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap()).get("RateEpiObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateEpiObjectData(RateEpiObjectData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectHelper.toMap(data, new HashMap()).get("RateEpiObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateEpiObjectKeyData(RateEpiObjectKeyData data) {
    if (data != null) {
      addInput("RateEpi", RateEpiObjectKeyHelper.toMap(data, new HashMap()).get("RateEpiObject"));
    }
  }
  /**
   @deprecated
   */
  public RateEpiObjectDataList getRateEpiObjectDataList() {
    return RateEpiObjectHelper.fromMapList(outputMap, "RateEpiList");
  }
  /**
   @deprecated
   */
  public RateEpiObjectData getRateEpiObjectData() {
    return RateEpiObjectHelper.fromMap(outputMap, "RateEpi");
  }
}
