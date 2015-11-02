/*
 * Generated code DO NOT EDIT
 * Generated file: InvsNetworkDeviceRequest.java
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
public final class InvsNetworkDeviceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsNetworkDeviceRequest (String request, InvsNetworkDeviceRequestMethod method) {
    initialize(request, "InvsNetworkDevice", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsNetworkDeviceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsNetworkDeviceForInvsNetworkDeviceCreate(InvsNetworkDeviceObjectData data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(data, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
  public void setInvsNetworkDeviceForInvsNetworkDeviceFind(InvsNetworkDeviceObjectFilter data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(data, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
  public void setInvsNetworkDeviceForInvsNetworkDeviceGet(InvsNetworkDeviceObjectKeyData data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectKeyHelper.toMap(data, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
  public void setInvsNetworkDeviceForInvsNetworkDeviceUpdate(InvsNetworkDeviceObjectData data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(data, new HashMap(), "InvsNetworkDevice").get("InvsNetworkDevice"));
    }
  }
  public InvsNetworkDeviceObjectData getInvsNetworkDeviceObjectDataInvsNetworkDeviceFromInvsNetworkDeviceCreate() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
  public InvsNetworkDeviceObjectDataList getInvsNetworkDeviceObjectDataInvsNetworkDeviceFromInvsNetworkDeviceFind() {
    return InvsNetworkDeviceObjectHelper.fromMapList(outputMap, "InvsNetworkDeviceList");
  }
  public InvsNetworkDeviceObjectData getInvsNetworkDeviceObjectDataInvsNetworkDeviceFromInvsNetworkDeviceGet() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
  public InvsNetworkDeviceObjectData getInvsNetworkDeviceObjectDataInvsNetworkDeviceFromInvsNetworkDeviceUpdate() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
  /**
   @deprecated
   */
  public void setInvsNetworkDeviceObjectFilter(InvsNetworkDeviceObjectFilter data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(data, new HashMap()).get("InvsNetworkDeviceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsNetworkDeviceObjectData(InvsNetworkDeviceObjectData data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectHelper.toMap(data, new HashMap()).get("InvsNetworkDeviceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsNetworkDeviceObjectKeyData(InvsNetworkDeviceObjectKeyData data) {
    if (data != null) {
      addInput("InvsNetworkDevice", InvsNetworkDeviceObjectKeyHelper.toMap(data, new HashMap()).get("InvsNetworkDeviceObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsNetworkDeviceObjectDataList getInvsNetworkDeviceObjectDataList() {
    return InvsNetworkDeviceObjectHelper.fromMapList(outputMap, "InvsNetworkDeviceList");
  }
  /**
   @deprecated
   */
  public InvsNetworkDeviceObjectData getInvsNetworkDeviceObjectData() {
    return InvsNetworkDeviceObjectHelper.fromMap(outputMap, "InvsNetworkDevice");
  }
}
