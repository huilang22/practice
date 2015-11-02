/*
 * Generated code DO NOT EDIT
 * Generated file: InvsThresholdRequest.java
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
public final class InvsThresholdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsThresholdRequest (String request, InvsThresholdRequestMethod method) {
    initialize(request, "InvsThreshold", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsThresholdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsThresholdForInvsThresholdCreate(InvsThresholdObjectData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
  public void setInvsThresholdForInvsThresholdDelete(InvsThresholdObjectData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
  public void setInvsThresholdForInvsThresholdFind(InvsThresholdObjectFilter data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
  public void setInvsThresholdForInvsThresholdGet(InvsThresholdObjectKeyData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectKeyHelper.toMap(data, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
  public void setInvsThresholdForInvsThresholdUpdate(InvsThresholdObjectData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
  public InvsThresholdObjectData getInvsThresholdObjectDataInvsThresholdFromInvsThresholdCreate() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
  public InvsThresholdObjectDataList getInvsThresholdObjectDataInvsThresholdFromInvsThresholdFind() {
    return InvsThresholdObjectHelper.fromMapList(outputMap, "InvsThresholdList");
  }
  public InvsThresholdObjectData getInvsThresholdObjectDataInvsThresholdFromInvsThresholdGet() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
  public InvsThresholdObjectData getInvsThresholdObjectDataInvsThresholdFromInvsThresholdUpdate() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
  /**
   @deprecated
   */
  public void setInvsThresholdObjectFilter(InvsThresholdObjectFilter data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap()).get("InvsThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsThresholdObjectData(InvsThresholdObjectData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(data, new HashMap()).get("InvsThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsThresholdObjectKeyData(InvsThresholdObjectKeyData data) {
    if (data != null) {
      addInput("InvsThreshold", InvsThresholdObjectKeyHelper.toMap(data, new HashMap()).get("InvsThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsThresholdObjectDataList getInvsThresholdObjectDataList() {
    return InvsThresholdObjectHelper.fromMapList(outputMap, "InvsThresholdList");
  }
  /**
   @deprecated
   */
  public InvsThresholdObjectData getInvsThresholdObjectData() {
    return InvsThresholdObjectHelper.fromMap(outputMap, "InvsThreshold");
  }
}
