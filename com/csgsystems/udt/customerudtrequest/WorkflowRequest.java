/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowRequest.java
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
public final class WorkflowRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WorkflowRequest (String request, WorkflowRequestMethod method) {
    initialize(request, "Workflow", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WorkflowRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWorkflowForWorkflowCreate(WorkflowObjectData data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(data, new HashMap(), "Workflow").get("Workflow"));
    }
  }
  public void setWorkflowForWorkflowFind(WorkflowObjectFilter data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(data, new HashMap(), "Workflow").get("Workflow"));
    }
  }
  public void setWorkflowForWorkflowGet(WorkflowObjectKeyData data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectKeyHelper.toMap(data, new HashMap(), "Workflow").get("Workflow"));
    }
  }
  public void setWorkflowForWorkflowUpdate(WorkflowObjectData data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(data, new HashMap(), "Workflow").get("Workflow"));
    }
  }
  public WorkflowObjectData getWorkflowObjectDataWorkflowFromWorkflowCreate() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
  public WorkflowObjectDataList getWorkflowObjectDataWorkflowFromWorkflowFind() {
    return WorkflowObjectHelper.fromMapList(outputMap, "WorkflowList");
  }
  public WorkflowObjectData getWorkflowObjectDataWorkflowFromWorkflowGet() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
  public WorkflowObjectData getWorkflowObjectDataWorkflowFromWorkflowUpdate() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
  /**
   @deprecated
   */
  public void setWorkflowObjectFilter(WorkflowObjectFilter data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(data, new HashMap()).get("WorkflowObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowObjectData(WorkflowObjectData data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectHelper.toMap(data, new HashMap()).get("WorkflowObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowObjectKeyData(WorkflowObjectKeyData data) {
    if (data != null) {
      addInput("Workflow", WorkflowObjectKeyHelper.toMap(data, new HashMap()).get("WorkflowObject"));
    }
  }
  /**
   @deprecated
   */
  public WorkflowObjectDataList getWorkflowObjectDataList() {
    return WorkflowObjectHelper.fromMapList(outputMap, "WorkflowList");
  }
  /**
   @deprecated
   */
  public WorkflowObjectData getWorkflowObjectData() {
    return WorkflowObjectHelper.fromMap(outputMap, "Workflow");
  }
}
