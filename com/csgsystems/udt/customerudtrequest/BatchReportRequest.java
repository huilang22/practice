/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportRequest.java
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
public final class BatchReportRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchReportRequest (String request, BatchReportRequestMethod method) {
    initialize(request, "BatchReport", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchReportRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchReportForBatchReportCreate(BatchReportObjectData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(data, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
  public void setBatchReportForBatchReportDelete(BatchReportObjectKeyData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(data, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
  public void setBatchReportForBatchReportFind(BatchReportObjectFilter data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(data, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
  public void setBatchReportForBatchReportGet(BatchReportObjectKeyData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(data, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
  public void setBatchReportForBatchReportUpdate(BatchReportObjectData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(data, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
  public BatchReportObjectData getBatchReportObjectDataBatchReportFromBatchReportCreate() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
  public BatchReportObjectData getBatchReportObjectDataBatchReportFromBatchReportDelete() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
  public BatchReportObjectDataList getBatchReportObjectDataBatchReportFromBatchReportFind() {
    return BatchReportObjectHelper.fromMapList(outputMap, "BatchReportList");
  }
  public BatchReportObjectData getBatchReportObjectDataBatchReportFromBatchReportGet() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
  public BatchReportObjectKeyData getBatchReportObjectKeyDataBatchReportFromBatchReportSequenceGet() {
    return BatchReportObjectKeyHelper.fromMap(outputMap, "BatchReport");
  }
  public BatchReportObjectData getBatchReportObjectDataBatchReportFromBatchReportUpdate() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
  /**
   @deprecated
   */
  public void setBatchReportObjectFilter(BatchReportObjectFilter data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(data, new HashMap()).get("BatchReportObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchReportObjectData(BatchReportObjectData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(data, new HashMap()).get("BatchReportObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchReportObjectKeyData(BatchReportObjectKeyData data) {
    if (data != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(data, new HashMap()).get("BatchReportObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchReportObjectDataList getBatchReportObjectDataList() {
    return BatchReportObjectHelper.fromMapList(outputMap, "BatchReportList");
  }
  /**
   @deprecated
   */
  public BatchReportObjectKeyData getBatchReportObjectKeyData() {
    return BatchReportObjectKeyHelper.fromMap(outputMap, "BatchReport");
  }
  /**
   @deprecated
   */
  public BatchReportObjectData getBatchReportObjectData() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
