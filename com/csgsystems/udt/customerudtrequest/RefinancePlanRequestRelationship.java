/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class RefinancePlanRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private RefinancePlanRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the RefinancePlan_Adjustment_Ref relationship */
  public static final RefinancePlanRequestRelationship REFINANCE_PLAN__ADJUSTMENT__REF = new RefinancePlanRequestRelationship("RefinancePlan_Adjustment_Ref");
  /** Variable representing the RefinancePlan_BalanceLineItem_Ref relationship */
  public static final RefinancePlanRequestRelationship REFINANCE_PLAN__BALANCE_LINE_ITEM__REF = new RefinancePlanRequestRelationship("RefinancePlan_BalanceLineItem_Ref");
  /** Variable representing the RefinancePlan_Nrc_Ref relationship */
  public static final RefinancePlanRequestRelationship REFINANCE_PLAN__NRC__REF = new RefinancePlanRequestRelationship("RefinancePlan_Nrc_Ref");
  /** Variable representing the RefinancePlan_OrderedNrc_Ref relationship */
  public static final RefinancePlanRequestRelationship REFINANCE_PLAN__ORDERED_NRC__REF = new RefinancePlanRequestRelationship("RefinancePlan_OrderedNrc_Ref");
}
