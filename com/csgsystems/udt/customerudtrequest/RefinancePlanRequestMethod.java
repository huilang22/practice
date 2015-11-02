/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RefinancePlanRequestMethod implements UdtMethod {
  private String method = null;
  private RefinancePlanRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RefinancePlanFind method */
  public static final RefinancePlanRequestMethod REFINANCE_PLAN_FIND = new RefinancePlanRequestMethod("RefinancePlanFind");
  /** Variable representing the RefinancePlanGet method */
  public static final RefinancePlanRequestMethod REFINANCE_PLAN_GET = new RefinancePlanRequestMethod("RefinancePlanGet");
}
