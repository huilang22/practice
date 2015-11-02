/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorPlanIdRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorPlanIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorPlanIdCreate method */
  public static final CorridorPlanIdRequestMethod CORRIDOR_PLAN_ID_CREATE = new CorridorPlanIdRequestMethod("CorridorPlanIdCreate");
  /** Variable representing the CorridorPlanIdFind method */
  public static final CorridorPlanIdRequestMethod CORRIDOR_PLAN_ID_FIND = new CorridorPlanIdRequestMethod("CorridorPlanIdFind");
  /** Variable representing the CorridorPlanIdGet method */
  public static final CorridorPlanIdRequestMethod CORRIDOR_PLAN_ID_GET = new CorridorPlanIdRequestMethod("CorridorPlanIdGet");
  /** Variable representing the CorridorPlanIdUpdate method */
  public static final CorridorPlanIdRequestMethod CORRIDOR_PLAN_ID_UPDATE = new CorridorPlanIdRequestMethod("CorridorPlanIdUpdate");
}
