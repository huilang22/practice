/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstRequest.java
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
public final class WorkflowInstRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WorkflowInstRequest (String request, WorkflowInstRequestMethod method) {
    initialize(request, "WorkflowInst", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WorkflowInstRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWorkflowInstForWorkflowInstCreate(WorkflowInstObjectData data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(data, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
  public void setWorkflowInstForWorkflowInstFind(WorkflowInstObjectFilter data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(data, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
  public void setWorkflowInstForWorkflowInstGet(WorkflowInstObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectKeyHelper.toMap(data, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
  public void setWorkflowInstForWorkflowInstUpdate(WorkflowInstObjectData data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(data, new HashMap(), "WorkflowInst").get("WorkflowInst"));
    }
  }
  public WorkflowInstObjectData getWorkflowInstObjectDataWorkflowInstFromWorkflowInstCreate() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
  public WorkflowInstObjectDataList getWorkflowInstObjectDataWorkflowInstFromWorkflowInstFind() {
    return WorkflowInstObjectHelper.fromMapList(outputMap, "WorkflowInstList");
  }
  public WorkflowInstObjectData getWorkflowInstObjectDataWorkflowInstFromWorkflowInstGet() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
  public WorkflowInstObjectData getWorkflowInstObjectDataWorkflowInstFromWorkflowInstUpdate() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
  /**
   @deprecated
   */
  public void setWorkflowInstObjectFilter(WorkflowInstObjectFilter data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(data, new HashMap()).get("WorkflowInstObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowInstObjectData(WorkflowInstObjectData data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectHelper.toMap(data, new HashMap()).get("WorkflowInstObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowInstObjectKeyData(WorkflowInstObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowInst", WorkflowInstObjectKeyHelper.toMap(data, new HashMap()).get("WorkflowInstObject"));
    }
  }
  /**
   @deprecated
   */
  public WorkflowInstObjectDataList getWorkflowInstObjectDataList() {
    return WorkflowInstObjectHelper.fromMapList(outputMap, "WorkflowInstList");
  }
  /**
   @deprecated
   */
  public WorkflowInstObjectData getWorkflowInstObjectData() {
    return WorkflowInstObjectHelper.fromMap(outputMap, "WorkflowInst");
  }
}
