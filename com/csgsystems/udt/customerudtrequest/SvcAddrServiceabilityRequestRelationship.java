/*
 * Generated code DO NOT EDIT
 * Generated file: SvcAddrServiceabilityRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class SvcAddrServiceabilityRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private SvcAddrServiceabilityRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
