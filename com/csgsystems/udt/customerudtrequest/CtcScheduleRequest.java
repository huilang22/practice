/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcScheduleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcScheduleRequest (String request, CtcScheduleRequestMethod method) {
    initialize(request, "CtcSchedule", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcScheduleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcScheduleForCtcScheduleCreate(CtcScheduleObjectData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public void setCtcScheduleForCtcScheduleDelete(CtcScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public void setCtcScheduleForCtcScheduleFind(CtcScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public void setCtcScheduleForCtcScheduleGet(CtcScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public void setCtcScheduleForCtcScheduleUpdate(CtcScheduleObjectData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap(), "CtcSchedule").get("CtcSchedule"));
    }
  }
  public CtcScheduleObjectData getCtcScheduleObjectDataCtcScheduleFromCtcScheduleCreate() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
  public CtcScheduleObjectData getCtcScheduleObjectDataCtcScheduleFromCtcScheduleDelete() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
  public CtcScheduleObjectDataList getCtcScheduleObjectDataCtcScheduleFromCtcScheduleFind() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
  public CtcScheduleObjectData getCtcScheduleObjectDataCtcScheduleFromCtcScheduleGet() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
  public CtcScheduleObjectData getCtcScheduleObjectDataCtcScheduleFromCtcScheduleUpdate() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
  /**
   @deprecated
   */
  public void setCtcScheduleObjectFilter(CtcScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap()).get("CtcScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcScheduleObjectData(CtcScheduleObjectData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectHelper.toMap(data, new HashMap()).get("CtcScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcScheduleObjectKeyData(CtcScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcSchedule", CtcScheduleObjectKeyHelper.toMap(data, new HashMap()).get("CtcScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcScheduleObjectDataList getCtcScheduleObjectDataList() {
    return CtcScheduleObjectHelper.fromMapList(outputMap, "CtcScheduleList");
  }
  /**
   @deprecated
   */
  public CtcScheduleObjectData getCtcScheduleObjectData() {
    return CtcScheduleObjectHelper.fromMap(outputMap, "CtcSchedule");
  }
}
