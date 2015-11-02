/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OpenItemIdMapRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OpenItemIdMapRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OpenItemIdMap_Account_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__ACCOUNT__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_Account_Ref");
  /** Variable representing the OpenItemIdMap_Balance_Account_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__BALANCE__ACCOUNT__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_Balance_Account_Ref");
  /** Variable representing the OpenItemIdMap_AccountBalances_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__ACCOUNT_BALANCES__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_AccountBalances_Ref");
  /** Variable representing the OpenItemIdMap_Balance_OrderedAccount_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__BALANCE__ORDERED_ACCOUNT__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_Balance_OrderedAccount_Ref");
  /** Variable representing the OpenItemIdMap_OrderedAccount_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__ORDERED_ACCOUNT__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_OrderedAccount_Ref");
  /** Variable representing the OpenItemIdMap_OrderedAccountBalance_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__ORDERED_ACCOUNT_BALANCE__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_OrderedAccountBalance_Ref");
  /** Variable representing the OpenItemIdMap_OrderedService_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__ORDERED_SERVICE__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_OrderedService_Ref");
  /** Variable representing the OpenItemIdMap_Service_Ref relationship */
  public static final OpenItemIdMapRequestRelationship OPEN_ITEM_ID_MAP__SERVICE__REF = new OpenItemIdMapRequestRelationship("OpenItemIdMap_Service_Ref");
}
