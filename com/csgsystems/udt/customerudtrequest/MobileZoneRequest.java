/*
 * Generated code DO NOT EDIT
 * Generated file: MobileZoneRequest.java
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
public final class MobileZoneRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MobileZoneRequest (String request, MobileZoneRequestMethod method) {
    initialize(request, "MobileZone", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MobileZoneRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMobileZoneForMobileZoneCreate(MobileZoneObjectData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(data, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
  public void setMobileZoneForMobileZoneDelete(MobileZoneObjectKeyData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(data, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
  public void setMobileZoneForMobileZoneFind(MobileZoneObjectFilter data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(data, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
  public void setMobileZoneForMobileZoneGet(MobileZoneObjectKeyData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(data, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
  public void setMobileZoneForMobileZoneUpdate(MobileZoneObjectData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(data, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
  public MobileZoneObjectData getMobileZoneObjectDataMobileZoneFromMobileZoneCreate() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
  public MobileZoneObjectData getMobileZoneObjectDataMobileZoneFromMobileZoneDelete() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
  public MobileZoneObjectDataList getMobileZoneObjectDataMobileZoneFromMobileZoneFind() {
    return MobileZoneObjectHelper.fromMapList(outputMap, "MobileZoneList");
  }
  public MobileZoneObjectData getMobileZoneObjectDataMobileZoneFromMobileZoneGet() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
  public MobileZoneObjectData getMobileZoneObjectDataMobileZoneFromMobileZoneUpdate() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
  /**
   @deprecated
   */
  public void setMobileZoneObjectFilter(MobileZoneObjectFilter data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(data, new HashMap()).get("MobileZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMobileZoneObjectData(MobileZoneObjectData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(data, new HashMap()).get("MobileZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMobileZoneObjectKeyData(MobileZoneObjectKeyData data) {
    if (data != null) {
      addInput("MobileZone", MobileZoneObjectKeyHelper.toMap(data, new HashMap()).get("MobileZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public MobileZoneObjectDataList getMobileZoneObjectDataList() {
    return MobileZoneObjectHelper.fromMapList(outputMap, "MobileZoneList");
  }
  /**
   @deprecated
   */
  public MobileZoneObjectData getMobileZoneObjectData() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
