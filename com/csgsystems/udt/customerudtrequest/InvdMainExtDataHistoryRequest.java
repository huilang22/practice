/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryRequest.java
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
public final class InvdMainExtDataHistoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdMainExtDataHistoryRequest (String request, InvdMainExtDataHistoryRequestMethod method) {
    initialize(request, "InvdMainExtDataHistory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdMainExtDataHistoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdMainExtDataHistoryForInvdMainExtDataHistoryCreate(InvdMainExtDataHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
  public void setInvdMainExtDataHistoryForInvdMainExtDataHistoryDelete(InvdMainExtDataHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(data, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
  public void setInvdMainExtDataHistoryForInvdMainExtDataHistoryFind(InvdMainExtDataHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
  public void setInvdMainExtDataHistoryForInvdMainExtDataHistoryGet(InvdMainExtDataHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(data, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
  public void setInvdMainExtDataHistoryForInvdMainExtDataHistoryUpdate(InvdMainExtDataHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistoryObjectDataInvdMainExtDataHistoryFromInvdMainExtDataHistoryCreate() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
  public InvdMainExtDataHistoryObjectDataList getInvdMainExtDataHistoryObjectDataInvdMainExtDataHistoryFromInvdMainExtDataHistoryFind() {
    return InvdMainExtDataHistoryObjectHelper.fromMapList(outputMap, "InvdMainExtDataHistoryList");
  }
  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistoryObjectDataInvdMainExtDataHistoryFromInvdMainExtDataHistoryGet() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistoryObjectDataInvdMainExtDataHistoryFromInvdMainExtDataHistoryUpdate() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
  /**
   @deprecated
   */
  public void setInvdMainExtDataHistoryObjectFilter(InvdMainExtDataHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(data, new HashMap()).get("InvdMainExtDataHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainExtDataHistoryObjectData(InvdMainExtDataHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(data, new HashMap()).get("InvdMainExtDataHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainExtDataHistoryObjectKeyData(InvdMainExtDataHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(data, new HashMap()).get("InvdMainExtDataHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdMainExtDataHistoryObjectDataList getInvdMainExtDataHistoryObjectDataList() {
    return InvdMainExtDataHistoryObjectHelper.fromMapList(outputMap, "InvdMainExtDataHistoryList");
  }
  /**
   @deprecated
   */
  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistoryObjectData() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
}
