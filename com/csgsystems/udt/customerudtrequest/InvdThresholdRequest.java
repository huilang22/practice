/*
 * Generated code DO NOT EDIT
 * Generated file: InvdThresholdRequest.java
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
public final class InvdThresholdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdThresholdRequest (String request, InvdThresholdRequestMethod method) {
    initialize(request, "InvdThreshold", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdThresholdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdThresholdForInvdThresholdCreate(InvdThresholdObjectData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(data, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
  public void setInvdThresholdForInvdThresholdDelete(InvdThresholdObjectKeyData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(data, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
  public void setInvdThresholdForInvdThresholdFind(InvdThresholdObjectFilter data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(data, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
  public void setInvdThresholdForInvdThresholdGet(InvdThresholdObjectKeyData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(data, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
  public void setInvdThresholdForInvdThresholdUpdate(InvdThresholdObjectData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(data, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
  public InvdThresholdObjectData getInvdThresholdObjectDataInvdThresholdFromInvdThresholdCreate() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
  public InvdThresholdObjectDataList getInvdThresholdObjectDataInvdThresholdFromInvdThresholdFind() {
    return InvdThresholdObjectHelper.fromMapList(outputMap, "InvdThresholdList");
  }
  public InvdThresholdObjectData getInvdThresholdObjectDataInvdThresholdFromInvdThresholdGet() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
  public InvdThresholdObjectData getInvdThresholdObjectDataInvdThresholdFromInvdThresholdUpdate() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
  /**
   @deprecated
   */
  public void setInvdThresholdObjectFilter(InvdThresholdObjectFilter data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(data, new HashMap()).get("InvdThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdThresholdObjectData(InvdThresholdObjectData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(data, new HashMap()).get("InvdThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdThresholdObjectKeyData(InvdThresholdObjectKeyData data) {
    if (data != null) {
      addInput("InvdThreshold", InvdThresholdObjectKeyHelper.toMap(data, new HashMap()).get("InvdThresholdObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdThresholdObjectDataList getInvdThresholdObjectDataList() {
    return InvdThresholdObjectHelper.fromMapList(outputMap, "InvdThresholdList");
  }
  /**
   @deprecated
   */
  public InvdThresholdObjectData getInvdThresholdObjectData() {
    return InvdThresholdObjectHelper.fromMap(outputMap, "InvdThreshold");
  }
}
