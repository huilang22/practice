/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpRequest.java
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
public final class GeoAreaSvcGrpRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaSvcGrpRequest (String request, GeoAreaSvcGrpRequestMethod method) {
    initialize(request, "GeoAreaSvcGrp", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaSvcGrpRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaSvcGrpForGeoAreaSvcGrpCreate(GASGObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
  public void setGeoAreaSvcGrpForGeoAreaSvcGrpDelete(GASGObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(data, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
  public void setGeoAreaSvcGrpForGeoAreaSvcGrpFind(GASGObjFilter data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
  public void setGeoAreaSvcGrpForGeoAreaSvcGrpGet(GASGObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(data, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
  public void setGeoAreaSvcGrpForGeoAreaSvcGrpUpdate(GASGObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrp").get("GeoAreaSvcGrp"));
    }
  }
  public GASGObjData getGASGObjDataGeoAreaSvcGrpFromGeoAreaSvcGrpCreate() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
  public GASGObjData getGASGObjDataGeoAreaSvcGrpFromGeoAreaSvcGrpDelete() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
  public GASGObjDataList getGASGObjDataGeoAreaSvcGrpFromGeoAreaSvcGrpFind() {
    return GASGObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpList");
  }
  public GASGObjData getGASGObjDataGeoAreaSvcGrpFromGeoAreaSvcGrpGet() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
  public GASGObjData getGASGObjDataGeoAreaSvcGrpFromGeoAreaSvcGrpUpdate() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
  /**
   @deprecated
   */
  public void setGASGObjFilter(GASGObjFilter data) {
    if (data != null) {
      addInput("GASGObj", GASGObjHelper.toMap(data, new HashMap()).get("GASGObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASGObjData(GASGObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjHelper.toMap(data, new HashMap()).get("GASGObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASGObjKeyData(GASGObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrp", GASGObjKeyHelper.toMap(data, new HashMap()).get("GASGObj"));
    }
  }
  /**
   @deprecated
   */
  public GASGObjDataList getGASGObjDataList() {
    return GASGObjHelper.fromMapList(outputMap, "GASGObjList");
  }
  /**
   @deprecated
   */
  public GASGObjData getGASGObjData() {
    return GASGObjHelper.fromMap(outputMap, "GeoAreaSvcGrp");
  }
}
