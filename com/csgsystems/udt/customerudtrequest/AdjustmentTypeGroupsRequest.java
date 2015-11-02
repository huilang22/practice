/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTypeGroupsRequest.java
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
public final class AdjustmentTypeGroupsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjustmentTypeGroupsRequest (String request, AdjustmentTypeGroupsRequestMethod method) {
    initialize(request, "AdjustmentTypeGroups", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjustmentTypeGroupsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdjustmentTypeGroupsForAdjustmentTypeGroupsCreate(AdjustmentTypeGroupsObjectData data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(data, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
  public void setAdjustmentTypeGroupsForAdjustmentTypeGroupsDelete(AdjustmentTypeGroupsObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
  public void setAdjustmentTypeGroupsForAdjustmentTypeGroupsFind(AdjustmentTypeGroupsObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(data, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
  public void setAdjustmentTypeGroupsForAdjustmentTypeGroupsGet(AdjustmentTypeGroupsObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentTypeGroups").get("AdjustmentTypeGroups"));
    }
  }
  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroupsObjectDataAdjustmentTypeGroupsFromAdjustmentTypeGroupsCreate() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroupsObjectDataAdjustmentTypeGroupsFromAdjustmentTypeGroupsDelete() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
  public AdjustmentTypeGroupsObjectDataList getAdjustmentTypeGroupsObjectDataAdjustmentTypeGroupsFromAdjustmentTypeGroupsFind() {
    return AdjustmentTypeGroupsObjectHelper.fromMapList(outputMap, "AdjustmentTypeGroupsList");
  }
  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroupsObjectDataAdjustmentTypeGroupsFromAdjustmentTypeGroupsGet() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
  /**
   @deprecated
   */
  public void setAdjustmentTypeGroupsObjectFilter(AdjustmentTypeGroupsObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(data, new HashMap()).get("AdjustmentTypeGroupsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentTypeGroupsObjectData(AdjustmentTypeGroupsObjectData data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectHelper.toMap(data, new HashMap()).get("AdjustmentTypeGroupsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentTypeGroupsObjectKeyData(AdjustmentTypeGroupsObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentTypeGroups", AdjustmentTypeGroupsObjectKeyHelper.toMap(data, new HashMap()).get("AdjustmentTypeGroupsObject"));
    }
  }
  /**
   @deprecated
   */
  public AdjustmentTypeGroupsObjectDataList getAdjustmentTypeGroupsObjectDataList() {
    return AdjustmentTypeGroupsObjectHelper.fromMapList(outputMap, "AdjustmentTypeGroupsList");
  }
  /**
   @deprecated
   */
  public AdjustmentTypeGroupsObjectData getAdjustmentTypeGroupsObjectData() {
    return AdjustmentTypeGroupsObjectHelper.fromMap(outputMap, "AdjustmentTypeGroups");
  }
}
