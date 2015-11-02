/*
 * Generated code DO NOT EDIT
 * Generated file: BatchStatusRequest.java
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
public final class BatchStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchStatusRequest (String request, BatchStatusRequestMethod method) {
    initialize(request, "BatchStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchStatusForBatchStatusFind(BatchStatusObjectFilter data) {
    if (data != null) {
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(data, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }
  public void setBatchStatusForBatchStatusGet(BatchStatusObjectKeyData data) {
    if (data != null) {
      addInput("BatchStatus", BatchStatusObjectKeyHelper.toMap(data, new HashMap(), "BatchStatus").get("BatchStatus"));
    }
  }
  public BatchStatusObjectDataList getBatchStatusObjectDataBatchStatusFromBatchStatusFind() {
    return BatchStatusObjectHelper.fromMapList(outputMap, "BatchStatusList");
  }
  public BatchStatusObjectData getBatchStatusObjectDataBatchStatusFromBatchStatusGet() {
    return BatchStatusObjectHelper.fromMap(outputMap, "BatchStatus");
  }
  /**
   @deprecated
   */
  public void setBatchStatusObjectFilter(BatchStatusObjectFilter data) {
    if (data != null) {
      addInput("BatchStatus", BatchStatusObjectHelper.toMap(data, new HashMap()).get("BatchStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchStatusObjectKeyData(BatchStatusObjectKeyData data) {
    if (data != null) {
      addInput("BatchStatus", BatchStatusObjectKeyHelper.toMap(data, new HashMap()).get("BatchStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchStatusObjectDataList getBatchStatusObjectDataList() {
    return BatchStatusObjectHelper.fromMapList(outputMap, "BatchStatusList");
  }
  /**
   @deprecated
   */
  public BatchStatusObjectData getBatchStatusObjectData() {
    return BatchStatusObjectHelper.fromMap(outputMap, "BatchStatus");
  }
}
