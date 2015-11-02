/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdRequest.java
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
public final class CustomerLifetimeIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerLifetimeIdRequest (String request, CustomerLifetimeIdRequestMethod method) {
    initialize(request, "CustomerLifetimeId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerLifetimeIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCustomerLifetimeIdForCustomerLifetimeIdCreate(CustomerLifetimeIdObjectData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(data, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
  public void setCustomerLifetimeIdForCustomerLifetimeIdDelete(CustomerLifetimeIdObjectKeyData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(data, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
  public void setCustomerLifetimeIdForCustomerLifetimeIdFind(CustomerLifetimeIdObjectFilter data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(data, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
  public void setCustomerLifetimeIdForCustomerLifetimeIdGet(CustomerLifetimeIdObjectKeyData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(data, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
  public void setCustomerLifetimeIdForCustomerLifetimeIdUpdate(CustomerLifetimeIdObjectData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(data, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
  public CustomerLifetimeIdObjectData getCustomerLifetimeIdObjectDataCustomerLifetimeIdFromCustomerLifetimeIdCreate() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
  public CustomerLifetimeIdObjectData getCustomerLifetimeIdObjectDataCustomerLifetimeIdFromCustomerLifetimeIdDelete() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
  public CustomerLifetimeIdObjectDataList getCustomerLifetimeIdObjectDataCustomerLifetimeIdFromCustomerLifetimeIdFind() {
    return CustomerLifetimeIdObjectHelper.fromMapList(outputMap, "CustomerLifetimeIdList");
  }
  public CustomerLifetimeIdObjectData getCustomerLifetimeIdObjectDataCustomerLifetimeIdFromCustomerLifetimeIdGet() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
  public CustomerLifetimeIdObjectData getCustomerLifetimeIdObjectDataCustomerLifetimeIdFromCustomerLifetimeIdUpdate() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
  /**
   @deprecated
   */
  public void setCustomerLifetimeIdObjectFilter(CustomerLifetimeIdObjectFilter data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(data, new HashMap()).get("CustomerLifetimeIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerLifetimeIdObjectData(CustomerLifetimeIdObjectData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(data, new HashMap()).get("CustomerLifetimeIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerLifetimeIdObjectKeyData(CustomerLifetimeIdObjectKeyData data) {
    if (data != null) {
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectKeyHelper.toMap(data, new HashMap()).get("CustomerLifetimeIdObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerLifetimeIdObjectDataList getCustomerLifetimeIdObjectDataList() {
    return CustomerLifetimeIdObjectHelper.fromMapList(outputMap, "CustomerLifetimeIdList");
  }
  /**
   @deprecated
   */
  public CustomerLifetimeIdObjectData getCustomerLifetimeIdObjectData() {
    return CustomerLifetimeIdObjectHelper.fromMap(outputMap, "CustomerLifetimeId");
  }
}
