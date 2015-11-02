/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WorkflowRequestMethod implements UdtMethod {
  private String method = null;
  private WorkflowRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WorkflowCreate method */
  public static final WorkflowRequestMethod WORKFLOW_CREATE = new WorkflowRequestMethod("WorkflowCreate");
  /** Variable representing the WorkflowFind method */
  public static final WorkflowRequestMethod WORKFLOW_FIND = new WorkflowRequestMethod("WorkflowFind");
  /** Variable representing the WorkflowGet method */
  public static final WorkflowRequestMethod WORKFLOW_GET = new WorkflowRequestMethod("WorkflowGet");
  /** Variable representing the WorkflowUpdate method */
  public static final WorkflowRequestMethod WORKFLOW_UPDATE = new WorkflowRequestMethod("WorkflowUpdate");
}
