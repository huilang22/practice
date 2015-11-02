/*
 * Generated code DO NOT EDIT
 * Generated file: OrderStatusRequest.java
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

import com.csgsystems.om.data.*;
public final class OrderStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderStatusRequest (String request, OrderStatusRequestMethod method) {
    initialize(request, "OrderStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOrderStatusForOrderStatusCreate(OrderStatusObjectData data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(data, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
  public void setOrderStatusForOrderStatusFind(OrderStatusObjectFilter data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(data, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
  public void setOrderStatusForOrderStatusGet(OrderStatusObjectKeyData data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectKeyHelper.toMap(data, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
  public void setOrderStatusForOrderStatusUpdate(OrderStatusObjectData data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(data, new HashMap(), "OrderStatus").get("OrderStatus"));
    }
  }
  public OrderStatusObjectData getOrderStatusObjectDataOrderStatusFromOrderStatusCreate() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
  public OrderStatusObjectDataList getOrderStatusObjectDataOrderStatusFromOrderStatusFind() {
    return OrderStatusObjectHelper.fromMapList(outputMap, "OrderStatusList");
  }
  public OrderStatusObjectData getOrderStatusObjectDataOrderStatusFromOrderStatusGet() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
  public OrderStatusObjectData getOrderStatusObjectDataOrderStatusFromOrderStatusUpdate() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
  /**
   @deprecated
   */
  public void setOrderStatusObjectFilter(OrderStatusObjectFilter data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(data, new HashMap()).get("OrderStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOrderStatusObjectData(OrderStatusObjectData data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectHelper.toMap(data, new HashMap()).get("OrderStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOrderStatusObjectKeyData(OrderStatusObjectKeyData data) {
    if (data != null) {
      addInput("OrderStatus", OrderStatusObjectKeyHelper.toMap(data, new HashMap()).get("OrderStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderStatusObjectDataList getOrderStatusObjectDataList() {
    return OrderStatusObjectHelper.fromMapList(outputMap, "OrderStatusList");
  }
  /**
   @deprecated
   */
  public OrderStatusObjectData getOrderStatusObjectData() {
    return OrderStatusObjectHelper.fromMap(outputMap, "OrderStatus");
  }
}
