/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractRequestRelationship.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtRelationship;
public final class CustomerContractRequestRelationship implements UdtRelationship {
  private String relationship = null;
  private CustomerContractRequestRelationship (String rel) {
    relationship = rel;
  }
  public String getRelationship () {
    return relationship;
  }
  /** Variable representing the CustomerContract_Account_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ACCOUNT__REF = new CustomerContractRequestRelationship("CustomerContract_Account_Ref");
  /** Variable representing the CustomerContract_Owning_Account_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__OWNING__ACCOUNT__REF = new CustomerContractRequestRelationship("CustomerContract_Owning_Account_Ref");
  /** Variable representing the CustomerContract_AccountHqContract_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ACCOUNT_HQ_CONTRACT__REF = new CustomerContractRequestRelationship("CustomerContract_AccountHqContract_Ref");
  /** Variable representing the CustomerContract_ComponentElement_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__COMPONENT_ELEMENT__REF = new CustomerContractRequestRelationship("CustomerContract_ComponentElement_Ref");
  /** Variable representing the CustomerContract_ContractUnitCredit_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__CONTRACT_UNIT_CREDIT__REF = new CustomerContractRequestRelationship("CustomerContract_ContractUnitCredit_Ref");
  /** Variable representing the CustomerContract_Item_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ITEM__REF = new CustomerContractRequestRelationship("CustomerContract_Item_Ref");
  /** Variable representing the CustomerContract_Nrc_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__NRC__REF = new CustomerContractRequestRelationship("CustomerContract_Nrc_Ref");
  /** Variable representing the CustomerContract_OrderedAccount_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ORDERED_ACCOUNT__REF = new CustomerContractRequestRelationship("CustomerContract_OrderedAccount_Ref");
  /** Variable representing the CustomerContract_Owning_OrderedAccount_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__OWNING__ORDERED_ACCOUNT__REF = new CustomerContractRequestRelationship("CustomerContract_Owning_OrderedAccount_Ref");
  /** Variable representing the CustomerContract_OrderedNrc_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ORDERED_NRC__REF = new CustomerContractRequestRelationship("CustomerContract_OrderedNrc_Ref");
  /** Variable representing the CustomerContract_OrderedProduct_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ORDERED_PRODUCT__REF = new CustomerContractRequestRelationship("CustomerContract_OrderedProduct_Ref");
  /** Variable representing the CustomerContract_OrderedService_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__ORDERED_SERVICE__REF = new CustomerContractRequestRelationship("CustomerContract_OrderedService_Ref");
  /** Variable representing the CustomerContract_OverrideDiscountRate_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__OVERRIDE_DISCOUNT_RATE__REF = new CustomerContractRequestRelationship("CustomerContract_OverrideDiscountRate_Ref");
  /** Variable representing the CustomerContract_OverrideUsageCreditRate_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__OVERRIDE_USAGE_CREDIT_RATE__REF = new CustomerContractRequestRelationship("CustomerContract_OverrideUsageCreditRate_Ref");
  /** Variable representing the CustomerContract_Product_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__PRODUCT__REF = new CustomerContractRequestRelationship("CustomerContract_Product_Ref");
  /** Variable representing the CustomerContract_Service_Ref relationship */
  public static final CustomerContractRequestRelationship CUSTOMER_CONTRACT__SERVICE__REF = new CustomerContractRequestRelationship("CustomerContract_Service_Ref");
}
