/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanRequest.java
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

import com.csgsystems.cf.data.*;
public final class CorridorPlanRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorPlanRequest (String request, CorridorPlanRequestMethod method) {
    initialize(request, "CorridorPlan", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorPlanRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRateOverrideRequest request, CorridorPlanRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRateOverrideRequest request, CorridorPlanRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCorridorPlanForCorridorPlanCreate(CPObjectData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(data, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
  public void setCorridorPlanForCorridorPlanDelete(CPObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(data, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
  public void setCorridorPlanForCorridorPlanFind(CPObjectFilter data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(data, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
  public void setCorridorPlanForCorridorPlanGet(CPObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(data, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
  public void setCorridorPlanForCorridorPlanUpdate(CPObjectData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(data, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }
  public CPObjectData getCPObjectDataCorridorPlanFromCorridorPlanCreate() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
  public CPObjectData getCPObjectDataCorridorPlanFromCorridorPlanDelete() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
  public CPObjectDataList getCPObjectDataCorridorPlanFromCorridorPlanFind() {
    return CPObjectHelper.fromMapList(outputMap, "CorridorPlanList");
  }
  public CPObjectData getCPObjectDataCorridorPlanFromCorridorPlanGet() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
  public CPObjectData getCPObjectDataCorridorPlanFromCorridorPlanUpdate() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
  /**
   @deprecated
   */
  public void setCPObjectFilter(CPObjectFilter data) {
    if (data != null) {
      addInput("CP", CPObjectHelper.toMap(data, new HashMap()).get("CPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPObjectData(CPObjectData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectHelper.toMap(data, new HashMap()).get("CPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPObjectKeyData(CPObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlan", CPObjectKeyHelper.toMap(data, new HashMap()).get("CPObject"));
    }
  }
  /**
   @deprecated
   */
  public CPObjectDataList getCPObjectDataList() {
    return CPObjectHelper.fromMapList(outputMap, "CPList");
  }
  /**
   @deprecated
   */
  public CPObjectData getCPObjectData() {
    return CPObjectHelper.fromMap(outputMap, "CorridorPlan");
  }
}
