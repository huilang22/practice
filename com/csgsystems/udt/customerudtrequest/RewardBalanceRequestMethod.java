/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RewardBalanceRequestMethod implements UdtMethod {
  private String method = null;
  private RewardBalanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RewardBalanceCreate method */
  public static final RewardBalanceRequestMethod REWARD_BALANCE_CREATE = new RewardBalanceRequestMethod("RewardBalanceCreate");
  /** Variable representing the RewardBalanceDelete method */
  public static final RewardBalanceRequestMethod REWARD_BALANCE_DELETE = new RewardBalanceRequestMethod("RewardBalanceDelete");
  /** Variable representing the RewardBalanceFind method */
  public static final RewardBalanceRequestMethod REWARD_BALANCE_FIND = new RewardBalanceRequestMethod("RewardBalanceFind");
  /** Variable representing the RewardBalanceGet method */
  public static final RewardBalanceRequestMethod REWARD_BALANCE_GET = new RewardBalanceRequestMethod("RewardBalanceGet");
  /** Variable representing the RewardBalanceUpdate method */
  public static final RewardBalanceRequestMethod REWARD_BALANCE_UPDATE = new RewardBalanceRequestMethod("RewardBalanceUpdate");
}
