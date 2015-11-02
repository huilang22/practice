/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainRequest.java
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
public final class InvdMainRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvdMainRequest (String request, InvdMainRequestMethod method) {
    initialize(request, "InvdMain", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvdMainRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvdMainForInvdMainCreate(InvdMainObjectData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public void setInvdMainForInvdMainExtendedDataFind(InvdMainObjectKeyData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public void setInvdMainForInvdMainFind(InvdMainObjectFilter data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public void setInvdMainForInvdMainGetCount(InvdMainObjectFilter data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public void setInvdMainForInvdMainGet(InvdMainObjectKeyData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public void setInvdMainForInvdMainUpdate(InvdMainObjectData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }
  public InvdMainObjectData getInvdMainObjectDataInvdMainFromInvdMainCreate() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
  public InvdMainEDObjectDataList getInvdMainEDObjectDataInvdMainFromInvdMainExtendedDataFind() {
    return InvdMainEDObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
  public InvdMainObjectDataList getInvdMainObjectDataInvdMainFromInvdMainFind() {
    return InvdMainObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
  public Integer getIntegerInvdMainCountFromInvdMainGetCount() {
    return (Integer)outputMap.get("InvdMainCount");
  }
  public InvdMainObjectData getInvdMainObjectDataInvdMainFromInvdMainGet() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
  public InvdMainObjectData getInvdMainObjectDataInvdMainFromInvdMainUpdate() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
  /**
   @deprecated
   */
  public Integer getInvdMainCount() {
    return (Integer)outputMap.get("InvdMainCount");
  }
  /**
   @deprecated
   */
  public InvdMainEDObjectDataList getInvdMainEDObjectDataList() {
    return InvdMainEDObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
  /**
   @deprecated
   */
  public void setInvdMainObjectFilter(InvdMainObjectFilter data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap()).get("InvdMainObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainObjectData(InvdMainObjectData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectHelper.toMap(data, new HashMap()).get("InvdMainObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvdMainObjectKeyData(InvdMainObjectKeyData data) {
    if (data != null) {
      addInput("InvdMain", InvdMainObjectKeyHelper.toMap(data, new HashMap()).get("InvdMainObject"));
    }
  }
  /**
   @deprecated
   */
  public InvdMainObjectDataList getInvdMainObjectDataList() {
    return InvdMainObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
  /**
   @deprecated
   */
  public Map  getInvdMainObjectExtendedData() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain").extendedData;
  }
  
  /**
   @deprecated
   */
  public InvdMainObjectData getInvdMainObjectData() {
    return InvdMainObjectHelper.fromMap(outputMap, "InvdMain");
  }
}
