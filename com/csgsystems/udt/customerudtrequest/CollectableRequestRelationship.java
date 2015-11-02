/*
 * Generated code DO NOT EDIT
 * Generated file: CollectableRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CollectableRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CollectableRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Collectable_Account_Ref relationship */
  public static final CollectableRequestRelationship COLLECTABLE__ACCOUNT__REF = new CollectableRequestRelationship("Collectable_Account_Ref");
  /** Variable representing the Collectable_BalanceLineItem_Ref relationship */
  public static final CollectableRequestRelationship COLLECTABLE__BALANCE_LINE_ITEM__REF = new CollectableRequestRelationship("Collectable_BalanceLineItem_Ref");
  /** Variable representing the Collectable_EventQueue_Ref relationship */
  public static final CollectableRequestRelationship COLLECTABLE__EVENT_QUEUE__REF = new CollectableRequestRelationship("Collectable_EventQueue_Ref");
  /** Variable representing the Collectable_Invoice_Ref relationship */
  public static final CollectableRequestRelationship COLLECTABLE__INVOICE__REF = new CollectableRequestRelationship("Collectable_Invoice_Ref");
  /** Variable representing the Collectable_OrderedAccount_Ref relationship */
  public static final CollectableRequestRelationship COLLECTABLE__ORDERED_ACCOUNT__REF = new CollectableRequestRelationship("Collectable_OrderedAccount_Ref");
}
