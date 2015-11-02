/*
 * Generated code DO NOT EDIT
 * Generated file: InvdWorkpointAssocRequest.java
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
public final class InvdWorkpointAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdWorkpointAssocRequest (String request, InvdWorkpointAssocRequestMethod method) {
    initialize(request, "InvdWorkpointAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdWorkpointAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdWorkpointAssocForInvdWorkpointAssocCreate(InvdWorkpointAssocObjectData data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(data, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
  public void setInvdWorkpointAssocForInvdWorkpointAssocFind(InvdWorkpointAssocObjectFilter data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(data, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
  public void setInvdWorkpointAssocForInvdWorkpointAssocGet(InvdWorkpointAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectKeyHelper.toMap(data, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
  public void setInvdWorkpointAssocForInvdWorkpointAssocUpdate(InvdWorkpointAssocObjectData data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(data, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }
  public InvdWorkpointAssocObjectData getInvdWorkpointAssocObjectDataInvdWorkpointAssocFromInvdWorkpointAssocCreate() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
  public InvdWorkpointAssocObjectDataList getInvdWorkpointAssocObjectDataInvdWorkpointAssocFromInvdWorkpointAssocFind() {
    return InvdWorkpointAssocObjectHelper.fromMapList(outputMap, "InvdWorkpointAssocList");
  }
  public InvdWorkpointAssocObjectData getInvdWorkpointAssocObjectDataInvdWorkpointAssocFromInvdWorkpointAssocGet() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
  public InvdWorkpointAssocObjectData getInvdWorkpointAssocObjectDataInvdWorkpointAssocFromInvdWorkpointAssocUpdate() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
  /**
   @deprecated
   */
  public void setInvdWorkpointAssocObjectFilter(InvdWorkpointAssocObjectFilter data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(data, new HashMap()).get("InvdWorkpointAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdWorkpointAssocObjectData(InvdWorkpointAssocObjectData data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(data, new HashMap()).get("InvdWorkpointAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdWorkpointAssocObjectKeyData(InvdWorkpointAssocObjectKeyData data) {
    if (data != null) {
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectKeyHelper.toMap(data, new HashMap()).get("InvdWorkpointAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdWorkpointAssocObjectDataList getInvdWorkpointAssocObjectDataList() {
    return InvdWorkpointAssocObjectHelper.fromMapList(outputMap, "InvdWorkpointAssocList");
  }
  /**
   @deprecated
   */
  public InvdWorkpointAssocObjectData getInvdWorkpointAssocObjectData() {
    return InvdWorkpointAssocObjectHelper.fromMap(outputMap, "InvdWorkpointAssoc");
  }
}
