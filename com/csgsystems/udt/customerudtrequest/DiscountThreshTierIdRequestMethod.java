/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscountThreshTierIdRequestMethod implements UdtMethod {
  private String method = null;
  private DiscountThreshTierIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscountThreshTierIdCreate method */
  public static final DiscountThreshTierIdRequestMethod DISCOUNT_THRESH_TIER_ID_CREATE = new DiscountThreshTierIdRequestMethod("DiscountThreshTierIdCreate");
  /** Variable representing the DiscountThreshTierIdDelete method */
  public static final DiscountThreshTierIdRequestMethod DISCOUNT_THRESH_TIER_ID_DELETE = new DiscountThreshTierIdRequestMethod("DiscountThreshTierIdDelete");
  /** Variable representing the DiscountThreshTierIdFind method */
  public static final DiscountThreshTierIdRequestMethod DISCOUNT_THRESH_TIER_ID_FIND = new DiscountThreshTierIdRequestMethod("DiscountThreshTierIdFind");
  /** Variable representing the DiscountThreshTierIdGet method */
  public static final DiscountThreshTierIdRequestMethod DISCOUNT_THRESH_TIER_ID_GET = new DiscountThreshTierIdRequestMethod("DiscountThreshTierIdGet");
  /** Variable representing the DiscountThreshTierIdUpdate method */
  public static final DiscountThreshTierIdRequestMethod DISCOUNT_THRESH_TIER_ID_UPDATE = new DiscountThreshTierIdRequestMethod("DiscountThreshTierIdUpdate");
}
