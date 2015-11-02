/*
 * Generated code DO NOT EDIT
 * Generated file: EftTransactionRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class EftTransactionRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private EftTransactionRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the EftTransaction_Account_Ref relationship */
  public static final EftTransactionRequestRelationship EFT_TRANSACTION__ACCOUNT__REF = new EftTransactionRequestRelationship("EftTransaction_Account_Ref");
  /** Variable representing the EftTransaction_OrigEftTransaction_Ref relationship */
  public static final EftTransactionRequestRelationship EFT_TRANSACTION__ORIG_EFT_TRANSACTION__REF = new EftTransactionRequestRelationship("EftTransaction_OrigEftTransaction_Ref");
  /** Variable representing the EftTransaction_Invoice_Ref relationship */
  public static final EftTransactionRequestRelationship EFT_TRANSACTION__INVOICE__REF = new EftTransactionRequestRelationship("EftTransaction_Invoice_Ref");
  /** Variable representing the EftTransaction_OrderedAccount_Ref relationship */
  public static final EftTransactionRequestRelationship EFT_TRANSACTION__ORDERED_ACCOUNT__REF = new EftTransactionRequestRelationship("EftTransaction_OrderedAccount_Ref");
}
