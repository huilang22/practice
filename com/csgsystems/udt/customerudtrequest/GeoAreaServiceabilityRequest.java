/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaServiceabilityRequest.java
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
public final class GeoAreaServiceabilityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaServiceabilityRequest (String request, GeoAreaServiceabilityRequestMethod method) {
    initialize(request, "GeoAreaServiceability", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaServiceabilityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaServiceabilityForGeoAreaServiceabilityCreate(GASObjData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(data, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
  public void setGeoAreaServiceabilityForGeoAreaServiceabilityDelete(GASObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(data, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
  public void setGeoAreaServiceabilityForGeoAreaServiceabilityFind(GASObjFilter data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(data, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
  public void setGeoAreaServiceabilityForGeoAreaServiceabilityGet(GASObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(data, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
  public void setGeoAreaServiceabilityForGeoAreaServiceabilityUpdate(GASObjData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(data, new HashMap(), "GeoAreaServiceability").get("GeoAreaServiceability"));
    }
  }
  public GASObjData getGASObjDataGeoAreaServiceabilityFromGeoAreaServiceabilityCreate() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
  public GASObjData getGASObjDataGeoAreaServiceabilityFromGeoAreaServiceabilityDelete() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
  public GASObjDataList getGASObjDataGeoAreaServiceabilityFromGeoAreaServiceabilityFind() {
    return GASObjHelper.fromMapList(outputMap, "GeoAreaServiceabilityList");
  }
  public GASObjData getGASObjDataGeoAreaServiceabilityFromGeoAreaServiceabilityGet() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
  public GASObjData getGASObjDataGeoAreaServiceabilityFromGeoAreaServiceabilityUpdate() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
  /**
   @deprecated
   */
  public void setGASObjFilter(GASObjFilter data) {
    if (data != null) {
      addInput("GASObj", GASObjHelper.toMap(data, new HashMap()).get("GASObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASObjData(GASObjData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjHelper.toMap(data, new HashMap()).get("GASObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASObjKeyData(GASObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaServiceability", GASObjKeyHelper.toMap(data, new HashMap()).get("GASObj"));
    }
  }
  /**
   @deprecated
   */
  public GASObjDataList getGASObjDataList() {
    return GASObjHelper.fromMapList(outputMap, "GASObjList");
  }
  /**
   @deprecated
   */
  public GASObjData getGASObjData() {
    return GASObjHelper.fromMap(outputMap, "GeoAreaServiceability");
  }
}
