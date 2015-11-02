/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGeoAreaScheduleRequest.java
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
public final class CtcGeoAreaScheduleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcGeoAreaScheduleRequest (String request, CtcGeoAreaScheduleRequestMethod method) {
    initialize(request, "CtcGeoAreaSchedule", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcGeoAreaScheduleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcGeoAreaScheduleForCtcGeoAreaScheduleCreate(CtcGeoAreaScheduleObjectData data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(data, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
  public void setCtcGeoAreaScheduleForCtcGeoAreaScheduleDelete(CtcGeoAreaScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(data, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
  public void setCtcGeoAreaScheduleForCtcGeoAreaScheduleFind(CtcGeoAreaScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(data, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
  public void setCtcGeoAreaScheduleForCtcGeoAreaScheduleGet(CtcGeoAreaScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(data, new HashMap(), "CtcGeoAreaSchedule").get("CtcGeoAreaSchedule"));
    }
  }
  public CtcGeoAreaScheduleObjectData getCtcGeoAreaScheduleObjectDataCtcGeoAreaScheduleFromCtcGeoAreaScheduleCreate() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
  public CtcGeoAreaScheduleObjectData getCtcGeoAreaScheduleObjectDataCtcGeoAreaScheduleFromCtcGeoAreaScheduleDelete() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
  public CtcGeoAreaScheduleObjectDataList getCtcGeoAreaScheduleObjectDataCtcGeoAreaScheduleFromCtcGeoAreaScheduleFind() {
    return CtcGeoAreaScheduleObjectHelper.fromMapList(outputMap, "CtcGeoAreaScheduleList");
  }
  public CtcGeoAreaScheduleObjectData getCtcGeoAreaScheduleObjectDataCtcGeoAreaScheduleFromCtcGeoAreaScheduleGet() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
  /**
   @deprecated
   */
  public void setCtcGeoAreaScheduleObjectFilter(CtcGeoAreaScheduleObjectFilter data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(data, new HashMap()).get("CtcGeoAreaScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcGeoAreaScheduleObjectData(CtcGeoAreaScheduleObjectData data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectHelper.toMap(data, new HashMap()).get("CtcGeoAreaScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcGeoAreaScheduleObjectKeyData(CtcGeoAreaScheduleObjectKeyData data) {
    if (data != null) {
      addInput("CtcGeoAreaSchedule", CtcGeoAreaScheduleObjectKeyHelper.toMap(data, new HashMap()).get("CtcGeoAreaScheduleObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcGeoAreaScheduleObjectDataList getCtcGeoAreaScheduleObjectDataList() {
    return CtcGeoAreaScheduleObjectHelper.fromMapList(outputMap, "CtcGeoAreaScheduleList");
  }
  /**
   @deprecated
   */
  public CtcGeoAreaScheduleObjectData getCtcGeoAreaScheduleObjectData() {
    return CtcGeoAreaScheduleObjectHelper.fromMap(outputMap, "CtcGeoAreaSchedule");
  }
}
