/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapRequest.java
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
public final class InvsExtDataMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsExtDataMapRequest (String request, InvsExtDataMapRequestMethod method) {
    initialize(request, "InvsExtDataMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsExtDataMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsExtDataMapForInvsExtDataMapCreate(InvsExtDataMapObjectData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(data, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
  public void setInvsExtDataMapForInvsExtDataMapDelete(InvsExtDataMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(data, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
  public void setInvsExtDataMapForInvsExtDataMapFind(InvsExtDataMapObjectFilter data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(data, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
  public void setInvsExtDataMapForInvsExtDataMapGet(InvsExtDataMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(data, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
  public void setInvsExtDataMapForInvsExtDataMapUpdate(InvsExtDataMapObjectData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(data, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
  public InvsExtDataMapObjectData getInvsExtDataMapObjectDataInvsExtDataMapFromInvsExtDataMapCreate() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
  public InvsExtDataMapObjectData getInvsExtDataMapObjectDataInvsExtDataMapFromInvsExtDataMapDelete() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
  public InvsExtDataMapObjectDataList getInvsExtDataMapObjectDataInvsExtDataMapFromInvsExtDataMapFind() {
    return InvsExtDataMapObjectHelper.fromMapList(outputMap, "InvsExtDataMapList");
  }
  public InvsExtDataMapObjectData getInvsExtDataMapObjectDataInvsExtDataMapFromInvsExtDataMapGet() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
  public InvsExtDataMapObjectData getInvsExtDataMapObjectDataInvsExtDataMapFromInvsExtDataMapUpdate() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
  /**
   @deprecated
   */
  public void setInvsExtDataMapObjectFilter(InvsExtDataMapObjectFilter data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(data, new HashMap()).get("InvsExtDataMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsExtDataMapObjectData(InvsExtDataMapObjectData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(data, new HashMap()).get("InvsExtDataMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsExtDataMapObjectKeyData(InvsExtDataMapObjectKeyData data) {
    if (data != null) {
      addInput("InvsExtDataMap", InvsExtDataMapObjectKeyHelper.toMap(data, new HashMap()).get("InvsExtDataMapObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsExtDataMapObjectDataList getInvsExtDataMapObjectDataList() {
    return InvsExtDataMapObjectHelper.fromMapList(outputMap, "InvsExtDataMapList");
  }
  /**
   @deprecated
   */
  public InvsExtDataMapObjectData getInvsExtDataMapObjectData() {
    return InvsExtDataMapObjectHelper.fromMap(outputMap, "InvsExtDataMap");
  }
}
