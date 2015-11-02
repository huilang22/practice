/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcRequest.java
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
public final class RateRcRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateRcRequest (String request, RateRcRequestMethod method) {
    initialize(request, "RateRc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateRcRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateRcForRateRcCreate(RACObjectData data) {
    if (data != null) {
      addInput("RateRc", RACObjectHelper.toMap(data, new HashMap(), "RateRc").get("RateRc"));
    }
  }
  public void setRateRcForRateRcDelete(RACObjectKeyData data) {
    if (data != null) {
      addInput("RateRc", RACObjectKeyHelper.toMap(data, new HashMap(), "RateRc").get("RateRc"));
    }
  }
  public void setRateRcForRateRcFind(RACObjectFilter data) {
    if (data != null) {
      addInput("RateRc", RACObjectHelper.toMap(data, new HashMap(), "RateRc").get("RateRc"));
    }
  }
  public void setRateRcForRateRcGet(RACObjectKeyData data) {
    if (data != null) {
      addInput("RateRc", RACObjectKeyHelper.toMap(data, new HashMap(), "RateRc").get("RateRc"));
    }
  }
  public void setRACUpdateFilterForRateRcUpdate(RACObjectFilter data) {
    if (data != null) {
      addInput("RACUpdateFilter", RACObjectHelper.toMap(data, new HashMap(), "RACUpdateFilter").get("RACUpdateFilter"));
    }
  }
  public void setRACUpdateGetForRateRcUpdate(RACObjectData data) {
    if (data != null) {
      addInput("RACUpdateGet", RACObjectHelper.toMap(data, new HashMap(), "RACUpdateGet").get("RACUpdateGet"));
    }
  }
  public void setRateRcForRateRcUpdate(RACObjectData data) {
    if (data != null) {
      addInput("RateRc", RACObjectHelper.toMap(data, new HashMap(), "RateRc").get("RateRc"));
    }
  }
  public RACObjectData getRACObjectDataRateRcFromRateRcCreate() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
  public RACObjectData getRACObjectDataRateRcFromRateRcDelete() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
  public RACObjectDataList getRACObjectDataRateRcFromRateRcFind() {
    return RACObjectHelper.fromMapList(outputMap, "RateRcList");
  }
  public RACObjectData getRACObjectDataRateRcFromRateRcGet() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
  public RACObjectData getRACObjectDataRateRcFromRateRcUpdate() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
  /**
   @deprecated
   */
  public void setRACObjectFilter(RACObjectFilter data) {
    if (data != null) {
      addInput("RAC", RACObjectHelper.toMap(data, new HashMap()).get("RACObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRACObjectData(RACObjectData data) {
    if (data != null) {
      addInput("RAC", RACObjectHelper.toMap(data, new HashMap()).get("RACObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRACObjectKeyData(RACObjectKeyData data) {
    if (data != null) {
      addInput("RateRc", RACObjectKeyHelper.toMap(data, new HashMap()).get("RACObject"));
    }
  }
  /**
   @deprecated
   */
  public RACObjectDataList getRACObjectDataList() {
    return RACObjectHelper.fromMapList(outputMap, "RACList");
  }
  /**
   @deprecated
   */
  public RACObjectData getRACObjectData() {
    return RACObjectHelper.fromMap(outputMap, "RateRc");
  }
}
