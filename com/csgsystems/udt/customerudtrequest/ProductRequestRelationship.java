/*
 * Generated code DO NOT EDIT
 * Generated file: ProductRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class ProductRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private ProductRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Product_Account_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ACCOUNT__REF = new ProductRequestRelationship("Product_Account_Ref");
  /** Variable representing the Product_BillTo_Account_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__BILL_TO__ACCOUNT__REF = new ProductRequestRelationship("Product_BillTo_Account_Ref");
  /** Variable representing the Product_AccountBalances_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ACCOUNT_BALANCES__REF = new ProductRequestRelationship("Product_AccountBalances_Ref");
  /** Variable representing the Product_ComponentElement_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__COMPONENT_ELEMENT__REF = new ProductRequestRelationship("Product_ComponentElement_Ref");
  /** Variable representing the Product_CustomerContract_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__CUSTOMER_CONTRACT__REF = new ProductRequestRelationship("Product_CustomerContract_Ref");
  /** Variable representing the Product_InvElement_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__INV_ELEMENT__REF = new ProductRequestRelationship("Product_InvElement_Ref");
  /** Variable representing the Product_Item_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ITEM__REF = new ProductRequestRelationship("Product_Item_Ref");
  /** Variable representing the Product_BillTo_OrderedAccount_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__BILL_TO__ORDERED_ACCOUNT__REF = new ProductRequestRelationship("Product_BillTo_OrderedAccount_Ref");
  /** Variable representing the Product_OrderedAccount_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ORDERED_ACCOUNT__REF = new ProductRequestRelationship("Product_OrderedAccount_Ref");
  /** Variable representing the Product_OrderedAccountBalance_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ORDERED_ACCOUNT_BALANCE__REF = new ProductRequestRelationship("Product_OrderedAccountBalance_Ref");
  /** Variable representing the Product_OrderedContract_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ORDERED_CONTRACT__REF = new ProductRequestRelationship("Product_OrderedContract_Ref");
  /** Variable representing the Product_OrderedInventory_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ORDERED_INVENTORY__REF = new ProductRequestRelationship("Product_OrderedInventory_Ref");
  /** Variable representing the Product_OrderedService_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__ORDERED_SERVICE__REF = new ProductRequestRelationship("Product_OrderedService_Ref");
  /** Variable representing the Product_ProductRateKey_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__PRODUCT_RATE_KEY__REF = new ProductRequestRelationship("Product_ProductRateKey_Ref");
  /** Variable representing the Product_ProductRateOverride_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__PRODUCT_RATE_OVERRIDE__REF = new ProductRequestRelationship("Product_ProductRateOverride_Ref");
  /** Variable representing the Product_Service_Ref relationship */
  public static final ProductRequestRelationship PRODUCT__SERVICE__REF = new ProductRequestRelationship("Product_Service_Ref");
}
