/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestExecuteLogEntryRequest.java
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
public final class BatchRequestExecuteLogEntryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestExecuteLogEntryRequest (String request, BatchRequestExecuteLogEntryRequestMethod method) {
    initialize(request, "BatchRequestExecuteLogEntry", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestExecuteLogEntryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestExecuteLogEntryForBatchRequestExecuteLogEntryCreate(BatchRequestExecuteLogEntryObjectData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(data, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
  public void setBatchRequestExecuteLogEntryForBatchRequestExecuteLogEntryDelete(BatchRequestExecuteLogEntryObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
  public void setBatchRequestExecuteLogEntryForBatchRequestExecuteLogEntryFind(BatchRequestExecuteLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(data, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
  public void setBatchRequestExecuteLogEntryForBatchRequestExecuteLogEntryGet(BatchRequestExecuteLogEntryObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
  public void setBatchRequestExecuteLogEntryForBatchRequestExecuteLogEntryUpdate(BatchRequestExecuteLogEntryObjectData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(data, new HashMap(), "BatchRequestExecuteLogEntry").get("BatchRequestExecuteLogEntry"));
    }
  }
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntryObjectDataBatchRequestExecuteLogEntryFromBatchRequestExecuteLogEntryCreate() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntryObjectDataBatchRequestExecuteLogEntryFromBatchRequestExecuteLogEntryDelete() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
  public BatchRequestExecuteLogEntryObjectDataList getBatchRequestExecuteLogEntryObjectDataBatchRequestExecuteLogEntryFromBatchRequestExecuteLogEntryFind() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestExecuteLogEntryList");
  }
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntryObjectDataBatchRequestExecuteLogEntryFromBatchRequestExecuteLogEntryGet() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntryObjectDataBatchRequestExecuteLogEntryFromBatchRequestExecuteLogEntryUpdate() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
  /**
   @deprecated
   */
  public void setBatchRequestExecuteLogEntryObjectFilter(BatchRequestExecuteLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(data, new HashMap()).get("BatchRequestExecuteLogEntryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestExecuteLogEntryObjectData(BatchRequestExecuteLogEntryObjectData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectHelper.toMap(data, new HashMap()).get("BatchRequestExecuteLogEntryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestExecuteLogEntryObjectKeyData(BatchRequestExecuteLogEntryObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestExecuteLogEntry", BatchRequestExecuteLogEntryObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestExecuteLogEntryObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestExecuteLogEntryObjectDataList getBatchRequestExecuteLogEntryObjectDataList() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestExecuteLogEntryList");
  }
  /**
   @deprecated
   */
  public BatchRequestExecuteLogEntryObjectData getBatchRequestExecuteLogEntryObjectData() {
    return BatchRequestExecuteLogEntryObjectHelper.fromMap(outputMap, "BatchRequestExecuteLogEntry");
  }
}
