/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductGroupServiceFilterRequestMethod implements UdtMethod {
  private String method = null;
  private ProductGroupServiceFilterRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductGroupServiceFilterCreate method */
  public static final ProductGroupServiceFilterRequestMethod PRODUCT_GROUP_SERVICE_FILTER_CREATE = new ProductGroupServiceFilterRequestMethod("ProductGroupServiceFilterCreate");
  /** Variable representing the ProductGroupServiceFilterDelete method */
  public static final ProductGroupServiceFilterRequestMethod PRODUCT_GROUP_SERVICE_FILTER_DELETE = new ProductGroupServiceFilterRequestMethod("ProductGroupServiceFilterDelete");
  /** Variable representing the ProductGroupServiceFilterFind method */
  public static final ProductGroupServiceFilterRequestMethod PRODUCT_GROUP_SERVICE_FILTER_FIND = new ProductGroupServiceFilterRequestMethod("ProductGroupServiceFilterFind");
  /** Variable representing the ProductGroupServiceFilterGet method */
  public static final ProductGroupServiceFilterRequestMethod PRODUCT_GROUP_SERVICE_FILTER_GET = new ProductGroupServiceFilterRequestMethod("ProductGroupServiceFilterGet");
  /** Variable representing the ProductGroupServiceFilterUpdate method */
  public static final ProductGroupServiceFilterRequestMethod PRODUCT_GROUP_SERVICE_FILTER_UPDATE = new ProductGroupServiceFilterRequestMethod("ProductGroupServiceFilterUpdate");
}
