/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestNotifyMessageRequest.java
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
public final class BatchRequestNotifyMessageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchRequestNotifyMessageRequest (String request, BatchRequestNotifyMessageRequestMethod method) {
    initialize(request, "BatchRequestNotifyMessage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchRequestNotifyMessageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchRequestNotifyMessageForBatchRequestNotifyMessageCreate(BatchRequestNotifyMessageObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
  public void setBatchRequestNotifyMessageForBatchRequestNotifyMessageDelete(BatchRequestNotifyMessageObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
  public void setBatchRequestNotifyMessageForBatchRequestNotifyMessageFind(BatchRequestNotifyMessageObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
  public void setBatchRequestNotifyMessageForBatchRequestNotifyMessageGet(BatchRequestNotifyMessageObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(data, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
  public void setBatchRequestNotifyMessageForBatchRequestNotifyMessageUpdate(BatchRequestNotifyMessageObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(data, new HashMap(), "BatchRequestNotifyMessage").get("BatchRequestNotifyMessage"));
    }
  }
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessageObjectDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageCreate() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessageObjectDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageDelete() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  public BatchRequestNotifyMessageObjectDataList getBatchRequestNotifyMessageObjectDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageFind() {
    return BatchRequestNotifyMessageObjectHelper.fromMapList(outputMap, "BatchRequestNotifyMessageList");
  }
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessageObjectDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageGet() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  public BatchRequestNotifyMessageObjectKeyData getBatchRequestNotifyMessageObjectKeyDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageSequenceGet() {
    return BatchRequestNotifyMessageObjectKeyHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessageObjectDataBatchRequestNotifyMessageFromBatchRequestNotifyMessageUpdate() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyMessageObjectFilter(BatchRequestNotifyMessageObjectFilter data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(data, new HashMap()).get("BatchRequestNotifyMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyMessageObjectData(BatchRequestNotifyMessageObjectData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectHelper.toMap(data, new HashMap()).get("BatchRequestNotifyMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBatchRequestNotifyMessageObjectKeyData(BatchRequestNotifyMessageObjectKeyData data) {
    if (data != null) {
      addInput("BatchRequestNotifyMessage", BatchRequestNotifyMessageObjectKeyHelper.toMap(data, new HashMap()).get("BatchRequestNotifyMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public BatchRequestNotifyMessageObjectDataList getBatchRequestNotifyMessageObjectDataList() {
    return BatchRequestNotifyMessageObjectHelper.fromMapList(outputMap, "BatchRequestNotifyMessageList");
  }
  /**
   @deprecated
   */
  public BatchRequestNotifyMessageObjectKeyData getBatchRequestNotifyMessageObjectKeyData() {
    return BatchRequestNotifyMessageObjectKeyHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
  /**
   @deprecated
   */
  public BatchRequestNotifyMessageObjectData getBatchRequestNotifyMessageObjectData() {
    return BatchRequestNotifyMessageObjectHelper.fromMap(outputMap, "BatchRequestNotifyMessage");
  }
}
