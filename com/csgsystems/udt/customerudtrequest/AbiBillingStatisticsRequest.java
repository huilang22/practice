/*
 * Generated code DO NOT EDIT
 * Generated file: AbiBillingStatisticsRequest.java
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
public final class AbiBillingStatisticsRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AbiBillingStatisticsRequest (String request, AbiBillingStatisticsRequestMethod method) {
    initialize(request, "AbiBillingStatistics", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AbiBillingStatisticsRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAbiBillingStatisticsForAbiBillingStatisticsFind(AbiBillingStatisticsObjectFilter data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(data, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }
  public void setAbiBillingStatisticsForAbiBillingStatisticsGet(AbiBillingStatisticsObjectKeyData data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectKeyHelper.toMap(data, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }
  public void setAbiBillingStatisticsForAbiBillingStatisticsUpdate(AbiBillingStatisticsObjectData data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(data, new HashMap(), "AbiBillingStatistics").get("AbiBillingStatistics"));
    }
  }
  public AbiBillingStatisticsObjectDataList getAbiBillingStatisticsObjectDataAbiBillingStatisticsFromAbiBillingStatisticsFind() {
    return AbiBillingStatisticsObjectHelper.fromMapList(outputMap, "AbiBillingStatisticsList");
  }
  public AbiBillingStatisticsObjectData getAbiBillingStatisticsObjectDataAbiBillingStatisticsFromAbiBillingStatisticsGet() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
  public AbiBillingStatisticsObjectData getAbiBillingStatisticsObjectDataAbiBillingStatisticsFromAbiBillingStatisticsUpdate() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
  /**
   @deprecated
   */
  public void setAbiBillingStatisticsObjectFilter(AbiBillingStatisticsObjectFilter data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(data, new HashMap()).get("AbiBillingStatisticsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiBillingStatisticsObjectData(AbiBillingStatisticsObjectData data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectHelper.toMap(data, new HashMap()).get("AbiBillingStatisticsObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiBillingStatisticsObjectKeyData(AbiBillingStatisticsObjectKeyData data) {
    if (data != null) {
      addInput("AbiBillingStatistics", AbiBillingStatisticsObjectKeyHelper.toMap(data, new HashMap()).get("AbiBillingStatisticsObject"));
    }
  }
  /**
   @deprecated
   */
  public AbiBillingStatisticsObjectDataList getAbiBillingStatisticsObjectDataList() {
    return AbiBillingStatisticsObjectHelper.fromMapList(outputMap, "AbiBillingStatisticsList");
  }
  /**
   @deprecated
   */
  public AbiBillingStatisticsObjectData getAbiBillingStatisticsObjectData() {
    return AbiBillingStatisticsObjectHelper.fromMap(outputMap, "AbiBillingStatistics");
  }
}
