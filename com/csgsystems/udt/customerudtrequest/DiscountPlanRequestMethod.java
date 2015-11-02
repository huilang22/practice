/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscountPlanRequestMethod implements UdtMethod {
  private String method = null;
  private DiscountPlanRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscountPlanCreate method */
  public static final DiscountPlanRequestMethod DISCOUNT_PLAN_CREATE = new DiscountPlanRequestMethod("DiscountPlanCreate");
  /** Variable representing the DiscountPlanDelete method */
  public static final DiscountPlanRequestMethod DISCOUNT_PLAN_DELETE = new DiscountPlanRequestMethod("DiscountPlanDelete");
  /** Variable representing the DiscountPlanFind method */
  public static final DiscountPlanRequestMethod DISCOUNT_PLAN_FIND = new DiscountPlanRequestMethod("DiscountPlanFind");
  /** Variable representing the DiscountPlanGet method */
  public static final DiscountPlanRequestMethod DISCOUNT_PLAN_GET = new DiscountPlanRequestMethod("DiscountPlanGet");
  /** Variable representing the DiscountPlanUpdate method */
  public static final DiscountPlanRequestMethod DISCOUNT_PLAN_UPDATE = new DiscountPlanRequestMethod("DiscountPlanUpdate");
}
