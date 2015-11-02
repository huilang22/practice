/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestRequest.java
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
public final class BatchRequestRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestRequest (String request, BatchRequestRequestMethod method) {
    initialize(request, "BatchRequest", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActivityDescriptionForBatchRequestCancel(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestCancel(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestCancelRun(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestCancelRun(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestClose(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestClose(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestCreate(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestCreate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBatchRequestDelete(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBatchRequestFind(BatchRequestObjectFilter data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBatchRequestGet(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBatchRequestParticipantDispositionSummary(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestReopen(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestReopen(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestRestart(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestRestart(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setErrorThresholdForBatchRequestRestart(Integer data) {
    if (data != null) {
      addInput("ErrorThreshold", data);
    }
  }
  public void setScheduledDateForBatchRequestRestart(Date data) {
    if (data != null) {
      addInput("ScheduledDate", data);
    }
  }
  public void setActivityDescriptionForBatchRequestResume(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setActivityDescriptionForBatchRequestResumeAll(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestResume(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setErrorThresholdForBatchRequestResume(Integer data) {
    if (data != null) {
      addInput("ErrorThreshold", data);
    }
  }
  public void setScheduledDateForBatchRequestResume(Date data) {
    if (data != null) {
      addInput("ScheduledDate", data);
    }
  }
  public void setActivityDescriptionForBatchRequestSchedule(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestSchedule(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setErrorThresholdForBatchRequestSchedule(Integer data) {
    if (data != null) {
      addInput("ErrorThreshold", data);
    }
  }
  public void setRunTypeForBatchRequestSchedule(Integer data) {
    if (data != null) {
      addInput("RunType", data);
    }
  }
  public void setScheduledDateForBatchRequestSchedule(Date data) {
    if (data != null) {
      addInput("ScheduledDate", data);
    }
  }
  public void setActivityDescriptionForBatchRequestSuspend(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setActivityDescriptionForBatchRequestSuspendAll(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestSuspend(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestTerminate(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestTerminate(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setActivityDescriptionForBatchRequestUnschedule(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  public void setBatchRequestForBatchRequestUnschedule(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setBatchRequestForBatchRequestUpdate(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap(), "BatchRequest").get("BatchRequest"));
    }
  }
  public void setScheduledDateForBatchRequestWorkSubmit(Date data) {
    if (data != null) {
      addInput("ScheduledDate", data);
    }
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestCancel() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestCancelRun() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestClose() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestCreate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestDelete() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectDataList getBatchRequestObjectDataBatchRequestFromBatchRequestFind() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestGet() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestParticipantDispositionSummaryOutputData getBatchRequestParticipantDispositionSummaryOutputDataBatchRequestParticipantDispositionSummaryOutputDataFromBatchRequestParticipantDispositionSummary() {
    return BatchRequestParticipantDispositionSummaryOutputHelper.fromMap(outputMap);
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestReopen() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestRestart() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectDataList getBatchRequestObjectDataBatchRequestFromBatchRequestResumeAll() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestResume() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestSchedule() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectKeyData getBatchRequestObjectKeyDataBatchRequestFromBatchRequestSequenceGet() {
    return BatchRequestObjectKeyHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectDataList getBatchRequestObjectDataBatchRequestFromBatchRequestSuspendAll() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestSuspend() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestTerminate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestUnschedule() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectData getBatchRequestObjectDataBatchRequestFromBatchRequestUpdate() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  public BatchRequestObjectDataList getBatchRequestObjectDataBatchRequestFromBatchRequestWorkSubmit() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
  /**
   @deprecated
   */
  public void setActivityDescription(String data) {
    if (data != null) {
      addInput("ActivityDescription", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectFilter(BatchRequestObjectFilter data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectData(BatchRequestObjectData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestObjectKeyData(BatchRequestObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequest", BatchRequestObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestObjectDataList getBatchRequestObjectDataList() {
    return BatchRequestObjectHelper.fromMapList(outputMap, "BatchRequestList");
  }
  /**
   @deprecated
   */
  public BatchRequestObjectKeyData getBatchRequestObjectKeyData() {
    return BatchRequestObjectKeyHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public BatchRequestObjectData getBatchRequestObjectData() {
    return BatchRequestObjectHelper.fromMap(outputMap, "BatchRequest");
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantDispositionSummaryOutputData getBatchRequestParticipantDispositionSummaryOutputData() {
    return BatchRequestParticipantDispositionSummaryOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setErrorThreshold(Integer data) {
    if (data != null) {
      addInput("ErrorThreshold", data);
    }
  }
  /**
   @deprecated
   */
  public void setRunType(Integer data) {
    if (data != null) {
      addInput("RunType", data);
    }
  }
  /**
   @deprecated
   */
  public void setScheduledDate(Date data) {
    if (data != null) {
      addInput("ScheduledDate", data);
    }
  }
}
