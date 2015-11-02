/*
 * Generated code DO NOT EDIT
 * Generated file: InvsEquipmentCondRequest.java
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
public final class InvsEquipmentCondRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsEquipmentCondRequest (String request, InvsEquipmentCondRequestMethod method) {
    initialize(request, "InvsEquipmentCond", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsEquipmentCondRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsEquipmentCondForInvsEquipmentCondCreate(InvsEquipmentCondObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(data, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
  public void setInvsEquipmentCondForInvsEquipmentCondDelete(InvsEquipmentCondObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
  public void setInvsEquipmentCondForInvsEquipmentCondFind(InvsEquipmentCondObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(data, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
  public void setInvsEquipmentCondForInvsEquipmentCondGet(InvsEquipmentCondObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(data, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
  public void setInvsEquipmentCondForInvsEquipmentCondUpdate(InvsEquipmentCondObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(data, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }
  public InvsEquipmentCondObjectData getInvsEquipmentCondObjectDataInvsEquipmentCondFromInvsEquipmentCondCreate() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
  public InvsEquipmentCondObjectData getInvsEquipmentCondObjectDataInvsEquipmentCondFromInvsEquipmentCondDelete() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
  public InvsEquipmentCondObjectDataList getInvsEquipmentCondObjectDataInvsEquipmentCondFromInvsEquipmentCondFind() {
    return InvsEquipmentCondObjectHelper.fromMapList(outputMap, "InvsEquipmentCondList");
  }
  public InvsEquipmentCondObjectData getInvsEquipmentCondObjectDataInvsEquipmentCondFromInvsEquipmentCondGet() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
  public InvsEquipmentCondObjectData getInvsEquipmentCondObjectDataInvsEquipmentCondFromInvsEquipmentCondUpdate() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentCondObjectFilter(InvsEquipmentCondObjectFilter data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentCondObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentCondObjectData(InvsEquipmentCondObjectData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(data, new HashMap()).get("InvsEquipmentCondObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsEquipmentCondObjectKeyData(InvsEquipmentCondObjectKeyData data) {
    if (data != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(data, new HashMap()).get("InvsEquipmentCondObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsEquipmentCondObjectDataList getInvsEquipmentCondObjectDataList() {
    return InvsEquipmentCondObjectHelper.fromMapList(outputMap, "InvsEquipmentCondList");
  }
  /**
   @deprecated
   */
  public InvsEquipmentCondObjectData getInvsEquipmentCondObjectData() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
