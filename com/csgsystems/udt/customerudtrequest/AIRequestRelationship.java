/*
 * Generated code DO NOT EDIT
 * Generated file: AIRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AIRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AIRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
