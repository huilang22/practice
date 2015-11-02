/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrPlanRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnitCrPlanRequestMethod implements UdtMethod {
  private String method = null;
  private UnitCrPlanRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnitCrPlanCreate method */
  public static final UnitCrPlanRequestMethod UNIT_CR_PLAN_CREATE = new UnitCrPlanRequestMethod("UnitCrPlanCreate");
  /** Variable representing the UnitCrPlanFind method */
  public static final UnitCrPlanRequestMethod UNIT_CR_PLAN_FIND = new UnitCrPlanRequestMethod("UnitCrPlanFind");
  /** Variable representing the UnitCrPlanGet method */
  public static final UnitCrPlanRequestMethod UNIT_CR_PLAN_GET = new UnitCrPlanRequestMethod("UnitCrPlanGet");
  /** Variable representing the UnitCrPlanUpdate method */
  public static final UnitCrPlanRequestMethod UNIT_CR_PLAN_UPDATE = new UnitCrPlanRequestMethod("UnitCrPlanUpdate");
}
