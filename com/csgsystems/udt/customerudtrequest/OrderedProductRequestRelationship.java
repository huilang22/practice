/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedProductRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedProductRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedProductRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedProduct_Account_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ACCOUNT__REF = new OrderedProductRequestRelationship("OrderedProduct_Account_Ref");
  /** Variable representing the OrderedProduct_BillTo_Account_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__BILL_TO__ACCOUNT__REF = new OrderedProductRequestRelationship("OrderedProduct_BillTo_Account_Ref");
  /** Variable representing the OrderedProduct_AccountBalances_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ACCOUNT_BALANCES__REF = new OrderedProductRequestRelationship("OrderedProduct_AccountBalances_Ref");
  /** Variable representing the OrderedProduct_ComponentElement_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__COMPONENT_ELEMENT__REF = new OrderedProductRequestRelationship("OrderedProduct_ComponentElement_Ref");
  /** Variable representing the OrderedProduct_CustomerContract_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__CUSTOMER_CONTRACT__REF = new OrderedProductRequestRelationship("OrderedProduct_CustomerContract_Ref");
  /** Variable representing the OrderedProduct_InvElement_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__INV_ELEMENT__REF = new OrderedProductRequestRelationship("OrderedProduct_InvElement_Ref");
  /** Variable representing the OrderedProduct_Item_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ITEM__REF = new OrderedProductRequestRelationship("OrderedProduct_Item_Ref");
  /** Variable representing the OrderedProduct_BillTo_OrderedAccount_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__BILL_TO__ORDERED_ACCOUNT__REF = new OrderedProductRequestRelationship("OrderedProduct_BillTo_OrderedAccount_Ref");
  /** Variable representing the OrderedProduct_OrderedAccount_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ORDERED_ACCOUNT__REF = new OrderedProductRequestRelationship("OrderedProduct_OrderedAccount_Ref");
  /** Variable representing the OrderedProduct_OrderedAccountBalance_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ORDERED_ACCOUNT_BALANCE__REF = new OrderedProductRequestRelationship("OrderedProduct_OrderedAccountBalance_Ref");
  /** Variable representing the OrderedProduct_OrderedContract_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ORDERED_CONTRACT__REF = new OrderedProductRequestRelationship("OrderedProduct_OrderedContract_Ref");
  /** Variable representing the OrderedProduct_OrderedInventory_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ORDERED_INVENTORY__REF = new OrderedProductRequestRelationship("OrderedProduct_OrderedInventory_Ref");
  /** Variable representing the OrderedProduct_OrderedService_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__ORDERED_SERVICE__REF = new OrderedProductRequestRelationship("OrderedProduct_OrderedService_Ref");
  /** Variable representing the OrderedProduct_ProductRateKey_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__PRODUCT_RATE_KEY__REF = new OrderedProductRequestRelationship("OrderedProduct_ProductRateKey_Ref");
  /** Variable representing the OrderedProduct_ProductRateOverride_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__PRODUCT_RATE_OVERRIDE__REF = new OrderedProductRequestRelationship("OrderedProduct_ProductRateOverride_Ref");
  /** Variable representing the OrderedProduct_Service_Ref relationship */
  public static final OrderedProductRequestRelationship ORDERED_PRODUCT__SERVICE__REF = new OrderedProductRequestRelationship("OrderedProduct_Service_Ref");
}
