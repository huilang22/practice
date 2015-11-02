/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeUnitRequest.java
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
public final class UsageTypeUnitRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageTypeUnitRequest (String request, UsageTypeUnitRequestMethod method) {
    initialize(request, "UsageTypeUnit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageTypeUnitRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageTypeUnitForUsageTypeUnitCreate(UsageTypeUnitObjectData data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(data, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
  public void setUsageTypeUnitForUsageTypeUnitFind(UsageTypeUnitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(data, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
  public void setUsageTypeUnitForUsageTypeUnitGet(UsageTypeUnitObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectKeyHelper.toMap(data, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
  public void setUsageTypeUnitForUsageTypeUnitUpdate(UsageTypeUnitObjectData data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(data, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }
  public void setUsageTypeUnitUpdateFilterForUsageTypeUnitUpdate(UsageTypeUnitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeUnitUpdateFilter", UsageTypeUnitObjectHelper.toMap(data, new HashMap(), "UsageTypeUnitUpdateFilter").get("UsageTypeUnitUpdateFilter"));
    }
  }
  public void setUsageTypeUnitUpdateGetForUsageTypeUnitUpdate(UsageTypeUnitObjectData data) {
    if (data != null) {
      addInput("UsageTypeUnitUpdateGet", UsageTypeUnitObjectHelper.toMap(data, new HashMap(), "UsageTypeUnitUpdateGet").get("UsageTypeUnitUpdateGet"));
    }
  }
  public UsageTypeUnitObjectData getUsageTypeUnitObjectDataUsageTypeUnitFromUsageTypeUnitCreate() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
  public UsageTypeUnitObjectDataList getUsageTypeUnitObjectDataUsageTypeUnitFromUsageTypeUnitFind() {
    return UsageTypeUnitObjectHelper.fromMapList(outputMap, "UsageTypeUnitList");
  }
  public UsageTypeUnitObjectData getUsageTypeUnitObjectDataUsageTypeUnitFromUsageTypeUnitGet() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
  public UsageTypeUnitObjectData getUsageTypeUnitObjectDataUsageTypeUnitFromUsageTypeUnitUpdate() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
  /**
   @deprecated
   */
  public void setUsageTypeUnitObjectFilter(UsageTypeUnitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(data, new HashMap()).get("UsageTypeUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeUnitObjectData(UsageTypeUnitObjectData data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(data, new HashMap()).get("UsageTypeUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeUnitObjectKeyData(UsageTypeUnitObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectKeyHelper.toMap(data, new HashMap()).get("UsageTypeUnitObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageTypeUnitObjectDataList getUsageTypeUnitObjectDataList() {
    return UsageTypeUnitObjectHelper.fromMapList(outputMap, "UsageTypeUnitList");
  }
  /**
   @deprecated
   */
  public UsageTypeUnitObjectData getUsageTypeUnitObjectData() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
}
