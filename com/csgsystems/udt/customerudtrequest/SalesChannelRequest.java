/*
 * Generated code DO NOT EDIT
 * Generated file: SalesChannelRequest.java
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
public final class SalesChannelRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SalesChannelRequest (String request, SalesChannelRequestMethod method) {
    initialize(request, "SalesChannel", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SalesChannelRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSalesChannelForSalesChannelCreate(SalesChannelObjectData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(data, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
  public void setSalesChannelForSalesChannelDelete(SalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(data, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
  public void setSalesChannelForSalesChannelFind(SalesChannelObjectFilter data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(data, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
  public void setSalesChannelForSalesChannelGet(SalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(data, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
  public void setSalesChannelForSalesChannelUpdate(SalesChannelObjectData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(data, new HashMap(), "SalesChannel").get("SalesChannel"));
    }
  }
  public SalesChannelObjectData getSalesChannelObjectDataSalesChannelFromSalesChannelCreate() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
  public SalesChannelObjectData getSalesChannelObjectDataSalesChannelFromSalesChannelDelete() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
  public SalesChannelObjectDataList getSalesChannelObjectDataSalesChannelFromSalesChannelFind() {
    return SalesChannelObjectHelper.fromMapList(outputMap, "SalesChannelList");
  }
  public SalesChannelObjectData getSalesChannelObjectDataSalesChannelFromSalesChannelGet() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
  public SalesChannelObjectData getSalesChannelObjectDataSalesChannelFromSalesChannelUpdate() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
  /**
   @deprecated
   */
  public void setSalesChannelObjectFilter(SalesChannelObjectFilter data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(data, new HashMap()).get("SalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSalesChannelObjectData(SalesChannelObjectData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectHelper.toMap(data, new HashMap()).get("SalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSalesChannelObjectKeyData(SalesChannelObjectKeyData data) {
    if (data != null) {
      addInput("SalesChannel", SalesChannelObjectKeyHelper.toMap(data, new HashMap()).get("SalesChannelObject"));
    }
  }
  /**
   @deprecated
   */
  public SalesChannelObjectDataList getSalesChannelObjectDataList() {
    return SalesChannelObjectHelper.fromMapList(outputMap, "SalesChannelList");
  }
  /**
   @deprecated
   */
  public SalesChannelObjectData getSalesChannelObjectData() {
    return SalesChannelObjectHelper.fromMap(outputMap, "SalesChannel");
  }
}
