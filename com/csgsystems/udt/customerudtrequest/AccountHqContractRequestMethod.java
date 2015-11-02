/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountHqContractRequestMethod implements UdtMethod {
  private String method = null;
  private AccountHqContractRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountHqContractCreate method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_CREATE = new AccountHqContractRequestMethod("AccountHqContractCreate");
  /** Variable representing the AccountHqContractDelete method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_DELETE = new AccountHqContractRequestMethod("AccountHqContractDelete");
  /** Variable representing the AccountHqContractDeleteList method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_DELETE_LIST = new AccountHqContractRequestMethod("AccountHqContractDeleteList");
  /** Variable representing the AccountHqContractFind method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_FIND = new AccountHqContractRequestMethod("AccountHqContractFind");
  /** Variable representing the AccountHqContractGet method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_GET = new AccountHqContractRequestMethod("AccountHqContractGet");
  /** Variable representing the AccountHqContractUpdate method */
  public static final AccountHqContractRequestMethod ACCOUNT_HQ_CONTRACT_UPDATE = new AccountHqContractRequestMethod("AccountHqContractUpdate");
}
