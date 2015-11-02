/*
 * Generated code DO NOT EDIT
 * Generated file: WorkflowInstRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class WorkflowInstRequestMethod implements UdtMethod {
  private String method = null;
  private WorkflowInstRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the WorkflowInstCreate method */
  public static final WorkflowInstRequestMethod WORKFLOW_INST_CREATE = new WorkflowInstRequestMethod("WorkflowInstCreate");
  /** Variable representing the WorkflowInstFind method */
  public static final WorkflowInstRequestMethod WORKFLOW_INST_FIND = new WorkflowInstRequestMethod("WorkflowInstFind");
  /** Variable representing the WorkflowInstGet method */
  public static final WorkflowInstRequestMethod WORKFLOW_INST_GET = new WorkflowInstRequestMethod("WorkflowInstGet");
  /** Variable representing the WorkflowInstUpdate method */
  public static final WorkflowInstRequestMethod WORKFLOW_INST_UPDATE = new WorkflowInstRequestMethod("WorkflowInstUpdate");
}
