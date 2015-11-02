/*
 * Generated code DO NOT EDIT
 * Generated file: ProductChargeMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductChargeMapRequestMethod implements UdtMethod {
  private String method = null;
  private ProductChargeMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductChargeMapCreate method */
  public static final ProductChargeMapRequestMethod PRODUCT_CHARGE_MAP_CREATE = new ProductChargeMapRequestMethod("ProductChargeMapCreate");
  /** Variable representing the ProductChargeMapFind method */
  public static final ProductChargeMapRequestMethod PRODUCT_CHARGE_MAP_FIND = new ProductChargeMapRequestMethod("ProductChargeMapFind");
  /** Variable representing the ProductChargeMapGet method */
  public static final ProductChargeMapRequestMethod PRODUCT_CHARGE_MAP_GET = new ProductChargeMapRequestMethod("ProductChargeMapGet");
  /** Variable representing the ProductChargeMapUpdate method */
  public static final ProductChargeMapRequestMethod PRODUCT_CHARGE_MAP_UPDATE = new ProductChargeMapRequestMethod("ProductChargeMapUpdate");
}
