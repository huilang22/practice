/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestErrorLogEntryRequest.java
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
public final class BatchRequestErrorLogEntryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestErrorLogEntryRequest (String request, BatchRequestErrorLogEntryRequestMethod method) {
    initialize(request, "BatchRequestErrorLogEntry", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestErrorLogEntryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogDeleteList(BatchRequestErrorLogEntryObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogEntryCreate(BatchRequestErrorLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogEntryDelete(BatchRequestErrorLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogEntryFind(BatchRequestErrorLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogEntryGet(BatchRequestErrorLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public void setBatchRequestErrorLogEntryForBatchRequestErrorLogEntryUpdate(BatchRequestErrorLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestErrorLogEntry").get("BatchRequestErrorLogEntry"));
    }
  }
  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntryObjectBaseDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntryCreate() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntryObjectBaseDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntryDelete() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  public BatchRequestErrorLogEntryObjectDataList getBatchRequestErrorLogEntryObjectDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntryFind() {
    return BatchRequestErrorLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestErrorLogEntryList");
  }
  public BatchRequestErrorLogEntryObjectData getBatchRequestErrorLogEntryObjectDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntryGet() {
    return BatchRequestErrorLogEntryObjectHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  public BatchRequestErrorLogEntryObjectBaseKeyData getBatchRequestErrorLogEntryObjectBaseKeyDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntrySequence() {
    return BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntryObjectBaseDataBatchRequestErrorLogEntryFromBatchRequestErrorLogEntryUpdate() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  /**
   @deprecated
   */
  public void setBatchRequestErrorLogEntryObjectFilter(BatchRequestErrorLogEntryObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectHelper.toMap(data, new HashMap()).get("BatchRequestErrorLogEntryObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestErrorLogEntryObjectDataList getBatchRequestErrorLogEntryObjectDataList() {
    return BatchRequestErrorLogEntryObjectHelper.fromMapList(outputMap, "BatchRequestErrorLogEntryList");
  }
  /**
   @deprecated
   */
  public BatchRequestErrorLogEntryObjectData getBatchRequestErrorLogEntryObjectData() {
    return BatchRequestErrorLogEntryObjectHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  /**
   @deprecated
   */
  public void setBatchRequestErrorLogEntryObjectBaseFilter(BatchRequestErrorLogEntryObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestErrorLogEntryObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestErrorLogEntryObjectBaseData(BatchRequestErrorLogEntryObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestErrorLogEntryObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestErrorLogEntryObjectBaseKeyData(BatchRequestErrorLogEntryObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestErrorLogEntry", BatchRequestErrorLogEntryObjectBaseKeyHelper.toMap(data, new HashMap()).get("BatchRequestErrorLogEntryObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestErrorLogEntryObjectBaseKeyData getBatchRequestErrorLogEntryObjectBaseKeyData() {
    return BatchRequestErrorLogEntryObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
  /**
   @deprecated
   */
  public BatchRequestErrorLogEntryObjectBaseData getBatchRequestErrorLogEntryObjectBaseData() {
    return BatchRequestErrorLogEntryObjectBaseHelper.fromMap(outputMap, "BatchRequestErrorLogEntry");
  }
}
