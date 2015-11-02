/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonMapRequest.java
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
public final class StatusReasonMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatusReasonMapRequest (String request, StatusReasonMapRequestMethod method) {
    initialize(request, "StatusReasonMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatusReasonMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatusReasonMapForStatusReasonMapCreate(SRMObjectData data) {
    if (data != null) {
      addInput("StatusReasonMap", SRMObjectHelper.toMap(data, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }
  public void setStatusReasonMapForStatusReasonMapFind(SRMObjectFilter data) {
    if (data != null) {
      addInput("StatusReasonMap", SRMObjectHelper.toMap(data, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }
  public void setStatusReasonMapForStatusReasonMapGet(SRMObjectKeyData data) {
    if (data != null) {
      addInput("StatusReasonMap", SRMObjectKeyHelper.toMap(data, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }
  public SRMObjectData getSRMObjectDataStatusReasonMapFromStatusReasonMapCreate() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
  public SRMObjectDataList getSRMObjectDataStatusReasonMapFromStatusReasonMapFind() {
    return SRMObjectHelper.fromMapList(outputMap, "StatusReasonMapList");
  }
  public SRMObjectData getSRMObjectDataStatusReasonMapFromStatusReasonMapGet() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
  /**
   @deprecated
   */
  public void setSRMObjectFilter(SRMObjectFilter data) {
    if (data != null) {
      addInput("SRM", SRMObjectHelper.toMap(data, new HashMap()).get("SRMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSRMObjectData(SRMObjectData data) {
    if (data != null) {
      addInput("StatusReasonMap", SRMObjectHelper.toMap(data, new HashMap()).get("SRMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSRMObjectKeyData(SRMObjectKeyData data) {
    if (data != null) {
      addInput("StatusReasonMap", SRMObjectKeyHelper.toMap(data, new HashMap()).get("SRMObject"));
    }
  }
  /**
   @deprecated
   */
  public SRMObjectDataList getSRMObjectDataList() {
    return SRMObjectHelper.fromMapList(outputMap, "SRMList");
  }
  /**
   @deprecated
   */
  public SRMObjectData getSRMObjectData() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
}
