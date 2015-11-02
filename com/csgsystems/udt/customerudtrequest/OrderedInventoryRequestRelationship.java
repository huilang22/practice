/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedInventoryRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedInventoryRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the InvElement_Account_Ref relationship */
  public static final OrderedInventoryRequestRelationship INV_ELEMENT__ACCOUNT__REF = new OrderedInventoryRequestRelationship("InvElement_Account_Ref");
  /** Variable representing the OrderedInventory_Reserving_Account_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__RESERVING__ACCOUNT__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Reserving_Account_Ref");
  /** Variable representing the OrderedInventory_Assigned_CustomerIdEquipMap_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ASSIGNED__CUSTOMER_ID_EQUIP_MAP__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Assigned_CustomerIdEquipMap_Ref");
  /** Variable representing the OrderedInventory_Item_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ITEM__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Item_Ref");
  /** Variable representing the OrderedInventory_Nrc_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__NRC__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Nrc_Ref");
  /** Variable representing the OrderedInventory_OrderedAccount_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ORDERED_ACCOUNT__REF = new OrderedInventoryRequestRelationship("OrderedInventory_OrderedAccount_Ref");
  /** Variable representing the OrderedInventory_Reserving_OrderedAccount_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__RESERVING__ORDERED_ACCOUNT__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Reserving_OrderedAccount_Ref");
  /** Variable representing the OrderedInventory_Assigned_OrderedCiem_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ASSIGNED__ORDERED_CIEM__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Assigned_OrderedCiem_Ref");
  /** Variable representing the OrderedInventory_OrderedNrc_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ORDERED_NRC__REF = new OrderedInventoryRequestRelationship("OrderedInventory_OrderedNrc_Ref");
  /** Variable representing the OrderedInventory_OrderedProduct_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ORDERED_PRODUCT__REF = new OrderedInventoryRequestRelationship("OrderedInventory_OrderedProduct_Ref");
  /** Variable representing the OrderedInventory_Assigned_OrderedService_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ASSIGNED__ORDERED_SERVICE__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Assigned_OrderedService_Ref");
  /** Variable representing the OrderedInventory_Product_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__PRODUCT__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Product_Ref");
  /** Variable representing the OrderedInventory_Assigned_Service_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__ASSIGNED__SERVICE__REF = new OrderedInventoryRequestRelationship("OrderedInventory_Assigned_Service_Ref");
  /** Variable representing the OrderedInventory_VanityCodeChargeMap_Ref relationship */
  public static final OrderedInventoryRequestRelationship ORDERED_INVENTORY__VANITY_CODE_CHARGE_MAP__REF = new OrderedInventoryRequestRelationship("OrderedInventory_VanityCodeChargeMap_Ref");
}
