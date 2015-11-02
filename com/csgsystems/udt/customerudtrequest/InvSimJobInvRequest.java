/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobInvRequest.java
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
public final class InvSimJobInvRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvSimJobInvRequest (String request, InvSimJobInvRequestMethod method) {
    initialize(request, "InvSimJobInv", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvSimJobInvRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvSimJobInvForInvSimJobInvFind(InvSimJobInvObjectFilter data) {
    if (data != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(data, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }
  public void setInvSimJobInvForInvSimJobInvGet(InvSimJobInvObjectKeyData data) {
    if (data != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectKeyHelper.toMap(data, new HashMap(), "InvSimJobInv").get("InvSimJobInv"));
    }
  }
  public InvSimJobInvObjectDataList getInvSimJobInvObjectDataInvSimJobInvFromInvSimJobInvFind() {
    return InvSimJobInvObjectHelper.fromMapList(outputMap, "InvSimJobInvList");
  }
  public InvSimJobInvObjectData getInvSimJobInvObjectDataInvSimJobInvFromInvSimJobInvGet() {
    return InvSimJobInvObjectHelper.fromMap(outputMap, "InvSimJobInv");
  }
  /**
   @deprecated
   */
  public void setInvSimJobInvObjectFilter(InvSimJobInvObjectFilter data) {
    if (data != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectHelper.toMap(data, new HashMap()).get("InvSimJobInvObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvSimJobInvObjectKeyData(InvSimJobInvObjectKeyData data) {
    if (data != null) {
      addInput("InvSimJobInv", InvSimJobInvObjectKeyHelper.toMap(data, new HashMap()).get("InvSimJobInvObject"));
    }
  }
  /**
   @deprecated
   */
  public InvSimJobInvObjectDataList getInvSimJobInvObjectDataList() {
    return InvSimJobInvObjectHelper.fromMapList(outputMap, "InvSimJobInvList");
  }
  /**
   @deprecated
   */
  public InvSimJobInvObjectData getInvSimJobInvObjectData() {
    return InvSimJobInvObjectHelper.fromMap(outputMap, "InvSimJobInv");
  }
}
