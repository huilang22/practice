/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingRequest.java
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
public final class RewardBalanceEntityMappingRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RewardBalanceEntityMappingRequest (String request, RewardBalanceEntityMappingRequestMethod method) {
    initialize(request, "RewardBalanceEntityMapping", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RewardBalanceEntityMappingRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRewardBalanceEntityMappingForRewardBalanceEntityMappingCreate(RewardBalanceEntityMappingObjectData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(data, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
  public void setRewardBalanceEntityMappingForRewardBalanceEntityMappingDelete(RewardBalanceEntityMappingObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(data, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
  public void setRewardBalanceEntityMappingForRewardBalanceEntityMappingFind(RewardBalanceEntityMappingObjectFilter data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(data, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
  public void setRewardBalanceEntityMappingForRewardBalanceEntityMappingGet(RewardBalanceEntityMappingObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(data, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
  public void setRewardBalanceEntityMappingForRewardBalanceEntityMappingUpdate(RewardBalanceEntityMappingObjectData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(data, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMappingObjectDataRewardBalanceEntityMappingFromRewardBalanceEntityMappingCreate() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMappingObjectDataRewardBalanceEntityMappingFromRewardBalanceEntityMappingDelete() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
  public RewardBalanceEntityMappingObjectDataList getRewardBalanceEntityMappingObjectDataRewardBalanceEntityMappingFromRewardBalanceEntityMappingFind() {
    return RewardBalanceEntityMappingObjectHelper.fromMapList(outputMap, "RewardBalanceEntityMappingList");
  }
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMappingObjectDataRewardBalanceEntityMappingFromRewardBalanceEntityMappingGet() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMappingObjectDataRewardBalanceEntityMappingFromRewardBalanceEntityMappingUpdate() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
  /**
   @deprecated
   */
  public void setRewardBalanceEntityMappingObjectFilter(RewardBalanceEntityMappingObjectFilter data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(data, new HashMap()).get("RewardBalanceEntityMappingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRewardBalanceEntityMappingObjectData(RewardBalanceEntityMappingObjectData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(data, new HashMap()).get("RewardBalanceEntityMappingObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRewardBalanceEntityMappingObjectKeyData(RewardBalanceEntityMappingObjectKeyData data) {
    if (data != null) {
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(data, new HashMap()).get("RewardBalanceEntityMappingObject"));
    }
  }
  /**
   @deprecated
   */
  public RewardBalanceEntityMappingObjectDataList getRewardBalanceEntityMappingObjectDataList() {
    return RewardBalanceEntityMappingObjectHelper.fromMapList(outputMap, "RewardBalanceEntityMappingList");
  }
  /**
   @deprecated
   */
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMappingObjectData() {
    return RewardBalanceEntityMappingObjectHelper.fromMap(outputMap, "RewardBalanceEntityMapping");
  }
}
