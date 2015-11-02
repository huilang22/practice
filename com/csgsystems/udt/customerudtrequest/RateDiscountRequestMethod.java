/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RateDiscountRequestMethod implements UdtMethod {
  private String method = null;
  private RateDiscountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RateDiscountCreate method */
  public static final RateDiscountRequestMethod RATE_DISCOUNT_CREATE = new RateDiscountRequestMethod("RateDiscountCreate");
  /** Variable representing the RateDiscountDelete method */
  public static final RateDiscountRequestMethod RATE_DISCOUNT_DELETE = new RateDiscountRequestMethod("RateDiscountDelete");
  /** Variable representing the RateDiscountFind method */
  public static final RateDiscountRequestMethod RATE_DISCOUNT_FIND = new RateDiscountRequestMethod("RateDiscountFind");
  /** Variable representing the RateDiscountGet method */
  public static final RateDiscountRequestMethod RATE_DISCOUNT_GET = new RateDiscountRequestMethod("RateDiscountGet");
  /** Variable representing the RateDiscountUpdate method */
  public static final RateDiscountRequestMethod RATE_DISCOUNT_UPDATE = new RateDiscountRequestMethod("RateDiscountUpdate");
}
