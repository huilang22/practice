/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSimSalesChannelRefRequest.java
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
public final class InvsSimSalesChannelRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSimSalesChannelRefRequest (String request, InvsSimSalesChannelRefRequestMethod method) {
    initialize(request, "InvsSimSalesChannelRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSimSalesChannelRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSimSalesChannelRefForInvsSimSalesChannelRefCreate(InvsSimSalesChannelRefObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
  public void setInvsSimSalesChannelRefForInvsSimSalesChannelRefFind(InvsSimSalesChannelRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
  public void setInvsSimSalesChannelRefForInvsSimSalesChannelRefGet(InvsSimSalesChannelRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectKeyHelper.toMap(data, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
  public void setInvsSimSalesChannelRefForInvsSimSalesChannelRefUpdate(InvsSimSalesChannelRefObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(data, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }
  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRefObjectDataInvsSimSalesChannelRefFromInvsSimSalesChannelRefCreate() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
  public InvsSimSalesChannelRefObjectDataList getInvsSimSalesChannelRefObjectDataInvsSimSalesChannelRefFromInvsSimSalesChannelRefFind() {
    return InvsSimSalesChannelRefObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelRefList");
  }
  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRefObjectDataInvsSimSalesChannelRefFromInvsSimSalesChannelRefGet() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRefObjectDataInvsSimSalesChannelRefFromInvsSimSalesChannelRefUpdate() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelRefObjectFilter(InvsSimSalesChannelRefObjectFilter data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelRefObjectData(InvsSimSalesChannelRefObjectData data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSimSalesChannelRefObjectKeyData(InvsSimSalesChannelRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsSimSalesChannelRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSimSalesChannelRefObjectDataList getInvsSimSalesChannelRefObjectDataList() {
    return InvsSimSalesChannelRefObjectHelper.fromMapList(outputMap, "InvsSimSalesChannelRefList");
  }
  /**
   @deprecated
   */
  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRefObjectData() {
    return InvsSimSalesChannelRefObjectHelper.fromMap(outputMap, "InvsSimSalesChannelRef");
  }
}
