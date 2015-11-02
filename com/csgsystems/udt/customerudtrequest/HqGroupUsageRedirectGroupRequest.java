/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupUsageRedirectGroupRequest.java
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
public final class HqGroupUsageRedirectGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqGroupUsageRedirectGroupRequest (String request, HqGroupUsageRedirectGroupRequestMethod method) {
    initialize(request, "HqGroupUsageRedirectGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqGroupUsageRedirectGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqGroupUsageRedirectGroupForHqGroupUsageRedirectGroupCreate(HqGroupUsageRedirectGroupObjectData data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(data, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
  public void setHqGroupUsageRedirectGroupForHqGroupUsageRedirectGroupDelete(HqGroupUsageRedirectGroupObjectData data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(data, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
  public void setHqGroupUsageRedirectGroupForHqGroupUsageRedirectGroupFind(HqGroupUsageRedirectGroupObjectFilter data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(data, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
  public void setHqGroupUsageRedirectGroupForHqGroupUsageRedirectGroupGet(HqGroupUsageRedirectGroupObjectKeyData data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectKeyHelper.toMap(data, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }
  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroupObjectDataHqGroupUsageRedirectGroupFromHqGroupUsageRedirectGroupCreate() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroupObjectDataHqGroupUsageRedirectGroupFromHqGroupUsageRedirectGroupDelete() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
  public HqGroupUsageRedirectGroupObjectDataList getHqGroupUsageRedirectGroupObjectDataHqGroupUsageRedirectGroupFromHqGroupUsageRedirectGroupFind() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMapList(outputMap, "HqGroupUsageRedirectGroupList");
  }
  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroupObjectDataHqGroupUsageRedirectGroupFromHqGroupUsageRedirectGroupGet() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectGroupObjectFilter(HqGroupUsageRedirectGroupObjectFilter data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectGroupObjectData(HqGroupUsageRedirectGroupObjectData data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqGroupUsageRedirectGroupObjectKeyData(HqGroupUsageRedirectGroupObjectKeyData data) {
    if (data != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectKeyHelper.toMap(data, new HashMap()).get("HqGroupUsageRedirectGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public HqGroupUsageRedirectGroupObjectDataList getHqGroupUsageRedirectGroupObjectDataList() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMapList(outputMap, "HqGroupUsageRedirectGroupList");
  }
  /**
   @deprecated
   */
  public HqGroupUsageRedirectGroupObjectData getHqGroupUsageRedirectGroupObjectData() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
}
