/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstHstryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MilestoneInstHstryRequestMethod implements UdtMethod {
  private String method = null;
  private MilestoneInstHstryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MilestoneInstHstryCreate method */
  public static final MilestoneInstHstryRequestMethod MILESTONE_INST_HSTRY_CREATE = new MilestoneInstHstryRequestMethod("MilestoneInstHstryCreate");
  /** Variable representing the MilestoneInstHstryFind method */
  public static final MilestoneInstHstryRequestMethod MILESTONE_INST_HSTRY_FIND = new MilestoneInstHstryRequestMethod("MilestoneInstHstryFind");
  /** Variable representing the MilestoneInstHstryGet method */
  public static final MilestoneInstHstryRequestMethod MILESTONE_INST_HSTRY_GET = new MilestoneInstHstryRequestMethod("MilestoneInstHstryGet");
  /** Variable representing the MilestoneInstHstryUpdate method */
  public static final MilestoneInstHstryRequestMethod MILESTONE_INST_HSTRY_UPDATE = new MilestoneInstHstryRequestMethod("MilestoneInstHstryUpdate");
}
