/*
 * Generated code DO NOT EDIT
 * Generated file: DistanceBandRequest.java
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
public final class DistanceBandRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DistanceBandRequest (String request, DistanceBandRequestMethod method) {
    initialize(request, "DistanceBand", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DistanceBandRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDistanceBandForDistanceBandCreate(DistanceBandObjectData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(data, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
  public void setDistanceBandForDistanceBandDelete(DistanceBandObjectKeyData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(data, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
  public void setDistanceBandForDistanceBandFind(DistanceBandObjectFilter data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(data, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
  public void setDistanceBandForDistanceBandGet(DistanceBandObjectKeyData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(data, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
  public void setDistanceBandForDistanceBandUpdate(DistanceBandObjectData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(data, new HashMap(), "DistanceBand").get("DistanceBand"));
    }
  }
  public DistanceBandObjectData getDistanceBandObjectDataDistanceBandFromDistanceBandCreate() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
  public DistanceBandObjectData getDistanceBandObjectDataDistanceBandFromDistanceBandDelete() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
  public DistanceBandObjectDataList getDistanceBandObjectDataDistanceBandFromDistanceBandFind() {
    return DistanceBandObjectHelper.fromMapList(outputMap, "DistanceBandList");
  }
  public DistanceBandObjectData getDistanceBandObjectDataDistanceBandFromDistanceBandGet() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
  public DistanceBandObjectData getDistanceBandObjectDataDistanceBandFromDistanceBandUpdate() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
  /**
   @deprecated
   */
  public void setDistanceBandObjectFilter(DistanceBandObjectFilter data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(data, new HashMap()).get("DistanceBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDistanceBandObjectData(DistanceBandObjectData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectHelper.toMap(data, new HashMap()).get("DistanceBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDistanceBandObjectKeyData(DistanceBandObjectKeyData data) {
    if (data != null) {
      addInput("DistanceBand", DistanceBandObjectKeyHelper.toMap(data, new HashMap()).get("DistanceBandObject"));
    }
  }
  /**
   @deprecated
   */
  public DistanceBandObjectDataList getDistanceBandObjectDataList() {
    return DistanceBandObjectHelper.fromMapList(outputMap, "DistanceBandList");
  }
  /**
   @deprecated
   */
  public DistanceBandObjectData getDistanceBandObjectData() {
    return DistanceBandObjectHelper.fromMap(outputMap, "DistanceBand");
  }
}
