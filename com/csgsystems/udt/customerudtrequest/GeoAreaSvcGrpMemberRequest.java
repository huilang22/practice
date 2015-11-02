/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaSvcGrpMemberRequest.java
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
public final class GeoAreaSvcGrpMemberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GeoAreaSvcGrpMemberRequest (String request, GeoAreaSvcGrpMemberRequestMethod method) {
    initialize(request, "GeoAreaSvcGrpMember", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GeoAreaSvcGrpMemberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGeoAreaSvcGrpMemberForGeoAreaSvcGrpMemberCreate(GASGMObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
  public void setGeoAreaSvcGrpMemberForGeoAreaSvcGrpMemberDelete(GASGMObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(data, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
  public void setGeoAreaSvcGrpMemberForGeoAreaSvcGrpMemberFind(GASGMObjFilter data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
  public void setGeoAreaSvcGrpMemberForGeoAreaSvcGrpMemberGet(GASGMObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(data, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
  public void setGeoAreaSvcGrpMemberForGeoAreaSvcGrpMemberUpdate(GASGMObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(data, new HashMap(), "GeoAreaSvcGrpMember").get("GeoAreaSvcGrpMember"));
    }
  }
  public GASGMObjData getGASGMObjDataGeoAreaSvcGrpMemberFromGeoAreaSvcGrpMemberCreate() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
  public GASGMObjData getGASGMObjDataGeoAreaSvcGrpMemberFromGeoAreaSvcGrpMemberDelete() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
  public GASGMObjDataList getGASGMObjDataGeoAreaSvcGrpMemberFromGeoAreaSvcGrpMemberFind() {
    return GASGMObjHelper.fromMapList(outputMap, "GeoAreaSvcGrpMemberList");
  }
  public GASGMObjData getGASGMObjDataGeoAreaSvcGrpMemberFromGeoAreaSvcGrpMemberGet() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
  public GASGMObjData getGASGMObjDataGeoAreaSvcGrpMemberFromGeoAreaSvcGrpMemberUpdate() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
  /**
   @deprecated
   */
  public void setGASGMObjFilter(GASGMObjFilter data) {
    if (data != null) {
      addInput("GASGMObj", GASGMObjHelper.toMap(data, new HashMap()).get("GASGMObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASGMObjData(GASGMObjData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjHelper.toMap(data, new HashMap()).get("GASGMObj"));
    }
  }
  /**
   @deprecated
   */
  public void setGASGMObjKeyData(GASGMObjKeyData data) {
    if (data != null) {
      addInput("GeoAreaSvcGrpMember", GASGMObjKeyHelper.toMap(data, new HashMap()).get("GASGMObj"));
    }
  }
  /**
   @deprecated
   */
  public GASGMObjDataList getGASGMObjDataList() {
    return GASGMObjHelper.fromMapList(outputMap, "GASGMObjList");
  }
  /**
   @deprecated
   */
  public GASGMObjData getGASGMObjData() {
    return GASGMObjHelper.fromMap(outputMap, "GeoAreaSvcGrpMember");
  }
}
