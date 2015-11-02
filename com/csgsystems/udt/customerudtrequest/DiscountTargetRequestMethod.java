/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountTargetRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscountTargetRequestMethod implements UdtMethod {
  private String method = null;
  private DiscountTargetRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscountTargetCreate method */
  public static final DiscountTargetRequestMethod DISCOUNT_TARGET_CREATE = new DiscountTargetRequestMethod("DiscountTargetCreate");
  /** Variable representing the DiscountTargetDelete method */
  public static final DiscountTargetRequestMethod DISCOUNT_TARGET_DELETE = new DiscountTargetRequestMethod("DiscountTargetDelete");
  /** Variable representing the DiscountTargetFind method */
  public static final DiscountTargetRequestMethod DISCOUNT_TARGET_FIND = new DiscountTargetRequestMethod("DiscountTargetFind");
  /** Variable representing the DiscountTargetGet method */
  public static final DiscountTargetRequestMethod DISCOUNT_TARGET_GET = new DiscountTargetRequestMethod("DiscountTargetGet");
  /** Variable representing the DiscountTargetUpdate method */
  public static final DiscountTargetRequestMethod DISCOUNT_TARGET_UPDATE = new DiscountTargetRequestMethod("DiscountTargetUpdate");
}
