/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParameterRequest.java
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
public final class BatchRequestParameterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestParameterRequest (String request, BatchRequestParameterRequestMethod method) {
    initialize(request, "BatchRequestParameter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestParameterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestParameterForBatchRequestParameterCreate(BatchRequestParameterObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
  public void setBatchRequestParameterForBatchRequestParameterDelete(BatchRequestParameterObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
  public void setBatchRequestParameterForBatchRequestParameterFind(BatchRequestParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(data, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
  public void setBatchRequestParameterForBatchRequestParameterGet(BatchRequestParameterObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
  public void setBatchRequestParameterForBatchRequestParameterUpdate(BatchRequestParameterObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestParameter").get("BatchRequestParameter"));
    }
  }
  public BatchRequestParameterObjectBaseData getBatchRequestParameterObjectBaseDataBatchRequestParameterFromBatchRequestParameterCreate() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
  public BatchRequestParameterObjectBaseData getBatchRequestParameterObjectBaseDataBatchRequestParameterFromBatchRequestParameterDelete() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
  public BatchRequestParameterObjectDataList getBatchRequestParameterObjectDataBatchRequestParameterFromBatchRequestParameterFind() {
    return BatchRequestParameterObjectHelper.fromMapList(outputMap, "BatchRequestParameterList");
  }
  public BatchRequestParameterObjectData getBatchRequestParameterObjectDataBatchRequestParameterFromBatchRequestParameterGet() {
    return BatchRequestParameterObjectHelper.fromMap(outputMap, "BatchRequestParameter");
  }
  public BatchRequestParameterObjectBaseData getBatchRequestParameterObjectBaseDataBatchRequestParameterFromBatchRequestParameterUpdate() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParameterObjectFilter(BatchRequestParameterObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectHelper.toMap(data, new HashMap()).get("BatchRequestParameterObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestParameterObjectDataList getBatchRequestParameterObjectDataList() {
    return BatchRequestParameterObjectHelper.fromMapList(outputMap, "BatchRequestParameterList");
  }
  /**
   @deprecated
   */
  public BatchRequestParameterObjectData getBatchRequestParameterObjectData() {
    return BatchRequestParameterObjectHelper.fromMap(outputMap, "BatchRequestParameter");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParameterObjectBaseData(BatchRequestParameterObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestParameterObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParameterObjectBaseKeyData(BatchRequestParameterObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParameter", BatchRequestParameterObjectBaseKeyHelper.toMap(data, new HashMap()).get("BatchRequestParameterObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestParameterObjectBaseData getBatchRequestParameterObjectBaseData() {
    return BatchRequestParameterObjectBaseHelper.fromMap(outputMap, "BatchRequestParameter");
  }
}
