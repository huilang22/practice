/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableRequest.java
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
public final class BatchExecutableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchExecutableRequest (String request, BatchExecutableRequestMethod method) {
    initialize(request, "BatchExecutable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchExecutableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchExecutableForBatchExecutableCreate(BatchExecutableObjectData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(data, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
  public void setBatchExecutableForBatchExecutableDelete(BatchExecutableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(data, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
  public void setBatchExecutableForBatchExecutableFind(BatchExecutableObjectFilter data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(data, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
  public void setBatchExecutableForBatchExecutableGet(BatchExecutableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(data, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
  public void setBatchExecutableForBatchExecutableUpdate(BatchExecutableObjectData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(data, new HashMap(), "BatchExecutable").get("BatchExecutable"));
    }
  }
  public BatchExecutableObjectData getBatchExecutableObjectDataBatchExecutableFromBatchExecutableCreate() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
  public BatchExecutableObjectData getBatchExecutableObjectDataBatchExecutableFromBatchExecutableDelete() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
  public BatchExecutableObjectDataList getBatchExecutableObjectDataBatchExecutableFromBatchExecutableFind() {
    return BatchExecutableObjectHelper.fromMapList(outputMap, "BatchExecutableList");
  }
  public BatchExecutableObjectData getBatchExecutableObjectDataBatchExecutableFromBatchExecutableGet() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
  public BatchExecutableObjectKeyData getBatchExecutableObjectKeyDataBatchExecutableFromBatchExecutableSequenceGet() {
    return BatchExecutableObjectKeyHelper.fromMap(outputMap, "BatchExecutable");
  }
  public BatchExecutableObjectData getBatchExecutableObjectDataBatchExecutableFromBatchExecutableUpdate() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
  /**
   @deprecated
   */
  public void setBatchExecutableObjectFilter(BatchExecutableObjectFilter data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(data, new HashMap()).get("BatchExecutableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchExecutableObjectData(BatchExecutableObjectData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectHelper.toMap(data, new HashMap()).get("BatchExecutableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchExecutableObjectKeyData(BatchExecutableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutable", BatchExecutableObjectKeyHelper.toMap(data, new HashMap()).get("BatchExecutableObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchExecutableObjectDataList getBatchExecutableObjectDataList() {
    return BatchExecutableObjectHelper.fromMapList(outputMap, "BatchExecutableList");
  }
  /**
   @deprecated
   */
  public BatchExecutableObjectKeyData getBatchExecutableObjectKeyData() {
    return BatchExecutableObjectKeyHelper.fromMap(outputMap, "BatchExecutable");
  }
  /**
   @deprecated
   */
  public BatchExecutableObjectData getBatchExecutableObjectData() {
    return BatchExecutableObjectHelper.fromMap(outputMap, "BatchExecutable");
  }
}
