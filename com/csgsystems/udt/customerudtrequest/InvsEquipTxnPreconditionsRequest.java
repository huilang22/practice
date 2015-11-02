/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPreconditionsRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsEquipTxnPreconditionsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipTxnPreconditionsRequest (String request, InvsEquipTxnPreconditionsRequestMethod method) {
    initialize(request, "InvsEquipTxnPreconditions", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipTxnPreconditionsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipTxnPreconditionsForInvsEquipTxnPreconditionsCreate(InvsEquipTxnPreconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
  public void setInvsEquipTxnPreconditionsForInvsEquipTxnPreconditionsDelete(InvsEquipTxnPreconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
  public void setInvsEquipTxnPreconditionsForInvsEquipTxnPreconditionsFind(InvsEquipTxnPreconditionsObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
  public void setInvsEquipTxnPreconditionsForInvsEquipTxnPreconditionsGet(InvsEquipTxnPreconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
  public void setInvsEquipTxnPreconditionsForInvsEquipTxnPreconditionsUpdate(InvsEquipTxnPreconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPreconditions").get("InvsEquipTxnPreconditions"));
    }
  }
  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditionsObjectDataInvsEquipTxnPreconditionsFromInvsEquipTxnPreconditionsCreate() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
  public InvsEquipTxnPreconditionsObjectDataList getInvsEquipTxnPreconditionsObjectDataInvsEquipTxnPreconditionsFromInvsEquipTxnPreconditionsFind() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPreconditionsList");
  }
  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditionsObjectDataInvsEquipTxnPreconditionsFromInvsEquipTxnPreconditionsGet() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditionsObjectDataInvsEquipTxnPreconditionsFromInvsEquipTxnPreconditionsUpdate() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPreconditionsObjectFilter(InvsEquipTxnPreconditionsObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(data, new HashMap()).get("InvsEquipTxnPreconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPreconditionsObjectData(InvsEquipTxnPreconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectHelper.toMap(data, new HashMap()).get("InvsEquipTxnPreconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPreconditionsObjectKeyData(InvsEquipTxnPreconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPreconditions", InvsEquipTxnPreconditionsObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipTxnPreconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipTxnPreconditionsObjectDataList getInvsEquipTxnPreconditionsObjectDataList() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPreconditionsList");
  }
  /**
   @deprecated
   */
  public InvsEquipTxnPreconditionsObjectData getInvsEquipTxnPreconditionsObjectData() {
    return InvsEquipTxnPreconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPreconditions");
  }
}
