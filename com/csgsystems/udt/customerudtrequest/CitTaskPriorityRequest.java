/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskPriorityRequest.java
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

import com.csgsystems.cit.data.*;
public final class CitTaskPriorityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitTaskPriorityRequest (String request, CitTaskPriorityRequestMethod method) {
    initialize(request, "CitTaskPriority", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitTaskPriorityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitTaskPriorityForCitTaskPriorityCreate(CitTaskPriorityObjectData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(data, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
  public void setCitTaskPriorityForCitTaskPriorityDelete(CitTaskPriorityObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(data, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
  public void setCitTaskPriorityForCitTaskPriorityFind(CitTaskPriorityObjectFilter data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(data, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
  public void setCitTaskPriorityForCitTaskPriorityGet(CitTaskPriorityObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(data, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
  public void setCitTaskPriorityForCitTaskPriorityUpdate(CitTaskPriorityObjectData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(data, new HashMap(), "CitTaskPriority").get("CitTaskPriority"));
    }
  }
  public CitTaskPriorityObjectData getCitTaskPriorityObjectDataCitTaskPriorityFromCitTaskPriorityCreate() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
  public CitTaskPriorityObjectData getCitTaskPriorityObjectDataCitTaskPriorityFromCitTaskPriorityDelete() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
  public CitTaskPriorityObjectDataList getCitTaskPriorityObjectDataCitTaskPriorityFromCitTaskPriorityFind() {
    return CitTaskPriorityObjectHelper.fromMapList(outputMap, "CitTaskPriorityList");
  }
  public CitTaskPriorityObjectData getCitTaskPriorityObjectDataCitTaskPriorityFromCitTaskPriorityGet() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
  public CitTaskPriorityObjectData getCitTaskPriorityObjectDataCitTaskPriorityFromCitTaskPriorityUpdate() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
  /**
   @deprecated
   */
  public void setCitTaskPriorityObjectFilter(CitTaskPriorityObjectFilter data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(data, new HashMap()).get("CitTaskPriorityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitTaskPriorityObjectData(CitTaskPriorityObjectData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectHelper.toMap(data, new HashMap()).get("CitTaskPriorityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitTaskPriorityObjectKeyData(CitTaskPriorityObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskPriority", CitTaskPriorityObjectKeyHelper.toMap(data, new HashMap()).get("CitTaskPriorityObject"));
    }
  }
  /**
   @deprecated
   */
  public CitTaskPriorityObjectDataList getCitTaskPriorityObjectDataList() {
    return CitTaskPriorityObjectHelper.fromMapList(outputMap, "CitTaskPriorityList");
  }
  /**
   @deprecated
   */
  public CitTaskPriorityObjectData getCitTaskPriorityObjectData() {
    return CitTaskPriorityObjectHelper.fromMap(outputMap, "CitTaskPriority");
  }
}
