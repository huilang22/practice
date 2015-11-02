/*
 * Generated code DO NOT EDIT
 * Generated file: NrcGroupRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class NrcGroupRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private NrcGroupRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
