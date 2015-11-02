/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ComponentRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ComponentRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Component_Account_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__ACCOUNT__REF = new ComponentRequestRelationship("Component_Account_Ref");
  /** Variable representing the Component_ComponentElement_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__COMPONENT_ELEMENT__REF = new ComponentRequestRelationship("Component_ComponentElement_Ref");
  /** Variable representing the Component_Item_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__ITEM__REF = new ComponentRequestRelationship("Component_Item_Ref");
  /** Variable representing the Component_OrderedAccount_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__ORDERED_ACCOUNT__REF = new ComponentRequestRelationship("Component_OrderedAccount_Ref");
  /** Variable representing the Component_OrderedPackage_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__ORDERED_PACKAGE__REF = new ComponentRequestRelationship("Component_OrderedPackage_Ref");
  /** Variable representing the Component_OrderedService_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__ORDERED_SERVICE__REF = new ComponentRequestRelationship("Component_OrderedService_Ref");
  /** Variable representing the Component_ProductPackage_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__PRODUCT_PACKAGE__REF = new ComponentRequestRelationship("Component_ProductPackage_Ref");
  /** Variable representing the Component_Service_Ref relationship */
  public static final ComponentRequestRelationship COMPONENT__SERVICE__REF = new ComponentRequestRelationship("Component_Service_Ref");
}
