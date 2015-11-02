/*
 * Generated code DO NOT EDIT
 * Generated file: TimezoneRequest.java
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

import com.csgsystems.bp.data.*;
public final class TimezoneRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TimezoneRequest (String request, TimezoneRequestMethod method) {
    initialize(request, "Timezone", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TimezoneRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTimezoneForTimezoneCreate(TimezoneObjectData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(data, new HashMap(), "Timezone").get("Timezone"));
    }
  }
  public void setTimezoneForTimezoneDelete(TimezoneObjectKeyData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(data, new HashMap(), "Timezone").get("Timezone"));
    }
  }
  public void setTimezoneForTimezoneFind(TimezoneObjectFilter data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(data, new HashMap(), "Timezone").get("Timezone"));
    }
  }
  public void setTimezoneForTimezoneGet(TimezoneObjectKeyData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(data, new HashMap(), "Timezone").get("Timezone"));
    }
  }
  public void setTimezoneForTimezoneUpdate(TimezoneObjectData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(data, new HashMap(), "Timezone").get("Timezone"));
    }
  }
  public TimezoneObjectData getTimezoneObjectDataTimezoneFromTimezoneCreate() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
  public TimezoneObjectData getTimezoneObjectDataTimezoneFromTimezoneDelete() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
  public TimezoneObjectDataList getTimezoneObjectDataTimezoneFromTimezoneFind() {
    return TimezoneObjectHelper.fromMapList(outputMap, "TimezoneList");
  }
  public TimezoneObjectData getTimezoneObjectDataTimezoneFromTimezoneGet() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
  public TimezoneObjectData getTimezoneObjectDataTimezoneFromTimezoneUpdate() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
  /**
   @deprecated
   */
  public void setTimezoneObjectFilter(TimezoneObjectFilter data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(data, new HashMap()).get("TimezoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTimezoneObjectData(TimezoneObjectData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectHelper.toMap(data, new HashMap()).get("TimezoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTimezoneObjectKeyData(TimezoneObjectKeyData data) {
    if (data != null) {
      addInput("Timezone", TimezoneObjectKeyHelper.toMap(data, new HashMap()).get("TimezoneObject"));
    }
  }
  /**
   @deprecated
   */
  public TimezoneObjectDataList getTimezoneObjectDataList() {
    return TimezoneObjectHelper.fromMapList(outputMap, "TimezoneList");
  }
  /**
   @deprecated
   */
  public TimezoneObjectData getTimezoneObjectData() {
    return TimezoneObjectHelper.fromMap(outputMap, "Timezone");
  }
}
