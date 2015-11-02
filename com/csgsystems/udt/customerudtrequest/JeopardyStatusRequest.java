/*
 * Generated code DO NOT EDIT
 * Generated file: JeopardyStatusRequest.java
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

import com.csgsystems.we.data.*;
public final class JeopardyStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public JeopardyStatusRequest (String request, JeopardyStatusRequestMethod method) {
    initialize(request, "JeopardyStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (JeopardyStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setJeopardyStatusForJeopardyStatusCreate(JeopardyStatusObjectData data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(data, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
  public void setJeopardyStatusForJeopardyStatusFind(JeopardyStatusObjectFilter data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(data, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
  public void setJeopardyStatusForJeopardyStatusGet(JeopardyStatusObjectKeyData data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectKeyHelper.toMap(data, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
  public void setJeopardyStatusForJeopardyStatusUpdate(JeopardyStatusObjectData data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(data, new HashMap(), "JeopardyStatus").get("JeopardyStatus"));
    }
  }
  public JeopardyStatusObjectData getJeopardyStatusObjectDataJeopardyStatusFromJeopardyStatusCreate() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
  public JeopardyStatusObjectDataList getJeopardyStatusObjectDataJeopardyStatusFromJeopardyStatusFind() {
    return JeopardyStatusObjectHelper.fromMapList(outputMap, "JeopardyStatusList");
  }
  public JeopardyStatusObjectData getJeopardyStatusObjectDataJeopardyStatusFromJeopardyStatusGet() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
  public JeopardyStatusObjectData getJeopardyStatusObjectDataJeopardyStatusFromJeopardyStatusUpdate() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
  /**
   @deprecated
   */
  public void setJeopardyStatusObjectFilter(JeopardyStatusObjectFilter data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(data, new HashMap()).get("JeopardyStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setJeopardyStatusObjectData(JeopardyStatusObjectData data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectHelper.toMap(data, new HashMap()).get("JeopardyStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setJeopardyStatusObjectKeyData(JeopardyStatusObjectKeyData data) {
    if (data != null) {
      addInput("JeopardyStatus", JeopardyStatusObjectKeyHelper.toMap(data, new HashMap()).get("JeopardyStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public JeopardyStatusObjectDataList getJeopardyStatusObjectDataList() {
    return JeopardyStatusObjectHelper.fromMapList(outputMap, "JeopardyStatusList");
  }
  /**
   @deprecated
   */
  public JeopardyStatusObjectData getJeopardyStatusObjectData() {
    return JeopardyStatusObjectHelper.fromMap(outputMap, "JeopardyStatus");
  }
}
