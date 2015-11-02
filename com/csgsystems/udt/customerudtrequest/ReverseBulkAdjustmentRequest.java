/*
 * Generated code DO NOT EDIT
 * Generated file: ReverseBulkAdjustmentRequest.java
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

import com.csgsystems.bat.data.*;
import com.csgsystems.bp.data.*;
public final class ReverseBulkAdjustmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ReverseBulkAdjustmentRequest (String request, ReverseBulkAdjustmentRequestMethod method) {
    initialize(request, "ReverseBulkAdjustment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ReverseBulkAdjustmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestForReverseBulkAdjustmentGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForReverseBulkAdjustmentUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setReasonCodeForReverseBulkAdjustmentUpdate(Integer data) {
    if (data != null) {
      addInput("ReasonCode", data);
    }
  }
  public ReverseBulkAdjustmentGetOutputData getReverseBulkAdjustmentGetOutputDataReverseBulkAdjustmentGetOutputDataFromReverseBulkAdjustmentGet() {
    return ReverseBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromReverseBulkAdjustmentUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectData(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectKeyData(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestObjectData getBatchRequestObjectData() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public void setReasonCode(Integer data) {
    if (data != null) {
      addInput("ReasonCode", data);
    }
  }
  /**
   @deprecated
   */
  public ReverseBulkAdjustmentGetOutputData getReverseBulkAdjustmentGetOutputData() {
    return ReverseBulkAdjustmentGetOutputHelper.fromMap(outputMap);
  }
}
