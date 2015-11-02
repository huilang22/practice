/*
 * Generated code DO NOT EDIT
 * Generated file: CreditCardRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CreditCardRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CreditCardRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CreditCard_Account_Ref relationship */
  public static final CreditCardRequestRelationship CREDIT_CARD__ACCOUNT__REF = new CreditCardRequestRelationship("CreditCard_Account_Ref");
  /** Variable representing the CreditCard_OrderedAccount_Ref relationship */
  public static final CreditCardRequestRelationship CREDIT_CARD__ORDERED_ACCOUNT__REF = new CreditCardRequestRelationship("CreditCard_OrderedAccount_Ref");
}
