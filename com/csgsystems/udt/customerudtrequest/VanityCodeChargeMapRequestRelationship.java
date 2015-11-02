/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class VanityCodeChargeMapRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private VanityCodeChargeMapRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the VanityCodeChargeMap_InvElement_Ref relationship */
  public static final VanityCodeChargeMapRequestRelationship VANITY_CODE_CHARGE_MAP__INV_ELEMENT__REF = new VanityCodeChargeMapRequestRelationship("VanityCodeChargeMap_InvElement_Ref");
  /** Variable representing the VanityCodeChargeMap_OrderedInventory_Ref relationship */
  public static final VanityCodeChargeMapRequestRelationship VANITY_CODE_CHARGE_MAP__ORDERED_INVENTORY__REF = new VanityCodeChargeMapRequestRelationship("VanityCodeChargeMap_OrderedInventory_Ref");
}
