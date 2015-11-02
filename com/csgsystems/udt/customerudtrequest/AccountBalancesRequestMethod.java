/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountBalancesRequestMethod implements UdtMethod {
  private String method = null;
  private AccountBalancesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountBalancesAlternateGet method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_ALTERNATE_GET = new AccountBalancesRequestMethod("AccountBalancesAlternateGet");
  /** Variable representing the AccountBalancesCount method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_COUNT = new AccountBalancesRequestMethod("AccountBalancesCount");
  /** Variable representing the AccountBalancesCreate method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_CREATE = new AccountBalancesRequestMethod("AccountBalancesCreate");
  /** Variable representing the AccountBalancesDelete method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_DELETE = new AccountBalancesRequestMethod("AccountBalancesDelete");
  /** Variable representing the AccountBalancesDeleteByAccount method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_DELETE_BY_ACCOUNT = new AccountBalancesRequestMethod("AccountBalancesDeleteByAccount");
  /** Variable representing the AccountBalancesDeleteList method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_DELETE_LIST = new AccountBalancesRequestMethod("AccountBalancesDeleteList");
  /** Variable representing the AccountBalancesFind method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_FIND = new AccountBalancesRequestMethod("AccountBalancesFind");
  /** Variable representing the AccountBalancesGet method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_GET = new AccountBalancesRequestMethod("AccountBalancesGet");
  /** Variable representing the AccountBalancesUpdate method */
  public static final AccountBalancesRequestMethod ACCOUNT_BALANCES_UPDATE = new AccountBalancesRequestMethod("AccountBalancesUpdate");
}
