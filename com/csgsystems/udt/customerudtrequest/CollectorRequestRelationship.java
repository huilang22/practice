/*
 * Generated code DO NOT EDIT
 * Generated file: CollectorRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CollectorRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CollectorRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
