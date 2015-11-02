/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyEventTypeRequest.java
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
public final class BatchNotifyEventTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchNotifyEventTypeRequest (String request, BatchNotifyEventTypeRequestMethod method) {
    initialize(request, "BatchNotifyEventType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchNotifyEventTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchNotifyEventTypeForBatchNotifyEventTypeCreate(BatchNotifyEventTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
  public void setBatchNotifyEventTypeForBatchNotifyEventTypeDelete(BatchNotifyEventTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
  public void setBatchNotifyEventTypeForBatchNotifyEventTypeFind(BatchNotifyEventTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
  public void setBatchNotifyEventTypeForBatchNotifyEventTypeGet(BatchNotifyEventTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
  public void setBatchNotifyEventTypeForBatchNotifyEventTypeUpdate(BatchNotifyEventTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }
  public BatchNotifyEventTypeObjectData getBatchNotifyEventTypeObjectDataBatchNotifyEventTypeFromBatchNotifyEventTypeCreate() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
  public BatchNotifyEventTypeObjectData getBatchNotifyEventTypeObjectDataBatchNotifyEventTypeFromBatchNotifyEventTypeDelete() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
  public BatchNotifyEventTypeObjectDataList getBatchNotifyEventTypeObjectDataBatchNotifyEventTypeFromBatchNotifyEventTypeFind() {
    return BatchNotifyEventTypeObjectHelper.fromMapList(outputMap, "BatchNotifyEventTypeList");
  }
  public BatchNotifyEventTypeObjectData getBatchNotifyEventTypeObjectDataBatchNotifyEventTypeFromBatchNotifyEventTypeGet() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
  public BatchNotifyEventTypeObjectData getBatchNotifyEventTypeObjectDataBatchNotifyEventTypeFromBatchNotifyEventTypeUpdate() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
  /**
   @deprecated
   */
  public void setBatchNotifyEventTypeObjectFilter(BatchNotifyEventTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(data, new HashMap()).get("BatchNotifyEventTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchNotifyEventTypeObjectData(BatchNotifyEventTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(data, new HashMap()).get("BatchNotifyEventTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchNotifyEventTypeObjectKeyData(BatchNotifyEventTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchNotifyEventTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchNotifyEventTypeObjectDataList getBatchNotifyEventTypeObjectDataList() {
    return BatchNotifyEventTypeObjectHelper.fromMapList(outputMap, "BatchNotifyEventTypeList");
  }
  /**
   @deprecated
   */
  public BatchNotifyEventTypeObjectData getBatchNotifyEventTypeObjectData() {
    return BatchNotifyEventTypeObjectHelper.fromMap(outputMap, "BatchNotifyEventType");
  }
}
