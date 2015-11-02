/*
 * Generated code DO NOT EDIT
 * Generated file: UsageUnitsConvertRequest.java
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
public final class UsageUnitsConvertRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UsageUnitsConvertRequest (String request, UsageUnitsConvertRequestMethod method) {
    initialize(request, "UsageUnitsConvert", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UsageUnitsConvertRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUsageUnitsConvertForUsageUnitsConvertCreate(UsageUnitsConvertObjectData data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(data, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
  public void setUsageUnitsConvertForUsageUnitsConvertFind(UsageUnitsConvertObjectFilter data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(data, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
  public void setUsageUnitsConvertForUsageUnitsConvertGet(UsageUnitsConvertObjectKeyData data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectKeyHelper.toMap(data, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
  public void setUsageUnitsConvertForUsageUnitsConvertUpdate(UsageUnitsConvertObjectData data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(data, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }
  public void setUsageUnitsConvertUpdateFilterForUsageUnitsConvertUpdate(UsageUnitsConvertObjectFilter data) {
    if (data != null) {
      addInput("UsageUnitsConvertUpdateFilter", UsageUnitsConvertObjectHelper.toMap(data, new HashMap(), "UsageUnitsConvertUpdateFilter").get("UsageUnitsConvertUpdateFilter"));
    }
  }
  public void setUsageUnitsConvertUpdateGetForUsageUnitsConvertUpdate(UsageUnitsConvertObjectData data) {
    if (data != null) {
      addInput("UsageUnitsConvertUpdateGet", UsageUnitsConvertObjectHelper.toMap(data, new HashMap(), "UsageUnitsConvertUpdateGet").get("UsageUnitsConvertUpdateGet"));
    }
  }
  public UsageUnitsConvertObjectData getUsageUnitsConvertObjectDataUsageUnitsConvertFromUsageUnitsConvertCreate() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
  public UsageUnitsConvertObjectDataList getUsageUnitsConvertObjectDataUsageUnitsConvertFromUsageUnitsConvertFind() {
    return UsageUnitsConvertObjectHelper.fromMapList(outputMap, "UsageUnitsConvertList");
  }
  public UsageUnitsConvertObjectData getUsageUnitsConvertObjectDataUsageUnitsConvertFromUsageUnitsConvertGet() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
  public UsageUnitsConvertObjectData getUsageUnitsConvertObjectDataUsageUnitsConvertFromUsageUnitsConvertUpdate() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
  /**
   @deprecated
   */
  public void setUsageUnitsConvertObjectFilter(UsageUnitsConvertObjectFilter data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(data, new HashMap()).get("UsageUnitsConvertObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageUnitsConvertObjectData(UsageUnitsConvertObjectData data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(data, new HashMap()).get("UsageUnitsConvertObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUsageUnitsConvertObjectKeyData(UsageUnitsConvertObjectKeyData data) {
    if (data != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectKeyHelper.toMap(data, new HashMap()).get("UsageUnitsConvertObject"));
    }
  }
  /**
   @deprecated
   */
  public UsageUnitsConvertObjectDataList getUsageUnitsConvertObjectDataList() {
    return UsageUnitsConvertObjectHelper.fromMapList(outputMap, "UsageUnitsConvertList");
  }
  /**
   @deprecated
   */
  public UsageUnitsConvertObjectData getUsageUnitsConvertObjectData() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
}
