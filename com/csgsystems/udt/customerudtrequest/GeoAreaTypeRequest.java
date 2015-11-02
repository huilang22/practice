/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaTypeRequest.java
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

import com.csgsystems.svbl.data.*;
public final class GeoAreaTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaTypeRequest (String request, GeoAreaTypeRequestMethod method) {
    initialize(request, "GeoAreaType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaTypeForGeoAreaTypeCreate(GeoAreaTypeObjectData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(data, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
  public void setGeoAreaTypeForGeoAreaTypeDelete(GeoAreaTypeObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
  public void setGeoAreaTypeForGeoAreaTypeFind(GeoAreaTypeObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(data, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
  public void setGeoAreaTypeForGeoAreaTypeGet(GeoAreaTypeObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
  public void setGeoAreaTypeForGeoAreaTypeUpdate(GeoAreaTypeObjectData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(data, new HashMap(), "GeoAreaType").get("GeoAreaType"));
    }
  }
  public GeoAreaTypeObjectData getGeoAreaTypeObjectDataGeoAreaTypeFromGeoAreaTypeCreate() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
  public GeoAreaTypeObjectData getGeoAreaTypeObjectDataGeoAreaTypeFromGeoAreaTypeDelete() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
  public GeoAreaTypeObjectDataList getGeoAreaTypeObjectDataGeoAreaTypeFromGeoAreaTypeFind() {
    return GeoAreaTypeObjectHelper.fromMapList(outputMap, "GeoAreaTypeList");
  }
  public GeoAreaTypeObjectData getGeoAreaTypeObjectDataGeoAreaTypeFromGeoAreaTypeGet() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
  public GeoAreaTypeObjectData getGeoAreaTypeObjectDataGeoAreaTypeFromGeoAreaTypeUpdate() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
  /**
   @deprecated
   */
  public void setGeoAreaTypeObjectFilter(GeoAreaTypeObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(data, new HashMap()).get("GeoAreaTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaTypeObjectData(GeoAreaTypeObjectData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectHelper.toMap(data, new HashMap()).get("GeoAreaTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaTypeObjectKeyData(GeoAreaTypeObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaType", GeoAreaTypeObjectKeyHelper.toMap(data, new HashMap()).get("GeoAreaTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public GeoAreaTypeObjectDataList getGeoAreaTypeObjectDataList() {
    return GeoAreaTypeObjectHelper.fromMapList(outputMap, "GeoAreaTypeList");
  }
  /**
   @deprecated
   */
  public GeoAreaTypeObjectData getGeoAreaTypeObjectData() {
    return GeoAreaTypeObjectHelper.fromMap(outputMap, "GeoAreaType");
  }
}
