/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobRequest.java
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
public final class InvJobRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvJobRequest (String request, InvJobRequestMethod method) {
    initialize(request, "InvJob", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvJobRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvJobForInvJobDelete(InvJobObjectData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap(), "InvJob").get("InvJob"));
    }
  }
  public void setInvJobForInvJobFind(InvJobObjectFilter data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap(), "InvJob").get("InvJob"));
    }
  }
  public void setInvJobForInvJobGet(InvJobObjectKeyData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectKeyHelper.toMap(data, new HashMap(), "InvJob").get("InvJob"));
    }
  }
  public void setInvJobForInvJobUpdate(InvJobObjectData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap(), "InvJob").get("InvJob"));
    }
  }
  public void setInvJobForInvJobUpdateNumber(InvJobObjectData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap(), "InvJob").get("InvJob"));
    }
  }
  public InvJobObjectData getInvJobObjectDataInvJobFromInvJobDelete() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
  public InvJobObjectDataList getInvJobObjectDataInvJobFromInvJobFind() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
  public InvJobObjectData getInvJobObjectDataInvJobFromInvJobGet() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
  public InvJobObjectDataList getInvJobObjectDataInvJobFromInvJobSubstateComplete() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
  public InvJobObjectData getInvJobObjectDataInvJobFromInvJobUpdate() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
  public InvJobObjectData getInvJobObjectDataInvJobFromInvJobUpdateNumber() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
  /**
   @deprecated
   */
  public void setInvJobObjectFilter(InvJobObjectFilter data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap()).get("InvJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvJobObjectData(InvJobObjectData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectHelper.toMap(data, new HashMap()).get("InvJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvJobObjectKeyData(InvJobObjectKeyData data) {
    if (data != null) {
      addInput("InvJob", InvJobObjectKeyHelper.toMap(data, new HashMap()).get("InvJobObject"));
    }
  }
  /**
   @deprecated
   */
  public InvJobObjectDataList getInvJobObjectDataList() {
    return InvJobObjectHelper.fromMapList(outputMap, "InvJobList");
  }
  /**
   @deprecated
   */
  public InvJobObjectData getInvJobObjectData() {
    return InvJobObjectHelper.fromMap(outputMap, "InvJob");
  }
}
