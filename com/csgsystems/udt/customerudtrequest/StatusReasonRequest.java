/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonRequest.java
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

import com.csgsystems.cf.data.*;
public final class StatusReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatusReasonRequest (String request, StatusReasonRequestMethod method) {
    initialize(request, "StatusReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatusReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatusReasonForStatusReasonCreate(StatusReasonObjectData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(data, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
  public void setStatusReasonForStatusReasonDelete(StatusReasonObjectKeyData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(data, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
  public void setStatusReasonForStatusReasonFind(StatusReasonObjectFilter data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(data, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
  public void setStatusReasonForStatusReasonGet(StatusReasonObjectKeyData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(data, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
  public void setStatusReasonForStatusReasonUpdate(StatusReasonObjectData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(data, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
  public StatusReasonObjectData getStatusReasonObjectDataStatusReasonFromStatusReasonCreate() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
  public StatusReasonObjectData getStatusReasonObjectDataStatusReasonFromStatusReasonDelete() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
  public StatusReasonObjectDataList getStatusReasonObjectDataStatusReasonFromStatusReasonFind() {
    return StatusReasonObjectHelper.fromMapList(outputMap, "StatusReasonList");
  }
  public StatusReasonObjectData getStatusReasonObjectDataStatusReasonFromStatusReasonGet() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
  public StatusReasonObjectData getStatusReasonObjectDataStatusReasonFromStatusReasonUpdate() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
  /**
   @deprecated
   */
  public void setStatusReasonObjectFilter(StatusReasonObjectFilter data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(data, new HashMap()).get("StatusReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusReasonObjectData(StatusReasonObjectData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(data, new HashMap()).get("StatusReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusReasonObjectKeyData(StatusReasonObjectKeyData data) {
    if (data != null) {
      addInput("StatusReason", StatusReasonObjectKeyHelper.toMap(data, new HashMap()).get("StatusReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public StatusReasonObjectDataList getStatusReasonObjectDataList() {
    return StatusReasonObjectHelper.fromMapList(outputMap, "StatusReasonList");
  }
  /**
   @deprecated
   */
  public StatusReasonObjectData getStatusReasonObjectData() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
