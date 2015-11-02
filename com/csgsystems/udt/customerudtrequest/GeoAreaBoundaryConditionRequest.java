/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryConditionRequest.java
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
public final class GeoAreaBoundaryConditionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaBoundaryConditionRequest (String request, GeoAreaBoundaryConditionRequestMethod method) {
    initialize(request, "GeoAreaBoundaryCondition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaBoundaryConditionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaBoundaryConditionForGeoAreaBoundaryConditionCreate(GeoAreaBoundaryConditionObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
  public void setGeoAreaBoundaryConditionForGeoAreaBoundaryConditionDelete(GeoAreaBoundaryConditionObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
  public void setGeoAreaBoundaryConditionForGeoAreaBoundaryConditionFind(GeoAreaBoundaryConditionObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
  public void setGeoAreaBoundaryConditionForGeoAreaBoundaryConditionGet(GeoAreaBoundaryConditionObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
  public void setGeoAreaBoundaryConditionForGeoAreaBoundaryConditionUpdate(GeoAreaBoundaryConditionObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundaryCondition").get("GeoAreaBoundaryCondition"));
    }
  }
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryConditionObjectDataGeoAreaBoundaryConditionFromGeoAreaBoundaryConditionCreate() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryConditionObjectDataGeoAreaBoundaryConditionFromGeoAreaBoundaryConditionDelete() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
  public GeoAreaBoundaryConditionObjectDataList getGeoAreaBoundaryConditionObjectDataGeoAreaBoundaryConditionFromGeoAreaBoundaryConditionFind() {
    return GeoAreaBoundaryConditionObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryConditionList");
  }
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryConditionObjectDataGeoAreaBoundaryConditionFromGeoAreaBoundaryConditionGet() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryConditionObjectDataGeoAreaBoundaryConditionFromGeoAreaBoundaryConditionUpdate() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryConditionObjectFilter(GeoAreaBoundaryConditionObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryConditionObjectData(GeoAreaBoundaryConditionObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryConditionObjectKeyData(GeoAreaBoundaryConditionObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundaryCondition", GeoAreaBoundaryConditionObjectKeyHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public GeoAreaBoundaryConditionObjectDataList getGeoAreaBoundaryConditionObjectDataList() {
    return GeoAreaBoundaryConditionObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryConditionList");
  }
  /**
   @deprecated
   */
  public GeoAreaBoundaryConditionObjectData getGeoAreaBoundaryConditionObjectData() {
    return GeoAreaBoundaryConditionObjectHelper.fromMap(outputMap, "GeoAreaBoundaryCondition");
  }
}
