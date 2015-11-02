/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPackageRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedPackageRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedPackageRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedPackage_Account_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__ACCOUNT__REF = new OrderedPackageRequestRelationship("OrderedPackage_Account_Ref");
  /** Variable representing the OrderedPackage_Component_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__COMPONENT__REF = new OrderedPackageRequestRelationship("OrderedPackage_Component_Ref");
  /** Variable representing the OrderedPackage_ComponentElement_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__COMPONENT_ELEMENT__REF = new OrderedPackageRequestRelationship("OrderedPackage_ComponentElement_Ref");
  /** Variable representing the OrderedPackage_Item_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__ITEM__REF = new OrderedPackageRequestRelationship("OrderedPackage_Item_Ref");
  /** Variable representing the OrderedPackage_OrderedAccount_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__ORDERED_ACCOUNT__REF = new OrderedPackageRequestRelationship("OrderedPackage_OrderedAccount_Ref");
  /** Variable representing the OrderedPackage_OrderedComponent_Ref relationship */
  public static final OrderedPackageRequestRelationship ORDERED_PACKAGE__ORDERED_COMPONENT__REF = new OrderedPackageRequestRelationship("OrderedPackage_OrderedComponent_Ref");
}
