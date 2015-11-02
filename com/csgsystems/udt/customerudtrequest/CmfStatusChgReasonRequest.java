/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonRequest.java
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
public final class CmfStatusChgReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CmfStatusChgReasonRequest (String request, CmfStatusChgReasonRequestMethod method) {
    initialize(request, "CmfStatusChgReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CmfStatusChgReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCmfStatusChgReasonForCmfStatusChgReasonCreate(CmfStatusChgReasonObjectData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(data, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
  public void setCmfStatusChgReasonForCmfStatusChgReasonDelete(CmfStatusChgReasonObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(data, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
  public void setCmfStatusChgReasonForCmfStatusChgReasonFind(CmfStatusChgReasonObjectFilter data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(data, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
  public void setCmfStatusChgReasonForCmfStatusChgReasonGet(CmfStatusChgReasonObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(data, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
  public void setCmfStatusChgReasonForCmfStatusChgReasonUpdate(CmfStatusChgReasonObjectData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(data, new HashMap(), "CmfStatusChgReason").get("CmfStatusChgReason"));
    }
  }
  public CmfStatusChgReasonObjectData getCmfStatusChgReasonObjectDataCmfStatusChgReasonFromCmfStatusChgReasonCreate() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
  public CmfStatusChgReasonObjectData getCmfStatusChgReasonObjectDataCmfStatusChgReasonFromCmfStatusChgReasonDelete() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
  public CmfStatusChgReasonObjectDataList getCmfStatusChgReasonObjectDataCmfStatusChgReasonFromCmfStatusChgReasonFind() {
    return CmfStatusChgReasonObjectHelper.fromMapList(outputMap, "CmfStatusChgReasonList");
  }
  public CmfStatusChgReasonObjectData getCmfStatusChgReasonObjectDataCmfStatusChgReasonFromCmfStatusChgReasonGet() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
  public CmfStatusChgReasonObjectData getCmfStatusChgReasonObjectDataCmfStatusChgReasonFromCmfStatusChgReasonUpdate() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
  /**
   @deprecated
   */
  public void setCmfStatusChgReasonObjectFilter(CmfStatusChgReasonObjectFilter data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(data, new HashMap()).get("CmfStatusChgReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfStatusChgReasonObjectData(CmfStatusChgReasonObjectData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectHelper.toMap(data, new HashMap()).get("CmfStatusChgReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCmfStatusChgReasonObjectKeyData(CmfStatusChgReasonObjectKeyData data) {
    if (data != null) {
      addInput("CmfStatusChgReason", CmfStatusChgReasonObjectKeyHelper.toMap(data, new HashMap()).get("CmfStatusChgReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public CmfStatusChgReasonObjectDataList getCmfStatusChgReasonObjectDataList() {
    return CmfStatusChgReasonObjectHelper.fromMapList(outputMap, "CmfStatusChgReasonList");
  }
  /**
   @deprecated
   */
  public CmfStatusChgReasonObjectData getCmfStatusChgReasonObjectData() {
    return CmfStatusChgReasonObjectHelper.fromMap(outputMap, "CmfStatusChgReason");
  }
}
