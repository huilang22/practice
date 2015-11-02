/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideUsageCreditRateRequest.java
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
public final class OverrideUsageCreditRateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OverrideUsageCreditRateRequest (String request, OverrideUsageCreditRateRequestMethod method) {
    initialize(request, "OverrideUsageCreditRate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OverrideUsageCreditRateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OverrideUsageCreditRateRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OverrideUsageCreditRateRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OverrideUsageCreditRateRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OverrideUsageCreditRateRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setOverrideUsageCreditRateForOverrideUsageCreditRateCreate(RUCOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(data, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
  public void setOverrideUsageCreditRateForOverrideUsageCreditRateFind(RUCOverrideObjectFilter data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(data, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
  public void setOverrideUsageCreditRateForOverrideUsageCreditRateGet(RUCBaseOverrideObjectKeyData data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCBaseOverrideObjectKeyHelper.toMap(data, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
  public void setOverrideUsageCreditRateForOverrideUsageCreditRateUpdate(RUCOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(data, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
  public RUCOverrideObjectData getRUCOverrideObjectDataOverrideUsageCreditRateFromOverrideUsageCreditRateCreate() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
  public RUCOverrideObjectDataList getRUCOverrideObjectDataOverrideUsageCreditRateFromOverrideUsageCreditRateFind() {
    return RUCOverrideObjectHelper.fromMapList(outputMap, "OverrideUsageCreditRateList");
  }
  public RUCOverrideObjectData getRUCOverrideObjectDataOverrideUsageCreditRateFromOverrideUsageCreditRateGet() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
  public RUCOverrideObjectData getRUCOverrideObjectDataOverrideUsageCreditRateFromOverrideUsageCreditRateUpdate() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
  /**
   @deprecated
   */
  public void setRUCBaseOverrideObjectKeyData(RUCBaseOverrideObjectKeyData data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCBaseOverrideObjectKeyHelper.toMap(data, new HashMap()).get("RUCBaseOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUCOverrideObjectFilter(RUCOverrideObjectFilter data) {
    if (data != null) {
      addInput("RUCOverride", RUCOverrideObjectHelper.toMap(data, new HashMap()).get("RUCOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUCOverrideObjectData(RUCOverrideObjectData data) {
    if (data != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(data, new HashMap()).get("RUCOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public RUCOverrideObjectDataList getRUCOverrideObjectDataList() {
    return RUCOverrideObjectHelper.fromMapList(outputMap, "RUCOverrideList");
  }
  /**
   @deprecated
   */
  public RUCOverrideObjectData getRUCOverrideObjectData() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
}
