/*
 * Generated code DO NOT EDIT
 * Generated file: StatusRequest.java
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
public final class StatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatusRequest (String request, StatusRequestMethod method) {
    initialize(request, "Status", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatusForStatusCreate(StatusObjectData data) {
    if (data != null) {
      addInput("Status", StatusObjectHelper.toMap(data, new HashMap(), "Status").get("Status"));
    }
  }
  public void setStatusForStatusDelete(StatusObjectKeyData data) {
    if (data != null) {
      addInput("Status", StatusObjectKeyHelper.toMap(data, new HashMap(), "Status").get("Status"));
    }
  }
  public void setStatusForStatusFind(StatusObjectFilter data) {
    if (data != null) {
      addInput("Status", StatusObjectHelper.toMap(data, new HashMap(), "Status").get("Status"));
    }
  }
  public void setStatusForStatusGet(StatusObjectKeyData data) {
    if (data != null) {
      addInput("Status", StatusObjectKeyHelper.toMap(data, new HashMap(), "Status").get("Status"));
    }
  }
  public void setStatusForStatusUpdate(StatusObjectData data) {
    if (data != null) {
      addInput("Status", StatusObjectHelper.toMap(data, new HashMap(), "Status").get("Status"));
    }
  }
  public StatusObjectData getStatusObjectDataStatusFromStatusCreate() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
  public StatusObjectData getStatusObjectDataStatusFromStatusDelete() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
  public StatusObjectDataList getStatusObjectDataStatusFromStatusFind() {
    return StatusObjectHelper.fromMapList(outputMap, "StatusList");
  }
  public StatusObjectData getStatusObjectDataStatusFromStatusGet() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
  public StatusObjectData getStatusObjectDataStatusFromStatusUpdate() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
  /**
   @deprecated
   */
  public void setStatusObjectFilter(StatusObjectFilter data) {
    if (data != null) {
      addInput("Status", StatusObjectHelper.toMap(data, new HashMap()).get("StatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusObjectData(StatusObjectData data) {
    if (data != null) {
      addInput("Status", StatusObjectHelper.toMap(data, new HashMap()).get("StatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatusObjectKeyData(StatusObjectKeyData data) {
    if (data != null) {
      addInput("Status", StatusObjectKeyHelper.toMap(data, new HashMap()).get("StatusObject"));
    }
  }
  /**
   @deprecated
   */
  public StatusObjectDataList getStatusObjectDataList() {
    return StatusObjectHelper.fromMapList(outputMap, "StatusList");
  }
  /**
   @deprecated
   */
  public StatusObjectData getStatusObjectData() {
    return StatusObjectHelper.fromMap(outputMap, "Status");
  }
}
