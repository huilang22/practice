/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BillMessageGroupRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BillMessageGroupRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
