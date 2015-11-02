/*
 * Generated code DO NOT EDIT
 * Generated file: BsdBusinessUnitRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BsdBusinessUnitRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BsdBusinessUnitRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
