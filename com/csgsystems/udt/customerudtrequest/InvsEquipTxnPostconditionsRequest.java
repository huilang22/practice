/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipTxnPostconditionsRequest.java
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
public final class InvsEquipTxnPostconditionsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipTxnPostconditionsRequest (String request, InvsEquipTxnPostconditionsRequestMethod method) {
    initialize(request, "InvsEquipTxnPostconditions", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipTxnPostconditionsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipTxnPostconditionsForInvsEquipTxnPostconditionsCreate(InvsEquipTxnPostconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
  public void setInvsEquipTxnPostconditionsForInvsEquipTxnPostconditionsDelete(InvsEquipTxnPostconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
  public void setInvsEquipTxnPostconditionsForInvsEquipTxnPostconditionsFind(InvsEquipTxnPostconditionsObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
  public void setInvsEquipTxnPostconditionsForInvsEquipTxnPostconditionsGet(InvsEquipTxnPostconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
  public void setInvsEquipTxnPostconditionsForInvsEquipTxnPostconditionsUpdate(InvsEquipTxnPostconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(data, new HashMap(), "InvsEquipTxnPostconditions").get("InvsEquipTxnPostconditions"));
    }
  }
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditionsObjectDataInvsEquipTxnPostconditionsFromInvsEquipTxnPostconditionsCreate() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
  public InvsEquipTxnPostconditionsObjectDataList getInvsEquipTxnPostconditionsObjectDataInvsEquipTxnPostconditionsFromInvsEquipTxnPostconditionsFind() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPostconditionsList");
  }
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditionsObjectDataInvsEquipTxnPostconditionsFromInvsEquipTxnPostconditionsGet() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditionsObjectDataInvsEquipTxnPostconditionsFromInvsEquipTxnPostconditionsUpdate() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPostconditionsObjectFilter(InvsEquipTxnPostconditionsObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(data, new HashMap()).get("InvsEquipTxnPostconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPostconditionsObjectData(InvsEquipTxnPostconditionsObjectData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectHelper.toMap(data, new HashMap()).get("InvsEquipTxnPostconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipTxnPostconditionsObjectKeyData(InvsEquipTxnPostconditionsObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipTxnPostconditions", InvsEquipTxnPostconditionsObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipTxnPostconditionsObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipTxnPostconditionsObjectDataList getInvsEquipTxnPostconditionsObjectDataList() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMapList(outputMap, "InvsEquipTxnPostconditionsList");
  }
  /**
   @deprecated
   */
  public InvsEquipTxnPostconditionsObjectData getInvsEquipTxnPostconditionsObjectData() {
    return InvsEquipTxnPostconditionsObjectHelper.fromMap(outputMap, "InvsEquipTxnPostconditions");
  }
}
