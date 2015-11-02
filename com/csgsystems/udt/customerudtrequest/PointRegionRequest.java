/*
 * Generated code DO NOT EDIT
 * Generated file: PointRegionRequest.java
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
public final class PointRegionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PointRegionRequest (String request, PointRegionRequestMethod method) {
    initialize(request, "PointRegion", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PointRegionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPointRegionForPointRegionCreate(PointRegionObjectData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(data, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
  public void setPointRegionForPointRegionDelete(PointRegionObjectKeyData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(data, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
  public void setPointRegionForPointRegionFind(PointRegionObjectFilter data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(data, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
  public void setPointRegionForPointRegionGet(PointRegionObjectKeyData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(data, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
  public void setPointRegionForPointRegionUpdate(PointRegionObjectData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(data, new HashMap(), "PointRegion").get("PointRegion"));
    }
  }
  public PointRegionObjectData getPointRegionObjectDataPointRegionFromPointRegionCreate() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
  public PointRegionObjectData getPointRegionObjectDataPointRegionFromPointRegionDelete() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
  public PointRegionObjectDataList getPointRegionObjectDataPointRegionFromPointRegionFind() {
    return PointRegionObjectHelper.fromMapList(outputMap, "PointRegionList");
  }
  public PointRegionObjectData getPointRegionObjectDataPointRegionFromPointRegionGet() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
  public PointRegionObjectData getPointRegionObjectDataPointRegionFromPointRegionUpdate() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
  /**
   @deprecated
   */
  public void setPointRegionObjectFilter(PointRegionObjectFilter data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(data, new HashMap()).get("PointRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointRegionObjectData(PointRegionObjectData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectHelper.toMap(data, new HashMap()).get("PointRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointRegionObjectKeyData(PointRegionObjectKeyData data) {
    if (data != null) {
      addInput("PointRegion", PointRegionObjectKeyHelper.toMap(data, new HashMap()).get("PointRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public PointRegionObjectDataList getPointRegionObjectDataList() {
    return PointRegionObjectHelper.fromMapList(outputMap, "PointRegionList");
  }
  /**
   @deprecated
   */
  public PointRegionObjectData getPointRegionObjectData() {
    return PointRegionObjectHelper.fromMap(outputMap, "PointRegion");
  }
}
