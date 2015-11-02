/*
 * Generated code DO NOT EDIT
 * Generated file: StatisticTypeRefRequest.java
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
public final class StatisticTypeRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public StatisticTypeRefRequest (String request, StatisticTypeRefRequestMethod method) {
    initialize(request, "StatisticTypeRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (StatisticTypeRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setStatisticTypeRefForStatisticTypeRefFind(StatisticTypeRefObjectFilter data) {
    if (data != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(data, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }
  public void setStatisticTypeRefForStatisticTypeRefGet(StatisticTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectKeyHelper.toMap(data, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }
  public StatisticTypeRefObjectDataList getStatisticTypeRefObjectDataStatisticTypeRefFromStatisticTypeRefFind() {
    return StatisticTypeRefObjectHelper.fromMapList(outputMap, "StatisticTypeRefList");
  }
  public StatisticTypeRefObjectData getStatisticTypeRefObjectDataStatisticTypeRefFromStatisticTypeRefGet() {
    return StatisticTypeRefObjectHelper.fromMap(outputMap, "StatisticTypeRef");
  }
  /**
   @deprecated
   */
  public void setStatisticTypeRefObjectFilter(StatisticTypeRefObjectFilter data) {
    if (data != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(data, new HashMap()).get("StatisticTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setStatisticTypeRefObjectKeyData(StatisticTypeRefObjectKeyData data) {
    if (data != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectKeyHelper.toMap(data, new HashMap()).get("StatisticTypeRefObject"));
    }
  }
  /**
   @deprecated
   */
  public StatisticTypeRefObjectDataList getStatisticTypeRefObjectDataList() {
    return StatisticTypeRefObjectHelper.fromMapList(outputMap, "StatisticTypeRefList");
  }
  /**
   @deprecated
   */
  public StatisticTypeRefObjectData getStatisticTypeRefObjectData() {
    return StatisticTypeRefObjectHelper.fromMap(outputMap, "StatisticTypeRef");
  }
}
