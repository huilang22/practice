/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class InvsTypeRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private InvsTypeRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
