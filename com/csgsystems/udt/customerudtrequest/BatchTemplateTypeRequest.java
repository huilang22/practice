/*
 * Generated code DO NOT EDIT
 * Generated file: BatchTemplateTypeRequest.java
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
public final class BatchTemplateTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchTemplateTypeRequest (String request, BatchTemplateTypeRequestMethod method) {
    initialize(request, "BatchTemplateType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchTemplateTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchTemplateTypeForBatchTemplateTypeFind(BatchTemplateTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(data, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }
  public void setBatchTemplateTypeForBatchTemplateTypeGet(BatchTemplateTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }
  public BatchTemplateTypeObjectDataList getBatchTemplateTypeObjectDataBatchTemplateTypeFromBatchTemplateTypeFind() {
    return BatchTemplateTypeObjectHelper.fromMapList(outputMap, "BatchTemplateTypeList");
  }
  public BatchTemplateTypeObjectData getBatchTemplateTypeObjectDataBatchTemplateTypeFromBatchTemplateTypeGet() {
    return BatchTemplateTypeObjectHelper.fromMap(outputMap, "BatchTemplateType");
  }
  /**
   @deprecated
   */
  public void setBatchTemplateTypeObjectFilter(BatchTemplateTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(data, new HashMap()).get("BatchTemplateTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchTemplateTypeObjectKeyData(BatchTemplateTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchTemplateTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchTemplateTypeObjectDataList getBatchTemplateTypeObjectDataList() {
    return BatchTemplateTypeObjectHelper.fromMapList(outputMap, "BatchTemplateTypeList");
  }
  /**
   @deprecated
   */
  public BatchTemplateTypeObjectData getBatchTemplateTypeObjectData() {
    return BatchTemplateTypeObjectHelper.fromMap(outputMap, "BatchTemplateType");
  }
}
