/*
 * Generated code DO NOT EDIT
 * Generated file: CcAuditLogRequest.java
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
public final class CcAuditLogRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CcAuditLogRequest (String request, CcAuditLogRequestMethod method) {
    initialize(request, "CcAuditLog", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CcAuditLogRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCcAuditLogForCcAuditLogCreate(CcAuditLogObjectData data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(data, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }
  public void setCcAuditLogForCcAuditLogFind(CcAuditLogObjectFilter data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(data, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }
  public void setCcAuditLogForCcAuditLogGet(CcAuditLogObjectKeyData data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectKeyHelper.toMap(data, new HashMap(), "CcAuditLog").get("CcAuditLog"));
    }
  }
  public CcAuditLogObjectData getCcAuditLogObjectDataCcAuditLogFromCcAuditLogCreate() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
  public CcAuditLogObjectDataList getCcAuditLogObjectDataCcAuditLogFromCcAuditLogFind() {
    return CcAuditLogObjectHelper.fromMapList(outputMap, "CcAuditLogList");
  }
  public CcAuditLogObjectData getCcAuditLogObjectDataCcAuditLogFromCcAuditLogGet() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
  /**
   @deprecated
   */
  public void setCcAuditLogObjectFilter(CcAuditLogObjectFilter data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(data, new HashMap()).get("CcAuditLogObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcAuditLogObjectData(CcAuditLogObjectData data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectHelper.toMap(data, new HashMap()).get("CcAuditLogObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcAuditLogObjectKeyData(CcAuditLogObjectKeyData data) {
    if (data != null) {
      addInput("CcAuditLog", CcAuditLogObjectKeyHelper.toMap(data, new HashMap()).get("CcAuditLogObject"));
    }
  }
  /**
   @deprecated
   */
  public CcAuditLogObjectDataList getCcAuditLogObjectDataList() {
    return CcAuditLogObjectHelper.fromMapList(outputMap, "CcAuditLogList");
  }
  /**
   @deprecated
   */
  public CcAuditLogObjectData getCcAuditLogObjectData() {
    return CcAuditLogObjectHelper.fromMap(outputMap, "CcAuditLog");
  }
}
