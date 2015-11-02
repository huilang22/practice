/*
 * Generated code DO NOT EDIT
 * Generated file: StatusTypeRequest.java
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
public final class StatusTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatusTypeRequest (String request, StatusTypeRequestMethod method) {
    initialize(request, "StatusType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatusTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatusTypeForStatusTypeCreate(StatusTypeObjectData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(data, new HashMap(), "StatusType").get("StatusType"));
    }
  }
  public void setStatusTypeForStatusTypeDelete(StatusTypeObjectKeyData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(data, new HashMap(), "StatusType").get("StatusType"));
    }
  }
  public void setStatusTypeForStatusTypeFind(StatusTypeObjectFilter data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(data, new HashMap(), "StatusType").get("StatusType"));
    }
  }
  public void setStatusTypeForStatusTypeGet(StatusTypeObjectKeyData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(data, new HashMap(), "StatusType").get("StatusType"));
    }
  }
  public void setStatusTypeForStatusTypeUpdate(StatusTypeObjectData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(data, new HashMap(), "StatusType").get("StatusType"));
    }
  }
  public StatusTypeObjectData getStatusTypeObjectDataStatusTypeFromStatusTypeCreate() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
  public StatusTypeObjectData getStatusTypeObjectDataStatusTypeFromStatusTypeDelete() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
  public StatusTypeObjectDataList getStatusTypeObjectDataStatusTypeFromStatusTypeFind() {
    return StatusTypeObjectHelper.fromMapList(outputMap, "StatusTypeList");
  }
  public StatusTypeObjectData getStatusTypeObjectDataStatusTypeFromStatusTypeGet() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
  public StatusTypeObjectData getStatusTypeObjectDataStatusTypeFromStatusTypeUpdate() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
  /**
   @deprecated
   */
  public void setStatusTypeObjectFilter(StatusTypeObjectFilter data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(data, new HashMap()).get("StatusTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusTypeObjectData(StatusTypeObjectData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectHelper.toMap(data, new HashMap()).get("StatusTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusTypeObjectKeyData(StatusTypeObjectKeyData data) {
    if (data != null) {
      addInput("StatusType", StatusTypeObjectKeyHelper.toMap(data, new HashMap()).get("StatusTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public StatusTypeObjectDataList getStatusTypeObjectDataList() {
    return StatusTypeObjectHelper.fromMapList(outputMap, "StatusTypeList");
  }
  /**
   @deprecated
   */
  public StatusTypeObjectData getStatusTypeObjectData() {
    return StatusTypeObjectHelper.fromMap(outputMap, "StatusType");
  }
}
