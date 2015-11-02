/*
 * Generated code DO NOT EDIT
 * Generated file: CsrAccountSegmentRequest.java
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
public final class CsrAccountSegmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CsrAccountSegmentRequest (String request, CsrAccountSegmentRequestMethod method) {
    initialize(request, "CsrAccountSegment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CsrAccountSegmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCsrAccountSegmentForCsrAccountSegmentCreate(CsrAccountSegmentObjectData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(data, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
  public void setCsrAccountSegmentForCsrAccountSegmentDelete(CsrAccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(data, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
  public void setCsrAccountSegmentForCsrAccountSegmentFind(CsrAccountSegmentObjectFilter data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(data, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
  public void setCsrAccountSegmentForCsrAccountSegmentGet(CsrAccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(data, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
  public void setCsrAccountSegmentForCsrAccountSegmentUpdate(CsrAccountSegmentObjectData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(data, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
  public CsrAccountSegmentObjectData getCsrAccountSegmentObjectDataCsrAccountSegmentFromCsrAccountSegmentCreate() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
  public CsrAccountSegmentObjectData getCsrAccountSegmentObjectDataCsrAccountSegmentFromCsrAccountSegmentDelete() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
  public CsrAccountSegmentObjectDataList getCsrAccountSegmentObjectDataCsrAccountSegmentFromCsrAccountSegmentFind() {
    return CsrAccountSegmentObjectHelper.fromMapList(outputMap, "CsrAccountSegmentList");
  }
  public CsrAccountSegmentObjectData getCsrAccountSegmentObjectDataCsrAccountSegmentFromCsrAccountSegmentGet() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
  public CsrAccountSegmentObjectData getCsrAccountSegmentObjectDataCsrAccountSegmentFromCsrAccountSegmentUpdate() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
  /**
   @deprecated
   */
  public void setCsrAccountSegmentObjectFilter(CsrAccountSegmentObjectFilter data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(data, new HashMap()).get("CsrAccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrAccountSegmentObjectData(CsrAccountSegmentObjectData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(data, new HashMap()).get("CsrAccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrAccountSegmentObjectKeyData(CsrAccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectKeyHelper.toMap(data, new HashMap()).get("CsrAccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public CsrAccountSegmentObjectDataList getCsrAccountSegmentObjectDataList() {
    return CsrAccountSegmentObjectHelper.fromMapList(outputMap, "CsrAccountSegmentList");
  }
  /**
   @deprecated
   */
  public CsrAccountSegmentObjectData getCsrAccountSegmentObjectData() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
