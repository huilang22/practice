/*
 * Generated code DO NOT EDIT
 * Generated file: RateCurrencyRequest.java
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
public final class RateCurrencyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateCurrencyRequest (String request, RateCurrencyRequestMethod method) {
    initialize(request, "RateCurrency", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateCurrencyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateCurrencyForRateCurrencyCreate(RCObjectData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(data, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
  public void setRateCurrencyForRateCurrencyDelete(RCObjectKeyData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectKeyHelper.toMap(data, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
  public void setRateCurrencyForRateCurrencyFind(RCObjectFilter data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(data, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
  public void setRateCurrencyForRateCurrencyGet(RCObjectKeyData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectKeyHelper.toMap(data, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
  public void setRateCurrencyForRateCurrencyUpdate(RCObjectData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(data, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
  public RCObjectData getRCObjectDataRateCurrencyFromRateCurrencyCreate() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
  public RCObjectData getRCObjectDataRateCurrencyFromRateCurrencyDelete() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
  public RCObjectDataList getRCObjectDataRateCurrencyFromRateCurrencyFind() {
    return RCObjectHelper.fromMapList(outputMap, "RateCurrencyList");
  }
  public RCObjectData getRCObjectDataRateCurrencyFromRateCurrencyGet() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
  public RCObjectData getRCObjectDataRateCurrencyFromRateCurrencyUpdate() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
  /**
   @deprecated
   */
  public void setRCObjectFilter(RCObjectFilter data) {
    if (data != null) {
      addInput("RC", RCObjectHelper.toMap(data, new HashMap()).get("RCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRCObjectData(RCObjectData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectHelper.toMap(data, new HashMap()).get("RCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRCObjectKeyData(RCObjectKeyData data) {
    if (data != null) {
      addInput("RateCurrency", RCObjectKeyHelper.toMap(data, new HashMap()).get("RCObject"));
    }
  }
  /**
   @deprecated
   */
  public RCObjectDataList getRCObjectDataList() {
    return RCObjectHelper.fromMapList(outputMap, "RCList");
  }
  /**
   @deprecated
   */
  public RCObjectData getRCObjectData() {
    return RCObjectHelper.fromMap(outputMap, "RateCurrency");
  }
}
