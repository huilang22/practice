/*
 * Generated code DO NOT EDIT
 * Generated file: InvsRateCenterRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsRateCenterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsRateCenterRequest (String request, InvsRateCenterRequestMethod method) {
    initialize(request, "InvsRateCenter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsRateCenterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsRateCenterForInvsRateCenterCreate(InvsRateCenterObjectData data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(data, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
  public void setInvsRateCenterForInvsRateCenterFind(InvsRateCenterObjectFilter data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(data, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
  public void setInvsRateCenterForInvsRateCenterGet(InvsRateCenterObjectKeyData data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectKeyHelper.toMap(data, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
  public void setInvsRateCenterForInvsRateCenterUpdate(InvsRateCenterObjectData data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(data, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
  public InvsRateCenterObjectData getInvsRateCenterObjectDataInvsRateCenterFromInvsRateCenterCreate() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
  public InvsRateCenterObjectDataList getInvsRateCenterObjectDataInvsRateCenterFromInvsRateCenterFind() {
    return InvsRateCenterObjectHelper.fromMapList(outputMap, "InvsRateCenterList");
  }
  public InvsRateCenterObjectData getInvsRateCenterObjectDataInvsRateCenterFromInvsRateCenterGet() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
  public InvsRateCenterObjectData getInvsRateCenterObjectDataInvsRateCenterFromInvsRateCenterUpdate() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
  /**
   @deprecated
   */
  public void setInvsRateCenterObjectFilter(InvsRateCenterObjectFilter data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(data, new HashMap()).get("InvsRateCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsRateCenterObjectData(InvsRateCenterObjectData data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(data, new HashMap()).get("InvsRateCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsRateCenterObjectKeyData(InvsRateCenterObjectKeyData data) {
    if (data != null) {
      addInput("InvsRateCenter", InvsRateCenterObjectKeyHelper.toMap(data, new HashMap()).get("InvsRateCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsRateCenterObjectDataList getInvsRateCenterObjectDataList() {
    return InvsRateCenterObjectHelper.fromMapList(outputMap, "InvsRateCenterList");
  }
  /**
   @deprecated
   */
  public InvsRateCenterObjectData getInvsRateCenterObjectData() {
    return InvsRateCenterObjectHelper.fromMap(outputMap, "InvsRateCenter");
  }
}
