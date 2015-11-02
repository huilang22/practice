/*
 * Generated code DO NOT EDIT
 * Generated file: InvsStatusRequest.java
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
public final class InvsStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsStatusRequest (String request, InvsStatusRequestMethod method) {
    initialize(request, "InvsStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsStatusForInvsStatusCreate(InvsStatusObjectData data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(data, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
  public void setInvsStatusForInvsStatusFind(InvsStatusObjectFilter data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(data, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
  public void setInvsStatusForInvsStatusGet(InvsStatusObjectKeyData data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectKeyHelper.toMap(data, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
  public void setInvsStatusForInvsStatusUpdate(InvsStatusObjectData data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(data, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }
  public InvsStatusObjectData getInvsStatusObjectDataInvsStatusFromInvsStatusCreate() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
  public InvsStatusObjectDataList getInvsStatusObjectDataInvsStatusFromInvsStatusFind() {
    return InvsStatusObjectHelper.fromMapList(outputMap, "InvsStatusList");
  }
  public InvsStatusObjectData getInvsStatusObjectDataInvsStatusFromInvsStatusGet() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
  public InvsStatusObjectData getInvsStatusObjectDataInvsStatusFromInvsStatusUpdate() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
  /**
   @deprecated
   */
  public void setInvsStatusObjectFilter(InvsStatusObjectFilter data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(data, new HashMap()).get("InvsStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStatusObjectData(InvsStatusObjectData data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(data, new HashMap()).get("InvsStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsStatusObjectKeyData(InvsStatusObjectKeyData data) {
    if (data != null) {
      addInput("InvsStatus", InvsStatusObjectKeyHelper.toMap(data, new HashMap()).get("InvsStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsStatusObjectDataList getInvsStatusObjectDataList() {
    return InvsStatusObjectHelper.fromMapList(outputMap, "InvsStatusList");
  }
  /**
   @deprecated
   */
  public InvsStatusObjectData getInvsStatusObjectData() {
    return InvsStatusObjectHelper.fromMap(outputMap, "InvsStatus");
  }
}
