/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRefRequest.java
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
public final class InvsContainerTypeRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsContainerTypeRefRequest (String request, InvsContainerTypeRefRequestMethod method) {
    initialize(request, "InvsContainerTypeRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsContainerTypeRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsContainerTypeRefForInvsContainerTypeRefCreate(InvsContainerTypeRefObjectData data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(data, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
  public void setInvsContainerTypeRefForInvsContainerTypeRefFind(InvsContainerTypeRefObjectFilter data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(data, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
  public void setInvsContainerTypeRefForInvsContainerTypeRefGet(InvsContainerTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectKeyHelper.toMap(data, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
  public void setInvsContainerTypeRefForInvsContainerTypeRefUpdate(InvsContainerTypeRefObjectData data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(data, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
  public InvsContainerTypeRefObjectData getInvsContainerTypeRefObjectDataInvsContainerTypeRefFromInvsContainerTypeRefCreate() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
  public InvsContainerTypeRefObjectDataList getInvsContainerTypeRefObjectDataInvsContainerTypeRefFromInvsContainerTypeRefFind() {
    return InvsContainerTypeRefObjectHelper.fromMapList(outputMap, "InvsContainerTypeRefList");
  }
  public InvsContainerTypeRefObjectData getInvsContainerTypeRefObjectDataInvsContainerTypeRefFromInvsContainerTypeRefGet() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
  public InvsContainerTypeRefObjectData getInvsContainerTypeRefObjectDataInvsContainerTypeRefFromInvsContainerTypeRefUpdate() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeRefObjectFilter(InvsContainerTypeRefObjectFilter data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(data, new HashMap()).get("InvsContainerTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeRefObjectData(InvsContainerTypeRefObjectData data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(data, new HashMap()).get("InvsContainerTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeRefObjectKeyData(InvsContainerTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsContainerTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsContainerTypeRefObjectDataList getInvsContainerTypeRefObjectDataList() {
    return InvsContainerTypeRefObjectHelper.fromMapList(outputMap, "InvsContainerTypeRefList");
  }
  /**
   @deprecated
   */
  public InvsContainerTypeRefObjectData getInvsContainerTypeRefObjectData() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
}
