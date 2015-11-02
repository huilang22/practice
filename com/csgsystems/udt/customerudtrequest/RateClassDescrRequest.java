/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrRequest.java
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
public final class RateClassDescrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateClassDescrRequest (String request, RateClassDescrRequestMethod method) {
    initialize(request, "RateClassDescr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateClassDescrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateClassDescrForRateClassDescrCreate(RateClassDescrObjectData data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(data, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
  public void setRateClassDescrForRateClassDescrFind(RateClassDescrObjectFilter data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(data, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
  public void setRateClassDescrForRateClassDescrGet(RateClassDescrObjectKeyData data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectKeyHelper.toMap(data, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
  public void setRateClassDescrForRateClassDescrUpdate(RateClassDescrObjectData data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(data, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
  public RateClassDescrObjectData getRateClassDescrObjectDataRateClassDescrFromRateClassDescrCreate() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
  public RateClassDescrObjectDataList getRateClassDescrObjectDataRateClassDescrFromRateClassDescrFind() {
    return RateClassDescrObjectHelper.fromMapList(outputMap, "RateClassDescrList");
  }
  public RateClassDescrObjectData getRateClassDescrObjectDataRateClassDescrFromRateClassDescrGet() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
  public RateClassDescrObjectData getRateClassDescrObjectDataRateClassDescrFromRateClassDescrUpdate() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
  /**
   @deprecated
   */
  public void setRateClassDescrObjectFilter(RateClassDescrObjectFilter data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(data, new HashMap()).get("RateClassDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateClassDescrObjectData(RateClassDescrObjectData data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(data, new HashMap()).get("RateClassDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateClassDescrObjectKeyData(RateClassDescrObjectKeyData data) {
    if (data != null) {
      addInput("RateClassDescr", RateClassDescrObjectKeyHelper.toMap(data, new HashMap()).get("RateClassDescrObject"));
    }
  }
  /**
   @deprecated
   */
  public RateClassDescrObjectDataList getRateClassDescrObjectDataList() {
    return RateClassDescrObjectHelper.fromMapList(outputMap, "RateClassDescrList");
  }
  /**
   @deprecated
   */
  public RateClassDescrObjectData getRateClassDescrObjectData() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
}
