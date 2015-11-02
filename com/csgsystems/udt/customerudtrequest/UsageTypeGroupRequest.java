/*
 * Generated code DO NOT EDIT
 * Generated file: UsageTypeGroupRequest.java
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
public final class UsageTypeGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageTypeGroupRequest (String request, UsageTypeGroupRequestMethod method) {
    initialize(request, "UsageTypeGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageTypeGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageTypeGroupForUsageTypeGroupCreate(UsageTypeGroupObjectData data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(data, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
  public void setUsageTypeGroupForUsageTypeGroupFind(UsageTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(data, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
  public void setUsageTypeGroupForUsageTypeGroupGet(UsageTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectKeyHelper.toMap(data, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
  public void setUTGUpdGetForUsageTypeGroupUpdate(UsageTypeGroupObjectData data) {
    if (data != null) {
      addInput("UTGUpdGet", UsageTypeGroupObjectHelper.toMap(data, new HashMap(), "UTGUpdGet").get("UTGUpdGet"));
    }
  }
  public void setUTGUpdateFilterForUsageTypeGroupUpdate(UsageTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("UTGUpdateFilter", UsageTypeGroupObjectHelper.toMap(data, new HashMap(), "UTGUpdateFilter").get("UTGUpdateFilter"));
    }
  }
  public void setUsageTypeGroupForUsageTypeGroupUpdate(UsageTypeGroupObjectData data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(data, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }
  public UsageTypeGroupObjectData getUsageTypeGroupObjectDataUsageTypeGroupFromUsageTypeGroupCreate() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
  public UsageTypeGroupObjectDataList getUsageTypeGroupObjectDataUsageTypeGroupFromUsageTypeGroupFind() {
    return UsageTypeGroupObjectHelper.fromMapList(outputMap, "UsageTypeGroupList");
  }
  public UsageTypeGroupObjectData getUsageTypeGroupObjectDataUsageTypeGroupFromUsageTypeGroupGet() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
  public UsageTypeGroupObjectData getUsageTypeGroupObjectDataUsageTypeGroupFromUsageTypeGroupUpdate() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
  /**
   @deprecated
   */
  public void setUsageTypeGroupObjectFilter(UsageTypeGroupObjectFilter data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(data, new HashMap()).get("UsageTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeGroupObjectData(UsageTypeGroupObjectData data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(data, new HashMap()).get("UsageTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageTypeGroupObjectKeyData(UsageTypeGroupObjectKeyData data) {
    if (data != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectKeyHelper.toMap(data, new HashMap()).get("UsageTypeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageTypeGroupObjectDataList getUsageTypeGroupObjectDataList() {
    return UsageTypeGroupObjectHelper.fromMapList(outputMap, "UsageTypeGroupList");
  }
  /**
   @deprecated
   */
  public UsageTypeGroupObjectData getUsageTypeGroupObjectData() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
}
