/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTypeRequest.java
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
public final class BatchTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchTypeRequest (String request, BatchTypeRequestMethod method) {
    initialize(request, "BatchType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchTypeForBatchTypeCreate(BatchTypeObjectData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(data, new HashMap(), "BatchType").get("BatchType"));
    }
  }
  public void setBatchTypeForBatchTypeDelete(BatchTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchType").get("BatchType"));
    }
  }
  public void setBatchTypeForBatchTypeFind(BatchTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(data, new HashMap(), "BatchType").get("BatchType"));
    }
  }
  public void setBatchTypeForBatchTypeGet(BatchTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchType").get("BatchType"));
    }
  }
  public void setBatchTypeForBatchTypeUpdate(BatchTypeObjectData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(data, new HashMap(), "BatchType").get("BatchType"));
    }
  }
  public BatchTypeObjectData getBatchTypeObjectDataBatchTypeFromBatchTypeCreate() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
  public BatchTypeObjectData getBatchTypeObjectDataBatchTypeFromBatchTypeDelete() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
  public BatchTypeObjectDataList getBatchTypeObjectDataBatchTypeFromBatchTypeFind() {
    return BatchTypeObjectHelper.fromMapList(outputMap, "BatchTypeList");
  }
  public BatchTypeObjectData getBatchTypeObjectDataBatchTypeFromBatchTypeGet() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
  public BatchTypeObjectKeyData getBatchTypeObjectKeyDataBatchTypeFromBatchTypeSequenceGet() {
    return BatchTypeObjectKeyHelper.fromMap(outputMap, "BatchType");
  }
  public BatchTypeObjectData getBatchTypeObjectDataBatchTypeFromBatchTypeUpdate() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
  /**
   @deprecated
   */
  public void setBatchTypeObjectFilter(BatchTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(data, new HashMap()).get("BatchTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeObjectData(BatchTypeObjectData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectHelper.toMap(data, new HashMap()).get("BatchTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTypeObjectKeyData(BatchTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchType", BatchTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchTypeObjectDataList getBatchTypeObjectDataList() {
    return BatchTypeObjectHelper.fromMapList(outputMap, "BatchTypeList");
  }
  /**
   @deprecated
   */
  public BatchTypeObjectKeyData getBatchTypeObjectKeyData() {
    return BatchTypeObjectKeyHelper.fromMap(outputMap, "BatchType");
  }
  /**
   @deprecated
   */
  public BatchTypeObjectData getBatchTypeObjectData() {
    return BatchTypeObjectHelper.fromMap(outputMap, "BatchType");
  }
}
