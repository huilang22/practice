/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdCreditRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PlanIdCreditRequestMethod implements UdtMethod {
  private String method = null;
  private PlanIdCreditRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PlanIdCreditCreate method */
  public static final PlanIdCreditRequestMethod PLAN_ID_CREDIT_CREATE = new PlanIdCreditRequestMethod("PlanIdCreditCreate");
  /** Variable representing the PlanIdCreditFind method */
  public static final PlanIdCreditRequestMethod PLAN_ID_CREDIT_FIND = new PlanIdCreditRequestMethod("PlanIdCreditFind");
  /** Variable representing the PlanIdCreditGet method */
  public static final PlanIdCreditRequestMethod PLAN_ID_CREDIT_GET = new PlanIdCreditRequestMethod("PlanIdCreditGet");
  /** Variable representing the PlanIdCreditUpdate method */
  public static final PlanIdCreditRequestMethod PLAN_ID_CREDIT_UPDATE = new PlanIdCreditRequestMethod("PlanIdCreditUpdate");
}
