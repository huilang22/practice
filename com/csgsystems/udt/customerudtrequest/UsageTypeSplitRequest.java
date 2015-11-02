/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeSplitRequest.java
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
public final class UsageTypeSplitRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageTypeSplitRequest (String request, UsageTypeSplitRequestMethod method) {
    initialize(request, "UsageTypeSplit", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageTypeSplitRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageTypeSplitForUsageTypeSplitCreate(UsageTypeSplitObjectData data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(data, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
  public void setUsageTypeSplitForUsageTypeSplitFind(UsageTypeSplitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(data, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
  public void setUsageTypeSplitForUsageTypeSplitGet(UsageTypeSplitObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectKeyHelper.toMap(data, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
  public void setUsageTypeSplitForUsageTypeSplitUpdate(UsageTypeSplitObjectData data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(data, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }
  public void setUsageTypeSplitUpdateFilterForUsageTypeSplitUpdate(UsageTypeSplitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeSplitUpdateFilter", UsageTypeSplitObjectHelper.toMap(data, new HashMap(), "UsageTypeSplitUpdateFilter").get("UsageTypeSplitUpdateFilter"));
    }
  }
  public void setUsageTypeSplitUpdateGetForUsageTypeSplitUpdate(UsageTypeSplitObjectData data) {
    if (data != null) {
      addInput("UsageTypeSplitUpdateGet", UsageTypeSplitObjectHelper.toMap(data, new HashMap(), "UsageTypeSplitUpdateGet").get("UsageTypeSplitUpdateGet"));
    }
  }
  public UsageTypeSplitObjectData getUsageTypeSplitObjectDataUsageTypeSplitFromUsageTypeSplitCreate() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
  public UsageTypeSplitObjectDataList getUsageTypeSplitObjectDataUsageTypeSplitFromUsageTypeSplitFind() {
    return UsageTypeSplitObjectHelper.fromMapList(outputMap, "UsageTypeSplitList");
  }
  public UsageTypeSplitObjectData getUsageTypeSplitObjectDataUsageTypeSplitFromUsageTypeSplitGet() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
  public UsageTypeSplitObjectData getUsageTypeSplitObjectDataUsageTypeSplitFromUsageTypeSplitUpdate() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
  /**
   @deprecated
   */
  public void setUsageTypeSplitObjectFilter(UsageTypeSplitObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(data, new HashMap()).get("UsageTypeSplitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeSplitObjectData(UsageTypeSplitObjectData data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(data, new HashMap()).get("UsageTypeSplitObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeSplitObjectKeyData(UsageTypeSplitObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeSplit", UsageTypeSplitObjectKeyHelper.toMap(data, new HashMap()).get("UsageTypeSplitObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageTypeSplitObjectDataList getUsageTypeSplitObjectDataList() {
    return UsageTypeSplitObjectHelper.fromMapList(outputMap, "UsageTypeSplitList");
  }
  /**
   @deprecated
   */
  public UsageTypeSplitObjectData getUsageTypeSplitObjectData() {
    return UsageTypeSplitObjectHelper.fromMap(outputMap, "UsageTypeSplit");
  }
}
