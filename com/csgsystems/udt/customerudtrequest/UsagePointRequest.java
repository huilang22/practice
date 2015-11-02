/*
 * Generated code DO NOT EDIT
 * Generated file: UsagePointRequest.java
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
public final class UsagePointRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsagePointRequest (String request, UsagePointRequestMethod method) {
    initialize(request, "UsagePoint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsagePointRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsagePointForUsagePointCreate(UsgPntObjectData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(data, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
  public void setUsagePointForUsagePointDelete(UsgPntObjectKeyData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(data, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
  public void setUsagePointForUsagePointFind(UsgPntObjectFilter data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(data, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
  public void setUsagePointForUsagePointGet(UsgPntObjectKeyData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(data, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
  public void setUsagePointForUsagePointUpdate(UsgPntObjectData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(data, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }
  public UsgPntObjectData getUsgPntObjectDataUsagePointFromUsagePointCreate() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
  public UsgPntObjectData getUsgPntObjectDataUsagePointFromUsagePointDelete() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
  public UsgPntObjectDataList getUsgPntObjectDataUsagePointFromUsagePointFind() {
    return UsgPntObjectHelper.fromMapList(outputMap, "UsagePointList");
  }
  public UsgPntObjectData getUsgPntObjectDataUsagePointFromUsagePointGet() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
  public UsgPntObjectData getUsgPntObjectDataUsagePointFromUsagePointUpdate() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
  /**
   @deprecated
   */
  public void setUsgPntObjectFilter(UsgPntObjectFilter data) {
    if (data != null) {
      addInput("UsgPnt", UsgPntObjectHelper.toMap(data, new HashMap()).get("UsgPntObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsgPntObjectData(UsgPntObjectData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectHelper.toMap(data, new HashMap()).get("UsgPntObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsgPntObjectKeyData(UsgPntObjectKeyData data) {
    if (data != null) {
      addInput("UsagePoint", UsgPntObjectKeyHelper.toMap(data, new HashMap()).get("UsgPntObject"));
    }
  }
  /**
   @deprecated
   */
  public UsgPntObjectDataList getUsgPntObjectDataList() {
    return UsgPntObjectHelper.fromMapList(outputMap, "UsgPntList");
  }
  /**
   @deprecated
   */
  public UsgPntObjectData getUsgPntObjectData() {
    return UsgPntObjectHelper.fromMap(outputMap, "UsagePoint");
  }
}
