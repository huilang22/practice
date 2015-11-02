/*
 * Generated code DO NOT EDIT
 * Generated file: AccountRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class AccountRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private AccountRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the Account_Child relationship */
  public static final AccountRequestRelationship ACCOUNT__CHILD = new AccountRequestRelationship("Account_Child");
  /** Variable representing the Account_Parent relationship */
  public static final AccountRequestRelationship ACCOUNT__PARENT = new AccountRequestRelationship("Account_Parent");
  /** Variable representing the Account_AccountBalances_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ACCOUNT_BALANCES__REF = new AccountRequestRelationship("Account_AccountBalances_Ref");
  /** Variable representing the Account_AccountBonusPointTransaction_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ACCOUNT_BONUS_POINT_TRANSACTION__REF = new AccountRequestRelationship("Account_AccountBonusPointTransaction_Ref");
  /** Variable representing the Account_AccountCodeGroup_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ACCOUNT_CODE_GROUP__REF = new AccountRequestRelationship("Account_AccountCodeGroup_Ref");
  /** Variable representing the Account_AccountHqContract_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ACCOUNT_HQ_CONTRACT__REF = new AccountRequestRelationship("Account_AccountHqContract_Ref");
  /** Variable representing the Account_AccountId_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ACCOUNT_ID__REF = new AccountRequestRelationship("Account_AccountId_Ref");
  /** Variable representing the Account_Collectable_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__COLLECTABLE__REF = new AccountRequestRelationship("Account_Collectable_Ref");
  /** Variable representing the Account_Component_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__COMPONENT__REF = new AccountRequestRelationship("Account_Component_Ref");
  /** Variable representing the Account_Corridor_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__CORRIDOR__REF = new AccountRequestRelationship("Account_Corridor_Ref");
  /** Variable representing the Account_Owned_Corridor_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__OWNED__CORRIDOR__REF = new AccountRequestRelationship("Account_Owned_Corridor_Ref");
  /** Variable representing the Account_CreditCard_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__CREDIT_CARD__REF = new AccountRequestRelationship("Account_CreditCard_Ref");
  /** Variable representing the Account_CustomerContract_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__CUSTOMER_CONTRACT__REF = new AccountRequestRelationship("Account_CustomerContract_Ref");
  /** Variable representing the Account_CustomerServiceCenter_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__CUSTOMER_SERVICE_CENTER__REF = new AccountRequestRelationship("Account_CustomerServiceCenter_Ref");
  /** Variable representing the Account_Deposit_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__DEPOSIT__REF = new AccountRequestRelationship("Account_Deposit_Ref");
  /** Variable representing the Account_EftTransaction_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__EFT_TRANSACTION__REF = new AccountRequestRelationship("Account_EftTransaction_Ref");
  /** Variable representing the Account_InterimBill_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__INTERIM_BILL__REF = new AccountRequestRelationship("Account_InterimBill_Ref");
  /** Variable representing the Account_InvElement_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__INV_ELEMENT__REF = new AccountRequestRelationship("Account_InvElement_Ref");
  /** Variable representing the Account_Reserved_InvElement_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__RESERVED__INV_ELEMENT__REF = new AccountRequestRelationship("Account_Reserved_InvElement_Ref");
  /** Variable representing the Account_Invoice_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__INVOICE__REF = new AccountRequestRelationship("Account_Invoice_Ref");
  /** Variable representing the Account_Item_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ITEM__REF = new AccountRequestRelationship("Account_Item_Ref");
  /** Variable representing the Account_Note_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__NOTE__REF = new AccountRequestRelationship("Account_Note_Ref");
  /** Variable representing the Account_Nrc_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__NRC__REF = new AccountRequestRelationship("Account_Nrc_Ref");
  /** Variable representing the Account_OpenItemIdMap_Balance_Account_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__OPEN_ITEM_ID_MAP__BALANCE__ACCOUNT__REF = new AccountRequestRelationship("Account_OpenItemIdMap_Balance_Account_Ref");
  /** Variable representing the Account_OpenItemIdMap_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__OPEN_ITEM_ID_MAP__REF = new AccountRequestRelationship("Account_OpenItemIdMap_Ref");
  /** Variable representing the Account_Order_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDER__REF = new AccountRequestRelationship("Account_Order_Ref");
  /** Variable representing the Account_OrderedAccount_Child relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_ACCOUNT__CHILD = new AccountRequestRelationship("Account_OrderedAccount_Child");
  /** Variable representing the Account_OrderedAccount_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_ACCOUNT__REF = new AccountRequestRelationship("Account_OrderedAccount_Ref");
  /** Variable representing the Account_OrderedAccountBalance_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_ACCOUNT_BALANCE__REF = new AccountRequestRelationship("Account_OrderedAccountBalance_Ref");
  /** Variable representing the Account_OrderedComponent_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_COMPONENT__REF = new AccountRequestRelationship("Account_OrderedComponent_Ref");
  /** Variable representing the Account_OrderedContract_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_CONTRACT__REF = new AccountRequestRelationship("Account_OrderedContract_Ref");
  /** Variable representing the Account_OrderedInventory_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_INVENTORY__REF = new AccountRequestRelationship("Account_OrderedInventory_Ref");
  /** Variable representing the Account_Reserved_OrderedInventory_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__RESERVED__ORDERED_INVENTORY__REF = new AccountRequestRelationship("Account_Reserved_OrderedInventory_Ref");
  /** Variable representing the Account_OrderedNrc_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_NRC__REF = new AccountRequestRelationship("Account_OrderedNrc_Ref");
  /** Variable representing the Account_OrderedPackage_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_PACKAGE__REF = new AccountRequestRelationship("Account_OrderedPackage_Ref");
  /** Variable representing the Account_OrderedProduct_Billing_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_PRODUCT__BILLING__REF = new AccountRequestRelationship("Account_OrderedProduct_Billing_Ref");
  /** Variable representing the Account_OrderedProduct_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_PRODUCT__REF = new AccountRequestRelationship("Account_OrderedProduct_Ref");
  /** Variable representing the Account_OrderedService_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__ORDERED_SERVICE__REF = new AccountRequestRelationship("Account_OrderedService_Ref");
  /** Variable representing the Account_Payment_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__PAYMENT__REF = new AccountRequestRelationship("Account_Payment_Ref");
  /** Variable representing the Account_Prepayment_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__PREPAYMENT__REF = new AccountRequestRelationship("Account_Prepayment_Ref");
  /** Variable representing the Account_Product_Billing_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__PRODUCT__BILLING__REF = new AccountRequestRelationship("Account_Product_Billing_Ref");
  /** Variable representing the Account_Product_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__PRODUCT__REF = new AccountRequestRelationship("Account_Product_Ref");
  /** Variable representing the Account_ProductPackage_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__PRODUCT_PACKAGE__REF = new AccountRequestRelationship("Account_ProductPackage_Ref");
  /** Variable representing the Account_Refund_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__REFUND__REF = new AccountRequestRelationship("Account_Refund_Ref");
  /** Variable representing the Account_Service_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__SERVICE__REF = new AccountRequestRelationship("Account_Service_Ref");
  /** Variable representing the Account_ServiceOrder_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__SERVICE_ORDER__REF = new AccountRequestRelationship("Account_ServiceOrder_Ref");
  /** Variable representing the Account_TaxExemption_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__TAX_EXEMPTION__REF = new AccountRequestRelationship("Account_TaxExemption_Ref");
  /** Variable representing the Account_UnbilledUsage_Ref relationship */
  public static final AccountRequestRelationship ACCOUNT__UNBILLED_USAGE__REF = new AccountRequestRelationship("Account_UnbilledUsage_Ref");
}
