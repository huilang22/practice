/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedAccountRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedAccountRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedAccount_Account_Child_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT__CHILD__REF = new OrderedAccountRequestRelationship("OrderedAccount_Account_Child_Ref");
  /** Variable representing the OrderedAccount_Account_Parent_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT__PARENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Account_Parent_Ref");
  /** Variable representing the OrderedAccount_Child relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__CHILD = new OrderedAccountRequestRelationship("OrderedAccount_Child");
  /** Variable representing the OrderedAccount_Parent relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PARENT = new OrderedAccountRequestRelationship("OrderedAccount_Parent");
  /** Variable representing the OrderedAccount_AccountBalances_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT_BALANCES__REF = new OrderedAccountRequestRelationship("OrderedAccount_AccountBalances_Ref");
  /** Variable representing the OrderedAccount_AccountCodeGroup_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT_CODE_GROUP__REF = new OrderedAccountRequestRelationship("OrderedAccount_AccountCodeGroup_Ref");
  /** Variable representing the OrderedAccount_AccountHqContract_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT_HQ_CONTRACT__REF = new OrderedAccountRequestRelationship("OrderedAccount_AccountHqContract_Ref");
  /** Variable representing the OrderedAccount_AccountId_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ACCOUNT_ID__REF = new OrderedAccountRequestRelationship("OrderedAccount_AccountId_Ref");
  /** Variable representing the OrderedAccount_Collectable_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__COLLECTABLE__REF = new OrderedAccountRequestRelationship("OrderedAccount_Collectable_Ref");
  /** Variable representing the OrderedAccount_Component_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__COMPONENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Component_Ref");
  /** Variable representing the OrderedAccount_Corridor_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__CORRIDOR__REF = new OrderedAccountRequestRelationship("OrderedAccount_Corridor_Ref");
  /** Variable representing the OrderedAccount_Owned_Corridor_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__OWNED__CORRIDOR__REF = new OrderedAccountRequestRelationship("OrderedAccount_Owned_Corridor_Ref");
  /** Variable representing the OrderedAccount_CreditCard_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__CREDIT_CARD__REF = new OrderedAccountRequestRelationship("OrderedAccount_CreditCard_Ref");
  /** Variable representing the OrderedAccount_CustomerContract_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__CUSTOMER_CONTRACT__REF = new OrderedAccountRequestRelationship("OrderedAccount_CustomerContract_Ref");
  /** Variable representing the OrderedAccount_Deposit_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__DEPOSIT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Deposit_Ref");
  /** Variable representing the OrderedAccount_EftTransaction_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__EFT_TRANSACTION__REF = new OrderedAccountRequestRelationship("OrderedAccount_EftTransaction_Ref");
  /** Variable representing the OrderedAccount_InterimBill_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__INTERIM_BILL__REF = new OrderedAccountRequestRelationship("OrderedAccount_InterimBill_Ref");
  /** Variable representing the OrderedAccount_InvElement_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__INV_ELEMENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_InvElement_Ref");
  /** Variable representing the OrderedAccount_Reserved_InvElement_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__RESERVED__INV_ELEMENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Reserved_InvElement_Ref");
  /** Variable representing the OrderedAccount_Invoice_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__INVOICE__REF = new OrderedAccountRequestRelationship("OrderedAccount_Invoice_Ref");
  /** Variable representing the OrderedAccount_Item_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ITEM__REF = new OrderedAccountRequestRelationship("OrderedAccount_Item_Ref");
  /** Variable representing the OrderedAccount_Note_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__NOTE__REF = new OrderedAccountRequestRelationship("OrderedAccount_Note_Ref");
  /** Variable representing the OrderedAccount_Nrc_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__NRC__REF = new OrderedAccountRequestRelationship("OrderedAccount_Nrc_Ref");
  /** Variable representing the OrderedAccount_OpenItemIdMap_Balance_Account_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__OPEN_ITEM_ID_MAP__BALANCE__ACCOUNT__REF = new OrderedAccountRequestRelationship("OrderedAccount_OpenItemIdMap_Balance_Account_Ref");
  /** Variable representing the OrderedAccount_OpenItemIdMap_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__OPEN_ITEM_ID_MAP__REF = new OrderedAccountRequestRelationship("OrderedAccount_OpenItemIdMap_Ref");
  /** Variable representing the OrderedAccount_Order_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDER__REF = new OrderedAccountRequestRelationship("OrderedAccount_Order_Ref");
  /** Variable representing the OrderedAccount_OrderedAccount_Child_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_ACCOUNT__CHILD__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedAccount_Child_Ref");
  /** Variable representing the OrderedAccount_OrderedAccount_Parent_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_ACCOUNT__PARENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedAccount_Parent_Ref");
  /** Variable representing the OrderedAccount_OrderedAccountBalance_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_ACCOUNT_BALANCE__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedAccountBalance_Ref");
  /** Variable representing the OrderedAccount_OrderedComponent_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_COMPONENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedComponent_Ref");
  /** Variable representing the OrderedAccount_OrderedContract_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_CONTRACT__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedContract_Ref");
  /** Variable representing the OrderedAccount_OrderedInventory_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_INVENTORY__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedInventory_Ref");
  /** Variable representing the OrderedAccount_Reserved_OrderedInventory_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__RESERVED__ORDERED_INVENTORY__REF = new OrderedAccountRequestRelationship("OrderedAccount_Reserved_OrderedInventory_Ref");
  /** Variable representing the OrderedAccount_OrderedNrc_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_NRC__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedNrc_Ref");
  /** Variable representing the OrderedAccount_OrderedPackage_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_PACKAGE__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedPackage_Ref");
  /** Variable representing the OrderedAccount_OrderedProduct_Billing_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_PRODUCT__BILLING__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedProduct_Billing_Ref");
  /** Variable representing the OrderedAccount_OrderedProduct_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_PRODUCT__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedProduct_Ref");
  /** Variable representing the OrderedAccount_OrderedService_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__ORDERED_SERVICE__REF = new OrderedAccountRequestRelationship("OrderedAccount_OrderedService_Ref");
  /** Variable representing the OrderedAccount_Payment_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PAYMENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Payment_Ref");
  /** Variable representing the OrderedAccount_Prepayment_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PREPAYMENT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Prepayment_Ref");
  /** Variable representing the OrderedAccount_Product_Billing_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PRODUCT__BILLING__REF = new OrderedAccountRequestRelationship("OrderedAccount_Product_Billing_Ref");
  /** Variable representing the OrderedAccount_Product_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PRODUCT__REF = new OrderedAccountRequestRelationship("OrderedAccount_Product_Ref");
  /** Variable representing the OrderedAccount_ProductPackage_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__PRODUCT_PACKAGE__REF = new OrderedAccountRequestRelationship("OrderedAccount_ProductPackage_Ref");
  /** Variable representing the OrderedAccount_Refund_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__REFUND__REF = new OrderedAccountRequestRelationship("OrderedAccount_Refund_Ref");
  /** Variable representing the OrderedAccount_Service_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__SERVICE__REF = new OrderedAccountRequestRelationship("OrderedAccount_Service_Ref");
  /** Variable representing the OrderedAccount_ServiceOrder_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__SERVICE_ORDER__REF = new OrderedAccountRequestRelationship("OrderedAccount_ServiceOrder_Ref");
  /** Variable representing the OrderedAccount_TaxExemption_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__TAX_EXEMPTION__REF = new OrderedAccountRequestRelationship("OrderedAccount_TaxExemption_Ref");
  /** Variable representing the OrderedAccount_UnbilledUsage_Ref relationship */
  public static final OrderedAccountRequestRelationship ORDERED_ACCOUNT__UNBILLED_USAGE__REF = new OrderedAccountRequestRelationship("OrderedAccount_UnbilledUsage_Ref");
}
