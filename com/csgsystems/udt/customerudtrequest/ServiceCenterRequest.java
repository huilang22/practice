/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterRequest.java
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
public final class ServiceCenterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceCenterRequest (String request, ServiceCenterRequestMethod method) {
    initialize(request, "ServiceCenter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceCenterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceCenterForServiceCenterCreate(ServiceCenterObjectData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(data, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
  public void setServiceCenterForServiceCenterDelete(ServiceCenterObjectKeyData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(data, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
  public void setServiceCenterForServiceCenterFind(ServiceCenterObjectFilter data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(data, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
  public void setServiceCenterForServiceCenterGet(ServiceCenterObjectKeyData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(data, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
  public void setServiceCenterForServiceCenterUpdate(ServiceCenterObjectData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(data, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
  public ServiceCenterObjectData getServiceCenterObjectDataServiceCenterFromServiceCenterCreate() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
  public ServiceCenterObjectData getServiceCenterObjectDataServiceCenterFromServiceCenterDelete() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
  public ServiceCenterObjectDataList getServiceCenterObjectDataServiceCenterFromServiceCenterFind() {
    return ServiceCenterObjectHelper.fromMapList(outputMap, "ServiceCenterList");
  }
  public ServiceCenterObjectData getServiceCenterObjectDataServiceCenterFromServiceCenterGet() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
  public ServiceCenterObjectData getServiceCenterObjectDataServiceCenterFromServiceCenterUpdate() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
  /**
   @deprecated
   */
  public void setServiceCenterObjectFilter(ServiceCenterObjectFilter data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(data, new HashMap()).get("ServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceCenterObjectData(ServiceCenterObjectData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(data, new HashMap()).get("ServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceCenterObjectKeyData(ServiceCenterObjectKeyData data) {
    if (data != null) {
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(data, new HashMap()).get("ServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceCenterObjectDataList getServiceCenterObjectDataList() {
    return ServiceCenterObjectHelper.fromMapList(outputMap, "ServiceCenterList");
  }
  /**
   @deprecated
   */
  public ServiceCenterObjectData getServiceCenterObjectData() {
    return ServiceCenterObjectHelper.fromMap(outputMap, "ServiceCenter");
  }
}
