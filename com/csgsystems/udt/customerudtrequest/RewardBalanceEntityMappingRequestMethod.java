/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class RewardBalanceEntityMappingRequestMethod implements UdtMethod {
  private String method = null;
  private RewardBalanceEntityMappingRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the RewardBalanceEntityMappingCreate method */
  public static final RewardBalanceEntityMappingRequestMethod REWARD_BALANCE_ENTITY_MAPPING_CREATE = new RewardBalanceEntityMappingRequestMethod("RewardBalanceEntityMappingCreate");
  /** Variable representing the RewardBalanceEntityMappingDelete method */
  public static final RewardBalanceEntityMappingRequestMethod REWARD_BALANCE_ENTITY_MAPPING_DELETE = new RewardBalanceEntityMappingRequestMethod("RewardBalanceEntityMappingDelete");
  /** Variable representing the RewardBalanceEntityMappingFind method */
  public static final RewardBalanceEntityMappingRequestMethod REWARD_BALANCE_ENTITY_MAPPING_FIND = new RewardBalanceEntityMappingRequestMethod("RewardBalanceEntityMappingFind");
  /** Variable representing the RewardBalanceEntityMappingGet method */
  public static final RewardBalanceEntityMappingRequestMethod REWARD_BALANCE_ENTITY_MAPPING_GET = new RewardBalanceEntityMappingRequestMethod("RewardBalanceEntityMappingGet");
  /** Variable representing the RewardBalanceEntityMappingUpdate method */
  public static final RewardBalanceEntityMappingRequestMethod REWARD_BALANCE_ENTITY_MAPPING_UPDATE = new RewardBalanceEntityMappingRequestMethod("RewardBalanceEntityMappingUpdate");
}
