/*
 * Generated code DO NOT EDIT
 * Generated file: ServComponentTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServComponentTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServComponentTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
