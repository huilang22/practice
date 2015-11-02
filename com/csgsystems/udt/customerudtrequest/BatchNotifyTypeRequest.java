/*
 * Generated code DO NOT EDIT
 * Generated file: BatchNotifyTypeRequest.java
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
public final class BatchNotifyTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchNotifyTypeRequest (String request, BatchNotifyTypeRequestMethod method) {
    initialize(request, "BatchNotifyType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchNotifyTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchNotifyTypeForBatchNotifyTypeCreate(BatchNotifyTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
  public void setBatchNotifyTypeForBatchNotifyTypeDelete(BatchNotifyTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
  public void setBatchNotifyTypeForBatchNotifyTypeFind(BatchNotifyTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
  public void setBatchNotifyTypeForBatchNotifyTypeGet(BatchNotifyTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
  public void setBatchNotifyTypeForBatchNotifyTypeUpdate(BatchNotifyTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(data, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
  public BatchNotifyTypeObjectData getBatchNotifyTypeObjectDataBatchNotifyTypeFromBatchNotifyTypeCreate() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
  public BatchNotifyTypeObjectData getBatchNotifyTypeObjectDataBatchNotifyTypeFromBatchNotifyTypeDelete() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
  public BatchNotifyTypeObjectDataList getBatchNotifyTypeObjectDataBatchNotifyTypeFromBatchNotifyTypeFind() {
    return BatchNotifyTypeObjectHelper.fromMapList(outputMap, "BatchNotifyTypeList");
  }
  public BatchNotifyTypeObjectData getBatchNotifyTypeObjectDataBatchNotifyTypeFromBatchNotifyTypeGet() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
  public BatchNotifyTypeObjectData getBatchNotifyTypeObjectDataBatchNotifyTypeFromBatchNotifyTypeUpdate() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
  /**
   @deprecated
   */
  public void setBatchNotifyTypeObjectFilter(BatchNotifyTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(data, new HashMap()).get("BatchNotifyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchNotifyTypeObjectData(BatchNotifyTypeObjectData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(data, new HashMap()).get("BatchNotifyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchNotifyTypeObjectKeyData(BatchNotifyTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchNotifyType", BatchNotifyTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchNotifyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchNotifyTypeObjectDataList getBatchNotifyTypeObjectDataList() {
    return BatchNotifyTypeObjectHelper.fromMapList(outputMap, "BatchNotifyTypeList");
  }
  /**
   @deprecated
   */
  public BatchNotifyTypeObjectData getBatchNotifyTypeObjectData() {
    return BatchNotifyTypeObjectHelper.fromMap(outputMap, "BatchNotifyType");
  }
}
