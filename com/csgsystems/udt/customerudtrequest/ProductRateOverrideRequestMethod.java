/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductRateOverrideRequestMethod implements UdtMethod {
  private String method = null;
  private ProductRateOverrideRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductRateOverrideCreate method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_CREATE = new ProductRateOverrideRequestMethod("ProductRateOverrideCreate");
  /** Variable representing the ProductRateOverrideDelete method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_DELETE = new ProductRateOverrideRequestMethod("ProductRateOverrideDelete");
  /** Variable representing the ProductRateOverrideDeleteList method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_DELETE_LIST = new ProductRateOverrideRequestMethod("ProductRateOverrideDeleteList");
  /** Variable representing the ProductRateOverrideFind method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_FIND = new ProductRateOverrideRequestMethod("ProductRateOverrideFind");
  /** Variable representing the ProductRateOverrideGet method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_GET = new ProductRateOverrideRequestMethod("ProductRateOverrideGet");
  /** Variable representing the ProductRateOverrideUpdate method */
  public static final ProductRateOverrideRequestMethod PRODUCT_RATE_OVERRIDE_UPDATE = new ProductRateOverrideRequestMethod("ProductRateOverrideUpdate");
}
