/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobInvRequest.java
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
public final class InvJobInvRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvJobInvRequest (String request, InvJobInvRequestMethod method) {
    initialize(request, "InvJobInv", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvJobInvRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvJobInvForInvJobInvFind(InvJobInvObjectFilter data) {
    if (data != null) {
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(data, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }
  public void setInvJobInvForInvJobInvGet(InvJobInvObjectKeyData data) {
    if (data != null) {
      addInput("InvJobInv", InvJobInvObjectKeyHelper.toMap(data, new HashMap(), "InvJobInv").get("InvJobInv"));
    }
  }
  public InvJobInvObjectDataList getInvJobInvObjectDataInvJobInvFromInvJobInvFind() {
    return InvJobInvObjectHelper.fromMapList(outputMap, "InvJobInvList");
  }
  public InvJobInvObjectData getInvJobInvObjectDataInvJobInvFromInvJobInvGet() {
    return InvJobInvObjectHelper.fromMap(outputMap, "InvJobInv");
  }
  /**
   @deprecated
   */
  public void setInvJobInvObjectFilter(InvJobInvObjectFilter data) {
    if (data != null) {
      addInput("InvJobInv", InvJobInvObjectHelper.toMap(data, new HashMap()).get("InvJobInvObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvJobInvObjectKeyData(InvJobInvObjectKeyData data) {
    if (data != null) {
      addInput("InvJobInv", InvJobInvObjectKeyHelper.toMap(data, new HashMap()).get("InvJobInvObject"));
    }
  }
  /**
   @deprecated
   */
  public InvJobInvObjectDataList getInvJobInvObjectDataList() {
    return InvJobInvObjectHelper.fromMapList(outputMap, "InvJobInvList");
  }
  /**
   @deprecated
   */
  public InvJobInvObjectData getInvJobInvObjectData() {
    return InvJobInvObjectHelper.fromMap(outputMap, "InvJobInv");
  }
}
