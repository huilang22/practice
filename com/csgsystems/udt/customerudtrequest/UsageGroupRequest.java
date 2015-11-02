/*
 * Generated code DO NOT EDIT
 * Generated file: UsageGroupRequest.java
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
public final class UsageGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageGroupRequest (String request, UsageGroupRequestMethod method) {
    initialize(request, "UsageGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageGroupForUsageGroupFind(UsageGroupObjectFilter data) {
    if (data != null) {
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(data, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }
  public void setUsageGroupForUsageGroupGet(UsageGroupObjectKeyData data) {
    if (data != null) {
      addInput("UsageGroup", UsageGroupObjectKeyHelper.toMap(data, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }
  public UsageGroupObjectDataList getUsageGroupObjectDataUsageGroupFromUsageGroupFind() {
    return UsageGroupObjectHelper.fromMapList(outputMap, "UsageGroupList");
  }
  public UsageGroupObjectData getUsageGroupObjectDataUsageGroupFromUsageGroupGet() {
    return UsageGroupObjectHelper.fromMap(outputMap, "UsageGroup");
  }
  /**
   @deprecated
   */
  public void setUsageGroupObjectFilter(UsageGroupObjectFilter data) {
    if (data != null) {
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(data, new HashMap()).get("UsageGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageGroupObjectKeyData(UsageGroupObjectKeyData data) {
    if (data != null) {
      addInput("UsageGroup", UsageGroupObjectKeyHelper.toMap(data, new HashMap()).get("UsageGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageGroupObjectDataList getUsageGroupObjectDataList() {
    return UsageGroupObjectHelper.fromMapList(outputMap, "UsageGroupList");
  }
  /**
   @deprecated
   */
  public UsageGroupObjectData getUsageGroupObjectData() {
    return UsageGroupObjectHelper.fromMap(outputMap, "UsageGroup");
  }
}
