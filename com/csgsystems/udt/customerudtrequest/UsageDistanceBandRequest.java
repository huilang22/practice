/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandRequest.java
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
public final class UsageDistanceBandRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageDistanceBandRequest (String request, UsageDistanceBandRequestMethod method) {
    initialize(request, "UsageDistanceBand", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageDistanceBandRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageDistanceBandForUsageDistanceBandCreate(UsageDistBandObjectData data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(data, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
  public void setUsageDistanceBandForUsageDistanceBandDelete(UsageDistBandObjectKeyData data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(data, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
  public void setUsageDistanceBandForUsageDistanceBandFind(UsageDistBandObjectFilter data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(data, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
  public void setUsageDistanceBandForUsageDistanceBandGet(UsageDistBandObjectKeyData data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(data, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
  public void setUDBUpdateFilterForUsageDistanceBandUpdate(UsageDistBandObjectFilter data) {
    if (data != null) {
      addInput("UDBUpdateFilter", UsageDistBandObjectHelper.toMap(data, new HashMap(), "UDBUpdateFilter").get("UDBUpdateFilter"));
    }
  }
  public void setUDBUpdateGetForUsageDistanceBandUpdate(UsageDistBandObjectData data) {
    if (data != null) {
      addInput("UDBUpdateGet", UsageDistBandObjectHelper.toMap(data, new HashMap(), "UDBUpdateGet").get("UDBUpdateGet"));
    }
  }
  public void setUsageDistanceBandForUsageDistanceBandUpdate(UsageDistBandObjectData data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(data, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
  public UsageDistBandObjectData getUsageDistBandObjectDataUsageDistanceBandFromUsageDistanceBandCreate() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
  public UsageDistBandObjectData getUsageDistBandObjectDataUsageDistanceBandFromUsageDistanceBandDelete() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
  public UsageDistBandObjectDataList getUsageDistBandObjectDataUsageDistanceBandFromUsageDistanceBandFind() {
    return UsageDistBandObjectHelper.fromMapList(outputMap, "UsageDistanceBandList");
  }
  public UsageDistBandObjectData getUsageDistBandObjectDataUsageDistanceBandFromUsageDistanceBandGet() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
  public UsageDistBandObjectData getUsageDistBandObjectDataUsageDistanceBandFromUsageDistanceBandUpdate() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
  /**
   @deprecated
   */
  public void setUsageDistBandObjectFilter(UsageDistBandObjectFilter data) {
    if (data != null) {
      addInput("UsageDistBand", UsageDistBandObjectHelper.toMap(data, new HashMap()).get("UsageDistBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageDistBandObjectData(UsageDistBandObjectData data) {
    if (data != null) {
      addInput("UsageDistBand", UsageDistBandObjectHelper.toMap(data, new HashMap()).get("UsageDistBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageDistBandObjectKeyData(UsageDistBandObjectKeyData data) {
    if (data != null) {
      addInput("UsageDistanceBand", UsageDistBandObjectKeyHelper.toMap(data, new HashMap()).get("UsageDistBandObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageDistBandObjectDataList getUsageDistBandObjectDataList() {
    return UsageDistBandObjectHelper.fromMapList(outputMap, "UsageDistBandList");
  }
  /**
   @deprecated
   */
  public UsageDistBandObjectData getUsageDistBandObjectData() {
    return UsageDistBandObjectHelper.fromMap(outputMap, "UsageDistanceBand");
  }
}
