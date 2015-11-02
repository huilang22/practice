/*
 * Generated code DO NOT EDIT
 * Generated file: ZoneRequest.java
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
public final class ZoneRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ZoneRequest (String request, ZoneRequestMethod method) {
    initialize(request, "Zone", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ZoneRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setZoneForZoneCreate(ZoneObjectData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectHelper.toMap(data, new HashMap(), "Zone").get("Zone"));
    }
  }
  public void setZoneForZoneDelete(ZoneObjectKeyData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectKeyHelper.toMap(data, new HashMap(), "Zone").get("Zone"));
    }
  }
  public void setZoneForZoneFind(ZoneObjectFilter data) {
    if (data != null) {
      addInput("Zone", ZoneObjectHelper.toMap(data, new HashMap(), "Zone").get("Zone"));
    }
  }
  public void setZoneForZoneGet(ZoneObjectKeyData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectKeyHelper.toMap(data, new HashMap(), "Zone").get("Zone"));
    }
  }
  public void setZoneForZoneUpdate(ZoneObjectData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectHelper.toMap(data, new HashMap(), "Zone").get("Zone"));
    }
  }
  public ZoneObjectData getZoneObjectDataZoneFromZoneCreate() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
  public ZoneObjectData getZoneObjectDataZoneFromZoneDelete() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
  public ZoneObjectDataList getZoneObjectDataZoneFromZoneFind() {
    return ZoneObjectHelper.fromMapList(outputMap, "ZoneList");
  }
  public ZoneObjectData getZoneObjectDataZoneFromZoneGet() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
  public ZoneObjectData getZoneObjectDataZoneFromZoneUpdate() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
  /**
   @deprecated
   */
  public void setZoneObjectFilter(ZoneObjectFilter data) {
    if (data != null) {
      addInput("Zone", ZoneObjectHelper.toMap(data, new HashMap()).get("ZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setZoneObjectData(ZoneObjectData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectHelper.toMap(data, new HashMap()).get("ZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setZoneObjectKeyData(ZoneObjectKeyData data) {
    if (data != null) {
      addInput("Zone", ZoneObjectKeyHelper.toMap(data, new HashMap()).get("ZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public ZoneObjectDataList getZoneObjectDataList() {
    return ZoneObjectHelper.fromMapList(outputMap, "ZoneList");
  }
  /**
   @deprecated
   */
  public ZoneObjectData getZoneObjectData() {
    return ZoneObjectHelper.fromMap(outputMap, "Zone");
  }
}
