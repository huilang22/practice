/*
 * Generated code DO NOT EDIT
 * Generated file: LocationCodeRequest.java
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
public final class LocationCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LocationCodeRequest (String request, LocationCodeRequestMethod method) {
    initialize(request, "LocationCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LocationCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLocationCodeForLocationCodeCreate(LOCObjectData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(data, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
  public void setLocationCodeForLocationCodeDelete(LOCObjectKeyData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectKeyHelper.toMap(data, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
  public void setLocationCodeForLocationCodeFind(LOCObjectFilter data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(data, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
  public void setLocationCodeForLocationCodeGet(LOCObjectKeyData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectKeyHelper.toMap(data, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
  public void setLocationCodeForLocationCodeUpdate(LOCObjectData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(data, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }
  public LOCObjectData getLOCObjectDataLocationCodeFromLocationCodeCreate() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
  public LOCObjectData getLOCObjectDataLocationCodeFromLocationCodeDelete() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
  public LOCObjectDataList getLOCObjectDataLocationCodeFromLocationCodeFind() {
    return LOCObjectHelper.fromMapList(outputMap, "LocationCodeList");
  }
  public LOCObjectData getLOCObjectDataLocationCodeFromLocationCodeGet() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
  public LOCObjectData getLOCObjectDataLocationCodeFromLocationCodeUpdate() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
  /**
   @deprecated
   */
  public void setLOCObjectFilter(LOCObjectFilter data) {
    if (data != null) {
      addInput("LOC", LOCObjectHelper.toMap(data, new HashMap()).get("LOCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLOCObjectData(LOCObjectData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectHelper.toMap(data, new HashMap()).get("LOCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLOCObjectKeyData(LOCObjectKeyData data) {
    if (data != null) {
      addInput("LocationCode", LOCObjectKeyHelper.toMap(data, new HashMap()).get("LOCObject"));
    }
  }
  /**
   @deprecated
   */
  public LOCObjectDataList getLOCObjectDataList() {
    return LOCObjectHelper.fromMapList(outputMap, "LOCList");
  }
  /**
   @deprecated
   */
  public LOCObjectData getLOCObjectData() {
    return LOCObjectHelper.fromMap(outputMap, "LocationCode");
  }
}
