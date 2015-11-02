/*
 * Generated code DO NOT EDIT
 * Generated file: WriteoffRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class WriteoffRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private WriteoffRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
