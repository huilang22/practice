/*
 * Generated code DO NOT EDIT
 * Generated file: OrderLookupRequest.java
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
public final class OrderLookupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderLookupRequest (String request, OrderLookupRequestMethod method) {
    initialize(request, "OrderLookup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderLookupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOrderLookupForOrderLookupFind(OrderLookupObjectFilter data) {
    if (data != null) {
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(data, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }
  public void setOrderLookupForOrderLookupGet(OrderLookupObjectKeyData data) {
    if (data != null) {
      addInput("OrderLookup", OrderLookupObjectKeyHelper.toMap(data, new HashMap(), "OrderLookup").get("OrderLookup"));
    }
  }
  public OrderLookupObjectDataList getOrderLookupObjectDataOrderLookupFromOrderLookupFind() {
    return OrderLookupObjectHelper.fromMapList(outputMap, "OrderLookupList");
  }
  public OrderLookupObjectData getOrderLookupObjectDataOrderLookupFromOrderLookupGet() {
    return OrderLookupObjectHelper.fromMap(outputMap, "OrderLookup");
  }
  /**
   @deprecated
   */
  public void setOrderLookupObjectFilter(OrderLookupObjectFilter data) {
    if (data != null) {
      addInput("OrderLookup", OrderLookupObjectHelper.toMap(data, new HashMap()).get("OrderLookupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOrderLookupObjectKeyData(OrderLookupObjectKeyData data) {
    if (data != null) {
      addInput("OrderLookup", OrderLookupObjectKeyHelper.toMap(data, new HashMap()).get("OrderLookupObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderLookupObjectDataList getOrderLookupObjectDataList() {
    return OrderLookupObjectHelper.fromMapList(outputMap, "OrderLookupList");
  }
  /**
   @deprecated
   */
  public OrderLookupObjectData getOrderLookupObjectData() {
    return OrderLookupObjectHelper.fromMap(outputMap, "OrderLookup");
  }
}
