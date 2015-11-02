/*
 * Generated code DO NOT EDIT
 * Generated file: BatchParticipantTypeRequest.java
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
public final class BatchParticipantTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchParticipantTypeRequest (String request, BatchParticipantTypeRequestMethod method) {
    initialize(request, "BatchParticipantType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchParticipantTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchParticipantTypeForBatchParticipantTypeFind(BatchParticipantTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(data, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }
  public void setBatchParticipantTypeForBatchParticipantTypeGet(BatchParticipantTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectKeyHelper.toMap(data, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }
  public BatchParticipantTypeObjectDataList getBatchParticipantTypeObjectDataBatchParticipantTypeFromBatchParticipantTypeFind() {
    return BatchParticipantTypeObjectHelper.fromMapList(outputMap, "BatchParticipantTypeList");
  }
  public BatchParticipantTypeObjectData getBatchParticipantTypeObjectDataBatchParticipantTypeFromBatchParticipantTypeGet() {
    return BatchParticipantTypeObjectHelper.fromMap(outputMap, "BatchParticipantType");
  }
  /**
   @deprecated
   */
  public void setBatchParticipantTypeObjectFilter(BatchParticipantTypeObjectFilter data) {
    if (data != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(data, new HashMap()).get("BatchParticipantTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchParticipantTypeObjectKeyData(BatchParticipantTypeObjectKeyData data) {
    if (data != null) {
      addInput("BatchParticipantType", BatchParticipantTypeObjectKeyHelper.toMap(data, new HashMap()).get("BatchParticipantTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchParticipantTypeObjectDataList getBatchParticipantTypeObjectDataList() {
    return BatchParticipantTypeObjectHelper.fromMapList(outputMap, "BatchParticipantTypeList");
  }
  /**
   @deprecated
   */
  public BatchParticipantTypeObjectData getBatchParticipantTypeObjectData() {
    return BatchParticipantTypeObjectHelper.fromMap(outputMap, "BatchParticipantType");
  }
}
