/*
 * Generated code DO NOT EDIT
 * Generated file: BatchInvSourceRequest.java
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
public final class BatchInvSourceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BatchInvSourceRequest (String request, BatchInvSourceRequestMethod method) {
    initialize(request, "BatchInvSource", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BatchInvSourceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBatchInvSourceForBatchInvSourceCreate(BISObjectData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(data, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
  public void setBatchInvSourceForBatchInvSourceDelete(BISObjectKeyData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(data, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
  public void setBatchInvSourceForBatchInvSourceFind(BISObjectFilter data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(data, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
  public void setBatchInvSourceForBatchInvSourceGet(BISObjectKeyData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(data, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
  public void setBatchInvSourceForBatchInvSourceUpdate(BISObjectData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(data, new HashMap(), "BatchInvSource").get("BatchInvSource"));
    }
  }
  public BISObjectData getBISObjectDataBatchInvSourceFromBatchInvSourceCreate() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
  public BISObjectData getBISObjectDataBatchInvSourceFromBatchInvSourceDelete() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
  public BISObjectDataList getBISObjectDataBatchInvSourceFromBatchInvSourceFind() {
    return BISObjectHelper.fromMapList(outputMap, "BatchInvSourceList");
  }
  public BISObjectData getBISObjectDataBatchInvSourceFromBatchInvSourceGet() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
  public BISObjectData getBISObjectDataBatchInvSourceFromBatchInvSourceUpdate() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
  /**
   @deprecated
   */
  public void setBISObjectFilter(BISObjectFilter data) {
    if (data != null) {
      addInput("BIS", BISObjectHelper.toMap(data, new HashMap()).get("BISObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBISObjectData(BISObjectData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectHelper.toMap(data, new HashMap()).get("BISObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBISObjectKeyData(BISObjectKeyData data) {
    if (data != null) {
      addInput("BatchInvSource", BISObjectKeyHelper.toMap(data, new HashMap()).get("BISObject"));
    }
  }
  /**
   @deprecated
   */
  public BISObjectDataList getBISObjectDataList() {
    return BISObjectHelper.fromMapList(outputMap, "BISList");
  }
  /**
   @deprecated
   */
  public BISObjectData getBISObjectData() {
    return BISObjectHelper.fromMap(outputMap, "BatchInvSource");
  }
}
