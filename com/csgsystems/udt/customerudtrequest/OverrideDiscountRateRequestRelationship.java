/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideDiscountRateRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OverrideDiscountRateRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OverrideDiscountRateRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OverrideDiscountRate_CustomerContract_Ref relationship */
  public static final OverrideDiscountRateRequestRelationship OVERRIDE_DISCOUNT_RATE__CUSTOMER_CONTRACT__REF = new OverrideDiscountRateRequestRelationship("OverrideDiscountRate_CustomerContract_Ref");
  /** Variable representing the OverrideDiscountRate_OrderedContract_Ref relationship */
  public static final OverrideDiscountRateRequestRelationship OVERRIDE_DISCOUNT_RATE__ORDERED_CONTRACT__REF = new OverrideDiscountRateRequestRelationship("OverrideDiscountRate_OrderedContract_Ref");
}
