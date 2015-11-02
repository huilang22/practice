/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class UsageTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private UsageTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
