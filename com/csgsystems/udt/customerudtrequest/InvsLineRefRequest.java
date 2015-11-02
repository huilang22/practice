/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefRequest.java
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
public final class InvsLineRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLineRefRequest (String request, InvsLineRefRequestMethod method) {
    initialize(request, "InvsLineRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLineRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLineRefForInvsLineRefCreate(InvsLineRefObjectData data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(data, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
  public void setInvsLineRefForInvsLineRefFind(InvsLineRefObjectFilter data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(data, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
  public void setInvsLineRefForInvsLineRefGet(InvsLineRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectKeyHelper.toMap(data, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
  public void setInvsLineRefForInvsLineRefUpdate(InvsLineRefObjectData data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(data, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
  public InvsLineRefObjectData getInvsLineRefObjectDataInvsLineRefFromInvsLineRefCreate() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
  public InvsLineRefObjectDataList getInvsLineRefObjectDataInvsLineRefFromInvsLineRefFind() {
    return InvsLineRefObjectHelper.fromMapList(outputMap, "InvsLineRefList");
  }
  public InvsLineRefObjectData getInvsLineRefObjectDataInvsLineRefFromInvsLineRefGet() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
  public InvsLineRefObjectData getInvsLineRefObjectDataInvsLineRefFromInvsLineRefUpdate() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
  /**
   @deprecated
   */
  public void setInvsLineRefObjectFilter(InvsLineRefObjectFilter data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(data, new HashMap()).get("InvsLineRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineRefObjectData(InvsLineRefObjectData data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(data, new HashMap()).get("InvsLineRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineRefObjectKeyData(InvsLineRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsLineRef", InvsLineRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsLineRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLineRefObjectDataList getInvsLineRefObjectDataList() {
    return InvsLineRefObjectHelper.fromMapList(outputMap, "InvsLineRefList");
  }
  /**
   @deprecated
   */
  public InvsLineRefObjectData getInvsLineRefObjectData() {
    return InvsLineRefObjectHelper.fromMap(outputMap, "InvsLineRef");
  }
}
