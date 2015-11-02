/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantRequest.java
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
public final class BatchRequestParticipantRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestParticipantRequest (String request, BatchRequestParticipantRequestMethod method) {
    initialize(request, "BatchRequestParticipant", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestParticipantRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestParticipantForBatchRequestParticipantCreate(BatchRequestParticipantObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantDelete(BatchRequestParticipantObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantDeleteList(BatchRequestParticipantObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantFileCreate(BatchRequestParticipantObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setXmlFileNameForBatchRequestParticipantFileCreate(String data) {
    if (data != null) {
      addInput("XmlFileName", data);
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantFind(BatchRequestParticipantObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantFindCount(BatchRequestParticipantObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantGet(BatchRequestParticipantObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public void setBrprepBatchIdInForBatchRequestParticipantReprocessErrorParticipants(BigInteger data) {
    if (data != null) {
      addInput("BrprepBatchIdIn", data);
    }
  }
  public void setBrprepRunNumberInForBatchRequestParticipantReprocessErrorParticipants(Integer data) {
    if (data != null) {
      addInput("BrprepRunNumberIn", data);
    }
  }
  public void setBrpsepBatchIdInForBatchRequestParticipantSkipErrorParticipants(BigInteger data) {
    if (data != null) {
      addInput("BrpsepBatchIdIn", data);
    }
  }
  public void setBrpsepRunNumberInForBatchRequestParticipantSkipErrorParticipants(Integer data) {
    if (data != null) {
      addInput("BrpsepRunNumberIn", data);
    }
  }
  public void setBatchRequestParticipantForBatchRequestParticipantUpdate(BatchRequestParticipantObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(data, new HashMap(), "BatchRequestParticipant").get("BatchRequestParticipant"));
    }
  }
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipantObjectBaseDataBatchRequestParticipantFromBatchRequestParticipantCreate() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipantObjectBaseDataBatchRequestParticipantFromBatchRequestParticipantDelete() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  public Integer getIntegerTotalCountFromBatchRequestParticipantFileCreate() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BatchRequestParticipantObjectDataList getBatchRequestParticipantObjectDataBatchRequestParticipantFromBatchRequestParticipantFind() {
    return BatchRequestParticipantObjectHelper.fromMapList(outputMap, "BatchRequestParticipantList");
  }
  public Integer getIntegerTotalCountFromBatchRequestParticipantFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BatchRequestParticipantObjectData getBatchRequestParticipantObjectDataBatchRequestParticipantFromBatchRequestParticipantGet() {
    return BatchRequestParticipantObjectHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipantObjectBaseDataBatchRequestParticipantFromBatchRequestParticipantUpdate() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantObjectFilter(BatchRequestParticipantObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectHelper.toMap(data, new HashMap()).get("BatchRequestParticipantObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantObjectDataList getBatchRequestParticipantObjectDataList() {
    return BatchRequestParticipantObjectHelper.fromMapList(outputMap, "BatchRequestParticipantList");
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantObjectData getBatchRequestParticipantObjectData() {
    return BatchRequestParticipantObjectHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantObjectBaseFilter(BatchRequestParticipantObjectBaseFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestParticipantObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantObjectBaseData(BatchRequestParticipantObjectBaseData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseHelper.toMap(data, new HashMap()).get("BatchRequestParticipantObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantObjectBaseKeyData(BatchRequestParticipantObjectBaseKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipant", BatchRequestParticipantObjectBaseKeyHelper.toMap(data, new HashMap()).get("BatchRequestParticipantObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantObjectBaseData getBatchRequestParticipantObjectBaseData() {
    return BatchRequestParticipantObjectBaseHelper.fromMap(outputMap, "BatchRequestParticipant");
  }
  /**
   @deprecated
   */
  public void setBrprepBatchIdIn(BigInteger data) {
    if (data != null) {
      addInput("BrprepBatchIdIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setBrprepRunNumberIn(Integer data) {
    if (data != null) {
      addInput("BrprepRunNumberIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setBrpsepBatchIdIn(BigInteger data) {
    if (data != null) {
      addInput("BrpsepBatchIdIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setBrpsepRunNumberIn(Integer data) {
    if (data != null) {
      addInput("BrpsepRunNumberIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setXmlFileName(String data) {
    if (data != null) {
      addInput("XmlFileName", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
