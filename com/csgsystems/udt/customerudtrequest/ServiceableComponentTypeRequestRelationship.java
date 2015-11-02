/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableComponentTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceableComponentTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceableComponentTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
