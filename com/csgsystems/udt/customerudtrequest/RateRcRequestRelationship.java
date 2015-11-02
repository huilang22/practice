/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class RateRcRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private RateRcRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
