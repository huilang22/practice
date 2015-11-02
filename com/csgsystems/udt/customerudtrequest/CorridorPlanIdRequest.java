/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanIdRequest.java
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
public final class CorridorPlanIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorPlanIdRequest (String request, CorridorPlanIdRequestMethod method) {
    initialize(request, "CorridorPlanId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorPlanIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCorridorPlanIdForCorridorPlanIdCreate(CPIObjectData data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(data, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
  public void setCorridorPlanIdForCorridorPlanIdFind(CPIObjectFilter data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(data, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
  public void setCorridorPlanIdForCorridorPlanIdGet(CPIObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectKeyHelper.toMap(data, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
  public void setCorridorPlanIdForCorridorPlanIdUpdate(CPIObjectData data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(data, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }
  public CPIObjectData getCPIObjectDataCorridorPlanIdFromCorridorPlanIdCreate() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
  public CPIObjectDataList getCPIObjectDataCorridorPlanIdFromCorridorPlanIdFind() {
    return CPIObjectHelper.fromMapList(outputMap, "CorridorPlanIdList");
  }
  public CPIObjectData getCPIObjectDataCorridorPlanIdFromCorridorPlanIdGet() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
  public CPIObjectData getCPIObjectDataCorridorPlanIdFromCorridorPlanIdUpdate() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
  /**
   @deprecated
   */
  public void setCPIObjectFilter(CPIObjectFilter data) {
    if (data != null) {
      addInput("CPI", CPIObjectHelper.toMap(data, new HashMap()).get("CPIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPIObjectData(CPIObjectData data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectHelper.toMap(data, new HashMap()).get("CPIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPIObjectKeyData(CPIObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlanId", CPIObjectKeyHelper.toMap(data, new HashMap()).get("CPIObject"));
    }
  }
  /**
   @deprecated
   */
  public CPIObjectDataList getCPIObjectDataList() {
    return CPIObjectHelper.fromMapList(outputMap, "CPIList");
  }
  /**
   @deprecated
   */
  public CPIObjectData getCPIObjectData() {
    return CPIObjectHelper.fromMap(outputMap, "CorridorPlanId");
  }
}
