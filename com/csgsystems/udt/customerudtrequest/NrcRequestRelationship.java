/*
 * Generated code DO NOT EDIT
 * Generated file: NrcRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class NrcRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private NrcRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Nrc_Account_Ref relationship */
  public static final NrcRequestRelationship NRC__ACCOUNT__REF = new NrcRequestRelationship("Nrc_Account_Ref");
  /** Variable representing the Nrc_AccountBalances_Ref relationship */
  public static final NrcRequestRelationship NRC__ACCOUNT_BALANCES__REF = new NrcRequestRelationship("Nrc_AccountBalances_Ref");
  /** Variable representing the Nrc_CustomerContract_Ref relationship */
  public static final NrcRequestRelationship NRC__CUSTOMER_CONTRACT__REF = new NrcRequestRelationship("Nrc_CustomerContract_Ref");
  /** Variable representing the Nrc_InvElement_Ref relationship */
  public static final NrcRequestRelationship NRC__INV_ELEMENT__REF = new NrcRequestRelationship("Nrc_InvElement_Ref");
  /** Variable representing the Nrc_Item_Ref relationship */
  public static final NrcRequestRelationship NRC__ITEM__REF = new NrcRequestRelationship("Nrc_Item_Ref");
  /** Variable representing the Nrc_Child relationship */
  public static final NrcRequestRelationship NRC__CHILD = new NrcRequestRelationship("Nrc_Child");
  /** Variable representing the Nrc_Parent relationship */
  public static final NrcRequestRelationship NRC__PARENT = new NrcRequestRelationship("Nrc_Parent");
  /** Variable representing the Nrc_OrderedAccount_Ref relationship */
  public static final NrcRequestRelationship NRC__ORDERED_ACCOUNT__REF = new NrcRequestRelationship("Nrc_OrderedAccount_Ref");
  /** Variable representing the Nrc_OrderedAccountBalance_Ref relationship */
  public static final NrcRequestRelationship NRC__ORDERED_ACCOUNT_BALANCE__REF = new NrcRequestRelationship("Nrc_OrderedAccountBalance_Ref");
  /** Variable representing the Nrc_OrderedContract_Ref relationship */
  public static final NrcRequestRelationship NRC__ORDERED_CONTRACT__REF = new NrcRequestRelationship("Nrc_OrderedContract_Ref");
  /** Variable representing the Nrc_OrderedInventory_Ref relationship */
  public static final NrcRequestRelationship NRC__ORDERED_INVENTORY__REF = new NrcRequestRelationship("Nrc_OrderedInventory_Ref");
  /** Variable representing the Nrc_OrderedNrc_Child relationship */
  public static final NrcRequestRelationship NRC__ORDERED_NRC__CHILD = new NrcRequestRelationship("Nrc_OrderedNrc_Child");
  /** Variable representing the Nrc_OrderedNrc_Parent relationship */
  public static final NrcRequestRelationship NRC__ORDERED_NRC__PARENT = new NrcRequestRelationship("Nrc_OrderedNrc_Parent");
  /** Variable representing the Nrc_OrderedService_Ref relationship */
  public static final NrcRequestRelationship NRC__ORDERED_SERVICE__REF = new NrcRequestRelationship("Nrc_OrderedService_Ref");
  /** Variable representing the Nrc_RefinancePlan_Ref relationship */
  public static final NrcRequestRelationship NRC__REFINANCE_PLAN__REF = new NrcRequestRelationship("Nrc_RefinancePlan_Ref");
  /** Variable representing the Nrc_Service_Ref relationship */
  public static final NrcRequestRelationship NRC__SERVICE__REF = new NrcRequestRelationship("Nrc_Service_Ref");
}
