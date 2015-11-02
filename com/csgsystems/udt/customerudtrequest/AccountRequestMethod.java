/*
 * Generated code DO NOT EDIT
 * Generated file: AccountRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountRequestMethod implements UdtMethod {
  private String method = null;
  private AccountRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountActivate method */
  public static final AccountRequestMethod ACCOUNT_ACTIVATE = new AccountRequestMethod("AccountActivate");
  /** Variable representing the AccountActiveChildCount method */
  public static final AccountRequestMethod ACCOUNT_ACTIVE_CHILD_COUNT = new AccountRequestMethod("AccountActiveChildCount");
  /** Variable representing the AccountBalanceSummary method */
  public static final AccountRequestMethod ACCOUNT_BALANCE_SUMMARY = new AccountRequestMethod("AccountBalanceSummary");
  /** Variable representing the AccountChildCount method */
  public static final AccountRequestMethod ACCOUNT_CHILD_COUNT = new AccountRequestMethod("AccountChildCount");
  /** Variable representing the AccountCreate method */
  public static final AccountRequestMethod ACCOUNT_CREATE = new AccountRequestMethod("AccountCreate");
  /** Variable representing the AccountExtendedDataFind method */
  public static final AccountRequestMethod ACCOUNT_EXTENDED_DATA_FIND = new AccountRequestMethod("AccountExtendedDataFind");
  /** Variable representing the AccountFind method */
  public static final AccountRequestMethod ACCOUNT_FIND = new AccountRequestMethod("AccountFind");
  /** Variable representing the AccountFindByOrderNumber method */
  public static final AccountRequestMethod ACCOUNT_FIND_BY_ORDER_NUMBER = new AccountRequestMethod("AccountFindByOrderNumber");
  /** Variable representing the AccountFindCount method */
  public static final AccountRequestMethod ACCOUNT_FIND_COUNT = new AccountRequestMethod("AccountFindCount");
  /** Variable representing the AccountFindWithExtendedData method */
  public static final AccountRequestMethod ACCOUNT_FIND_WITH_EXTENDED_DATA = new AccountRequestMethod("AccountFindWithExtendedData");
  /** Variable representing the AccountGet method */
  public static final AccountRequestMethod ACCOUNT_GET = new AccountRequestMethod("AccountGet");
  /** Variable representing the AccountReactivate method */
  public static final AccountRequestMethod ACCOUNT_REACTIVATE = new AccountRequestMethod("AccountReactivate");
  /** Variable representing the AccountSequenceGet method */
  public static final AccountRequestMethod ACCOUNT_SEQUENCE_GET = new AccountRequestMethod("AccountSequenceGet");
  /** Variable representing the AccountUpdate method */
  public static final AccountRequestMethod ACCOUNT_UPDATE = new AccountRequestMethod("AccountUpdate");
  /** Variable representing the NetworkStatus method */
  public static final AccountRequestMethod NETWORK_STATUS = new AccountRequestMethod("NetworkStatus");
}
