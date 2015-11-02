/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GlobalAccountBalancesRequestMethod implements UdtMethod {
  private String method = null;
  private GlobalAccountBalancesRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GlobalAccountBalancesCreate method */
  public static final GlobalAccountBalancesRequestMethod GLOBAL_ACCOUNT_BALANCES_CREATE = new GlobalAccountBalancesRequestMethod("GlobalAccountBalancesCreate");
  /** Variable representing the GlobalAccountBalancesDelete method */
  public static final GlobalAccountBalancesRequestMethod GLOBAL_ACCOUNT_BALANCES_DELETE = new GlobalAccountBalancesRequestMethod("GlobalAccountBalancesDelete");
  /** Variable representing the GlobalAccountBalancesFind method */
  public static final GlobalAccountBalancesRequestMethod GLOBAL_ACCOUNT_BALANCES_FIND = new GlobalAccountBalancesRequestMethod("GlobalAccountBalancesFind");
  /** Variable representing the GlobalAccountBalancesGet method */
  public static final GlobalAccountBalancesRequestMethod GLOBAL_ACCOUNT_BALANCES_GET = new GlobalAccountBalancesRequestMethod("GlobalAccountBalancesGet");
  /** Variable representing the GlobalAccountBalancesUpdate method */
  public static final GlobalAccountBalancesRequestMethod GLOBAL_ACCOUNT_BALANCES_UPDATE = new GlobalAccountBalancesRequestMethod("GlobalAccountBalancesUpdate");
}
