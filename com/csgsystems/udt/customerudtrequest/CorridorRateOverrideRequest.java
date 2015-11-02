/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideRequest.java
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

import com.csgsystems.bp.data.*;
public final class CorridorRateOverrideRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorRateOverrideRequest (String request, CorridorRateOverrideRequestMethod method) {
    initialize(request, "CorridorRateOverride", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorRateOverrideRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorPlanRequest request, CorridorRateOverrideRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorPlanRequest request, CorridorRateOverrideRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRateBandOverrideRequest request, CorridorRateOverrideRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRateBandOverrideRequest request, CorridorRateOverrideRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCorridorRateOverrideForCorridorRateOverrideFind(CROObjectFilter data) {
    if (data != null) {
      addInput("CorridorRateOverride", CROObjectHelper.toMap(data, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }
  public void setCorridorRateOverrideForCorridorRateOverrideGet(CROObjectKeyData data) {
    if (data != null) {
      addInput("CorridorRateOverride", CROObjectKeyHelper.toMap(data, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }
  public void setCorridorRateOverrideForCorridorRateOverrideUpdate(CROObjectData data) {
    if (data != null) {
      addInput("CorridorRateOverride", CROObjectHelper.toMap(data, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }
  public CROObjectDataList getCROObjectDataCorridorRateOverrideFromCorridorRateOverrideFind() {
    return CROObjectHelper.fromMapList(outputMap, "CorridorRateOverrideList");
  }
  public CROObjectData getCROObjectDataCorridorRateOverrideFromCorridorRateOverrideGet() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
  public CROObjectData getCROObjectDataCorridorRateOverrideFromCorridorRateOverrideUpdate() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
  /**
   @deprecated
   */
  public void setCROObjectFilter(CROObjectFilter data) {
    if (data != null) {
      addInput("CRO", CROObjectHelper.toMap(data, new HashMap()).get("CROObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCROObjectData(CROObjectData data) {
    if (data != null) {
      addInput("CorridorRateOverride", CROObjectHelper.toMap(data, new HashMap()).get("CROObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCROObjectKeyData(CROObjectKeyData data) {
    if (data != null) {
      addInput("CorridorRateOverride", CROObjectKeyHelper.toMap(data, new HashMap()).get("CROObject"));
    }
  }
  /**
   @deprecated
   */
  public CROObjectDataList getCROObjectDataList() {
    return CROObjectHelper.fromMapList(outputMap, "CROList");
  }
  /**
   @deprecated
   */
  public CROObjectData getCROObjectData() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
}
