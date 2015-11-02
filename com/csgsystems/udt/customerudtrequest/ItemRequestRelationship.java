/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ItemRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ItemRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Item_Account_Ref relationship */
  public static final ItemRequestRelationship ITEM__ACCOUNT__REF = new ItemRequestRelationship("Item_Account_Ref");
  /** Variable representing the Item_AccountBalances_Ref relationship */
  public static final ItemRequestRelationship ITEM__ACCOUNT_BALANCES__REF = new ItemRequestRelationship("Item_AccountBalances_Ref");
  /** Variable representing the Item_Component_Ref relationship */
  public static final ItemRequestRelationship ITEM__COMPONENT__REF = new ItemRequestRelationship("Item_Component_Ref");
  /** Variable representing the Item_CustomerContract_Ref relationship */
  public static final ItemRequestRelationship ITEM__CUSTOMER_CONTRACT__REF = new ItemRequestRelationship("Item_CustomerContract_Ref");
  /** Variable representing the Item_CustomerIdEquipMap_Ref relationship */
  public static final ItemRequestRelationship ITEM__CUSTOMER_ID_EQUIP_MAP__REF = new ItemRequestRelationship("Item_CustomerIdEquipMap_Ref");
  /** Variable representing the Item_InvElement_Ref relationship */
  public static final ItemRequestRelationship ITEM__INV_ELEMENT__REF = new ItemRequestRelationship("Item_InvElement_Ref");
  /** Variable representing the Item_Nrc_Ref relationship */
  public static final ItemRequestRelationship ITEM__NRC__REF = new ItemRequestRelationship("Item_Nrc_Ref");
  /** Variable representing the Item_OrderedAccount_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_ACCOUNT__REF = new ItemRequestRelationship("Item_OrderedAccount_Ref");
  /** Variable representing the Item_OrderedAccountBalance_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_ACCOUNT_BALANCE__REF = new ItemRequestRelationship("Item_OrderedAccountBalance_Ref");
  /** Variable representing the Item_OrderedCiem_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_CIEM__REF = new ItemRequestRelationship("Item_OrderedCiem_Ref");
  /** Variable representing the Item_OrderedComponent_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_COMPONENT__REF = new ItemRequestRelationship("Item_OrderedComponent_Ref");
  /** Variable representing the Item_OrderedContract_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_CONTRACT__REF = new ItemRequestRelationship("Item_OrderedContract_Ref");
  /** Variable representing the Item_OrderedInventory_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_INVENTORY__REF = new ItemRequestRelationship("Item_OrderedInventory_Ref");
  /** Variable representing the Item_OrderedNrc_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_NRC__REF = new ItemRequestRelationship("Item_OrderedNrc_Ref");
  /** Variable representing the Item_OrderedPackage_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_PACKAGE__REF = new ItemRequestRelationship("Item_OrderedPackage_Ref");
  /** Variable representing the Item_OrderedProduct_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_PRODUCT__REF = new ItemRequestRelationship("Item_OrderedProduct_Ref");
  /** Variable representing the Item_OrderedService_Ref relationship */
  public static final ItemRequestRelationship ITEM__ORDERED_SERVICE__REF = new ItemRequestRelationship("Item_OrderedService_Ref");
  /** Variable representing the Item_Product_Ref relationship */
  public static final ItemRequestRelationship ITEM__PRODUCT__REF = new ItemRequestRelationship("Item_Product_Ref");
  /** Variable representing the Item_ProductPackage_Ref relationship */
  public static final ItemRequestRelationship ITEM__PRODUCT_PACKAGE__REF = new ItemRequestRelationship("Item_ProductPackage_Ref");
  /** Variable representing the Item_Service_Ref relationship */
  public static final ItemRequestRelationship ITEM__SERVICE__REF = new ItemRequestRelationship("Item_Service_Ref");
  /** Variable representing the Item_ServiceOrder_Ref relationship */
  public static final ItemRequestRelationship ITEM__SERVICE_ORDER__REF = new ItemRequestRelationship("Item_ServiceOrder_Ref");
}
