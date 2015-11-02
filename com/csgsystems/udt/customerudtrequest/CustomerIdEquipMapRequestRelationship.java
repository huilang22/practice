/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerIdEquipMapRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CustomerIdEquipMapRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CustomerIdEquipMapRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CustomerIdEquipMap_InvElement_Ref relationship */
  public static final CustomerIdEquipMapRequestRelationship CUSTOMER_ID_EQUIP_MAP__INV_ELEMENT__REF = new CustomerIdEquipMapRequestRelationship("CustomerIdEquipMap_InvElement_Ref");
  /** Variable representing the CustomerIdEquipMap_Item_Ref relationship */
  public static final CustomerIdEquipMapRequestRelationship CUSTOMER_ID_EQUIP_MAP__ITEM__REF = new CustomerIdEquipMapRequestRelationship("CustomerIdEquipMap_Item_Ref");
  /** Variable representing the CustomerIdEquipMap_OrderedInventory_Ref relationship */
  public static final CustomerIdEquipMapRequestRelationship CUSTOMER_ID_EQUIP_MAP__ORDERED_INVENTORY__REF = new CustomerIdEquipMapRequestRelationship("CustomerIdEquipMap_OrderedInventory_Ref");
  /** Variable representing the CustomerIdEquipMap_OrderedService_Ref relationship */
  public static final CustomerIdEquipMapRequestRelationship CUSTOMER_ID_EQUIP_MAP__ORDERED_SERVICE__REF = new CustomerIdEquipMapRequestRelationship("CustomerIdEquipMap_OrderedService_Ref");
  /** Variable representing the CustomerIdEquipMap_Service_Ref relationship */
  public static final CustomerIdEquipMapRequestRelationship CUSTOMER_ID_EQUIP_MAP__SERVICE__REF = new CustomerIdEquipMapRequestRelationship("CustomerIdEquipMap_Service_Ref");
}
