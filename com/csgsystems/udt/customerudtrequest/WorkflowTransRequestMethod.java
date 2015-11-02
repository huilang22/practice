/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowTransRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WorkflowTransRequestMethod implements UdtMethod {
  private String method = null;
  private WorkflowTransRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WorkflowTransCreate method */
  public static final WorkflowTransRequestMethod WORKFLOW_TRANS_CREATE = new WorkflowTransRequestMethod("WorkflowTransCreate");
  /** Variable representing the WorkflowTransFind method */
  public static final WorkflowTransRequestMethod WORKFLOW_TRANS_FIND = new WorkflowTransRequestMethod("WorkflowTransFind");
  /** Variable representing the WorkflowTransGet method */
  public static final WorkflowTransRequestMethod WORKFLOW_TRANS_GET = new WorkflowTransRequestMethod("WorkflowTransGet");
  /** Variable representing the WorkflowTransUpdate method */
  public static final WorkflowTransRequestMethod WORKFLOW_TRANS_UPDATE = new WorkflowTransRequestMethod("WorkflowTransUpdate");
}
