/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountCodeRequestMethod implements UdtMethod {
  private String method = null;
  private AccountCodeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountCodeCreate method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_CREATE = new AccountCodeRequestMethod("AccountCodeCreate");
  /** Variable representing the AccountCodeDelete method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_DELETE = new AccountCodeRequestMethod("AccountCodeDelete");
  /** Variable representing the AccountCodeDeleteList method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_DELETE_LIST = new AccountCodeRequestMethod("AccountCodeDeleteList");
  /** Variable representing the AccountCodeFind method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_FIND = new AccountCodeRequestMethod("AccountCodeFind");
  /** Variable representing the AccountCodeGet method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_GET = new AccountCodeRequestMethod("AccountCodeGet");
  /** Variable representing the AccountCodeUpdate method */
  public static final AccountCodeRequestMethod ACCOUNT_CODE_UPDATE = new AccountCodeRequestMethod("AccountCodeUpdate");
}
