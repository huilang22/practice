/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class MilestoneRequestMethod implements UdtMethod {
  private String method = null;
  private MilestoneRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the MilestoneCreate method */
  public static final MilestoneRequestMethod MILESTONE_CREATE = new MilestoneRequestMethod("MilestoneCreate");
  /** Variable representing the MilestoneFind method */
  public static final MilestoneRequestMethod MILESTONE_FIND = new MilestoneRequestMethod("MilestoneFind");
  /** Variable representing the MilestoneGet method */
  public static final MilestoneRequestMethod MILESTONE_GET = new MilestoneRequestMethod("MilestoneGet");
  /** Variable representing the MilestoneUpdate method */
  public static final MilestoneRequestMethod MILESTONE_UPDATE = new MilestoneRequestMethod("MilestoneUpdate");
}
