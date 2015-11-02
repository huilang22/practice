/*
 * Generated code DO NOT EDIT
 * Generated file: AccountStatusRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountStatusRequestMethod implements UdtMethod {
  private String method = null;
  private AccountStatusRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountStatusFind method */
  public static final AccountStatusRequestMethod ACCOUNT_STATUS_FIND = new AccountStatusRequestMethod("AccountStatusFind");
  /** Variable representing the AccountStatusGet method */
  public static final AccountStatusRequestMethod ACCOUNT_STATUS_GET = new AccountStatusRequestMethod("AccountStatusGet");
}
