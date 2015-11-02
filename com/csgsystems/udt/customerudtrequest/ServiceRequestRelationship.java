/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ServiceRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ServiceRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Service_Account_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ACCOUNT__REF = new ServiceRequestRelationship("Service_Account_Ref");
  /** Variable representing the Service_Component_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__COMPONENT__REF = new ServiceRequestRelationship("Service_Component_Ref");
  /** Variable representing the Service_Corridor_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__CORRIDOR__REF = new ServiceRequestRelationship("Service_Corridor_Ref");
  /** Variable representing the Service_CustomerContract_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__CUSTOMER_CONTRACT__REF = new ServiceRequestRelationship("Service_CustomerContract_Ref");
  /** Variable representing the Service_CustomerIdEquipMap_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__CUSTOMER_ID_EQUIP_MAP__REF = new ServiceRequestRelationship("Service_CustomerIdEquipMap_Ref");
  /** Variable representing the Service_EmfConfiguration_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__EMF_CONFIGURATION__REF = new ServiceRequestRelationship("Service_EmfConfiguration_Ref");
  /** Variable representing the Service_InvElement_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__INV_ELEMENT__REF = new ServiceRequestRelationship("Service_InvElement_Ref");
  /** Variable representing the Service_Item_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ITEM__REF = new ServiceRequestRelationship("Service_Item_Ref");
  /** Variable representing the Service_Nrc_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__NRC__REF = new ServiceRequestRelationship("Service_Nrc_Ref");
  /** Variable representing the Service_OpenItemIdMap_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__OPEN_ITEM_ID_MAP__REF = new ServiceRequestRelationship("Service_OpenItemIdMap_Ref");
  /** Variable representing the Service_OrderedAccount_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_ACCOUNT__REF = new ServiceRequestRelationship("Service_OrderedAccount_Ref");
  /** Variable representing the Service_OrderedCiem_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_CIEM__REF = new ServiceRequestRelationship("Service_OrderedCiem_Ref");
  /** Variable representing the Service_OrderedComponent_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_COMPONENT__REF = new ServiceRequestRelationship("Service_OrderedComponent_Ref");
  /** Variable representing the Service_OrderedContract_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_CONTRACT__REF = new ServiceRequestRelationship("Service_OrderedContract_Ref");
  /** Variable representing the Service_OrderedInventory_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_INVENTORY__REF = new ServiceRequestRelationship("Service_OrderedInventory_Ref");
  /** Variable representing the Service_OrderedNrc_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_NRC__REF = new ServiceRequestRelationship("Service_OrderedNrc_Ref");
  /** Variable representing the Service_OrderedProduct_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__ORDERED_PRODUCT__REF = new ServiceRequestRelationship("Service_OrderedProduct_Ref");
  /** Variable representing the Service_Product_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__PRODUCT__REF = new ServiceRequestRelationship("Service_Product_Ref");
  /** Variable representing the Service_ServiceOrder_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__SERVICE_ORDER__REF = new ServiceRequestRelationship("Service_ServiceOrder_Ref");
  /** Variable representing the Service_ServicePricingPlan_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__SERVICE_PRICING_PLAN__REF = new ServiceRequestRelationship("Service_ServicePricingPlan_Ref");
  /** Variable representing the Service_ServiceStatus_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__SERVICE_STATUS__REF = new ServiceRequestRelationship("Service_ServiceStatus_Ref");
  /** Variable representing the Service_ServiceZone_Ref relationship */
  public static final ServiceRequestRelationship SERVICE__SERVICE_ZONE__REF = new ServiceRequestRelationship("Service_ServiceZone_Ref");
}
