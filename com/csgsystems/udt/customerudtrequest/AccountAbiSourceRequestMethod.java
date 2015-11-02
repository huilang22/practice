/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountAbiSourceRequestMethod implements UdtMethod {
  private String method = null;
  private AccountAbiSourceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountAbiSourceCreate method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_CREATE = new AccountAbiSourceRequestMethod("AccountAbiSourceCreate");
  /** Variable representing the AccountAbiSourceDelete method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_DELETE = new AccountAbiSourceRequestMethod("AccountAbiSourceDelete");
  /** Variable representing the AccountAbiSourceDeleteList method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_DELETE_LIST = new AccountAbiSourceRequestMethod("AccountAbiSourceDeleteList");
  /** Variable representing the AccountAbiSourceFind method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_FIND = new AccountAbiSourceRequestMethod("AccountAbiSourceFind");
  /** Variable representing the AccountAbiSourceGet method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_GET = new AccountAbiSourceRequestMethod("AccountAbiSourceGet");
  /** Variable representing the AccountAbiSourceUpdate method */
  public static final AccountAbiSourceRequestMethod ACCOUNT_ABI_SOURCE_UPDATE = new AccountAbiSourceRequestMethod("AccountAbiSourceUpdate");
}
