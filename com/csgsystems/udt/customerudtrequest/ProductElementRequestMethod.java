/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductElementRequestMethod implements UdtMethod {
  private String method = null;
  private ProductElementRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductElementCreate method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_CREATE = new ProductElementRequestMethod("ProductElementCreate");
  /** Variable representing the ProductElementDelete method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_DELETE = new ProductElementRequestMethod("ProductElementDelete");
  /** Variable representing the ProductElementFind method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_FIND = new ProductElementRequestMethod("ProductElementFind");
  /** Variable representing the ProductElementFindByAccount method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_FIND_BY_ACCOUNT = new ProductElementRequestMethod("ProductElementFindByAccount");
  /** Variable representing the ProductElementFindByService method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_FIND_BY_SERVICE = new ProductElementRequestMethod("ProductElementFindByService");
  /** Variable representing the ProductElementGet method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_GET = new ProductElementRequestMethod("ProductElementGet");
  /** Variable representing the ProductElementRate method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_RATE = new ProductElementRequestMethod("ProductElementRate");
  /** Variable representing the ProductElementUpdate method */
  public static final ProductElementRequestMethod PRODUCT_ELEMENT_UPDATE = new ProductElementRequestMethod("ProductElementUpdate");
}
