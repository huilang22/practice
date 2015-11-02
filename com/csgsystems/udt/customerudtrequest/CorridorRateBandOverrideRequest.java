/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideRequest.java
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
public final class CorridorRateBandOverrideRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorRateBandOverrideRequest (String request, CorridorRateBandOverrideRequestMethod method) {
    initialize(request, "CorridorRateBandOverride", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorRateBandOverrideRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRateOverrideRequest request, CorridorRateBandOverrideRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRateOverrideRequest request, CorridorRateBandOverrideRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCorridorRateBandOverrideForCorridorRateBandOverrideFind(CRBOObjectFilter data) {
    if (data != null) {
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(data, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }
  public void setCorridorRateBandOverrideForCorridorRateBandOverrideGet(CRBOObjectKeyData data) {
    if (data != null) {
      addInput("CorridorRateBandOverride", CRBOObjectKeyHelper.toMap(data, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }
  public void setCorridorRateBandOverrideForCorridorRateBandOverrideUpdate(CRBOObjectData data) {
    if (data != null) {
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(data, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }
  public CRBOObjectDataList getCRBOObjectDataCorridorRateBandOverrideFromCorridorRateBandOverrideFind() {
    return CRBOObjectHelper.fromMapList(outputMap, "CorridorRateBandOverrideList");
  }
  public CRBOObjectData getCRBOObjectDataCorridorRateBandOverrideFromCorridorRateBandOverrideGet() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
  public CRBOObjectData getCRBOObjectDataCorridorRateBandOverrideFromCorridorRateBandOverrideUpdate() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
  /**
   @deprecated
   */
  public void setCRBOObjectFilter(CRBOObjectFilter data) {
    if (data != null) {
      addInput("CRBO", CRBOObjectHelper.toMap(data, new HashMap()).get("CRBOObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCRBOObjectData(CRBOObjectData data) {
    if (data != null) {
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(data, new HashMap()).get("CRBOObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCRBOObjectKeyData(CRBOObjectKeyData data) {
    if (data != null) {
      addInput("CorridorRateBandOverride", CRBOObjectKeyHelper.toMap(data, new HashMap()).get("CRBOObject"));
    }
  }
  /**
   @deprecated
   */
  public CRBOObjectDataList getCRBOObjectDataList() {
    return CRBOObjectHelper.fromMapList(outputMap, "CRBOList");
  }
  /**
   @deprecated
   */
  public CRBOObjectData getCRBOObjectData() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
}
