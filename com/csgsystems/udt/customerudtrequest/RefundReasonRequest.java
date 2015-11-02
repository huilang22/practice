/*
 * Generated code DO NOT EDIT
 * Generated file: RefundReasonRequest.java
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
public final class RefundReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RefundReasonRequest (String request, RefundReasonRequestMethod method) {
    initialize(request, "RefundReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RefundReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRefundReasonForRefundReasonCreate(RefundReasonObjectData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(data, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
  public void setRefundReasonForRefundReasonDelete(RefundReasonObjectKeyData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(data, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
  public void setRefundReasonForRefundReasonFind(RefundReasonObjectFilter data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(data, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
  public void setRefundReasonForRefundReasonGet(RefundReasonObjectKeyData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(data, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
  public void setRefundReasonForRefundReasonUpdate(RefundReasonObjectData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(data, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
  public RefundReasonObjectData getRefundReasonObjectDataRefundReasonFromRefundReasonCreate() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
  public RefundReasonObjectData getRefundReasonObjectDataRefundReasonFromRefundReasonDelete() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
  public RefundReasonObjectDataList getRefundReasonObjectDataRefundReasonFromRefundReasonFind() {
    return RefundReasonObjectHelper.fromMapList(outputMap, "RefundReasonList");
  }
  public RefundReasonObjectData getRefundReasonObjectDataRefundReasonFromRefundReasonGet() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
  public RefundReasonObjectData getRefundReasonObjectDataRefundReasonFromRefundReasonUpdate() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
  /**
   @deprecated
   */
  public void setRefundReasonObjectFilter(RefundReasonObjectFilter data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(data, new HashMap()).get("RefundReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRefundReasonObjectData(RefundReasonObjectData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(data, new HashMap()).get("RefundReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRefundReasonObjectKeyData(RefundReasonObjectKeyData data) {
    if (data != null) {
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(data, new HashMap()).get("RefundReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public RefundReasonObjectDataList getRefundReasonObjectDataList() {
    return RefundReasonObjectHelper.fromMapList(outputMap, "RefundReasonList");
  }
  /**
   @deprecated
   */
  public RefundReasonObjectData getRefundReasonObjectData() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
