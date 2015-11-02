/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateRequest.java
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
public final class RbrRateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrRateRequest (String request, RbrRateRequestMethod method) {
    initialize(request, "RbrRate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrRateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrRateForRbrRateCreate(RbrRatesObjectData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(data, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
  public void setRbrRateForRbrRateDelete(RbrRatesObjectKeyData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(data, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
  public void setRbrRateForRbrRateFind(RbrRatesObjectFilter data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(data, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
  public void setRbrRateForRbrRateGet(RbrRatesObjectKeyData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(data, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
  public void setRbrRateForRbrRateUpdate(RbrRatesObjectData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(data, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
  public RbrRatesObjectData getRbrRatesObjectDataRbrRateFromRbrRateCreate() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
  public RbrRatesObjectData getRbrRatesObjectDataRbrRateFromRbrRateDelete() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
  public RbrRatesObjectDataList getRbrRatesObjectDataRbrRateFromRbrRateFind() {
    return RbrRatesObjectHelper.fromMapList(outputMap, "RbrRateList");
  }
  public RbrRatesObjectData getRbrRatesObjectDataRbrRateFromRbrRateGet() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
  public RbrRatesObjectData getRbrRatesObjectDataRbrRateFromRbrRateUpdate() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
  /**
   @deprecated
   */
  public void setRbrRatesObjectFilter(RbrRatesObjectFilter data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(data, new HashMap()).get("RbrRatesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRatesObjectData(RbrRatesObjectData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectHelper.toMap(data, new HashMap()).get("RbrRatesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRatesObjectKeyData(RbrRatesObjectKeyData data) {
    if (data != null) {
      addInput("RbrRate", RbrRatesObjectKeyHelper.toMap(data, new HashMap()).get("RbrRatesObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrRatesObjectDataList getRbrRatesObjectDataList() {
    return RbrRatesObjectHelper.fromMapList(outputMap, "RbrRateList");
  }
  /**
   @deprecated
   */
  public RbrRatesObjectData getRbrRatesObjectData() {
    return RbrRatesObjectHelper.fromMap(outputMap, "RbrRate");
  }
}
