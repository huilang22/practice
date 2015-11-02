/*
 * Generated code DO NOT EDIT
 * Generated file: CmfRewardBalanceDetailRequest.java
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
public final class CmfRewardBalanceDetailRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CmfRewardBalanceDetailRequest (String request, CmfRewardBalanceDetailRequestMethod method) {
    initialize(request, "CmfRewardBalanceDetail", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CmfRewardBalanceDetailRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCmfRewardBalanceDetailForCmfRewardBalanceDetailCreate(CmfRewardBalanceDetailObjectData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(data, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
  public void setCmfRewardBalanceDetailForCmfRewardBalanceDetailDelete(CmfRewardBalanceDetailObjectKeyData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(data, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
  public void setCmfRewardBalanceDetailForCmfRewardBalanceDetailFind(CmfRewardBalanceDetailObjectFilter data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(data, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
  public void setCmfRewardBalanceDetailForCmfRewardBalanceDetailGet(CmfRewardBalanceDetailObjectKeyData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(data, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
  public void setCmfRewardBalanceDetailForCmfRewardBalanceDetailUpdate(CmfRewardBalanceDetailObjectData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(data, new HashMap(), "CmfRewardBalanceDetail").get("CmfRewardBalanceDetail"));
    }
  }
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetailObjectDataCmfRewardBalanceDetailFromCmfRewardBalanceDetailCreate() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetailObjectDataCmfRewardBalanceDetailFromCmfRewardBalanceDetailDelete() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
  public CmfRewardBalanceDetailObjectDataList getCmfRewardBalanceDetailObjectDataCmfRewardBalanceDetailFromCmfRewardBalanceDetailFind() {
    return CmfRewardBalanceDetailObjectHelper.fromMapList(outputMap, "CmfRewardBalanceDetailList");
  }
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetailObjectDataCmfRewardBalanceDetailFromCmfRewardBalanceDetailGet() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetailObjectDataCmfRewardBalanceDetailFromCmfRewardBalanceDetailUpdate() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
  /**
   @deprecated
   */
  public void setCmfRewardBalanceDetailObjectFilter(CmfRewardBalanceDetailObjectFilter data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(data, new HashMap()).get("CmfRewardBalanceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfRewardBalanceDetailObjectData(CmfRewardBalanceDetailObjectData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectHelper.toMap(data, new HashMap()).get("CmfRewardBalanceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfRewardBalanceDetailObjectKeyData(CmfRewardBalanceDetailObjectKeyData data) {
    if (data != null) {
      addInput("CmfRewardBalanceDetail", CmfRewardBalanceDetailObjectKeyHelper.toMap(data, new HashMap()).get("CmfRewardBalanceDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public CmfRewardBalanceDetailObjectDataList getCmfRewardBalanceDetailObjectDataList() {
    return CmfRewardBalanceDetailObjectHelper.fromMapList(outputMap, "CmfRewardBalanceDetailList");
  }
  /**
   @deprecated
   */
  public CmfRewardBalanceDetailObjectData getCmfRewardBalanceDetailObjectData() {
    return CmfRewardBalanceDetailObjectHelper.fromMap(outputMap, "CmfRewardBalanceDetail");
  }
}
