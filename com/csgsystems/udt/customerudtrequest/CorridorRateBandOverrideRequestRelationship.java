/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CorridorRateBandOverrideRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CorridorRateBandOverrideRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CorridorRateBandOverride_CorridorRateOverride_Ref relationship */
  public static final CorridorRateBandOverrideRequestRelationship CORRIDOR_RATE_BAND_OVERRIDE__CORRIDOR_RATE_OVERRIDE__REF = new CorridorRateBandOverrideRequestRelationship("CorridorRateBandOverride_CorridorRateOverride_Ref");
}
