/*
 * Generated code DO NOT EDIT
 * Generated file: InvElementRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class InvElementRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private InvElementRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the InvElement_Account_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ACCOUNT__REF = new InvElementRequestRelationship("InvElement_Account_Ref");
  /** Variable representing the InvElement_Reserving_Account_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__RESERVING__ACCOUNT__REF = new InvElementRequestRelationship("InvElement_Reserving_Account_Ref");
  /** Variable representing the InvElement_Assigned_CustomerIdEquipMap_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ASSIGNED__CUSTOMER_ID_EQUIP_MAP__REF = new InvElementRequestRelationship("InvElement_Assigned_CustomerIdEquipMap_Ref");
  /** Variable representing the InvElement_Item_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ITEM__REF = new InvElementRequestRelationship("InvElement_Item_Ref");
  /** Variable representing the InvElement_Nrc_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__NRC__REF = new InvElementRequestRelationship("InvElement_Nrc_Ref");
  /** Variable representing the InvElement_OrderedAccount_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ORDERED_ACCOUNT__REF = new InvElementRequestRelationship("InvElement_OrderedAccount_Ref");
  /** Variable representing the InvElement_Reserving_OrderedAccount_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__RESERVING__ORDERED_ACCOUNT__REF = new InvElementRequestRelationship("InvElement_Reserving_OrderedAccount_Ref");
  /** Variable representing the InvElement_Assigned_OrderedCiem_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ASSIGNED__ORDERED_CIEM__REF = new InvElementRequestRelationship("InvElement_Assigned_OrderedCiem_Ref");
  /** Variable representing the InvElement_OrderedNrc_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ORDERED_NRC__REF = new InvElementRequestRelationship("InvElement_OrderedNrc_Ref");
  /** Variable representing the InvElement_OrderedProduct_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ORDERED_PRODUCT__REF = new InvElementRequestRelationship("InvElement_OrderedProduct_Ref");
  /** Variable representing the InvElement_Assigned_OrderedService_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ASSIGNED__ORDERED_SERVICE__REF = new InvElementRequestRelationship("InvElement_Assigned_OrderedService_Ref");
  /** Variable representing the InvElement_Product_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__PRODUCT__REF = new InvElementRequestRelationship("InvElement_Product_Ref");
  /** Variable representing the InvElement_Assigned_Service_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__ASSIGNED__SERVICE__REF = new InvElementRequestRelationship("InvElement_Assigned_Service_Ref");
  /** Variable representing the InvElement_VanityCodeChargeMap_Ref relationship */
  public static final InvElementRequestRelationship INV_ELEMENT__VANITY_CODE_CHARGE_MAP__REF = new InvElementRequestRelationship("InvElement_VanityCodeChargeMap_Ref");
}
