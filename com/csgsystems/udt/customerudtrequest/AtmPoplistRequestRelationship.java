/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AtmPoplistRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AtmPoplistRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
