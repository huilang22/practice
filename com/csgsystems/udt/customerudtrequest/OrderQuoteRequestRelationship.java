/*
 * Generated code DO NOT EDIT
 * Generated file: OrderQuoteRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderQuoteRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderQuoteRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
