/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateKeyRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ProductRateKeyRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ProductRateKeyRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ProductRateKey_OrderedProduct_Ref relationship */
  public static final ProductRateKeyRequestRelationship PRODUCT_RATE_KEY__ORDERED_PRODUCT__REF = new ProductRateKeyRequestRelationship("ProductRateKey_OrderedProduct_Ref");
  /** Variable representing the ProductRateKey_Product_Ref relationship */
  public static final ProductRateKeyRequestRelationship PRODUCT_RATE_KEY__PRODUCT__REF = new ProductRateKeyRequestRelationship("ProductRateKey_Product_Ref");
}
