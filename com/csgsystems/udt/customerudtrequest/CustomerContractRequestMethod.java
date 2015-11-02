/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CustomerContractRequestMethod implements UdtMethod {
  private String method = null;
  private CustomerContractRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountDisconnectChargeAccountAmountGet method */
  public static final CustomerContractRequestMethod ACCOUNT_DISCONNECT_CHARGE_ACCOUNT_AMOUNT_GET = new CustomerContractRequestMethod("AccountDisconnectChargeAccountAmountGet");
  /** Variable representing the AccountDisconnectChargeAmountGet method */
  public static final CustomerContractRequestMethod ACCOUNT_DISCONNECT_CHARGE_AMOUNT_GET = new CustomerContractRequestMethod("AccountDisconnectChargeAmountGet");
  /** Variable representing the AccountDisconnectChargeServiceAmountGet method */
  public static final CustomerContractRequestMethod ACCOUNT_DISCONNECT_CHARGE_SERVICE_AMOUNT_GET = new CustomerContractRequestMethod("AccountDisconnectChargeServiceAmountGet");
  /** Variable representing the ComponentDisconnectChargeAmountGet method */
  public static final CustomerContractRequestMethod COMPONENT_DISCONNECT_CHARGE_AMOUNT_GET = new CustomerContractRequestMethod("ComponentDisconnectChargeAmountGet");
  /** Variable representing the CustomerContractAlternateGet method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_ALTERNATE_GET = new CustomerContractRequestMethod("CustomerContractAlternateGet");
  /** Variable representing the CustomerContractCreate method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_CREATE = new CustomerContractRequestMethod("CustomerContractCreate");
  /** Variable representing the CustomerContractCreateInternal method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_CREATE_INTERNAL = new CustomerContractRequestMethod("CustomerContractCreateInternal");
  /** Variable representing the CustomerContractDelete method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_DELETE = new CustomerContractRequestMethod("CustomerContractDelete");
  /** Variable representing the CustomerContractDeleteList method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_DELETE_LIST = new CustomerContractRequestMethod("CustomerContractDeleteList");
  /** Variable representing the CustomerContractDisconnectChargeAmountGet method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_DISCONNECT_CHARGE_AMOUNT_GET = new CustomerContractRequestMethod("CustomerContractDisconnectChargeAmountGet");
  /** Variable representing the CustomerContractDisconnectValidate method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_DISCONNECT_VALIDATE = new CustomerContractRequestMethod("CustomerContractDisconnectValidate");
  /** Variable representing the CustomerContractExtendedDataFind method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_EXTENDED_DATA_FIND = new CustomerContractRequestMethod("CustomerContractExtendedDataFind");
  /** Variable representing the CustomerContractExternalFind method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_EXTERNAL_FIND = new CustomerContractRequestMethod("CustomerContractExternalFind");
  /** Variable representing the CustomerContractFind method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_FIND = new CustomerContractRequestMethod("CustomerContractFind");
  /** Variable representing the CustomerContractFindByServiceOrder method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_FIND_BY_SERVICE_ORDER = new CustomerContractRequestMethod("CustomerContractFindByServiceOrder");
  /** Variable representing the CustomerContractFindWithExtendedData method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_FIND_WITH_EXTENDED_DATA = new CustomerContractRequestMethod("CustomerContractFindWithExtendedData");
  /** Variable representing the CustomerContractGet method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_GET = new CustomerContractRequestMethod("CustomerContractGet");
  /** Variable representing the CustomerContractHqFind method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_HQ_FIND = new CustomerContractRequestMethod("CustomerContractHqFind");
  /** Variable representing the CustomerContractUpdate method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_UPDATE = new CustomerContractRequestMethod("CustomerContractUpdate");
  /** Variable representing the CustomerContractUpdateValidate method */
  public static final CustomerContractRequestMethod CUSTOMER_CONTRACT_UPDATE_VALIDATE = new CustomerContractRequestMethod("CustomerContractUpdateValidate");
  /** Variable representing the ServiceDisconnectChargeAmountGet method */
  public static final CustomerContractRequestMethod SERVICE_DISCONNECT_CHARGE_AMOUNT_GET = new CustomerContractRequestMethod("ServiceDisconnectChargeAmountGet");
}
