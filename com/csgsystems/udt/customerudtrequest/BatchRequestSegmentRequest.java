/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestSegmentRequest.java
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
public final class BatchRequestSegmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestSegmentRequest (String request, BatchRequestSegmentRequestMethod method) {
    initialize(request, "BatchRequestSegment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestSegmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestSegmentForBatchRequestSegmentCreate(BatchRequestSegmentObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentDelete(BatchRequestSegmentObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentDeleteList(BatchRequestSegmentObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentFind(BatchRequestSegmentObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentFindForUpdate(BatchRequestSegmentObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentGet(BatchRequestSegmentObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentUpdate(BatchRequestSegmentObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentForBatchRequestSegmentUpdateList(BatchRequestSegmentObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestSegment").get("BatchRequestSegment"));
    }
  }
  public void setBatchRequestSegmentUpdateListFilterForBatchRequestSegmentUpdateList(BatchRequestSegmentObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestSegmentUpdateListFilter", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestSegmentUpdateListFilter").get("BatchRequestSegmentUpdateListFilter"));
    }
  }
  public BatchRequestSegmentObjectBaseData getBatchRequestSegmentObjectBaseDataBatchRequestSegmentFromBatchRequestSegmentCreate() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  public BatchRequestSegmentObjectBaseData getBatchRequestSegmentObjectBaseDataBatchRequestSegmentFromBatchRequestSegmentDelete() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  public BatchRequestSegmentObjectDataList getBatchRequestSegmentObjectDataBatchRequestSegmentFromBatchRequestSegmentFind() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
  public BatchRequestSegmentObjectDataList getBatchRequestSegmentObjectDataBatchRequestSegmentFromBatchRequestSegmentFindForUpdate() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
  public BatchRequestSegmentObjectData getBatchRequestSegmentObjectDataBatchRequestSegmentFromBatchRequestSegmentGet() {
    return BatchRequestSegmentObjectHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  public BatchRequestSegmentObjectBaseKeyData getBatchRequestSegmentObjectBaseKeyDataBatchRequestSegmentFromBatchRequestSegmentSequenceGet() {
    return BatchRequestSegmentObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  public BatchRequestSegmentObjectBaseData getBatchRequestSegmentObjectBaseDataBatchRequestSegmentFromBatchRequestSegmentUpdate() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  /**
   @deprecated
   */
  public void setBatchRequestSegmentObjectFilter(BatchRequestSegmentObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectHelper.toMap(data, new HashMap()).get("BatchRequestSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestSegmentObjectDataList getBatchRequestSegmentObjectDataList() {
    return BatchRequestSegmentObjectHelper.fromMapList(outputMap, "BatchRequestSegmentList");
  }
  /**
   @deprecated
   */
  public BatchRequestSegmentObjectData getBatchRequestSegmentObjectData() {
    return BatchRequestSegmentObjectHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  /**
   @deprecated
   */
  public void setBatchRequestSegmentObjectBaseFilter(BatchRequestSegmentObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestSegmentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestSegmentObjectBaseData(BatchRequestSegmentObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestSegmentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestSegmentObjectBaseKeyData(BatchRequestSegmentObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestSegment", BatchRequestSegmentObjectBaseKeyHelper.toMap(data, new HashMap()).get("BatchRequestSegmentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestSegmentObjectBaseKeyData getBatchRequestSegmentObjectBaseKeyData() {
    return BatchRequestSegmentObjectBaseKeyHelper.fromMap(outputMap, "BatchRequestSegment");
  }
  /**
   @deprecated
   */
  public BatchRequestSegmentObjectBaseData getBatchRequestSegmentObjectBaseData() {
    return BatchRequestSegmentObjectBaseHelper.fromMap(outputMap, "BatchRequestSegment");
  }
}
