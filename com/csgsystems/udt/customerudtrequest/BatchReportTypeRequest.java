/*
 * Generated code DO NOT EDIT
 * Generated file: BatchReportTypeRequest.java
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
public final class BatchReportTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchReportTypeRequest (String request, BatchReportTypeRequestMethod method) {
    initialize(request, "BatchReportType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchReportTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchReportTypeForBatchReportTypeFind(BatchReportTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(data, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }
  public void setBatchReportTypeForBatchReportTypeGet(BatchReportTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchReportType", BatchReportTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }
  public BatchReportTypeObjectDataList getBatchReportTypeObjectDataBatchReportTypeFromBatchReportTypeFind() {
    return BatchReportTypeObjectHelper.fromMapList(outputMap, "BatchReportTypeList");
  }
  public BatchReportTypeObjectData getBatchReportTypeObjectDataBatchReportTypeFromBatchReportTypeGet() {
    return BatchReportTypeObjectHelper.fromMap(outputMap, "BatchReportType");
  }
  /**
   @deprecated
   */
  public void setBatchReportTypeObjectFilter(BatchReportTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(data, new HashMap()).get("BatchReportTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchReportTypeObjectKeyData(BatchReportTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchReportType", BatchReportTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchReportTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchReportTypeObjectDataList getBatchReportTypeObjectDataList() {
    return BatchReportTypeObjectHelper.fromMapList(outputMap, "BatchReportTypeList");
  }
  /**
   @deprecated
   */
  public BatchReportTypeObjectData getBatchReportTypeObjectData() {
    return BatchReportTypeObjectHelper.fromMap(outputMap, "BatchReportType");
  }
}
