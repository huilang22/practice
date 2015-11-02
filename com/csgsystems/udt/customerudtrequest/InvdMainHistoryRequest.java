/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryRequest.java
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
public final class InvdMainHistoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdMainHistoryRequest (String request, InvdMainHistoryRequestMethod method) {
    initialize(request, "InvdMainHistory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdMainHistoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdMainHistoryForInvdMainHistoryCreate(InvdMainHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
  public void setInvdMainHistoryForInvdMainHistoryDelete(InvdMainHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(data, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
  public void setInvdMainHistoryForInvdMainHistoryFind(InvdMainHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
  public void setInvdMainHistoryForInvdMainHistoryGet(InvdMainHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(data, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
  public void setInvdMainHistoryForInvdMainHistoryUpdate(InvdMainHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(data, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
  public InvdMainHistoryObjectData getInvdMainHistoryObjectDataInvdMainHistoryFromInvdMainHistoryCreate() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
  public InvdMainHistoryObjectDataList getInvdMainHistoryObjectDataInvdMainHistoryFromInvdMainHistoryFind() {
    return InvdMainHistoryObjectHelper.fromMapList(outputMap, "InvdMainHistoryList");
  }
  public InvdMainHistoryObjectData getInvdMainHistoryObjectDataInvdMainHistoryFromInvdMainHistoryGet() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
  public InvdMainHistoryObjectData getInvdMainHistoryObjectDataInvdMainHistoryFromInvdMainHistoryUpdate() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
  /**
   @deprecated
   */
  public void setInvdMainHistoryObjectFilter(InvdMainHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(data, new HashMap()).get("InvdMainHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainHistoryObjectData(InvdMainHistoryObjectData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(data, new HashMap()).get("InvdMainHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainHistoryObjectKeyData(InvdMainHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(data, new HashMap()).get("InvdMainHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdMainHistoryObjectDataList getInvdMainHistoryObjectDataList() {
    return InvdMainHistoryObjectHelper.fromMapList(outputMap, "InvdMainHistoryList");
  }
  /**
   @deprecated
   */
  public InvdMainHistoryObjectData getInvdMainHistoryObjectData() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
}
