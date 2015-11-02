/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointBalanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountBonusPointBalanceRequestMethod implements UdtMethod {
  private String method = null;
  private AccountBonusPointBalanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountBonusPointBalanceFind method */
  public static final AccountBonusPointBalanceRequestMethod ACCOUNT_BONUS_POINT_BALANCE_FIND = new AccountBonusPointBalanceRequestMethod("AccountBonusPointBalanceFind");
  /** Variable representing the AccountBonusPointBalanceGet method */
  public static final AccountBonusPointBalanceRequestMethod ACCOUNT_BONUS_POINT_BALANCE_GET = new AccountBonusPointBalanceRequestMethod("AccountBonusPointBalanceGet");
}
