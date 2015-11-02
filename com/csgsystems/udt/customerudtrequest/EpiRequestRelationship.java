/*
 * Generated code DO NOT EDIT
 * Generated file: EpiRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class EpiRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private EpiRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
