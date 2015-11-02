/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class OrderedContractRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private OrderedContractRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the OrderedContract_Account_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ACCOUNT__REF = new OrderedContractRequestRelationship("OrderedContract_Account_Ref");
  /** Variable representing the OrderedContract_Owning_Account_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__OWNING__ACCOUNT__REF = new OrderedContractRequestRelationship("OrderedContract_Owning_Account_Ref");
  /** Variable representing the OrderedContract_AccountHqContract_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ACCOUNT_HQ_CONTRACT__REF = new OrderedContractRequestRelationship("OrderedContract_AccountHqContract_Ref");
  /** Variable representing the OrderedContract_ComponentElement_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__COMPONENT_ELEMENT__REF = new OrderedContractRequestRelationship("OrderedContract_ComponentElement_Ref");
  /** Variable representing the OrderedContract_ContractUnitCredit_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__CONTRACT_UNIT_CREDIT__REF = new OrderedContractRequestRelationship("OrderedContract_ContractUnitCredit_Ref");
  /** Variable representing the OrderedContract_Item_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ITEM__REF = new OrderedContractRequestRelationship("OrderedContract_Item_Ref");
  /** Variable representing the OrderedContract_Nrc_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__NRC__REF = new OrderedContractRequestRelationship("OrderedContract_Nrc_Ref");
  /** Variable representing the OrderedContract_Owning_OrderedAccount_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__OWNING__ORDERED_ACCOUNT__REF = new OrderedContractRequestRelationship("OrderedContract_Owning_OrderedAccount_Ref");
  /** Variable representing the OrderedContract_OrderedNrc_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ORDERED_NRC__REF = new OrderedContractRequestRelationship("OrderedContract_OrderedNrc_Ref");
  /** Variable representing the OrderedContract_OrderedProduct_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ORDERED_PRODUCT__REF = new OrderedContractRequestRelationship("OrderedContract_OrderedProduct_Ref");
  /** Variable representing the OrderedContract_OrderedService_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__ORDERED_SERVICE__REF = new OrderedContractRequestRelationship("OrderedContract_OrderedService_Ref");
  /** Variable representing the OrderedContract_OverrideDiscountRate_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__OVERRIDE_DISCOUNT_RATE__REF = new OrderedContractRequestRelationship("OrderedContract_OverrideDiscountRate_Ref");
  /** Variable representing the OrderedContract_OverrideUsageCreditRate_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__OVERRIDE_USAGE_CREDIT_RATE__REF = new OrderedContractRequestRelationship("OrderedContract_OverrideUsageCreditRate_Ref");
  /** Variable representing the OrderedContract_Product_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__PRODUCT__REF = new OrderedContractRequestRelationship("OrderedContract_Product_Ref");
  /** Variable representing the OrderedContract_Service_Ref relationship */
  public static final OrderedContractRequestRelationship ORDERED_CONTRACT__SERVICE__REF = new OrderedContractRequestRelationship("OrderedContract_Service_Ref");
}
