/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountMessageRequestMethod implements UdtMethod {
  private String method = null;
  private AccountMessageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountMessageCreate method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_CREATE = new AccountMessageRequestMethod("AccountMessageCreate");
  /** Variable representing the AccountMessageDelete method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_DELETE = new AccountMessageRequestMethod("AccountMessageDelete");
  /** Variable representing the AccountMessageDeleteList method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_DELETE_LIST = new AccountMessageRequestMethod("AccountMessageDeleteList");
  /** Variable representing the AccountMessageFind method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_FIND = new AccountMessageRequestMethod("AccountMessageFind");
  /** Variable representing the AccountMessageGet method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_GET = new AccountMessageRequestMethod("AccountMessageGet");
  /** Variable representing the AccountMessageUpdate method */
  public static final AccountMessageRequestMethod ACCOUNT_MESSAGE_UPDATE = new AccountMessageRequestMethod("AccountMessageUpdate");
}
