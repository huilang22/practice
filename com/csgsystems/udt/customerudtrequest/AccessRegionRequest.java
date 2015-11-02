/*
 * Generated code DO NOT EDIT
 * Generated file: AccessRegionRequest.java
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
public final class AccessRegionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccessRegionRequest (String request, AccessRegionRequestMethod method) {
    initialize(request, "AccessRegion", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccessRegionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccessRegionForAccessRegionCreate(AccessRegionObjectData data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(data, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
  public void setAccessRegionForAccessRegionFind(AccessRegionObjectFilter data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(data, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
  public void setAccessRegionForAccessRegionGet(AccessRegionObjectKeyData data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectKeyHelper.toMap(data, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
  public void setAccessRegionForAccessRegionUpdate(AccessRegionObjectData data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(data, new HashMap(), "AccessRegion").get("AccessRegion"));
    }
  }
  public AccessRegionObjectData getAccessRegionObjectDataAccessRegionFromAccessRegionCreate() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
  public AccessRegionObjectDataList getAccessRegionObjectDataAccessRegionFromAccessRegionFind() {
    return AccessRegionObjectHelper.fromMapList(outputMap, "AccessRegionList");
  }
  public AccessRegionObjectData getAccessRegionObjectDataAccessRegionFromAccessRegionGet() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
  public AccessRegionObjectData getAccessRegionObjectDataAccessRegionFromAccessRegionUpdate() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
  /**
   @deprecated
   */
  public void setAccessRegionObjectFilter(AccessRegionObjectFilter data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(data, new HashMap()).get("AccessRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccessRegionObjectData(AccessRegionObjectData data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectHelper.toMap(data, new HashMap()).get("AccessRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccessRegionObjectKeyData(AccessRegionObjectKeyData data) {
    if (data != null) {
      addInput("AccessRegion", AccessRegionObjectKeyHelper.toMap(data, new HashMap()).get("AccessRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public AccessRegionObjectDataList getAccessRegionObjectDataList() {
    return AccessRegionObjectHelper.fromMapList(outputMap, "AccessRegionList");
  }
  /**
   @deprecated
   */
  public AccessRegionObjectData getAccessRegionObjectData() {
    return AccessRegionObjectHelper.fromMap(outputMap, "AccessRegion");
  }
}
