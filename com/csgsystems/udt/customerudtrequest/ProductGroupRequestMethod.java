/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductGroupRequestMethod implements UdtMethod {
  private String method = null;
  private ProductGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductGroupCreate method */
  public static final ProductGroupRequestMethod PRODUCT_GROUP_CREATE = new ProductGroupRequestMethod("ProductGroupCreate");
  /** Variable representing the ProductGroupDelete method */
  public static final ProductGroupRequestMethod PRODUCT_GROUP_DELETE = new ProductGroupRequestMethod("ProductGroupDelete");
  /** Variable representing the ProductGroupFind method */
  public static final ProductGroupRequestMethod PRODUCT_GROUP_FIND = new ProductGroupRequestMethod("ProductGroupFind");
  /** Variable representing the ProductGroupGet method */
  public static final ProductGroupRequestMethod PRODUCT_GROUP_GET = new ProductGroupRequestMethod("ProductGroupGet");
  /** Variable representing the ProductGroupUpdate method */
  public static final ProductGroupRequestMethod PRODUCT_GROUP_UPDATE = new ProductGroupRequestMethod("ProductGroupUpdate");
}
