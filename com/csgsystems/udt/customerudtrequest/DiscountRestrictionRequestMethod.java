/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountRestrictionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DiscountRestrictionRequestMethod implements UdtMethod {
  private String method = null;
  private DiscountRestrictionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DiscountRestrictionCreate method */
  public static final DiscountRestrictionRequestMethod DISCOUNT_RESTRICTION_CREATE = new DiscountRestrictionRequestMethod("DiscountRestrictionCreate");
  /** Variable representing the DiscountRestrictionDelete method */
  public static final DiscountRestrictionRequestMethod DISCOUNT_RESTRICTION_DELETE = new DiscountRestrictionRequestMethod("DiscountRestrictionDelete");
  /** Variable representing the DiscountRestrictionFind method */
  public static final DiscountRestrictionRequestMethod DISCOUNT_RESTRICTION_FIND = new DiscountRestrictionRequestMethod("DiscountRestrictionFind");
  /** Variable representing the DiscountRestrictionGet method */
  public static final DiscountRestrictionRequestMethod DISCOUNT_RESTRICTION_GET = new DiscountRestrictionRequestMethod("DiscountRestrictionGet");
  /** Variable representing the DiscountRestrictionUpdate method */
  public static final DiscountRestrictionRequestMethod DISCOUNT_RESTRICTION_UPDATE = new DiscountRestrictionRequestMethod("DiscountRestrictionUpdate");
}
