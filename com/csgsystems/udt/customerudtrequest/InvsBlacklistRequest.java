/*
 * Generated code DO NOT EDIT
 * Generated file: InvsBlacklistRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsBlacklistRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsBlacklistRequest (String request, InvsBlacklistRequestMethod method) {
    initialize(request, "InvsBlacklist", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsBlacklistRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsBlacklistForInvsBlacklistCreate(InvsBlacklistObjectData data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(data, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
  public void setInvsBlacklistForInvsBlacklistFind(InvsBlacklistObjectFilter data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(data, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
  public void setInvsBlacklistForInvsBlacklistGet(InvsBlacklistObjectKeyData data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectKeyHelper.toMap(data, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
  public void setInvsBlacklistForInvsBlacklistUpdate(InvsBlacklistObjectData data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(data, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
  public InvsBlacklistObjectData getInvsBlacklistObjectDataInvsBlacklistFromInvsBlacklistCreate() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
  public InvsBlacklistObjectDataList getInvsBlacklistObjectDataInvsBlacklistFromInvsBlacklistFind() {
    return InvsBlacklistObjectHelper.fromMapList(outputMap, "InvsBlacklistList");
  }
  public InvsBlacklistObjectData getInvsBlacklistObjectDataInvsBlacklistFromInvsBlacklistGet() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
  public InvsBlacklistObjectData getInvsBlacklistObjectDataInvsBlacklistFromInvsBlacklistUpdate() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
  /**
   @deprecated
   */
  public void setInvsBlacklistObjectFilter(InvsBlacklistObjectFilter data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(data, new HashMap()).get("InvsBlacklistObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsBlacklistObjectData(InvsBlacklistObjectData data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(data, new HashMap()).get("InvsBlacklistObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsBlacklistObjectKeyData(InvsBlacklistObjectKeyData data) {
    if (data != null) {
      addInput("InvsBlacklist", InvsBlacklistObjectKeyHelper.toMap(data, new HashMap()).get("InvsBlacklistObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsBlacklistObjectDataList getInvsBlacklistObjectDataList() {
    return InvsBlacklistObjectHelper.fromMapList(outputMap, "InvsBlacklistList");
  }
  /**
   @deprecated
   */
  public InvsBlacklistObjectData getInvsBlacklistObjectData() {
    return InvsBlacklistObjectHelper.fromMap(outputMap, "InvsBlacklist");
  }
}
