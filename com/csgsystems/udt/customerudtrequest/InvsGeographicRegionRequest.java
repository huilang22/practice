/*
 * Generated code DO NOT EDIT
 * Generated file: InvsGeographicRegionRequest.java
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
public final class InvsGeographicRegionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsGeographicRegionRequest (String request, InvsGeographicRegionRequestMethod method) {
    initialize(request, "InvsGeographicRegion", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsGeographicRegionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsGeographicRegionForInvsGeographicRegionCreate(InvsGeographicRegionObjectData data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(data, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
  public void setInvsGeographicRegionForInvsGeographicRegionFind(InvsGeographicRegionObjectFilter data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(data, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
  public void setInvsGeographicRegionForInvsGeographicRegionGet(InvsGeographicRegionObjectKeyData data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectKeyHelper.toMap(data, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
  public void setInvsGeographicRegionForInvsGeographicRegionUpdate(InvsGeographicRegionObjectData data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(data, new HashMap(), "InvsGeographicRegion").get("InvsGeographicRegion"));
    }
  }
  public InvsGeographicRegionObjectData getInvsGeographicRegionObjectDataInvsGeographicRegionFromInvsGeographicRegionCreate() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
  public InvsGeographicRegionObjectDataList getInvsGeographicRegionObjectDataInvsGeographicRegionFromInvsGeographicRegionFind() {
    return InvsGeographicRegionObjectHelper.fromMapList(outputMap, "InvsGeographicRegionList");
  }
  public InvsGeographicRegionObjectData getInvsGeographicRegionObjectDataInvsGeographicRegionFromInvsGeographicRegionGet() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
  public InvsGeographicRegionObjectData getInvsGeographicRegionObjectDataInvsGeographicRegionFromInvsGeographicRegionUpdate() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
  /**
   @deprecated
   */
  public void setInvsGeographicRegionObjectFilter(InvsGeographicRegionObjectFilter data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(data, new HashMap()).get("InvsGeographicRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsGeographicRegionObjectData(InvsGeographicRegionObjectData data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectHelper.toMap(data, new HashMap()).get("InvsGeographicRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsGeographicRegionObjectKeyData(InvsGeographicRegionObjectKeyData data) {
    if (data != null) {
      addInput("InvsGeographicRegion", InvsGeographicRegionObjectKeyHelper.toMap(data, new HashMap()).get("InvsGeographicRegionObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsGeographicRegionObjectDataList getInvsGeographicRegionObjectDataList() {
    return InvsGeographicRegionObjectHelper.fromMapList(outputMap, "InvsGeographicRegionList");
  }
  /**
   @deprecated
   */
  public InvsGeographicRegionObjectData getInvsGeographicRegionObjectData() {
    return InvsGeographicRegionObjectHelper.fromMap(outputMap, "InvsGeographicRegion");
  }
}
