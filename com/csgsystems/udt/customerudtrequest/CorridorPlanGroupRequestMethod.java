/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorPlanGroupRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorPlanGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorPlanGroupCreate method */
  public static final CorridorPlanGroupRequestMethod CORRIDOR_PLAN_GROUP_CREATE = new CorridorPlanGroupRequestMethod("CorridorPlanGroupCreate");
  /** Variable representing the CorridorPlanGroupDelete method */
  public static final CorridorPlanGroupRequestMethod CORRIDOR_PLAN_GROUP_DELETE = new CorridorPlanGroupRequestMethod("CorridorPlanGroupDelete");
  /** Variable representing the CorridorPlanGroupFind method */
  public static final CorridorPlanGroupRequestMethod CORRIDOR_PLAN_GROUP_FIND = new CorridorPlanGroupRequestMethod("CorridorPlanGroupFind");
  /** Variable representing the CorridorPlanGroupGet method */
  public static final CorridorPlanGroupRequestMethod CORRIDOR_PLAN_GROUP_GET = new CorridorPlanGroupRequestMethod("CorridorPlanGroupGet");
}
