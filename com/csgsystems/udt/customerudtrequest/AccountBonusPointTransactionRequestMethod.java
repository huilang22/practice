/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AccountBonusPointTransactionRequestMethod implements UdtMethod {
  private String method = null;
  private AccountBonusPointTransactionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AccountBonusPointTransactionActivate method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_ACTIVATE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionActivate");
  /** Variable representing the AccountBonusPointTransactionAddBalance method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_ADD_BALANCE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionAddBalance");
  /** Variable representing the AccountBonusPointTransactionBalance method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_BALANCE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionBalance");
  /** Variable representing the AccountBonusPointTransactionCreate method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_CREATE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionCreate");
  /** Variable representing the AccountBonusPointTransactionDelete method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_DELETE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionDelete");
  /** Variable representing the AccountBonusPointTransactionExpiringBalance method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_EXPIRING_BALANCE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionExpiringBalance");
  /** Variable representing the AccountBonusPointTransactionFind method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_FIND = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionFind");
  /** Variable representing the AccountBonusPointTransactionFindbyRewardbalance method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_FINDBY_REWARDBALANCE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionFindbyRewardbalance");
  /** Variable representing the AccountBonusPointTransactionGet method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_GET = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionGet");
  /** Variable representing the AccountBonusPointTransactionRedeemPoints method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_REDEEM_POINTS = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionRedeemPoints");
  /** Variable representing the AccountBonusPointTransactionTransfer method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_TRANSFER = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionTransfer");
  /** Variable representing the AccountBonusPointTransactionUpdate method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_UPDATE = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionUpdate");
  /** Variable representing the AccountBonusPointTransactionUpdatePoints method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_UPDATE_POINTS = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionUpdatePoints");
  /** Variable representing the AccountBonusPointTransactionUpdateUnredeemed method */
  public static final AccountBonusPointTransactionRequestMethod ACCOUNT_BONUS_POINT_TRANSACTION_UPDATE_UNREDEEMED = new AccountBonusPointTransactionRequestMethod("AccountBonusPointTransactionUpdateUnredeemed");
}
