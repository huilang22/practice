/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CmfStatusChgReasonRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CmfStatusChgReasonRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
}
