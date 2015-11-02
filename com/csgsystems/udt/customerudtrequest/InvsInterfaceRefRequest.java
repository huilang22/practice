/*
 * Generated code DO NOT EDIT
 * Generated file: InvsInterfaceRefRequest.java
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
public final class InvsInterfaceRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsInterfaceRefRequest (String request, InvsInterfaceRefRequestMethod method) {
    initialize(request, "InvsInterfaceRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsInterfaceRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsInterfaceRefForInvsInterfaceRefCreate(InvsInterfaceRefObjectData data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(data, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
  public void setInvsInterfaceRefForInvsInterfaceRefFind(InvsInterfaceRefObjectFilter data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(data, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
  public void setInvsInterfaceRefForInvsInterfaceRefGet(InvsInterfaceRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectKeyHelper.toMap(data, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
  public void setInvsInterfaceRefForInvsInterfaceRefUpdate(InvsInterfaceRefObjectData data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(data, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }
  public InvsInterfaceRefObjectData getInvsInterfaceRefObjectDataInvsInterfaceRefFromInvsInterfaceRefCreate() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
  public InvsInterfaceRefObjectDataList getInvsInterfaceRefObjectDataInvsInterfaceRefFromInvsInterfaceRefFind() {
    return InvsInterfaceRefObjectHelper.fromMapList(outputMap, "InvsInterfaceRefList");
  }
  public InvsInterfaceRefObjectData getInvsInterfaceRefObjectDataInvsInterfaceRefFromInvsInterfaceRefGet() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
  public InvsInterfaceRefObjectData getInvsInterfaceRefObjectDataInvsInterfaceRefFromInvsInterfaceRefUpdate() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceRefObjectFilter(InvsInterfaceRefObjectFilter data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(data, new HashMap()).get("InvsInterfaceRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceRefObjectData(InvsInterfaceRefObjectData data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(data, new HashMap()).get("InvsInterfaceRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsInterfaceRefObjectKeyData(InvsInterfaceRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsInterfaceRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsInterfaceRefObjectDataList getInvsInterfaceRefObjectDataList() {
    return InvsInterfaceRefObjectHelper.fromMapList(outputMap, "InvsInterfaceRefList");
  }
  /**
   @deprecated
   */
  public InvsInterfaceRefObjectData getInvsInterfaceRefObjectData() {
    return InvsInterfaceRefObjectHelper.fromMap(outputMap, "InvsInterfaceRef");
  }
}
