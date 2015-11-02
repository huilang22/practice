/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeValuesRequest.java
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
public final class StatisticTypeValuesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatisticTypeValuesRequest (String request, StatisticTypeValuesRequestMethod method) {
    initialize(request, "StatisticTypeValues", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatisticTypeValuesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatisticTypeValuesForStatisticTypeValuesFind(StatisticTypeValuesObjectFilter data) {
    if (data != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(data, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }
  public void setStatisticTypeValuesForStatisticTypeValuesGet(StatisticTypeValuesObjectKeyData data) {
    if (data != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectKeyHelper.toMap(data, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }
  public StatisticTypeValuesObjectDataList getStatisticTypeValuesObjectDataStatisticTypeValuesFromStatisticTypeValuesFind() {
    return StatisticTypeValuesObjectHelper.fromMapList(outputMap, "StatisticTypeValuesList");
  }
  public StatisticTypeValuesObjectData getStatisticTypeValuesObjectDataStatisticTypeValuesFromStatisticTypeValuesGet() {
    return StatisticTypeValuesObjectHelper.fromMap(outputMap, "StatisticTypeValues");
  }
  /**
   @deprecated
   */
  public void setStatisticTypeValuesObjectFilter(StatisticTypeValuesObjectFilter data) {
    if (data != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(data, new HashMap()).get("StatisticTypeValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatisticTypeValuesObjectKeyData(StatisticTypeValuesObjectKeyData data) {
    if (data != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectKeyHelper.toMap(data, new HashMap()).get("StatisticTypeValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public StatisticTypeValuesObjectDataList getStatisticTypeValuesObjectDataList() {
    return StatisticTypeValuesObjectHelper.fromMapList(outputMap, "StatisticTypeValuesList");
  }
  /**
   @deprecated
   */
  public StatisticTypeValuesObjectData getStatisticTypeValuesObjectData() {
    return StatisticTypeValuesObjectHelper.fromMap(outputMap, "StatisticTypeValues");
  }
}
