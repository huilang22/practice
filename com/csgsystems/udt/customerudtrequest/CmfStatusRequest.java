/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusRequest.java
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
public final class CmfStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CmfStatusRequest (String request, CmfStatusRequestMethod method) {
    initialize(request, "CmfStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CmfStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCmfStatusForCmfStatusCreate(CmfStatusObjectData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(data, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
  public void setCmfStatusForCmfStatusDelete(CmfStatusObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(data, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
  public void setCmfStatusForCmfStatusFind(CmfStatusObjectFilter data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(data, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
  public void setCmfStatusForCmfStatusGet(CmfStatusObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(data, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
  public void setCmfStatusForCmfStatusUpdate(CmfStatusObjectData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(data, new HashMap(), "CmfStatus").get("CmfStatus"));
    }
  }
  public CmfStatusObjectData getCmfStatusObjectDataCmfStatusFromCmfStatusCreate() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
  public CmfStatusObjectData getCmfStatusObjectDataCmfStatusFromCmfStatusDelete() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
  public CmfStatusObjectDataList getCmfStatusObjectDataCmfStatusFromCmfStatusFind() {
    return CmfStatusObjectHelper.fromMapList(outputMap, "CmfStatusList");
  }
  public CmfStatusObjectData getCmfStatusObjectDataCmfStatusFromCmfStatusGet() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
  public CmfStatusObjectData getCmfStatusObjectDataCmfStatusFromCmfStatusUpdate() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
  /**
   @deprecated
   */
  public void setCmfStatusObjectFilter(CmfStatusObjectFilter data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(data, new HashMap()).get("CmfStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfStatusObjectData(CmfStatusObjectData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectHelper.toMap(data, new HashMap()).get("CmfStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfStatusObjectKeyData(CmfStatusObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatus", CmfStatusObjectKeyHelper.toMap(data, new HashMap()).get("CmfStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public CmfStatusObjectDataList getCmfStatusObjectDataList() {
    return CmfStatusObjectHelper.fromMapList(outputMap, "CmfStatusList");
  }
  /**
   @deprecated
   */
  public CmfStatusObjectData getCmfStatusObjectData() {
    return CmfStatusObjectHelper.fromMap(outputMap, "CmfStatus");
  }
}
