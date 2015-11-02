/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyParameterRequest.java
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
public final class BatchRequestNotifyParameterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestNotifyParameterRequest (String request, BatchRequestNotifyParameterRequestMethod method) {
    initialize(request, "BatchRequestNotifyParameter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestNotifyParameterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterCreate(BatchRequestNotifyParameterObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterDelete(BatchRequestNotifyParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterFind(BatchRequestNotifyParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterFindCount(BatchRequestNotifyParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterGet(BatchRequestNotifyParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public void setBatchRequestNotifyParameterForBatchRequestNotifyParameterUpdate(BatchRequestNotifyParameterObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyParameter").get("BatchRequestNotifyParameter"));
    }
  }
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameterObjectDataBatchRequestNotifyParameterFromBatchRequestNotifyParameterCreate() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameterObjectDataBatchRequestNotifyParameterFromBatchRequestNotifyParameterDelete() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
  public BatchRequestNotifyParameterObjectDataList getBatchRequestNotifyParameterObjectDataBatchRequestNotifyParameterFromBatchRequestNotifyParameterFind() {
    return BatchRequestNotifyParameterObjectHelper.fromMapList(outputMap, "BatchRequestNotifyParameterList");
  }
  public Integer getIntegerTotalCountFromBatchRequestNotifyParameterFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameterObjectDataBatchRequestNotifyParameterFromBatchRequestNotifyParameterGet() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameterObjectDataBatchRequestNotifyParameterFromBatchRequestNotifyParameterUpdate() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyParameterObjectFilter(BatchRequestNotifyParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap()).get("BatchRequestNotifyParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyParameterObjectData(BatchRequestNotifyParameterObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectHelper.toMap(data, new HashMap()).get("BatchRequestNotifyParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyParameterObjectKeyData(BatchRequestNotifyParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyParameter", BatchRequestNotifyParameterObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestNotifyParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestNotifyParameterObjectDataList getBatchRequestNotifyParameterObjectDataList() {
    return BatchRequestNotifyParameterObjectHelper.fromMapList(outputMap, "BatchRequestNotifyParameterList");
  }
  /**
   @deprecated
   */
  public BatchRequestNotifyParameterObjectData getBatchRequestNotifyParameterObjectData() {
    return BatchRequestNotifyParameterObjectHelper.fromMap(outputMap, "BatchRequestNotifyParameter");
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
