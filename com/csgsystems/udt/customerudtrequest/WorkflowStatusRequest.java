/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowStatusRequest.java
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
public final class WorkflowStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WorkflowStatusRequest (String request, WorkflowStatusRequestMethod method) {
    initialize(request, "WorkflowStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WorkflowStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWorkflowStatusForWorkflowStatusCreate(WorkflowStatusObjectData data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(data, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
  public void setWorkflowStatusForWorkflowStatusFind(WorkflowStatusObjectFilter data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(data, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
  public void setWorkflowStatusForWorkflowStatusGet(WorkflowStatusObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectKeyHelper.toMap(data, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
  public void setWorkflowStatusForWorkflowStatusUpdate(WorkflowStatusObjectData data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(data, new HashMap(), "WorkflowStatus").get("WorkflowStatus"));
    }
  }
  public WorkflowStatusObjectData getWorkflowStatusObjectDataWorkflowStatusFromWorkflowStatusCreate() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
  public WorkflowStatusObjectDataList getWorkflowStatusObjectDataWorkflowStatusFromWorkflowStatusFind() {
    return WorkflowStatusObjectHelper.fromMapList(outputMap, "WorkflowStatusList");
  }
  public WorkflowStatusObjectData getWorkflowStatusObjectDataWorkflowStatusFromWorkflowStatusGet() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
  public WorkflowStatusObjectData getWorkflowStatusObjectDataWorkflowStatusFromWorkflowStatusUpdate() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
  /**
   @deprecated
   */
  public void setWorkflowStatusObjectFilter(WorkflowStatusObjectFilter data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(data, new HashMap()).get("WorkflowStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowStatusObjectData(WorkflowStatusObjectData data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectHelper.toMap(data, new HashMap()).get("WorkflowStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowStatusObjectKeyData(WorkflowStatusObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowStatus", WorkflowStatusObjectKeyHelper.toMap(data, new HashMap()).get("WorkflowStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public WorkflowStatusObjectDataList getWorkflowStatusObjectDataList() {
    return WorkflowStatusObjectHelper.fromMapList(outputMap, "WorkflowStatusList");
  }
  /**
   @deprecated
   */
  public WorkflowStatusObjectData getWorkflowStatusObjectData() {
    return WorkflowStatusObjectHelper.fromMap(outputMap, "WorkflowStatus");
  }
}
