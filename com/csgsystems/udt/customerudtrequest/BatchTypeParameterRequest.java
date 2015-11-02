/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeParameterRequest.java
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
public final class BatchTypeParameterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchTypeParameterRequest (String request, BatchTypeParameterRequestMethod method) {
    initialize(request, "BatchTypeParameter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchTypeParameterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchTypeParameterForBatchTypeParameterCreate(BatchTypeParameterObjectData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(data, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
  public void setBatchTypeParameterForBatchTypeParameterDelete(BatchTypeParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(data, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
  public void setBatchTypeParameterForBatchTypeParameterFind(BatchTypeParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(data, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
  public void setBatchTypeParameterForBatchTypeParameterGet(BatchTypeParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(data, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
  public void setBatchTypeParameterForBatchTypeParameterUpdate(BatchTypeParameterObjectData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(data, new HashMap(), "BatchTypeParameter").get("BatchTypeParameter"));
    }
  }
  public BatchTypeParameterObjectData getBatchTypeParameterObjectDataBatchTypeParameterFromBatchTypeParameterCreate() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  public BatchTypeParameterObjectData getBatchTypeParameterObjectDataBatchTypeParameterFromBatchTypeParameterDelete() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  public BatchTypeParameterObjectDataList getBatchTypeParameterObjectDataBatchTypeParameterFromBatchTypeParameterFind() {
    return BatchTypeParameterObjectHelper.fromMapList(outputMap, "BatchTypeParameterList");
  }
  public BatchTypeParameterObjectData getBatchTypeParameterObjectDataBatchTypeParameterFromBatchTypeParameterGet() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  public BatchTypeParameterObjectKeyData getBatchTypeParameterObjectKeyDataBatchTypeParameterFromBatchTypeParameterSequenceGet() {
    return BatchTypeParameterObjectKeyHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  public BatchTypeParameterObjectData getBatchTypeParameterObjectDataBatchTypeParameterFromBatchTypeParameterUpdate() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  /**
   @deprecated
   */
  public void setBatchTypeParameterObjectFilter(BatchTypeParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(data, new HashMap()).get("BatchTypeParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeParameterObjectData(BatchTypeParameterObjectData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectHelper.toMap(data, new HashMap()).get("BatchTypeParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeParameterObjectKeyData(BatchTypeParameterObjectKeyData data) {
    if (data != null) {
      addInput("BatchTypeParameter", BatchTypeParameterObjectKeyHelper.toMap(data, new HashMap()).get("BatchTypeParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchTypeParameterObjectDataList getBatchTypeParameterObjectDataList() {
    return BatchTypeParameterObjectHelper.fromMapList(outputMap, "BatchTypeParameterList");
  }
  /**
   @deprecated
   */
  public BatchTypeParameterObjectKeyData getBatchTypeParameterObjectKeyData() {
    return BatchTypeParameterObjectKeyHelper.fromMap(outputMap, "BatchTypeParameter");
  }
  /**
   @deprecated
   */
  public BatchTypeParameterObjectData getBatchTypeParameterObjectData() {
    return BatchTypeParameterObjectHelper.fromMap(outputMap, "BatchTypeParameter");
  }
}
