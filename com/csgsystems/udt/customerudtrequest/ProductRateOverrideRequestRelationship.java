/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRateOverrideRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ProductRateOverrideRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ProductRateOverrideRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ProductRateOverride_OrderedProduct_Ref relationship */
  public static final ProductRateOverrideRequestRelationship PRODUCT_RATE_OVERRIDE__ORDERED_PRODUCT__REF = new ProductRateOverrideRequestRelationship("ProductRateOverride_OrderedProduct_Ref");
  /** Variable representing the ProductRateOverride_Product_Ref relationship */
  public static final ProductRateOverrideRequestRelationship PRODUCT_RATE_OVERRIDE__PRODUCT__REF = new ProductRateOverrideRequestRelationship("ProductRateOverride_Product_Ref");
}
