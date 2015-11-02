/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorPlanGroupRequest.java
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
public final class CorridorPlanGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CorridorPlanGroupRequest (String request, CorridorPlanGroupRequestMethod method) {
    initialize(request, "CorridorPlanGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CorridorPlanGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCorridorPlanGroupForCorridorPlanGroupCreate(CPGObjectData data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(data, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
  public void setCorridorPlanGroupForCorridorPlanGroupDelete(CPGObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(data, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
  public void setCorridorPlanGroupForCorridorPlanGroupFind(CPGObjectFilter data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(data, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
  public void setCorridorPlanGroupForCorridorPlanGroupGet(CPGObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(data, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }
  public CPGObjectData getCPGObjectDataCorridorPlanGroupFromCorridorPlanGroupCreate() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
  public CPGObjectData getCPGObjectDataCorridorPlanGroupFromCorridorPlanGroupDelete() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
  public CPGObjectDataList getCPGObjectDataCorridorPlanGroupFromCorridorPlanGroupFind() {
    return CPGObjectHelper.fromMapList(outputMap, "CorridorPlanGroupList");
  }
  public CPGObjectData getCPGObjectDataCorridorPlanGroupFromCorridorPlanGroupGet() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
  /**
   @deprecated
   */
  public void setCPGObjectFilter(CPGObjectFilter data) {
    if (data != null) {
      addInput("CPG", CPGObjectHelper.toMap(data, new HashMap()).get("CPGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPGObjectData(CPGObjectData data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(data, new HashMap()).get("CPGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCPGObjectKeyData(CPGObjectKeyData data) {
    if (data != null) {
      addInput("CorridorPlanGroup", CPGObjectKeyHelper.toMap(data, new HashMap()).get("CPGObject"));
    }
  }
  /**
   @deprecated
   */
  public CPGObjectDataList getCPGObjectDataList() {
    return CPGObjectHelper.fromMapList(outputMap, "CPGList");
  }
  /**
   @deprecated
   */
  public CPGObjectData getCPGObjectData() {
    return CPGObjectHelper.fromMap(outputMap, "CorridorPlanGroup");
  }
}
