/*
 * Generated code DO NOT EDIT
 * Generated file: RbrCalendarRequest.java
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

import com.csgsystems.cf.data.*;
public final class RbrCalendarRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrCalendarRequest (String request, RbrCalendarRequestMethod method) {
    initialize(request, "RbrCalendar", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrCalendarRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrCalendarForRbrCalendarCreate(RbrCalendarObjectData data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(data, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
  public void setRbrCalendarForRbrCalendarFind(RbrCalendarObjectFilter data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(data, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
  public void setRbrCalendarForRbrCalendarGet(RbrCalendarObjectKeyData data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectKeyHelper.toMap(data, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
  public void setRbrCalendarForRbrCalendarUpdate(RbrCalendarObjectData data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(data, new HashMap(), "RbrCalendar").get("RbrCalendar"));
    }
  }
  public RbrCalendarObjectData getRbrCalendarObjectDataRbrCalendarFromRbrCalendarCreate() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
  public RbrCalendarObjectDataList getRbrCalendarObjectDataRbrCalendarFromRbrCalendarFind() {
    return RbrCalendarObjectHelper.fromMapList(outputMap, "RbrCalendarList");
  }
  public RbrCalendarObjectData getRbrCalendarObjectDataRbrCalendarFromRbrCalendarGet() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
  public RbrCalendarObjectData getRbrCalendarObjectDataRbrCalendarFromRbrCalendarUpdate() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
  /**
   @deprecated
   */
  public void setRbrCalendarObjectFilter(RbrCalendarObjectFilter data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(data, new HashMap()).get("RbrCalendarObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrCalendarObjectData(RbrCalendarObjectData data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectHelper.toMap(data, new HashMap()).get("RbrCalendarObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrCalendarObjectKeyData(RbrCalendarObjectKeyData data) {
    if (data != null) {
      addInput("RbrCalendar", RbrCalendarObjectKeyHelper.toMap(data, new HashMap()).get("RbrCalendarObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrCalendarObjectDataList getRbrCalendarObjectDataList() {
    return RbrCalendarObjectHelper.fromMapList(outputMap, "RbrCalendarList");
  }
  /**
   @deprecated
   */
  public RbrCalendarObjectData getRbrCalendarObjectData() {
    return RbrCalendarObjectHelper.fromMap(outputMap, "RbrCalendar");
  }
}
