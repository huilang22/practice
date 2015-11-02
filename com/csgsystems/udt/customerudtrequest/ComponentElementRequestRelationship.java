/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ComponentElementRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ComponentElementRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ComponentElement_Component_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__COMPONENT__REF = new ComponentElementRequestRelationship("ComponentElement_Component_Ref");
  /** Variable representing the ComponentElement_CustomerContract_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__CUSTOMER_CONTRACT__REF = new ComponentElementRequestRelationship("ComponentElement_CustomerContract_Ref");
  /** Variable representing the ComponentElement_OrderedComponent_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__ORDERED_COMPONENT__REF = new ComponentElementRequestRelationship("ComponentElement_OrderedComponent_Ref");
  /** Variable representing the ComponentElement_OrderedContract_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__ORDERED_CONTRACT__REF = new ComponentElementRequestRelationship("ComponentElement_OrderedContract_Ref");
  /** Variable representing the ComponentElement_OrderedPackage_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__ORDERED_PACKAGE__REF = new ComponentElementRequestRelationship("ComponentElement_OrderedPackage_Ref");
  /** Variable representing the ComponentElement_OrderedProduct_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__ORDERED_PRODUCT__REF = new ComponentElementRequestRelationship("ComponentElement_OrderedProduct_Ref");
  /** Variable representing the ComponentElement_Product_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__PRODUCT__REF = new ComponentElementRequestRelationship("ComponentElement_Product_Ref");
  /** Variable representing the ComponentElement_ProductPackage_Ref relationship */
  public static final ComponentElementRequestRelationship COMPONENT_ELEMENT__PRODUCT_PACKAGE__REF = new ComponentElementRequestRelationship("ComponentElement_ProductPackage_Ref");
}
