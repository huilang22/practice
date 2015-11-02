/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeStageRequest.java
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
public final class BatchTypeStageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchTypeStageRequest (String request, BatchTypeStageRequestMethod method) {
    initialize(request, "BatchTypeStage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchTypeStageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchTypeStageForBatchTypeStageCreate(BatchTypeStageObjectData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(data, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
  public void setBatchTypeStageForBatchTypeStageDelete(BatchTypeStageObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(data, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
  public void setBatchTypeStageForBatchTypeStageFind(BatchTypeStageObjectFilter data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(data, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
  public void setBatchTypeStageForBatchTypeStageGet(BatchTypeStageObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(data, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
  public void setBatchTypeStageForBatchTypeStageUpdate(BatchTypeStageObjectData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(data, new HashMap(), "BatchTypeStage").get("BatchTypeStage"));
    }
  }
  public BatchTypeStageObjectData getBatchTypeStageObjectDataBatchTypeStageFromBatchTypeStageCreate() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
  public BatchTypeStageObjectData getBatchTypeStageObjectDataBatchTypeStageFromBatchTypeStageDelete() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
  public BatchTypeStageObjectDataList getBatchTypeStageObjectDataBatchTypeStageFromBatchTypeStageFind() {
    return BatchTypeStageObjectHelper.fromMapList(outputMap, "BatchTypeStageList");
  }
  public BatchTypeStageObjectData getBatchTypeStageObjectDataBatchTypeStageFromBatchTypeStageGet() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
  public BatchTypeStageObjectKeyData getBatchTypeStageObjectKeyDataBatchTypeStageFromBatchTypeStageSequenceGet() {
    return BatchTypeStageObjectKeyHelper.fromMap(outputMap, "BatchTypeStage");
  }
  public BatchTypeStageObjectData getBatchTypeStageObjectDataBatchTypeStageFromBatchTypeStageUpdate() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
  /**
   @deprecated
   */
  public void setBatchTypeStageObjectFilter(BatchTypeStageObjectFilter data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(data, new HashMap()).get("BatchTypeStageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeStageObjectData(BatchTypeStageObjectData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectHelper.toMap(data, new HashMap()).get("BatchTypeStageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeStageObjectKeyData(BatchTypeStageObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeStage", BatchTypeStageObjectKeyHelper.toMap(data, new HashMap()).get("BatchTypeStageObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchTypeStageObjectDataList getBatchTypeStageObjectDataList() {
    return BatchTypeStageObjectHelper.fromMapList(outputMap, "BatchTypeStageList");
  }
  /**
   @deprecated
   */
  public BatchTypeStageObjectKeyData getBatchTypeStageObjectKeyData() {
    return BatchTypeStageObjectKeyHelper.fromMap(outputMap, "BatchTypeStage");
  }
  /**
   @deprecated
   */
  public BatchTypeStageObjectData getBatchTypeStageObjectData() {
    return BatchTypeStageObjectHelper.fromMap(outputMap, "BatchTypeStage");
  }
}
