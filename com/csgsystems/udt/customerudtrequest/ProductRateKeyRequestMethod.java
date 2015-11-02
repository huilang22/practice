/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductRateKeyRequestMethod implements UdtMethod {
  private String method = null;
  private ProductRateKeyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductRateKeyCreate method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_CREATE = new ProductRateKeyRequestMethod("ProductRateKeyCreate");
  /** Variable representing the ProductRateKeyDelete method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_DELETE = new ProductRateKeyRequestMethod("ProductRateKeyDelete");
  /** Variable representing the ProductRateKeyDeleteList method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_DELETE_LIST = new ProductRateKeyRequestMethod("ProductRateKeyDeleteList");
  /** Variable representing the ProductRateKeyFind method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_FIND = new ProductRateKeyRequestMethod("ProductRateKeyFind");
  /** Variable representing the ProductRateKeyGet method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_GET = new ProductRateKeyRequestMethod("ProductRateKeyGet");
  /** Variable representing the ProductRateKeyJurisdictionDerive method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_JURISDICTION_DERIVE = new ProductRateKeyRequestMethod("ProductRateKeyJurisdictionDerive");
  /** Variable representing the ProductRateKeyUpdate method */
  public static final ProductRateKeyRequestMethod PRODUCT_RATE_KEY_UPDATE = new ProductRateKeyRequestMethod("ProductRateKeyUpdate");
}
