/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaBoundaryRequest.java
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
public final class GeoAreaBoundaryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaBoundaryRequest (String request, GeoAreaBoundaryRequestMethod method) {
    initialize(request, "GeoAreaBoundary", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaBoundaryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaBoundaryForGeoAreaBoundaryCreate(GeoAreaBoundaryObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
  public void setGeoAreaBoundaryForGeoAreaBoundaryDelete(GeoAreaBoundaryObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
  public void setGeoAreaBoundaryForGeoAreaBoundaryFind(GeoAreaBoundaryObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
  public void setGeoAreaBoundaryForGeoAreaBoundaryGet(GeoAreaBoundaryObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(data, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
  public void setGeoAreaBoundaryForGeoAreaBoundaryUpdate(GeoAreaBoundaryObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(data, new HashMap(), "GeoAreaBoundary").get("GeoAreaBoundary"));
    }
  }
  public GeoAreaBoundaryObjectData getGeoAreaBoundaryObjectDataGeoAreaBoundaryFromGeoAreaBoundaryCreate() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
  public GeoAreaBoundaryObjectData getGeoAreaBoundaryObjectDataGeoAreaBoundaryFromGeoAreaBoundaryDelete() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
  public GeoAreaBoundaryObjectDataList getGeoAreaBoundaryObjectDataGeoAreaBoundaryFromGeoAreaBoundaryFind() {
    return GeoAreaBoundaryObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryList");
  }
  public GeoAreaBoundaryObjectData getGeoAreaBoundaryObjectDataGeoAreaBoundaryFromGeoAreaBoundaryGet() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
  public GeoAreaBoundaryObjectData getGeoAreaBoundaryObjectDataGeoAreaBoundaryFromGeoAreaBoundaryUpdate() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryObjectFilter(GeoAreaBoundaryObjectFilter data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryObjectData(GeoAreaBoundaryObjectData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGeoAreaBoundaryObjectKeyData(GeoAreaBoundaryObjectKeyData data) {
    if (data != null) {
      addInput("GeoAreaBoundary", GeoAreaBoundaryObjectKeyHelper.toMap(data, new HashMap()).get("GeoAreaBoundaryObject"));
    }
  }
  /**
   @deprecated
   */
  public GeoAreaBoundaryObjectDataList getGeoAreaBoundaryObjectDataList() {
    return GeoAreaBoundaryObjectHelper.fromMapList(outputMap, "GeoAreaBoundaryList");
  }
  /**
   @deprecated
   */
  public GeoAreaBoundaryObjectData getGeoAreaBoundaryObjectData() {
    return GeoAreaBoundaryObjectHelper.fromMap(outputMap, "GeoAreaBoundary");
  }
}
