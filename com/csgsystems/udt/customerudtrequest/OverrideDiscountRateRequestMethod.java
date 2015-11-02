/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideDiscountRateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OverrideDiscountRateRequestMethod implements UdtMethod {
  private String method = null;
  private OverrideDiscountRateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OverrideDiscountRateCreate method */
  public static final OverrideDiscountRateRequestMethod OVERRIDE_DISCOUNT_RATE_CREATE = new OverrideDiscountRateRequestMethod("OverrideDiscountRateCreate");
  /** Variable representing the OverrideDiscountRateFind method */
  public static final OverrideDiscountRateRequestMethod OVERRIDE_DISCOUNT_RATE_FIND = new OverrideDiscountRateRequestMethod("OverrideDiscountRateFind");
  /** Variable representing the OverrideDiscountRateGet method */
  public static final OverrideDiscountRateRequestMethod OVERRIDE_DISCOUNT_RATE_GET = new OverrideDiscountRateRequestMethod("OverrideDiscountRateGet");
  /** Variable representing the OverrideDiscountRateUpdate method */
  public static final OverrideDiscountRateRequestMethod OVERRIDE_DISCOUNT_RATE_UPDATE = new OverrideDiscountRateRequestMethod("OverrideDiscountRateUpdate");
}
