/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CorridorPlanRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CorridorPlanRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CorridorPlan_CorridorRateOverride_Ref relationship */
  public static final CorridorPlanRequestRelationship CORRIDOR_PLAN__CORRIDOR_RATE_OVERRIDE__REF = new CorridorPlanRequestRelationship("CorridorPlan_CorridorRateOverride_Ref");
}
