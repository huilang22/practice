/*
 * Generated code DO NOT EDIT
 * Generated file: LateFeeRateOverridesRequest.java
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
public final class LateFeeRateOverridesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LateFeeRateOverridesRequest (String request, LateFeeRateOverridesRequestMethod method) {
    initialize(request, "LateFeeRateOverrides", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LateFeeRateOverridesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLateFeeRateOverridesForLateFeeRateOverridesCreate(LateFeeRateOverridesObjectData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(data, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
  public void setLFROCeaseDateForLateFeeRateOverridesDelete(Date data) {
    if (data != null) {
      addInput("LFROCeaseDate", data);
    }
  }
  public void setLateFeeRateOverridesForLateFeeRateOverridesDelete(LateFeeRateOverridesObjectKeyData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(data, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
  public void setLateFeeRateOverridesForLateFeeRateOverridesFind(LateFeeRateOverridesObjectFilter data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(data, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
  public void setLateFeeRateOverridesForLateFeeRateOverridesGet(LateFeeRateOverridesObjectKeyData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(data, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
  public void setLateFeeRateOverridesForLateFeeRateOverridesUpdate(LateFeeRateOverridesObjectData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(data, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }
  public LateFeeRateOverridesObjectData getLateFeeRateOverridesObjectDataLateFeeRateOverridesFromLateFeeRateOverridesCreate() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
  public LateFeeRateOverridesObjectData getLateFeeRateOverridesObjectDataLateFeeRateOverridesFromLateFeeRateOverridesDelete() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
  public LateFeeRateOverridesObjectDataList getLateFeeRateOverridesObjectDataLateFeeRateOverridesFromLateFeeRateOverridesFind() {
    return LateFeeRateOverridesObjectHelper.fromMapList(outputMap, "LateFeeRateOverridesList");
  }
  public LateFeeRateOverridesObjectData getLateFeeRateOverridesObjectDataLateFeeRateOverridesFromLateFeeRateOverridesGet() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
  public LateFeeRateOverridesObjectData getLateFeeRateOverridesObjectDataLateFeeRateOverridesFromLateFeeRateOverridesUpdate() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
  /**
   @deprecated
   */
  public void setLFROCeaseDate(Date data) {
    if (data != null) {
      addInput("LFROCeaseDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setLateFeeRateOverridesObjectFilter(LateFeeRateOverridesObjectFilter data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(data, new HashMap()).get("LateFeeRateOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLateFeeRateOverridesObjectData(LateFeeRateOverridesObjectData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(data, new HashMap()).get("LateFeeRateOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLateFeeRateOverridesObjectKeyData(LateFeeRateOverridesObjectKeyData data) {
    if (data != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(data, new HashMap()).get("LateFeeRateOverridesObject"));
    }
  }
  /**
   @deprecated
   */
  public LateFeeRateOverridesObjectDataList getLateFeeRateOverridesObjectDataList() {
    return LateFeeRateOverridesObjectHelper.fromMapList(outputMap, "LateFeeRateOverridesList");
  }
  /**
   @deprecated
   */
  public LateFeeRateOverridesObjectData getLateFeeRateOverridesObjectData() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
