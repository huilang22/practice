/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestActivityLogEntryRequest.java
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
public final class BatchRequestActivityLogEntryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestActivityLogEntryRequest (String request, BatchRequestActivityLogEntryRequestMethod method) {
    initialize(request, "BatchRequestActivityLogEntry", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestActivityLogEntryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestActivityLogEntryForBatchRequestActivityLogEntryCreate(BatchRequestActivityLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
  public void setBatchRequestActivityLogEntryForBatchRequestActivityLogEntryDelete(BatchRequestActivityLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
  public void setBatchRequestActivityLogEntryForBatchRequestActivityLogEntryFind(BatchRequestActivityLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(data, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
  public void setBatchRequestActivityLogEntryForBatchRequestActivityLogEntryGet(BatchRequestActivityLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
  public void setBatchRequestActivityLogEntryForBatchRequestActivityLogEntryUpdate(BatchRequestActivityLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestActivityLogEntry").get("BatchRequestActivityLogEntry"));
    }
  }
  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntryObjectBaseDataBatchRequestActivityLogEntryFromBatchRequestActivityLogEntryCreate() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntryObjectBaseDataBatchRequestActivityLogEntryFromBatchRequestActivityLogEntryDelete() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
  public BatchRequestActivityLogEntryObjectDataList getBatchRequestActivityLogEntryObjectDataBatchRequestActivityLogEntryFromBatchRequestActivityLogEntryFind() {
    return BatchRequestActivityLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestActivityLogEntryList");
  }
  public BatchRequestActivityLogEntryObjectData getBatchRequestActivityLogEntryObjectDataBatchRequestActivityLogEntryFromBatchRequestActivityLogEntryGet() {
    return BatchRequestActivityLogEntryObjectHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntryObjectBaseDataBatchRequestActivityLogEntryFromBatchRequestActivityLogEntryUpdate() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
  /**
   @deprecated
   */
  public void setBatchRequestActivityLogEntryObjectFilter(BatchRequestActivityLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectHelper.toMap(data, new HashMap()).get("BatchRequestActivityLogEntryObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestActivityLogEntryObjectDataList getBatchRequestActivityLogEntryObjectDataList() {
    return BatchRequestActivityLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestActivityLogEntryList");
  }
  /**
   @deprecated
   */
  public BatchRequestActivityLogEntryObjectData getBatchRequestActivityLogEntryObjectData() {
    return BatchRequestActivityLogEntryObjectHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
  /**
   @deprecated
   */
  public void setBatchRequestActivityLogEntryObjectBaseData(BatchRequestActivityLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestActivityLogEntryObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestActivityLogEntryObjectBaseKeyData(BatchRequestActivityLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestActivityLogEntry", BatchRequestActivityLogEntryObjectBaseKeyHelper.toMap(data, new HashMap()).get("BatchRequestActivityLogEntryObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestActivityLogEntryObjectBaseData getBatchRequestActivityLogEntryObjectBaseData() {
    return BatchRequestActivityLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestActivityLogEntry");
  }
}
