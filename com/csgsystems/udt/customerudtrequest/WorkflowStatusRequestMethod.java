/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WorkflowStatusRequestMethod implements UdtMethod {
  private String method = null;
  private WorkflowStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WorkflowStatusCreate method */
  public static final WorkflowStatusRequestMethod WORKFLOW_STATUS_CREATE = new WorkflowStatusRequestMethod("WorkflowStatusCreate");
  /** Variable representing the WorkflowStatusFind method */
  public static final WorkflowStatusRequestMethod WORKFLOW_STATUS_FIND = new WorkflowStatusRequestMethod("WorkflowStatusFind");
  /** Variable representing the WorkflowStatusGet method */
  public static final WorkflowStatusRequestMethod WORKFLOW_STATUS_GET = new WorkflowStatusRequestMethod("WorkflowStatusGet");
  /** Variable representing the WorkflowStatusUpdate method */
  public static final WorkflowStatusRequestMethod WORKFLOW_STATUS_UPDATE = new WorkflowStatusRequestMethod("WorkflowStatusUpdate");
}
