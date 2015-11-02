/*
 * Generated code DO NOT EDIT
 * Generated file: ProductJurisdictionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductJurisdictionRequestMethod implements UdtMethod {
  private String method = null;
  private ProductJurisdictionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductJurisdictionCreate method */
  public static final ProductJurisdictionRequestMethod PRODUCT_JURISDICTION_CREATE = new ProductJurisdictionRequestMethod("ProductJurisdictionCreate");
  /** Variable representing the ProductJurisdictionFind method */
  public static final ProductJurisdictionRequestMethod PRODUCT_JURISDICTION_FIND = new ProductJurisdictionRequestMethod("ProductJurisdictionFind");
  /** Variable representing the ProductJurisdictionGet method */
  public static final ProductJurisdictionRequestMethod PRODUCT_JURISDICTION_GET = new ProductJurisdictionRequestMethod("ProductJurisdictionGet");
  /** Variable representing the ProductJurisdictionUpdate method */
  public static final ProductJurisdictionRequestMethod PRODUCT_JURISDICTION_UPDATE = new ProductJurisdictionRequestMethod("ProductJurisdictionUpdate");
}
