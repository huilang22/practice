/*
 * Generated code DO NOT EDIT
 * Generated file: AdrAutoAssocRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AdrAutoAssocRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AdrAutoAssocRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
