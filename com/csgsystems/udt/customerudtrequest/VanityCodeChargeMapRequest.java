/*
 * Generated code DO NOT EDIT
 * Generated file: VanityCodeChargeMapRequest.java
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

import com.csgsystems.om.data.*;
public final class VanityCodeChargeMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VanityCodeChargeMapRequest (String request, VanityCodeChargeMapRequestMethod method) {
    initialize(request, "VanityCodeChargeMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VanityCodeChargeMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, VanityCodeChargeMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, VanityCodeChargeMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, VanityCodeChargeMapRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, VanityCodeChargeMapRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setVanityCodeChargeMapForVanityCodeChargeMapCreate(VanityCodeChargeObjData data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(data, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
  public void setVanityCodeChargeMapForVanityCodeChargeMapFind(VanityCodeChargeObjFilter data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(data, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
  public void setVanityCodeChargeMapForVanityCodeChargeMapGet(VanityCodeChargeObjKeyData data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjKeyHelper.toMap(data, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
  public void setVanityCodeChargeMapForVanityCodeChargeMapUpdate(VanityCodeChargeObjData data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(data, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }
  public VanityCodeChargeObjData getVanityCodeChargeObjDataVanityCodeChargeMapFromVanityCodeChargeMapCreate() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
  public VanityCodeChargeObjDataList getVanityCodeChargeObjDataVanityCodeChargeMapFromVanityCodeChargeMapFind() {
    return VanityCodeChargeObjHelper.fromMapList(outputMap, "VanityCodeChargeMapList");
  }
  public VanityCodeChargeObjData getVanityCodeChargeObjDataVanityCodeChargeMapFromVanityCodeChargeMapGet() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
  public VanityCodeChargeObjData getVanityCodeChargeObjDataVanityCodeChargeMapFromVanityCodeChargeMapUpdate() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
  /**
   @deprecated
   */
  public void setVanityCodeChargeObjFilter(VanityCodeChargeObjFilter data) {
    if (data != null) {
      addInput("VanityCodeChargeObj", VanityCodeChargeObjHelper.toMap(data, new HashMap()).get("VanityCodeChargeObj"));
    }
  }
  /**
   @deprecated
   */
  public void setVanityCodeChargeObjData(VanityCodeChargeObjData data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(data, new HashMap()).get("VanityCodeChargeObj"));
    }
  }
  /**
   @deprecated
   */
  public void setVanityCodeChargeObjKeyData(VanityCodeChargeObjKeyData data) {
    if (data != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjKeyHelper.toMap(data, new HashMap()).get("VanityCodeChargeObj"));
    }
  }
  /**
   @deprecated
   */
  public VanityCodeChargeObjDataList getVanityCodeChargeObjDataList() {
    return VanityCodeChargeObjHelper.fromMapList(outputMap, "VanityCodeChargeObjList");
  }
  /**
   @deprecated
   */
  public VanityCodeChargeObjData getVanityCodeChargeObjData() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
}
