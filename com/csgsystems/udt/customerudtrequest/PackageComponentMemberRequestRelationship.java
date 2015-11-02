/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class PackageComponentMemberRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private PackageComponentMemberRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
