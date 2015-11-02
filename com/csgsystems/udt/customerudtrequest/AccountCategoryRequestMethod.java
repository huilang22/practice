/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private AccountCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountCategoryCreate method */
  public static final AccountCategoryRequestMethod ACCOUNT_CATEGORY_CREATE = new AccountCategoryRequestMethod("AccountCategoryCreate");
  /** Variable representing the AccountCategoryDelete method */
  public static final AccountCategoryRequestMethod ACCOUNT_CATEGORY_DELETE = new AccountCategoryRequestMethod("AccountCategoryDelete");
  /** Variable representing the AccountCategoryFind method */
  public static final AccountCategoryRequestMethod ACCOUNT_CATEGORY_FIND = new AccountCategoryRequestMethod("AccountCategoryFind");
  /** Variable representing the AccountCategoryGet method */
  public static final AccountCategoryRequestMethod ACCOUNT_CATEGORY_GET = new AccountCategoryRequestMethod("AccountCategoryGet");
  /** Variable representing the AccountCategoryUpdate method */
  public static final AccountCategoryRequestMethod ACCOUNT_CATEGORY_UPDATE = new AccountCategoryRequestMethod("AccountCategoryUpdate");
}
