/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class GenderTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private GenderTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
