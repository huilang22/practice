/*
 * Generated code DO NOT EDIT
 * Generated file: RateCorridorUsageBandRequest.java
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
public final class RateCorridorUsageBandRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateCorridorUsageBandRequest (String request, RateCorridorUsageBandRequestMethod method) {
    initialize(request, "RateCorridorUsageBand", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateCorridorUsageBandRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateCorridorUsageBandForRateCorridorUsageBandCreate(RUBOverrideObjectData data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(data, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
  public void setRateCorridorUsageBandForRateCorridorUsageBandDelete(RUBOverrideObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(data, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
  public void setRateCorridorUsageBandForRateCorridorUsageBandFind(RUBOverrideObjectFilter data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(data, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
  public void setRateCorridorUsageBandForRateCorridorUsageBandGet(RUBOverrideObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(data, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
  public void setRUBOUpdateFilterForRateCorridorUsageBandUpdate(RUBOverrideObjectFilter data) {
    if (data != null) {
      addInput("RUBOUpdateFilter", RUBOverrideObjectHelper.toMap(data, new HashMap(), "RUBOUpdateFilter").get("RUBOUpdateFilter"));
    }
  }
  public void setRUBOUpdateGetForRateCorridorUsageBandUpdate(RUBOverrideObjectData data) {
    if (data != null) {
      addInput("RUBOUpdateGet", RUBOverrideObjectHelper.toMap(data, new HashMap(), "RUBOUpdateGet").get("RUBOUpdateGet"));
    }
  }
  public void setRateCorridorUsageBandForRateCorridorUsageBandUpdate(RUBOverrideObjectData data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectHelper.toMap(data, new HashMap(), "RateCorridorUsageBand").get("RateCorridorUsageBand"));
    }
  }
  public RUBOverrideObjectData getRUBOverrideObjectDataRateCorridorUsageBandFromRateCorridorUsageBandCreate() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
  public RUBOverrideObjectDataList getRUBOverrideObjectDataRateCorridorUsageBandFromRateCorridorUsageBandFind() {
    return RUBOverrideObjectHelper.fromMapList(outputMap, "RateCorridorUsageBandList");
  }
  public RUBOverrideObjectData getRUBOverrideObjectDataRateCorridorUsageBandFromRateCorridorUsageBandGet() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
  public RUBOverrideObjectData getRUBOverrideObjectDataRateCorridorUsageBandFromRateCorridorUsageBandUpdate() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
  /**
   @deprecated
   */
  public void setRUBOverrideObjectFilter(RUBOverrideObjectFilter data) {
    if (data != null) {
      addInput("RUBOverride", RUBOverrideObjectHelper.toMap(data, new HashMap()).get("RUBOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUBOverrideObjectData(RUBOverrideObjectData data) {
    if (data != null) {
      addInput("RUBOverride", RUBOverrideObjectHelper.toMap(data, new HashMap()).get("RUBOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUBOverrideObjectKeyData(RUBOverrideObjectKeyData data) {
    if (data != null) {
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(data, new HashMap()).get("RUBOverrideObject"));
    }
  }
  /**
   @deprecated
   */
  public RUBOverrideObjectDataList getRUBOverrideObjectDataList() {
    return RUBOverrideObjectHelper.fromMapList(outputMap, "RUBOverrideList");
  }
  /**
   @deprecated
   */
  public RUBOverrideObjectData getRUBOverrideObjectData() {
    return RUBOverrideObjectHelper.fromMap(outputMap, "RateCorridorUsageBand");
  }
}
