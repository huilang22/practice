/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CorridorRateOverrideRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CorridorRateOverrideRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CorridorRateOverride_CorridorPlan_Ref relationship */
  public static final CorridorRateOverrideRequestRelationship CORRIDOR_RATE_OVERRIDE__CORRIDOR_PLAN__REF = new CorridorRateOverrideRequestRelationship("CorridorRateOverride_CorridorPlan_Ref");
  /** Variable representing the CorridorRateOverride_CorridorRateBandOverride_Ref relationship */
  public static final CorridorRateOverrideRequestRelationship CORRIDOR_RATE_OVERRIDE__CORRIDOR_RATE_BAND_OVERRIDE__REF = new CorridorRateOverrideRequestRelationship("CorridorRateOverride_CorridorRateBandOverride_Ref");
}
