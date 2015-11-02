/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BonusPointRateRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BonusPointRateRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
