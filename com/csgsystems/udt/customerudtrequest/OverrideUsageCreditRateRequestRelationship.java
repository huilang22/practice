/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideUsageCreditRateRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OverrideUsageCreditRateRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OverrideUsageCreditRateRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OverrideUsageCreditRate_CustomerContract_Ref relationship */
  public static final OverrideUsageCreditRateRequestRelationship OVERRIDE_USAGE_CREDIT_RATE__CUSTOMER_CONTRACT__REF = new OverrideUsageCreditRateRequestRelationship("OverrideUsageCreditRate_CustomerContract_Ref");
  /** Variable representing the OverrideUsageCreditRate_OrderedContract_Ref relationship */
  public static final OverrideUsageCreditRateRequestRelationship OVERRIDE_USAGE_CREDIT_RATE__ORDERED_CONTRACT__REF = new OverrideUsageCreditRateRequestRelationship("OverrideUsageCreditRate_OrderedContract_Ref");
}
