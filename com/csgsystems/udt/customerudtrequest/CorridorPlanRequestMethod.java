/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CorridorPlanRequestMethod implements UdtMethod {
  private String method = null;
  private CorridorPlanRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CorridorPlanCreate method */
  public static final CorridorPlanRequestMethod CORRIDOR_PLAN_CREATE = new CorridorPlanRequestMethod("CorridorPlanCreate");
  /** Variable representing the CorridorPlanDelete method */
  public static final CorridorPlanRequestMethod CORRIDOR_PLAN_DELETE = new CorridorPlanRequestMethod("CorridorPlanDelete");
  /** Variable representing the CorridorPlanFind method */
  public static final CorridorPlanRequestMethod CORRIDOR_PLAN_FIND = new CorridorPlanRequestMethod("CorridorPlanFind");
  /** Variable representing the CorridorPlanGet method */
  public static final CorridorPlanRequestMethod CORRIDOR_PLAN_GET = new CorridorPlanRequestMethod("CorridorPlanGet");
  /** Variable representing the CorridorPlanUpdate method */
  public static final CorridorPlanRequestMethod CORRIDOR_PLAN_UPDATE = new CorridorPlanRequestMethod("CorridorPlanUpdate");
}
