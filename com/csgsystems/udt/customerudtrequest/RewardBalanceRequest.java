/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class RewardBalanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RewardBalanceRequest (String request, RewardBalanceRequestMethod method) {
    initialize(request, "RewardBalance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RewardBalanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRewardBalanceForRewardBalanceCreate(RewardBalanceObjectData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(data, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
  public void setRewardBalanceForRewardBalanceDelete(RewardBalanceObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(data, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
  public void setRewardBalanceForRewardBalanceFind(RewardBalanceObjectFilter data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(data, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
  public void setRewardBalanceForRewardBalanceGet(RewardBalanceObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(data, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
  public void setRewardBalanceForRewardBalanceUpdate(RewardBalanceObjectData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(data, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
  public RewardBalanceObjectData getRewardBalanceObjectDataRewardBalanceFromRewardBalanceCreate() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
  public RewardBalanceObjectData getRewardBalanceObjectDataRewardBalanceFromRewardBalanceDelete() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
  public RewardBalanceObjectDataList getRewardBalanceObjectDataRewardBalanceFromRewardBalanceFind() {
    return RewardBalanceObjectHelper.fromMapList(outputMap, "RewardBalanceList");
  }
  public RewardBalanceObjectData getRewardBalanceObjectDataRewardBalanceFromRewardBalanceGet() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
  public RewardBalanceObjectData getRewardBalanceObjectDataRewardBalanceFromRewardBalanceUpdate() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
  /**
   @deprecated
   */
  public void setRewardBalanceObjectFilter(RewardBalanceObjectFilter data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(data, new HashMap()).get("RewardBalanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRewardBalanceObjectData(RewardBalanceObjectData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(data, new HashMap()).get("RewardBalanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRewardBalanceObjectKeyData(RewardBalanceObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(data, new HashMap()).get("RewardBalanceObject"));
    }
  }
  /**
   @deprecated
   */
  public RewardBalanceObjectDataList getRewardBalanceObjectDataList() {
    return RewardBalanceObjectHelper.fromMapList(outputMap, "RewardBalanceList");
  }
  /**
   @deprecated
   */
  public RewardBalanceObjectData getRewardBalanceObjectData() {
    return RewardBalanceObjectHelper.fromMap(outputMap, "RewardBalance");
  }
}
