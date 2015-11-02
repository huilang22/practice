/*
 * Generated code DO NOT EDIT
 * Generated file: UsageJurisdictionRequest.java
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
public final class UsageJurisdictionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageJurisdictionRequest (String request, UsageJurisdictionRequestMethod method) {
    initialize(request, "UsageJurisdiction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageJurisdictionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageJurisdictionForUsageJurisdictionCreate(UsageJurisdictionObjectData data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(data, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
  public void setUsageJurisdictionForUsageJurisdictionFind(UsageJurisdictionObjectFilter data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(data, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
  public void setUsageJurisdictionForUsageJurisdictionGet(UsageJurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectKeyHelper.toMap(data, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
  public void setUsageJurisdictionForUsageJurisdictionUpdate(UsageJurisdictionObjectData data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(data, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }
  public UsageJurisdictionObjectData getUsageJurisdictionObjectDataUsageJurisdictionFromUsageJurisdictionCreate() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
  public UsageJurisdictionObjectDataList getUsageJurisdictionObjectDataUsageJurisdictionFromUsageJurisdictionFind() {
    return UsageJurisdictionObjectHelper.fromMapList(outputMap, "UsageJurisdictionList");
  }
  public UsageJurisdictionObjectData getUsageJurisdictionObjectDataUsageJurisdictionFromUsageJurisdictionGet() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
  public UsageJurisdictionObjectData getUsageJurisdictionObjectDataUsageJurisdictionFromUsageJurisdictionUpdate() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
  /**
   @deprecated
   */
  public void setUsageJurisdictionObjectFilter(UsageJurisdictionObjectFilter data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(data, new HashMap()).get("UsageJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageJurisdictionObjectData(UsageJurisdictionObjectData data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(data, new HashMap()).get("UsageJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageJurisdictionObjectKeyData(UsageJurisdictionObjectKeyData data) {
    if (data != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectKeyHelper.toMap(data, new HashMap()).get("UsageJurisdictionObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageJurisdictionObjectDataList getUsageJurisdictionObjectDataList() {
    return UsageJurisdictionObjectHelper.fromMapList(outputMap, "UsageJurisdictionList");
  }
  /**
   @deprecated
   */
  public UsageJurisdictionObjectData getUsageJurisdictionObjectData() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
}
