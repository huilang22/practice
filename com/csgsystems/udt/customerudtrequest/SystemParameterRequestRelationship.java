/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class SystemParameterRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private SystemParameterRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
