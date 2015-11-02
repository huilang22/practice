/*
 * Generated code DO NOT EDIT
 * Generated file: BatchExecutableEnvironmentalVariableRequest.java
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
public final class BatchExecutableEnvironmentalVariableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchExecutableEnvironmentalVariableRequest (String request, BatchExecutableEnvironmentalVariableRequestMethod method) {
    initialize(request, "BatchExecutableEnvironmentalVariable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchExecutableEnvironmentalVariableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchExecutableEnvironmentalVariableForBatchExecutableEnvironmentalVariableCreate(BatchExecutableEnvironmentalVariableObjectData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(data, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
  public void setBatchExecutableEnvironmentalVariableForBatchExecutableEnvironmentalVariableDelete(BatchExecutableEnvironmentalVariableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(data, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
  public void setBatchExecutableEnvironmentalVariableForBatchExecutableEnvironmentalVariableFind(BatchExecutableEnvironmentalVariableObjectFilter data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(data, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
  public void setBatchExecutableEnvironmentalVariableForBatchExecutableEnvironmentalVariableGet(BatchExecutableEnvironmentalVariableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(data, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
  public void setBatchExecutableEnvironmentalVariableForBatchExecutableEnvironmentalVariableUpdate(BatchExecutableEnvironmentalVariableObjectData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(data, new HashMap(), "BatchExecutableEnvironmentalVariable").get("BatchExecutableEnvironmentalVariable"));
    }
  }
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariableObjectDataBatchExecutableEnvironmentalVariableFromBatchExecutableEnvironmentalVariableCreate() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariableObjectDataBatchExecutableEnvironmentalVariableFromBatchExecutableEnvironmentalVariableDelete() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
  public BatchExecutableEnvironmentalVariableObjectDataList getBatchExecutableEnvironmentalVariableObjectDataBatchExecutableEnvironmentalVariableFromBatchExecutableEnvironmentalVariableFind() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMapList(outputMap, "BatchExecutableEnvironmentalVariableList");
  }
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariableObjectDataBatchExecutableEnvironmentalVariableFromBatchExecutableEnvironmentalVariableGet() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariableObjectDataBatchExecutableEnvironmentalVariableFromBatchExecutableEnvironmentalVariableUpdate() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
  /**
   @deprecated
   */
  public void setBatchExecutableEnvironmentalVariableObjectFilter(BatchExecutableEnvironmentalVariableObjectFilter data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(data, new HashMap()).get("BatchExecutableEnvironmentalVariableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchExecutableEnvironmentalVariableObjectData(BatchExecutableEnvironmentalVariableObjectData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectHelper.toMap(data, new HashMap()).get("BatchExecutableEnvironmentalVariableObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchExecutableEnvironmentalVariableObjectKeyData(BatchExecutableEnvironmentalVariableObjectKeyData data) {
    if (data != null) {
      addInput("BatchExecutableEnvironmentalVariable", BatchExecutableEnvironmentalVariableObjectKeyHelper.toMap(data, new HashMap()).get("BatchExecutableEnvironmentalVariableObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchExecutableEnvironmentalVariableObjectDataList getBatchExecutableEnvironmentalVariableObjectDataList() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMapList(outputMap, "BatchExecutableEnvironmentalVariableList");
  }
  /**
   @deprecated
   */
  public BatchExecutableEnvironmentalVariableObjectData getBatchExecutableEnvironmentalVariableObjectData() {
    return BatchExecutableEnvironmentalVariableObjectHelper.fromMap(outputMap, "BatchExecutableEnvironmentalVariable");
  }
}
