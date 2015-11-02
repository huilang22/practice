/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowTransRequest.java
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
public final class WorkflowTransRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WorkflowTransRequest (String request, WorkflowTransRequestMethod method) {
    initialize(request, "WorkflowTrans", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WorkflowTransRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWorkflowTransForWorkflowTransCreate(WorkflowTransObjectData data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(data, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
  public void setWorkflowTransForWorkflowTransFind(WorkflowTransObjectFilter data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(data, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
  public void setWorkflowTransForWorkflowTransGet(WorkflowTransObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectKeyHelper.toMap(data, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
  public void setWorkflowTransForWorkflowTransUpdate(WorkflowTransObjectData data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(data, new HashMap(), "WorkflowTrans").get("WorkflowTrans"));
    }
  }
  public WorkflowTransObjectData getWorkflowTransObjectDataWorkflowTransFromWorkflowTransCreate() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
  public WorkflowTransObjectDataList getWorkflowTransObjectDataWorkflowTransFromWorkflowTransFind() {
    return WorkflowTransObjectHelper.fromMapList(outputMap, "WorkflowTransList");
  }
  public WorkflowTransObjectData getWorkflowTransObjectDataWorkflowTransFromWorkflowTransGet() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
  public WorkflowTransObjectData getWorkflowTransObjectDataWorkflowTransFromWorkflowTransUpdate() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
  /**
   @deprecated
   */
  public void setWorkflowTransObjectFilter(WorkflowTransObjectFilter data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(data, new HashMap()).get("WorkflowTransObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowTransObjectData(WorkflowTransObjectData data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectHelper.toMap(data, new HashMap()).get("WorkflowTransObject"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkflowTransObjectKeyData(WorkflowTransObjectKeyData data) {
    if (data != null) {
      addInput("WorkflowTrans", WorkflowTransObjectKeyHelper.toMap(data, new HashMap()).get("WorkflowTransObject"));
    }
  }
  /**
   @deprecated
   */
  public WorkflowTransObjectDataList getWorkflowTransObjectDataList() {
    return WorkflowTransObjectHelper.fromMapList(outputMap, "WorkflowTransList");
  }
  /**
   @deprecated
   */
  public WorkflowTransObjectData getWorkflowTransObjectData() {
    return WorkflowTransObjectHelper.fromMap(outputMap, "WorkflowTrans");
  }
}
