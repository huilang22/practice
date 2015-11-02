/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueAutoRetryRequest.java
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

import com.csgsystems.sfq.data.*;
public final class BsdQueueAutoRetryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdQueueAutoRetryRequest (String request, BsdQueueAutoRetryRequestMethod method) {
    initialize(request, "BsdQueueAutoRetry", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdQueueAutoRetryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdQueueAutoRetryForBsdQueueAutoRetryCreate(BsdQueueAutoRetryObjectData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
  public void setBsdQueueAutoRetryForBsdQueueAutoRetryDelete(BsdQueueAutoRetryObjectData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
  public void setBsdQueueAutoRetryForBsdQueueAutoRetryFind(BsdQueueAutoRetryObjectFilter data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
  public void setBsdQueueAutoRetryForBsdQueueAutoRetryGet(BsdQueueAutoRetryObjectKeyData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectKeyHelper.toMap(data, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
  public void setBsdQueueAutoRetryForBsdQueueAutoRetryUpdate(BsdQueueAutoRetryObjectData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap(), "BsdQueueAutoRetry").get("BsdQueueAutoRetry"));
    }
  }
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetryObjectDataBsdQueueAutoRetryFromBsdQueueAutoRetryCreate() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetryObjectDataBsdQueueAutoRetryFromBsdQueueAutoRetryDelete() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
  public BsdQueueAutoRetryObjectDataList getBsdQueueAutoRetryObjectDataBsdQueueAutoRetryFromBsdQueueAutoRetryFind() {
    return BsdQueueAutoRetryObjectHelper.fromMapList(outputMap, "BsdQueueAutoRetryList");
  }
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetryObjectDataBsdQueueAutoRetryFromBsdQueueAutoRetryGet() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetryObjectDataBsdQueueAutoRetryFromBsdQueueAutoRetryUpdate() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
  /**
   @deprecated
   */
  public void setBsdQueueAutoRetryObjectFilter(BsdQueueAutoRetryObjectFilter data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap()).get("BsdQueueAutoRetryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdQueueAutoRetryObjectData(BsdQueueAutoRetryObjectData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectHelper.toMap(data, new HashMap()).get("BsdQueueAutoRetryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdQueueAutoRetryObjectKeyData(BsdQueueAutoRetryObjectKeyData data) {
    if (data != null) {
      addInput("BsdQueueAutoRetry", BsdQueueAutoRetryObjectKeyHelper.toMap(data, new HashMap()).get("BsdQueueAutoRetryObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdQueueAutoRetryObjectDataList getBsdQueueAutoRetryObjectDataList() {
    return BsdQueueAutoRetryObjectHelper.fromMapList(outputMap, "BsdQueueAutoRetryList");
  }
  /**
   @deprecated
   */
  public BsdQueueAutoRetryObjectData getBsdQueueAutoRetryObjectData() {
    return BsdQueueAutoRetryObjectHelper.fromMap(outputMap, "BsdQueueAutoRetry");
  }
}
