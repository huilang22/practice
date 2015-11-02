/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class RefundReasonRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private RefundReasonRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
