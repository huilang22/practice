/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MilestoneStatusRequestMethod implements UdtMethod {
  private String method = null;
  private MilestoneStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MilestoneStatusCreate method */
  public static final MilestoneStatusRequestMethod MILESTONE_STATUS_CREATE = new MilestoneStatusRequestMethod("MilestoneStatusCreate");
  /** Variable representing the MilestoneStatusFind method */
  public static final MilestoneStatusRequestMethod MILESTONE_STATUS_FIND = new MilestoneStatusRequestMethod("MilestoneStatusFind");
  /** Variable representing the MilestoneStatusGet method */
  public static final MilestoneStatusRequestMethod MILESTONE_STATUS_GET = new MilestoneStatusRequestMethod("MilestoneStatusGet");
  /** Variable representing the MilestoneStatusUpdate method */
  public static final MilestoneStatusRequestMethod MILESTONE_STATUS_UPDATE = new MilestoneStatusRequestMethod("MilestoneStatusUpdate");
}
