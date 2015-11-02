/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MilestoneInstRequestMethod implements UdtMethod {
  private String method = null;
  private MilestoneInstRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MilestoneInstCreate method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_CREATE = new MilestoneInstRequestMethod("MilestoneInstCreate");
  /** Variable representing the MilestoneInstFind method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_FIND = new MilestoneInstRequestMethod("MilestoneInstFind");
  /** Variable representing the MilestoneInstGet method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_GET = new MilestoneInstRequestMethod("MilestoneInstGet");
  /** Variable representing the MilestoneInstModify method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_MODIFY = new MilestoneInstRequestMethod("MilestoneInstModify");
  /** Variable representing the MilestoneInstRequeue method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_REQUEUE = new MilestoneInstRequestMethod("MilestoneInstRequeue");
  /** Variable representing the MilestoneInstUpdate method */
  public static final MilestoneInstRequestMethod MILESTONE_INST_UPDATE = new MilestoneInstRequestMethod("MilestoneInstUpdate");
}
