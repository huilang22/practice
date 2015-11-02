/*
 * Generated code DO NOT EDIT
 * Generated file: RateUnitCrRequest.java
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
public final class RateUnitCrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateUnitCrRequest (String request, RateUnitCrRequestMethod method) {
    initialize(request, "RateUnitCr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateUnitCrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateUnitCrForRateUnitCrCreate(RateUnitCrObjectData data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(data, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
  public void setRateUnitCrForRateUnitCrFind(RateUnitCrObjectFilter data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(data, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
  public void setRateUnitCrForRateUnitCrGet(RateUnitCrObjectKeyData data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectKeyHelper.toMap(data, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
  public void setRateUnitCrForRateUnitCrUpdate(RateUnitCrObjectData data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(data, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
  public void setRateUnitCrUpdateFilterForRateUnitCrUpdate(RateUnitCrObjectFilter data) {
    if (data != null) {
      addInput("RateUnitCrUpdateFilter", RateUnitCrObjectHelper.toMap(data, new HashMap(), "RateUnitCrUpdateFilter").get("RateUnitCrUpdateFilter"));
    }
  }
  public void setRateUnitCrUpdateGetForRateUnitCrUpdate(RateUnitCrObjectData data) {
    if (data != null) {
      addInput("RateUnitCrUpdateGet", RateUnitCrObjectHelper.toMap(data, new HashMap(), "RateUnitCrUpdateGet").get("RateUnitCrUpdateGet"));
    }
  }
  public RateUnitCrObjectData getRateUnitCrObjectDataRateUnitCrFromRateUnitCrCreate() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
  public RateUnitCrObjectDataList getRateUnitCrObjectDataRateUnitCrFromRateUnitCrFind() {
    return RateUnitCrObjectHelper.fromMapList(outputMap, "RateUnitCrList");
  }
  public RateUnitCrObjectData getRateUnitCrObjectDataRateUnitCrFromRateUnitCrGet() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
  public RateUnitCrObjectData getRateUnitCrObjectDataRateUnitCrFromRateUnitCrUpdate() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
  /**
   @deprecated
   */
  public void setRateUnitCrObjectFilter(RateUnitCrObjectFilter data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(data, new HashMap()).get("RateUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUnitCrObjectData(RateUnitCrObjectData data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(data, new HashMap()).get("RateUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUnitCrObjectKeyData(RateUnitCrObjectKeyData data) {
    if (data != null) {
      addInput("RateUnitCr", RateUnitCrObjectKeyHelper.toMap(data, new HashMap()).get("RateUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public RateUnitCrObjectDataList getRateUnitCrObjectDataList() {
    return RateUnitCrObjectHelper.fromMapList(outputMap, "RateUnitCrList");
  }
  /**
   @deprecated
   */
  public RateUnitCrObjectData getRateUnitCrObjectData() {
    return RateUnitCrObjectHelper.fromMap(outputMap, "RateUnitCr");
  }
}
