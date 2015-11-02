/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimResellerRefRequest.java
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
public final class InvsSimResellerRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimResellerRefRequest (String request, InvsSimResellerRefRequestMethod method) {
    initialize(request, "InvsSimResellerRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimResellerRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimResellerRefForInvsSimResellerRefCreate(InvsSimResellerRefObjectData data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(data, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
  public void setInvsSimResellerRefForInvsSimResellerRefFind(InvsSimResellerRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(data, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
  public void setInvsSimResellerRefForInvsSimResellerRefGet(InvsSimResellerRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectKeyHelper.toMap(data, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
  public void setInvsSimResellerRefForInvsSimResellerRefUpdate(InvsSimResellerRefObjectData data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(data, new HashMap(), "InvsSimResellerRef").get("InvsSimResellerRef"));
    }
  }
  public InvsSimResellerRefObjectData getInvsSimResellerRefObjectDataInvsSimResellerRefFromInvsSimResellerRefCreate() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
  public InvsSimResellerRefObjectDataList getInvsSimResellerRefObjectDataInvsSimResellerRefFromInvsSimResellerRefFind() {
    return InvsSimResellerRefObjectHelper.fromMapList(outputMap, "InvsSimResellerRefList");
  }
  public InvsSimResellerRefObjectData getInvsSimResellerRefObjectDataInvsSimResellerRefFromInvsSimResellerRefGet() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
  public InvsSimResellerRefObjectData getInvsSimResellerRefObjectDataInvsSimResellerRefFromInvsSimResellerRefUpdate() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerRefObjectFilter(InvsSimResellerRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(data, new HashMap()).get("InvsSimResellerRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerRefObjectData(InvsSimResellerRefObjectData data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectHelper.toMap(data, new HashMap()).get("InvsSimResellerRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimResellerRefObjectKeyData(InvsSimResellerRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimResellerRef", InvsSimResellerRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimResellerRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimResellerRefObjectDataList getInvsSimResellerRefObjectDataList() {
    return InvsSimResellerRefObjectHelper.fromMapList(outputMap, "InvsSimResellerRefList");
  }
  /**
   @deprecated
   */
  public InvsSimResellerRefObjectData getInvsSimResellerRefObjectData() {
    return InvsSimResellerRefObjectHelper.fromMap(outputMap, "InvsSimResellerRef");
  }
}
