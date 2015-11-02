/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobHistoryRequest.java
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
public final class InvJobHistoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvJobHistoryRequest (String request, InvJobHistoryRequestMethod method) {
    initialize(request, "InvJobHistory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvJobHistoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvJobHistoryForInvJobHistoryDelete(InvJobHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(data, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }
  public void setInvJobHistoryForInvJobHistoryFind(InvJobHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(data, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }
  public void setInvJobHistoryForInvJobHistoryGet(InvJobHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvJobHistory", InvJobHistoryObjectKeyHelper.toMap(data, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }
  public InvJobHistoryObjectDataList getInvJobHistoryObjectDataInvJobHistoryFromInvJobHistoryFind() {
    return InvJobHistoryObjectHelper.fromMapList(outputMap, "InvJobHistoryList");
  }
  public InvJobHistoryObjectData getInvJobHistoryObjectDataInvJobHistoryFromInvJobHistoryGet() {
    return InvJobHistoryObjectHelper.fromMap(outputMap, "InvJobHistory");
  }
  /**
   @deprecated
   */
  public void setInvJobHistoryObjectFilter(InvJobHistoryObjectFilter data) {
    if (data != null) {
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(data, new HashMap()).get("InvJobHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvJobHistoryObjectKeyData(InvJobHistoryObjectKeyData data) {
    if (data != null) {
      addInput("InvJobHistory", InvJobHistoryObjectKeyHelper.toMap(data, new HashMap()).get("InvJobHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public InvJobHistoryObjectDataList getInvJobHistoryObjectDataList() {
    return InvJobHistoryObjectHelper.fromMapList(outputMap, "InvJobHistoryList");
  }
  /**
   @deprecated
   */
  public InvJobHistoryObjectData getInvJobHistoryObjectData() {
    return InvJobHistoryObjectHelper.fromMap(outputMap, "InvJobHistory");
  }
}
