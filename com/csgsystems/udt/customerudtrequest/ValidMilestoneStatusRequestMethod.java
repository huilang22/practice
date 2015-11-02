/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ValidMilestoneStatusRequestMethod implements UdtMethod {
  private String method = null;
  private ValidMilestoneStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ValidMilestoneStatusCreate method */
  public static final ValidMilestoneStatusRequestMethod VALID_MILESTONE_STATUS_CREATE = new ValidMilestoneStatusRequestMethod("ValidMilestoneStatusCreate");
  /** Variable representing the ValidMilestoneStatusFind method */
  public static final ValidMilestoneStatusRequestMethod VALID_MILESTONE_STATUS_FIND = new ValidMilestoneStatusRequestMethod("ValidMilestoneStatusFind");
  /** Variable representing the ValidMilestoneStatusGet method */
  public static final ValidMilestoneStatusRequestMethod VALID_MILESTONE_STATUS_GET = new ValidMilestoneStatusRequestMethod("ValidMilestoneStatusGet");
  /** Variable representing the ValidMilestoneStatusUpdate method */
  public static final ValidMilestoneStatusRequestMethod VALID_MILESTONE_STATUS_UPDATE = new ValidMilestoneStatusRequestMethod("ValidMilestoneStatusUpdate");
}
