/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class BillImageRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private BillImageRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the BillImage_BillImagePage_Ref relationship */
  public static final BillImageRequestRelationship BILL_IMAGE__BILL_IMAGE_PAGE__REF = new BillImageRequestRelationship("BillImage_BillImagePage_Ref");
  /** Variable representing the BillImage_Invoice_Ref relationship */
  public static final BillImageRequestRelationship BILL_IMAGE__INVOICE__REF = new BillImageRequestRelationship("BillImage_Invoice_Ref");
}
