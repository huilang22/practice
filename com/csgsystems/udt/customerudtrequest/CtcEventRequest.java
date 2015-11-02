/*
 * Generated code DO NOT EDIT
 * Generated file: CtcEventRequest.java
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
public final class CtcEventRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcEventRequest (String request, CtcEventRequestMethod method) {
    initialize(request, "CtcEvent", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcEventRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcEventForCtcEventCreate(CtcEventObjectData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(data, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
  public void setCtcEventForCtcEventDelete(CtcEventObjectKeyData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(data, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
  public void setCtcEventForCtcEventFind(CtcEventObjectFilter data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(data, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
  public void setCtcEventForCtcEventGet(CtcEventObjectKeyData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(data, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
  public void setCtcEventForCtcEventUpdate(CtcEventObjectData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(data, new HashMap(), "CtcEvent").get("CtcEvent"));
    }
  }
  public CtcEventObjectData getCtcEventObjectDataCtcEventFromCtcEventCreate() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
  public CtcEventObjectData getCtcEventObjectDataCtcEventFromCtcEventDelete() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
  public CtcEventObjectDataList getCtcEventObjectDataCtcEventFromCtcEventFind() {
    return CtcEventObjectHelper.fromMapList(outputMap, "CtcEventList");
  }
  public CtcEventObjectData getCtcEventObjectDataCtcEventFromCtcEventGet() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
  public CtcEventObjectData getCtcEventObjectDataCtcEventFromCtcEventUpdate() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
  /**
   @deprecated
   */
  public void setCtcEventObjectFilter(CtcEventObjectFilter data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(data, new HashMap()).get("CtcEventObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcEventObjectData(CtcEventObjectData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectHelper.toMap(data, new HashMap()).get("CtcEventObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcEventObjectKeyData(CtcEventObjectKeyData data) {
    if (data != null) {
      addInput("CtcEvent", CtcEventObjectKeyHelper.toMap(data, new HashMap()).get("CtcEventObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcEventObjectDataList getCtcEventObjectDataList() {
    return CtcEventObjectHelper.fromMapList(outputMap, "CtcEventList");
  }
  /**
   @deprecated
   */
  public CtcEventObjectData getCtcEventObjectData() {
    return CtcEventObjectHelper.fromMap(outputMap, "CtcEvent");
  }
}
