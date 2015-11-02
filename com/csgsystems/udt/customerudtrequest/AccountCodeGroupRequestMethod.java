/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountCodeGroupRequestMethod implements UdtMethod {
  private String method = null;
  private AccountCodeGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountCodeGroupCreate method */
  public static final AccountCodeGroupRequestMethod ACCOUNT_CODE_GROUP_CREATE = new AccountCodeGroupRequestMethod("AccountCodeGroupCreate");
  /** Variable representing the AccountCodeGroupFind method */
  public static final AccountCodeGroupRequestMethod ACCOUNT_CODE_GROUP_FIND = new AccountCodeGroupRequestMethod("AccountCodeGroupFind");
  /** Variable representing the AccountCodeGroupGet method */
  public static final AccountCodeGroupRequestMethod ACCOUNT_CODE_GROUP_GET = new AccountCodeGroupRequestMethod("AccountCodeGroupGet");
  /** Variable representing the AccountCodeGroupUpdate method */
  public static final AccountCodeGroupRequestMethod ACCOUNT_CODE_GROUP_UPDATE = new AccountCodeGroupRequestMethod("AccountCodeGroupUpdate");
}
