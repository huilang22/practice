/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneClassRequest.java
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
public final class ZoneClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ZoneClassRequest (String request, ZoneClassRequestMethod method) {
    initialize(request, "ZoneClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ZoneClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setZoneClassForZoneClassCreate(ZoneClassObjectData data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(data, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
  public void setZoneClassForZoneClassFind(ZoneClassObjectFilter data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(data, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
  public void setZoneClassForZoneClassGet(ZoneClassObjectKeyData data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectKeyHelper.toMap(data, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
  public void setZoneClassForZoneClassUpdate(ZoneClassObjectData data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(data, new HashMap(), "ZoneClass").get("ZoneClass"));
    }
  }
  public ZoneClassObjectData getZoneClassObjectDataZoneClassFromZoneClassCreate() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
  public ZoneClassObjectDataList getZoneClassObjectDataZoneClassFromZoneClassFind() {
    return ZoneClassObjectHelper.fromMapList(outputMap, "ZoneClassList");
  }
  public ZoneClassObjectData getZoneClassObjectDataZoneClassFromZoneClassGet() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
  public ZoneClassObjectData getZoneClassObjectDataZoneClassFromZoneClassUpdate() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
  /**
   @deprecated
   */
  public void setZoneClassObjectFilter(ZoneClassObjectFilter data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(data, new HashMap()).get("ZoneClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setZoneClassObjectData(ZoneClassObjectData data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectHelper.toMap(data, new HashMap()).get("ZoneClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setZoneClassObjectKeyData(ZoneClassObjectKeyData data) {
    if (data != null) {
      addInput("ZoneClass", ZoneClassObjectKeyHelper.toMap(data, new HashMap()).get("ZoneClassObject"));
    }
  }
  /**
   @deprecated
   */
  public ZoneClassObjectDataList getZoneClassObjectDataList() {
    return ZoneClassObjectHelper.fromMapList(outputMap, "ZoneClassList");
  }
  /**
   @deprecated
   */
  public ZoneClassObjectData getZoneClassObjectData() {
    return ZoneClassObjectHelper.fromMap(outputMap, "ZoneClass");
  }
}
