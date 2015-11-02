/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountInsertRequestMethod implements UdtMethod {
  private String method = null;
  private AccountInsertRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountInsertCreate method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_CREATE = new AccountInsertRequestMethod("AccountInsertCreate");
  /** Variable representing the AccountInsertDelete method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_DELETE = new AccountInsertRequestMethod("AccountInsertDelete");
  /** Variable representing the AccountInsertDeleteList method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_DELETE_LIST = new AccountInsertRequestMethod("AccountInsertDeleteList");
  /** Variable representing the AccountInsertFind method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_FIND = new AccountInsertRequestMethod("AccountInsertFind");
  /** Variable representing the AccountInsertGet method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_GET = new AccountInsertRequestMethod("AccountInsertGet");
  /** Variable representing the AccountInsertUpdate method */
  public static final AccountInsertRequestMethod ACCOUNT_INSERT_UPDATE = new AccountInsertRequestMethod("AccountInsertUpdate");
}
