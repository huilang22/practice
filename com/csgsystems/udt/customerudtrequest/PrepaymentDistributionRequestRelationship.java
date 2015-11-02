/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentDistributionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class PrepaymentDistributionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private PrepaymentDistributionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the PrepaymentDistribution_Prepayment_Ref relationship */
  public static final PrepaymentDistributionRequestRelationship PREPAYMENT_DISTRIBUTION__PREPAYMENT__REF = new PrepaymentDistributionRequestRelationship("PrepaymentDistribution_Prepayment_Ref");
}
