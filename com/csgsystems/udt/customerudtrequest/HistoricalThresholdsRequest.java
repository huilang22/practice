/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalThresholdsRequest.java
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

import com.csgsystems.bp.data.*;
public final class HistoricalThresholdsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HistoricalThresholdsRequest (String request, HistoricalThresholdsRequestMethod method) {
    initialize(request, "HistoricalThresholds", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HistoricalThresholdsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHistoricalThresholdsForHistoricalThresholdsCreate(HistoricalThresholdsObjectData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public void setHistoricalThresholdsForHistoricalThresholdsDelete(HistoricalThresholdsObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public void setInactiveDateForHistoricalThresholdsDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setHistoricalThresholdsForHistoricalThresholdsDeleteList(HistoricalThresholdsObjectFilter data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public void setInactiveDateForHistoricalThresholdsDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setHistoricalThresholdsForHistoricalThresholdsFind(HistoricalThresholdsObjectFilter data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public void setHistoricalThresholdsForHistoricalThresholdsGet(HistoricalThresholdsObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public void setHistoricalThresholdsForHistoricalThresholdsUpdate(HistoricalThresholdsObjectData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap(), "HistoricalThresholds").get("HistoricalThresholds"));
    }
  }
  public HistoricalThresholdsObjectData getHistoricalThresholdsObjectDataHistoricalThresholdsFromHistoricalThresholdsCreate() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
  public HistoricalThresholdsObjectData getHistoricalThresholdsObjectDataHistoricalThresholdsFromHistoricalThresholdsDelete() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
  public HistoricalThresholdsObjectDataList getHistoricalThresholdsObjectDataHistoricalThresholdsFromHistoricalThresholdsFind() {
    return HistoricalThresholdsObjectHelper.fromMapList(outputMap, "HistoricalThresholdsList");
  }
  public HistoricalThresholdsObjectData getHistoricalThresholdsObjectDataHistoricalThresholdsFromHistoricalThresholdsGet() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
  public HistoricalThresholdsObjectData getHistoricalThresholdsObjectDataHistoricalThresholdsFromHistoricalThresholdsUpdate() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
  /**
   @deprecated
   */
  public void setHistoricalThresholdsObjectFilter(HistoricalThresholdsObjectFilter data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap()).get("HistoricalThresholdsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalThresholdsObjectData(HistoricalThresholdsObjectData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectHelper.toMap(data, new HashMap()).get("HistoricalThresholdsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalThresholdsObjectKeyData(HistoricalThresholdsObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalThresholds", HistoricalThresholdsObjectKeyHelper.toMap(data, new HashMap()).get("HistoricalThresholdsObject"));
    }
  }
  /**
   @deprecated
   */
  public HistoricalThresholdsObjectDataList getHistoricalThresholdsObjectDataList() {
    return HistoricalThresholdsObjectHelper.fromMapList(outputMap, "HistoricalThresholdsList");
  }
  /**
   @deprecated
   */
  public HistoricalThresholdsObjectData getHistoricalThresholdsObjectData() {
    return HistoricalThresholdsObjectHelper.fromMap(outputMap, "HistoricalThresholds");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
}
