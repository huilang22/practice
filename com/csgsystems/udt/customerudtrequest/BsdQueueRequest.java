/*
 * Generated code DO NOT EDIT
 * Generated file: BsdQueueRequest.java
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
public final class BsdQueueRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdQueueRequest (String request, BsdQueueRequestMethod method) {
    initialize(request, "BsdQueue", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdQueueRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBsdQueueForBsdQueueAdd(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueCreate(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueDelete(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueDeleteInternal(BsdQueueObjectKeyData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueFind(BsdQueueObjectFilter data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueFindInternal(BsdQueueObjectFilter data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueGet(BsdQueueObjectKeyData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueResume(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueRetry(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueSuspend(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public void setBsdQueueForBsdQueueUpdate(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap(), "BsdQueue").get("BsdQueue"));
    }
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueAdd() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueCreate() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueDelete() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueDeleteInternal() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectDataList getBsdQueueObjectDataBsdQueueFromBsdQueueFind() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
  public BsdQueueObjectDataList getBsdQueueObjectDataBsdQueueFromBsdQueueFindInternal() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueGet() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectDataList getBsdQueueObjectDataBsdQueueFromBsdQueueGetRecovery() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueResume() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueRetry() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueSuspend() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  public BsdQueueObjectData getBsdQueueObjectDataBsdQueueFromBsdQueueUpdate() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
  /**
   @deprecated
   */
  public void setBsdQueueObjectFilter(BsdQueueObjectFilter data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap()).get("BsdQueueObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdQueueObjectData(BsdQueueObjectData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectHelper.toMap(data, new HashMap()).get("BsdQueueObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdQueueObjectKeyData(BsdQueueObjectKeyData data) {
    if (data != null) {
      addInput("BsdQueue", BsdQueueObjectKeyHelper.toMap(data, new HashMap()).get("BsdQueueObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdQueueObjectDataList getBsdQueueObjectDataList() {
    return BsdQueueObjectHelper.fromMapList(outputMap, "BsdQueueList");
  }
  /**
   @deprecated
   */
  public BsdQueueObjectData getBsdQueueObjectData() {
    return BsdQueueObjectHelper.fromMap(outputMap, "BsdQueue");
  }
}
