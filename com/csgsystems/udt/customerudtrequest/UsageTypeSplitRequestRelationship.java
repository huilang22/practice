/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class UsageTypeSplitRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private UsageTypeSplitRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
