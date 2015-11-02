/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimCardConfigRefRequest.java
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
public final class InvsSimCardConfigRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimCardConfigRefRequest (String request, InvsSimCardConfigRefRequestMethod method) {
    initialize(request, "InvsSimCardConfigRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimCardConfigRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimCardConfigRefForInvsSimCardConfigRefCreate(InvsSimCardConfigRefObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
  public void setInvsSimCardConfigRefForInvsSimCardConfigRefFind(InvsSimCardConfigRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
  public void setInvsSimCardConfigRefForInvsSimCardConfigRefGet(InvsSimCardConfigRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectKeyHelper.toMap(data, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
  public void setInvsSimCardConfigRefForInvsSimCardConfigRefUpdate(InvsSimCardConfigRefObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(data, new HashMap(), "InvsSimCardConfigRef").get("InvsSimCardConfigRef"));
    }
  }
  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRefObjectDataInvsSimCardConfigRefFromInvsSimCardConfigRefCreate() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
  public InvsSimCardConfigRefObjectDataList getInvsSimCardConfigRefObjectDataInvsSimCardConfigRefFromInvsSimCardConfigRefFind() {
    return InvsSimCardConfigRefObjectHelper.fromMapList(outputMap, "InvsSimCardConfigRefList");
  }
  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRefObjectDataInvsSimCardConfigRefFromInvsSimCardConfigRefGet() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRefObjectDataInvsSimCardConfigRefFromInvsSimCardConfigRefUpdate() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigRefObjectFilter(InvsSimCardConfigRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(data, new HashMap()).get("InvsSimCardConfigRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigRefObjectData(InvsSimCardConfigRefObjectData data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectHelper.toMap(data, new HashMap()).get("InvsSimCardConfigRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimCardConfigRefObjectKeyData(InvsSimCardConfigRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimCardConfigRef", InvsSimCardConfigRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimCardConfigRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimCardConfigRefObjectDataList getInvsSimCardConfigRefObjectDataList() {
    return InvsSimCardConfigRefObjectHelper.fromMapList(outputMap, "InvsSimCardConfigRefList");
  }
  /**
   @deprecated
   */
  public InvsSimCardConfigRefObjectData getInvsSimCardConfigRefObjectData() {
    return InvsSimCardConfigRefObjectHelper.fromMap(outputMap, "InvsSimCardConfigRef");
  }
}
