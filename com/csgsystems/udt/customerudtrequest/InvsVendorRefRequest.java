/*
 * Generated code DO NOT EDIT
 * Generated file: InvsVendorRefRequest.java
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
public final class InvsVendorRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsVendorRefRequest (String request, InvsVendorRefRequestMethod method) {
    initialize(request, "InvsVendorRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsVendorRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsVendorRefForInvsVendorRefCreate(InvsVendorRefObjectData data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(data, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
  public void setInvsVendorRefForInvsVendorRefFind(InvsVendorRefObjectFilter data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(data, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
  public void setInvsVendorRefForInvsVendorRefGet(InvsVendorRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectKeyHelper.toMap(data, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
  public void setInvsVendorRefForInvsVendorRefUpdate(InvsVendorRefObjectData data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(data, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
  public InvsVendorRefObjectData getInvsVendorRefObjectDataInvsVendorRefFromInvsVendorRefCreate() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
  public InvsVendorRefObjectDataList getInvsVendorRefObjectDataInvsVendorRefFromInvsVendorRefFind() {
    return InvsVendorRefObjectHelper.fromMapList(outputMap, "InvsVendorRefList");
  }
  public InvsVendorRefObjectData getInvsVendorRefObjectDataInvsVendorRefFromInvsVendorRefGet() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
  public InvsVendorRefObjectData getInvsVendorRefObjectDataInvsVendorRefFromInvsVendorRefUpdate() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
  /**
   @deprecated
   */
  public void setInvsVendorRefObjectFilter(InvsVendorRefObjectFilter data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(data, new HashMap()).get("InvsVendorRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVendorRefObjectData(InvsVendorRefObjectData data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(data, new HashMap()).get("InvsVendorRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsVendorRefObjectKeyData(InvsVendorRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsVendorRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsVendorRefObjectDataList getInvsVendorRefObjectDataList() {
    return InvsVendorRefObjectHelper.fromMapList(outputMap, "InvsVendorRefList");
  }
  /**
   @deprecated
   */
  public InvsVendorRefObjectData getInvsVendorRefObjectData() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
}
