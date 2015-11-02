/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CmfRewardBalanceDetailRequestMethod implements UdtMethod {
  private String method = null;
  private CmfRewardBalanceDetailRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CmfRewardBalanceDetailCreate method */
  public static final CmfRewardBalanceDetailRequestMethod CMF_REWARD_BALANCE_DETAIL_CREATE = new CmfRewardBalanceDetailRequestMethod("CmfRewardBalanceDetailCreate");
  /** Variable representing the CmfRewardBalanceDetailDelete method */
  public static final CmfRewardBalanceDetailRequestMethod CMF_REWARD_BALANCE_DETAIL_DELETE = new CmfRewardBalanceDetailRequestMethod("CmfRewardBalanceDetailDelete");
  /** Variable representing the CmfRewardBalanceDetailFind method */
  public static final CmfRewardBalanceDetailRequestMethod CMF_REWARD_BALANCE_DETAIL_FIND = new CmfRewardBalanceDetailRequestMethod("CmfRewardBalanceDetailFind");
  /** Variable representing the CmfRewardBalanceDetailGet method */
  public static final CmfRewardBalanceDetailRequestMethod CMF_REWARD_BALANCE_DETAIL_GET = new CmfRewardBalanceDetailRequestMethod("CmfRewardBalanceDetailGet");
  /** Variable representing the CmfRewardBalanceDetailUpdate method */
  public static final CmfRewardBalanceDetailRequestMethod CMF_REWARD_BALANCE_DETAIL_UPDATE = new CmfRewardBalanceDetailRequestMethod("CmfRewardBalanceDetailUpdate");
}
