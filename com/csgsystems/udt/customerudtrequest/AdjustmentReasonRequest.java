/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentReasonRequest.java
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
public final class AdjustmentReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjustmentReasonRequest (String request, AdjustmentReasonRequestMethod method) {
    initialize(request, "AdjustmentReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjustmentReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdjustmentReasonForAdjustmentReasonCreate(AdjustmentReasonObjectData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(data, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
  public void setAdjustmentReasonForAdjustmentReasonDelete(AdjustmentReasonObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
  public void setAdjustmentReasonForAdjustmentReasonFind(AdjustmentReasonObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(data, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
  public void setAdjustmentReasonForAdjustmentReasonGet(AdjustmentReasonObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
  public void setAdjustmentReasonForAdjustmentReasonUpdate(AdjustmentReasonObjectData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(data, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }
  public AdjustmentReasonObjectData getAdjustmentReasonObjectDataAdjustmentReasonFromAdjustmentReasonCreate() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
  public AdjustmentReasonObjectData getAdjustmentReasonObjectDataAdjustmentReasonFromAdjustmentReasonDelete() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
  public AdjustmentReasonObjectDataList getAdjustmentReasonObjectDataAdjustmentReasonFromAdjustmentReasonFind() {
    return AdjustmentReasonObjectHelper.fromMapList(outputMap, "AdjustmentReasonList");
  }
  public AdjustmentReasonObjectData getAdjustmentReasonObjectDataAdjustmentReasonFromAdjustmentReasonGet() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
  public AdjustmentReasonObjectData getAdjustmentReasonObjectDataAdjustmentReasonFromAdjustmentReasonUpdate() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
  /**
   @deprecated
   */
  public void setAdjustmentReasonObjectFilter(AdjustmentReasonObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(data, new HashMap()).get("AdjustmentReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentReasonObjectData(AdjustmentReasonObjectData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(data, new HashMap()).get("AdjustmentReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentReasonObjectKeyData(AdjustmentReasonObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(data, new HashMap()).get("AdjustmentReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public AdjustmentReasonObjectDataList getAdjustmentReasonObjectDataList() {
    return AdjustmentReasonObjectHelper.fromMapList(outputMap, "AdjustmentReasonList");
  }
  /**
   @deprecated
   */
  public AdjustmentReasonObjectData getAdjustmentReasonObjectData() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
