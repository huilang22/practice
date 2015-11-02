/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceOrderTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceOrderTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
