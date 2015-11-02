/*
 * Generated code DO NOT EDIT
 * Generated file: AccessRegionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccessRegionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccessRegionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
