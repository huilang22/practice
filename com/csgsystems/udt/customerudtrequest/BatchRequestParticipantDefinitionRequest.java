/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantDefinitionRequest.java
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
public final class BatchRequestParticipantDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestParticipantDefinitionRequest (String request, BatchRequestParticipantDefinitionRequestMethod method) {
    initialize(request, "BatchRequestParticipantDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestParticipantDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionCreate(BatchRequestParticipantDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionDelete(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionFind(BatchRequestParticipantDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionGet(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionQueryCreate(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionQueryCreateInParticipantQueryForBatchRequestParticipantDefinitionQueryCreate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery", data);
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionQueryGet(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionQueryUpdate(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionQueryUpdateInParticipantQueryForBatchRequestParticipantDefinitionQueryUpdate(BulkParticipantQuery data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery", data);
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionRetrieve(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public void setBatchRequestParticipantDefinitionForBatchRequestParticipantDefinitionUpdate(BatchRequestParticipantDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(data, new HashMap(), "BatchRequestParticipantDefinition").get("BatchRequestParticipantDefinition"));
    }
  }
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinitionObjectDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionCreate() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinitionObjectDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionDelete() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public BatchRequestParticipantDefinitionObjectDataList getBatchRequestParticipantDefinitionObjectDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionFind() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestParticipantDefinitionList");
  }
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinitionObjectDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionGet() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinitionObjectKeyDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionQueryCreate() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public BulkParticipantQuery getBulkParticipantQueryBatchRequestParticipantDefinitionQueryGetOutFromBatchRequestParticipantDefinitionQueryGet() {
    return (BulkParticipantQuery)outputMap.get("BatchRequestParticipantDefinitionQueryGetOut");
  }
  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinitionObjectKeyDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionQueryUpdate() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public Object getObjectParticipantsFromBatchRequestParticipantDefinitionRetrieve() {
    return (Object)outputMap.get("Participants");
  }
  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinitionObjectKeyDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionSequenceGet() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinitionObjectDataBatchRequestParticipantDefinitionFromBatchRequestParticipantDefinitionUpdate() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantDefinitionObjectFilter(BatchRequestParticipantDefinitionObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(data, new HashMap()).get("BatchRequestParticipantDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantDefinitionObjectData(BatchRequestParticipantDefinitionObjectData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectHelper.toMap(data, new HashMap()).get("BatchRequestParticipantDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantDefinitionObjectKeyData(BatchRequestParticipantDefinitionObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinition", BatchRequestParticipantDefinitionObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestParticipantDefinitionObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantDefinitionObjectDataList getBatchRequestParticipantDefinitionObjectDataList() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMapList(outputMap, "BatchRequestParticipantDefinitionList");
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantDefinitionObjectKeyData getBatchRequestParticipantDefinitionObjectKeyData() {
    return BatchRequestParticipantDefinitionObjectKeyHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  /**
   @deprecated
   */
  public BatchRequestParticipantDefinitionObjectData getBatchRequestParticipantDefinitionObjectData() {
    return BatchRequestParticipantDefinitionObjectHelper.fromMap(outputMap, "BatchRequestParticipantDefinition");
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantDefinitionQueryCreateInParticipantQuery(BulkParticipantQuery data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinitionQueryCreateInParticipantQuery", data);
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestParticipantDefinitionQueryUpdateInParticipantQuery(BulkParticipantQuery data) {
    if (data != null) {
      addInput("BatchRequestParticipantDefinitionQueryUpdateInParticipantQuery", data);
    }
  }
  /**
   @deprecated
   */
  public Object getParticipants() {
    return (Object)outputMap.get("Participants");
  }
  /**
   @deprecated
   */
  public BulkParticipantQuery getBatchRequestParticipantDefinitionQueryGetOut() {
    return (BulkParticipantQuery)outputMap.get("BatchRequestParticipantDefinitionQueryGetOut");
  }
}
