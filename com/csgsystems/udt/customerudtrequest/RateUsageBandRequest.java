/*
 * Generated code DO NOT EDIT
 * Generated file: RateUsageBandRequest.java
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
public final class RateUsageBandRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RateUsageBandRequest (String request, RateUsageBandRequestMethod method) {
    initialize(request, "RateUsageBand", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RateUsageBandRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRateUsageBandForRateUsageBandCreate(RateUsageBandObjectData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(data, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
  public void setRateUsageBandForRateUsageBandDelete(RateUsageBandObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(data, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
  public void setRateUsageBandForRateUsageBandFind(RateUsageBandObjectFilter data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(data, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
  public void setRateUsageBandForRateUsageBandGet(RateUsageBandObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(data, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
  public void setRUUpdateFilterForRateUsageBandUpdate(RateUsageBandObjectFilter data) {
    if (data != null) {
      addInput("RUUpdateFilter", RateUsageBandObjectHelper.toMap(data, new HashMap(), "RUUpdateFilter").get("RUUpdateFilter"));
    }
  }
  public void setRUUpdateGetForRateUsageBandUpdate(RateUsageBandObjectData data) {
    if (data != null) {
      addInput("RUUpdateGet", RateUsageBandObjectHelper.toMap(data, new HashMap(), "RUUpdateGet").get("RUUpdateGet"));
    }
  }
  public void setRateUsageBandForRateUsageBandUpdate(RateUsageBandObjectData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(data, new HashMap(), "RateUsageBand").get("RateUsageBand"));
    }
  }
  public RateUsageBandObjectData getRateUsageBandObjectDataRateUsageBandFromRateUsageBandCreate() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
  public RateUsageBandObjectDataList getRateUsageBandObjectDataRateUsageBandFromRateUsageBandFind() {
    return RateUsageBandObjectHelper.fromMapList(outputMap, "RateUsageBandList");
  }
  public RateUsageBandObjectData getRateUsageBandObjectDataRateUsageBandFromRateUsageBandGet() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
  public RateUsageBandObjectData getRateUsageBandObjectDataRateUsageBandFromRateUsageBandUpdate() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
  /**
   @deprecated
   */
  public void setRateUsageBandObjectFilter(RateUsageBandObjectFilter data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(data, new HashMap()).get("RateUsageBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageBandObjectData(RateUsageBandObjectData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectHelper.toMap(data, new HashMap()).get("RateUsageBandObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRateUsageBandObjectKeyData(RateUsageBandObjectKeyData data) {
    if (data != null) {
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(data, new HashMap()).get("RateUsageBandObject"));
    }
  }
  /**
   @deprecated
   */
  public RateUsageBandObjectDataList getRateUsageBandObjectDataList() {
    return RateUsageBandObjectHelper.fromMapList(outputMap, "RateUsageBandList");
  }
  /**
   @deprecated
   */
  public RateUsageBandObjectData getRateUsageBandObjectData() {
    return RateUsageBandObjectHelper.fromMap(outputMap, "RateUsageBand");
  }
}
