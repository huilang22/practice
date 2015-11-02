/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementValidateRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ProductElementValidateRequestMethod implements UdtMethod {
  private String method = null;
  private ProductElementValidateRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ProductElementValidateCreate method */
  public static final ProductElementValidateRequestMethod PRODUCT_ELEMENT_VALIDATE_CREATE = new ProductElementValidateRequestMethod("ProductElementValidateCreate");
}
