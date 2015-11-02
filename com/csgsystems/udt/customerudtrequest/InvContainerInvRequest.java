/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerInvRequest.java
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
public final class InvContainerInvRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvContainerInvRequest (String request, InvContainerInvRequestMethod method) {
    initialize(request, "InvContainerInv", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvContainerInvRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvContainerInvForInvContainerInvCreate(InvContainerInvObjectData data) {
    if (data != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(data, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }
  public void setInvContainerInvForInvContainerInvDelete(InvContainerInvObjectData data) {
    if (data != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(data, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }
  public void setInvContainerInvForInvContainerInvFind(InvContainerInvObjectFilter data) {
    if (data != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(data, new HashMap(), "InvContainerInv").get("InvContainerInv"));
    }
  }
  public InvContainerInvObjectData getInvContainerInvObjectDataInvContainerInvFromInvContainerInvCreate() {
    return InvContainerInvObjectHelper.fromMap(outputMap, "InvContainerInv");
  }
  public InvContainerInvObjectDataList getInvContainerInvObjectDataInvContainerInvFromInvContainerInvFind() {
    return InvContainerInvObjectHelper.fromMapList(outputMap, "InvContainerInvList");
  }
  /**
   @deprecated
   */
  public void setInvContainerInvObjectFilter(InvContainerInvObjectFilter data) {
    if (data != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(data, new HashMap()).get("InvContainerInvObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvContainerInvObjectData(InvContainerInvObjectData data) {
    if (data != null) {
      addInput("InvContainerInv", InvContainerInvObjectHelper.toMap(data, new HashMap()).get("InvContainerInvObject"));
    }
  }
  /**
   @deprecated
   */
  public InvContainerInvObjectDataList getInvContainerInvObjectDataList() {
    return InvContainerInvObjectHelper.fromMapList(outputMap, "InvContainerInvList");
  }
  /**
   @deprecated
   */
  public InvContainerInvObjectData getInvContainerInvObjectData() {
    return InvContainerInvObjectHelper.fromMap(outputMap, "InvContainerInv");
  }
}
