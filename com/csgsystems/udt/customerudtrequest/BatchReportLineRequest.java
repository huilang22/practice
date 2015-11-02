/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportLineRequest.java
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
public final class BatchReportLineRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchReportLineRequest (String request, BatchReportLineRequestMethod method) {
    initialize(request, "BatchReportLine", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchReportLineRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchReportLineForBatchReportLineCreate(BatchReportLineObjectData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(data, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
  public void setBatchReportLineForBatchReportLineDelete(BatchReportLineObjectKeyData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(data, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
  public void setBatchReportLineForBatchReportLineFind(BatchReportLineObjectFilter data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(data, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
  public void setBatchReportLineForBatchReportLineGet(BatchReportLineObjectKeyData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(data, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
  public void setBatchReportLineForBatchReportLineUpdate(BatchReportLineObjectData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(data, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
  public BatchReportLineObjectData getBatchReportLineObjectDataBatchReportLineFromBatchReportLineCreate() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
  public BatchReportLineObjectData getBatchReportLineObjectDataBatchReportLineFromBatchReportLineDelete() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
  public BatchReportLineObjectDataList getBatchReportLineObjectDataBatchReportLineFromBatchReportLineFind() {
    return BatchReportLineObjectHelper.fromMapList(outputMap, "BatchReportLineList");
  }
  public BatchReportLineObjectData getBatchReportLineObjectDataBatchReportLineFromBatchReportLineGet() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
  public BatchReportLineObjectData getBatchReportLineObjectDataBatchReportLineFromBatchReportLineUpdate() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
  /**
   @deprecated
   */
  public void setBatchReportLineObjectFilter(BatchReportLineObjectFilter data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(data, new HashMap()).get("BatchReportLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchReportLineObjectData(BatchReportLineObjectData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(data, new HashMap()).get("BatchReportLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchReportLineObjectKeyData(BatchReportLineObjectKeyData data) {
    if (data != null) {
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(data, new HashMap()).get("BatchReportLineObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchReportLineObjectDataList getBatchReportLineObjectDataList() {
    return BatchReportLineObjectHelper.fromMapList(outputMap, "BatchReportLineList");
  }
  /**
   @deprecated
   */
  public BatchReportLineObjectData getBatchReportLineObjectData() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
