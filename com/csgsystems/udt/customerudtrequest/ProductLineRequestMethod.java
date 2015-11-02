/*
 * Generated code DO NOT EDIT
 * Generated file: ProductLineRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductLineRequestMethod implements UdtMethod {
  private String method = null;
  private ProductLineRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductLineCreate method */
  public static final ProductLineRequestMethod PRODUCT_LINE_CREATE = new ProductLineRequestMethod("ProductLineCreate");
  /** Variable representing the ProductLineDelete method */
  public static final ProductLineRequestMethod PRODUCT_LINE_DELETE = new ProductLineRequestMethod("ProductLineDelete");
  /** Variable representing the ProductLineFind method */
  public static final ProductLineRequestMethod PRODUCT_LINE_FIND = new ProductLineRequestMethod("ProductLineFind");
  /** Variable representing the ProductLineGet method */
  public static final ProductLineRequestMethod PRODUCT_LINE_GET = new ProductLineRequestMethod("ProductLineGet");
  /** Variable representing the ProductLineUpdate method */
  public static final ProductLineRequestMethod PRODUCT_LINE_UPDATE = new ProductLineRequestMethod("ProductLineUpdate");
}
