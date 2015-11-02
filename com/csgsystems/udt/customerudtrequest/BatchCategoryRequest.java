/*
 * Generated code DO NOT EDIT
 * Generated file: BatchCategoryRequest.java
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
public final class BatchCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchCategoryRequest (String request, BatchCategoryRequestMethod method) {
    initialize(request, "BatchCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchCategoryForBatchCategoryCreate(BatchCategoryObjectData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(data, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
  public void setBatchCategoryForBatchCategoryDelete(BatchCategoryObjectKeyData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(data, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
  public void setBatchCategoryForBatchCategoryFind(BatchCategoryObjectFilter data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(data, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
  public void setBatchCategoryForBatchCategoryGet(BatchCategoryObjectKeyData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(data, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
  public void setBatchCategoryForBatchCategoryUpdate(BatchCategoryObjectData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(data, new HashMap(), "BatchCategory").get("BatchCategory"));
    }
  }
  public BatchCategoryObjectData getBatchCategoryObjectDataBatchCategoryFromBatchCategoryCreate() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
  public BatchCategoryObjectData getBatchCategoryObjectDataBatchCategoryFromBatchCategoryDelete() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
  public BatchCategoryObjectDataList getBatchCategoryObjectDataBatchCategoryFromBatchCategoryFind() {
    return BatchCategoryObjectHelper.fromMapList(outputMap, "BatchCategoryList");
  }
  public BatchCategoryObjectData getBatchCategoryObjectDataBatchCategoryFromBatchCategoryGet() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
  public BatchCategoryObjectKeyData getBatchCategoryObjectKeyDataBatchCategoryFromBatchCategorySequenceGet() {
    return BatchCategoryObjectKeyHelper.fromMap(outputMap, "BatchCategory");
  }
  public BatchCategoryObjectData getBatchCategoryObjectDataBatchCategoryFromBatchCategoryUpdate() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
  /**
   @deprecated
   */
  public void setBatchCategoryObjectFilter(BatchCategoryObjectFilter data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(data, new HashMap()).get("BatchCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchCategoryObjectData(BatchCategoryObjectData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectHelper.toMap(data, new HashMap()).get("BatchCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchCategoryObjectKeyData(BatchCategoryObjectKeyData data) {
    if (data != null) {
      addInput("BatchCategory", BatchCategoryObjectKeyHelper.toMap(data, new HashMap()).get("BatchCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchCategoryObjectDataList getBatchCategoryObjectDataList() {
    return BatchCategoryObjectHelper.fromMapList(outputMap, "BatchCategoryList");
  }
  /**
   @deprecated
   */
  public BatchCategoryObjectKeyData getBatchCategoryObjectKeyData() {
    return BatchCategoryObjectKeyHelper.fromMap(outputMap, "BatchCategory");
  }
  /**
   @deprecated
   */
  public BatchCategoryObjectData getBatchCategoryObjectData() {
    return BatchCategoryObjectHelper.fromMap(outputMap, "BatchCategory");
  }
}
