/*
 * Generated code DO NOT EDIT
 * Generated file: LogicalServiceOrderRequest.java
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
import com.csgsystems.om.data.*;
public final class LogicalServiceOrderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LogicalServiceOrderRequest (String request, LogicalServiceOrderRequestMethod method) {
    initialize(request, "LogicalServiceOrder", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LogicalServiceOrderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceOrderForLogicalServiceOrderDependencyCheck(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setLogicalServiceOrderForLogicalServiceOrderFindCount(LogicalServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(data, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }
  public void setLogicalServiceOrderForLogicalServiceOrderFind(LogicalServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(data, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }
  public void setLogicalServiceOrderForLogicalServiceOrderGet(LogicalServiceOrderObjectKeyData data) {
    if (data != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectKeyHelper.toMap(data, new HashMap(), "LogicalServiceOrder").get("LogicalServiceOrder"));
    }
  }
  public void setOrderForLogicalServiceOrderPreProcess(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForLogicalServiceOrderPreProcess(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public LogicalServiceOrderDependencyCheckOutputData getLogicalServiceOrderDependencyCheckOutputDataLogicalServiceOrderDependencyCheckOutputDataFromLogicalServiceOrderDependencyCheck() {
    return LogicalServiceOrderDependencyCheckOutputHelper.fromMap(outputMap);
  }
  public Integer getIntegerLogicalServiceOrderCountFromLogicalServiceOrderFindCount() {
    return (Integer)outputMap.get("LogicalServiceOrderCount");
  }
  public LogicalServiceOrderObjectDataList getLogicalServiceOrderObjectDataLogicalServiceOrderFromLogicalServiceOrderFind() {
    return LogicalServiceOrderObjectHelper.fromMapList(outputMap, "LogicalServiceOrderList");
  }
  public LogicalServiceOrderObjectData getLogicalServiceOrderObjectDataLogicalServiceOrderFromLogicalServiceOrderGet() {
    return LogicalServiceOrderObjectHelper.fromMap(outputMap, "LogicalServiceOrder");
  }
  public LogicalServiceOrderPreProcessOutputData getLogicalServiceOrderPreProcessOutputDataLogicalServiceOrderPreProcessOutputDataFromLogicalServiceOrderPreProcess() {
    return LogicalServiceOrderPreProcessOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public Integer getLogicalServiceOrderCount() {
    return (Integer)outputMap.get("LogicalServiceOrderCount");
  }
  /**
   @deprecated
   */
  public LogicalServiceOrderDependencyCheckOutputData getLogicalServiceOrderDependencyCheckOutputData() {
    return LogicalServiceOrderDependencyCheckOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setLogicalServiceOrderObjectFilter(LogicalServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectHelper.toMap(data, new HashMap()).get("LogicalServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLogicalServiceOrderObjectKeyData(LogicalServiceOrderObjectKeyData data) {
    if (data != null) {
      addInput("LogicalServiceOrder", LogicalServiceOrderObjectKeyHelper.toMap(data, new HashMap()).get("LogicalServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public LogicalServiceOrderObjectDataList getLogicalServiceOrderObjectDataList() {
    return LogicalServiceOrderObjectHelper.fromMapList(outputMap, "LogicalServiceOrderList");
  }
  /**
   @deprecated
   */
  public LogicalServiceOrderObjectData getLogicalServiceOrderObjectData() {
    return LogicalServiceOrderObjectHelper.fromMap(outputMap, "LogicalServiceOrder");
  }
  /**
   @deprecated
   */
  public LogicalServiceOrderPreProcessOutputData getLogicalServiceOrderPreProcessOutputData() {
    return LogicalServiceOrderPreProcessOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectData(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap()).get("ServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectDataArray(ServiceOrderObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ServiceOrderObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }
}
