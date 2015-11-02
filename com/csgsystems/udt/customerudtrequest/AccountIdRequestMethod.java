/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountIdRequestMethod implements UdtMethod {
  private String method = null;
  private AccountIdRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountIdCreate method */
  public static final AccountIdRequestMethod ACCOUNT_ID_CREATE = new AccountIdRequestMethod("AccountIdCreate");
  /** Variable representing the AccountIdDelete method */
  public static final AccountIdRequestMethod ACCOUNT_ID_DELETE = new AccountIdRequestMethod("AccountIdDelete");
  /** Variable representing the AccountIdDeleteList method */
  public static final AccountIdRequestMethod ACCOUNT_ID_DELETE_LIST = new AccountIdRequestMethod("AccountIdDeleteList");
  /** Variable representing the AccountIdFind method */
  public static final AccountIdRequestMethod ACCOUNT_ID_FIND = new AccountIdRequestMethod("AccountIdFind");
  /** Variable representing the AccountIdGet method */
  public static final AccountIdRequestMethod ACCOUNT_ID_GET = new AccountIdRequestMethod("AccountIdGet");
  /** Variable representing the AccountIdUpdate method */
  public static final AccountIdRequestMethod ACCOUNT_ID_UPDATE = new AccountIdRequestMethod("AccountIdUpdate");
}
