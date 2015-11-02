/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedComponentRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedComponentRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedComponent_Account_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__ACCOUNT__REF = new OrderedComponentRequestRelationship("OrderedComponent_Account_Ref");
  /** Variable representing the OrderedComponent_ComponentElement_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__COMPONENT_ELEMENT__REF = new OrderedComponentRequestRelationship("OrderedComponent_ComponentElement_Ref");
  /** Variable representing the OrderedComponent_Item_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__ITEM__REF = new OrderedComponentRequestRelationship("OrderedComponent_Item_Ref");
  /** Variable representing the OrderedComponent_OrderedAccount_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__ORDERED_ACCOUNT__REF = new OrderedComponentRequestRelationship("OrderedComponent_OrderedAccount_Ref");
  /** Variable representing the OrderedComponent_OrderedPackage_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__ORDERED_PACKAGE__REF = new OrderedComponentRequestRelationship("OrderedComponent_OrderedPackage_Ref");
  /** Variable representing the OrderedComponent_OrderedService_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__ORDERED_SERVICE__REF = new OrderedComponentRequestRelationship("OrderedComponent_OrderedService_Ref");
  /** Variable representing the OrderedComponent_ProductPackage_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__PRODUCT_PACKAGE__REF = new OrderedComponentRequestRelationship("OrderedComponent_ProductPackage_Ref");
  /** Variable representing the OrderedComponent_Service_Ref relationship */
  public static final OrderedComponentRequestRelationship ORDERED_COMPONENT__SERVICE__REF = new OrderedComponentRequestRelationship("OrderedComponent_Service_Ref");
}
