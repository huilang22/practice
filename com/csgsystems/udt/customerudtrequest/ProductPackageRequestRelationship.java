/*
 * Generated code DO NOT EDIT
 * Generated file: ProductPackageRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ProductPackageRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ProductPackageRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the ProductPackage_Account_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__ACCOUNT__REF = new ProductPackageRequestRelationship("ProductPackage_Account_Ref");
  /** Variable representing the ProductPackage_Component_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__COMPONENT__REF = new ProductPackageRequestRelationship("ProductPackage_Component_Ref");
  /** Variable representing the ProductPackage_ComponentElement_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__COMPONENT_ELEMENT__REF = new ProductPackageRequestRelationship("ProductPackage_ComponentElement_Ref");
  /** Variable representing the ProductPackage_Item_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__ITEM__REF = new ProductPackageRequestRelationship("ProductPackage_Item_Ref");
  /** Variable representing the ProductPackage_OrderedAccount_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__ORDERED_ACCOUNT__REF = new ProductPackageRequestRelationship("ProductPackage_OrderedAccount_Ref");
  /** Variable representing the ProductPackage_OrderedComponent_Ref relationship */
  public static final ProductPackageRequestRelationship PRODUCT_PACKAGE__ORDERED_COMPONENT__REF = new ProductPackageRequestRelationship("ProductPackage_OrderedComponent_Ref");
}
