/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedServiceRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedServiceRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedService_Account_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ACCOUNT__REF = new OrderedServiceRequestRelationship("OrderedService_Account_Ref");
  /** Variable representing the OrderedService_Component_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__COMPONENT__REF = new OrderedServiceRequestRelationship("OrderedService_Component_Ref");
  /** Variable representing the OrderedService_Corridor_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__CORRIDOR__REF = new OrderedServiceRequestRelationship("OrderedService_Corridor_Ref");
  /** Variable representing the OrderedService_CustomerContract_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__CUSTOMER_CONTRACT__REF = new OrderedServiceRequestRelationship("OrderedService_CustomerContract_Ref");
  /** Variable representing the OrderedService_CustomerIdEquipMap_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__CUSTOMER_ID_EQUIP_MAP__REF = new OrderedServiceRequestRelationship("OrderedService_CustomerIdEquipMap_Ref");
  /** Variable representing the OrderedService_EmfConfiguration_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__EMF_CONFIGURATION__REF = new OrderedServiceRequestRelationship("OrderedService_EmfConfiguration_Ref");
  /** Variable representing the OrderedService_InvElement_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__INV_ELEMENT__REF = new OrderedServiceRequestRelationship("OrderedService_InvElement_Ref");
  /** Variable representing the OrderedService_Item_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ITEM__REF = new OrderedServiceRequestRelationship("OrderedService_Item_Ref");
  /** Variable representing the OrderedService_Nrc_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__NRC__REF = new OrderedServiceRequestRelationship("OrderedService_Nrc_Ref");
  /** Variable representing the OrderedService_OpenItemIdMap_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__OPEN_ITEM_ID_MAP__REF = new OrderedServiceRequestRelationship("OrderedService_OpenItemIdMap_Ref");
  /** Variable representing the OrderedService_OrderedAccount_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_ACCOUNT__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedAccount_Ref");
  /** Variable representing the OrderedService_OrderedCiem_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_CIEM__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedCiem_Ref");
  /** Variable representing the OrderedService_OrderedComponent_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_COMPONENT__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedComponent_Ref");
  /** Variable representing the OrderedService_OrderedContract_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_CONTRACT__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedContract_Ref");
  /** Variable representing the OrderedService_OrderedInventory_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_INVENTORY__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedInventory_Ref");
  /** Variable representing the OrderedService_OrderedNrc_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_NRC__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedNrc_Ref");
  /** Variable representing the OrderedService_OrderedProduct_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__ORDERED_PRODUCT__REF = new OrderedServiceRequestRelationship("OrderedService_OrderedProduct_Ref");
  /** Variable representing the OrderedService_Product_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__PRODUCT__REF = new OrderedServiceRequestRelationship("OrderedService_Product_Ref");
  /** Variable representing the OrderedService_ServiceOrder_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__SERVICE_ORDER__REF = new OrderedServiceRequestRelationship("OrderedService_ServiceOrder_Ref");
  /** Variable representing the OrderedService_ServicePricingPlan_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__SERVICE_PRICING_PLAN__REF = new OrderedServiceRequestRelationship("OrderedService_ServicePricingPlan_Ref");
  /** Variable representing the OrderedService_ServiceStatus_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__SERVICE_STATUS__REF = new OrderedServiceRequestRelationship("OrderedService_ServiceStatus_Ref");
  /** Variable representing the OrderedService_ServiceZone_Ref relationship */
  public static final OrderedServiceRequestRelationship ORDERED_SERVICE__SERVICE_ZONE__REF = new OrderedServiceRequestRelationship("OrderedService_ServiceZone_Ref");
}
