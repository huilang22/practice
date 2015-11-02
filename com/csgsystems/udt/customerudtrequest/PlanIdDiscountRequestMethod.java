/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PlanIdDiscountRequestMethod implements UdtMethod {
  private String method = null;
  private PlanIdDiscountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PlanIdDiscountCreate method */
  public static final PlanIdDiscountRequestMethod PLAN_ID_DISCOUNT_CREATE = new PlanIdDiscountRequestMethod("PlanIdDiscountCreate");
  /** Variable representing the PlanIdDiscountDelete method */
  public static final PlanIdDiscountRequestMethod PLAN_ID_DISCOUNT_DELETE = new PlanIdDiscountRequestMethod("PlanIdDiscountDelete");
  /** Variable representing the PlanIdDiscountFind method */
  public static final PlanIdDiscountRequestMethod PLAN_ID_DISCOUNT_FIND = new PlanIdDiscountRequestMethod("PlanIdDiscountFind");
  /** Variable representing the PlanIdDiscountGet method */
  public static final PlanIdDiscountRequestMethod PLAN_ID_DISCOUNT_GET = new PlanIdDiscountRequestMethod("PlanIdDiscountGet");
  /** Variable representing the PlanIdDiscountUpdate method */
  public static final PlanIdDiscountRequestMethod PLAN_ID_DISCOUNT_UPDATE = new PlanIdDiscountRequestMethod("PlanIdDiscountUpdate");
}
