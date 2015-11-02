/*
 * Generated code DO NOT EDIT
 * Generated file: InvHistoryRequest.java
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
public final class InvHistoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvHistoryRequest (String request, InvHistoryRequestMethod method) {
    initialize(request, "InvHistory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvHistoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvHistoryForInvHistoryCreate(InvMainObjectData data) {
    if (data != null) {
      addInput("InvHistory", InvMainObjectHelper.toMap(data, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }
  public void setInvHistoryForInvHistoryFind(InvHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvHistory", InvHistoryObjectHelper.toMap(data, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }
  public InvHistoryObjectData getInvHistoryObjectDataInvHistoryFromInvHistoryCreate() {
    return InvHistoryObjectHelper.fromMap(outputMap, "InvHistory");
  }
  public InvHistoryObjectDataList getInvHistoryObjectDataInvHistoryFromInvHistoryFind() {
    return InvHistoryObjectHelper.fromMapList(outputMap, "InvHistoryList");
  }
  /**
   @deprecated
   */
  public void setInvHistoryObjectFilter(InvHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvHistory", InvHistoryObjectHelper.toMap(data, new HashMap()).get("InvHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public InvHistoryObjectDataList getInvHistoryObjectDataList() {
    return InvHistoryObjectHelper.fromMapList(outputMap, "InvHistoryList");
  }
  /**
   @deprecated
   */
  public Map  getInvHistoryObjectExtendedData() {
    return InvHistoryObjectHelper.fromMap(outputMap, "InvHistory").extendedData;
  }
  
  /**
   @deprecated
   */
  public InvHistoryObjectData getInvHistoryObjectData() {
    return InvHistoryObjectHelper.fromMap(outputMap, "InvHistory");
  }
  /**
   @deprecated
   */
  public void setInvMainObjectData(InvMainObjectData data) {
    if (data != null) {
      addInput("InvHistory", InvMainObjectHelper.toMap(data, new HashMap()).get("InvMainObject"));
    }
  }
}
