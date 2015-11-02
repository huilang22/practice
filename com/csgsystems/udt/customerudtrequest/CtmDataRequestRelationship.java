/*
 * Generated code DO NOT EDIT
 * Generated file: CtmDataRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CtmDataRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CtmDataRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
