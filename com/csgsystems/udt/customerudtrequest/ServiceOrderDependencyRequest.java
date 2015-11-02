/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyRequest.java
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
public final class ServiceOrderDependencyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceOrderDependencyRequest (String request, ServiceOrderDependencyRequestMethod method) {
    initialize(request, "ServiceOrderDependency", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceOrderDependencyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceOrderDependencyForServiceOrderDependencyCreate(ServiceOrderDependencyObjectData data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(data, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
  public void setServiceOrderDependencyForServiceOrderDependencyEval(ServiceOrderDependencyObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(data, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
  public void setServiceOrderDependencyForServiceOrderDependencyFindDependent(ServiceOrderDependencyObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(data, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
  public void setServiceOrderDependencyForServiceOrderDependencyFind(ServiceOrderDependencyObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(data, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
  public void setServiceOrderDependencyForServiceOrderDependencyGet(ServiceOrderDependencyObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(data, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
  public ServiceOrderDependencyObjectData getServiceOrderDependencyObjectDataServiceOrderDependencyFromServiceOrderDependencyCreate() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
  public ServiceOrderDependencyObjectData getServiceOrderDependencyObjectDataServiceOrderDependencyFromServiceOrderDependencyEval() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
  public ServiceOrderDependencyObjectDataList getServiceOrderDependencyObjectDataServiceOrderDependencyFromServiceOrderDependencyFindDependent() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
  public ServiceOrderDependencyObjectDataList getServiceOrderDependencyObjectDataServiceOrderDependencyFromServiceOrderDependencyFind() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
  public ServiceOrderDependencyObjectData getServiceOrderDependencyObjectDataServiceOrderDependencyFromServiceOrderDependencyGet() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
  /**
   @deprecated
   */
  public void setServiceOrderDependencyObjectFilter(ServiceOrderDependencyObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(data, new HashMap()).get("ServiceOrderDependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderDependencyObjectData(ServiceOrderDependencyObjectData data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(data, new HashMap()).get("ServiceOrderDependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderDependencyObjectKeyData(ServiceOrderDependencyObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(data, new HashMap()).get("ServiceOrderDependencyObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderDependencyObjectDataList getServiceOrderDependencyObjectDataList() {
    return ServiceOrderDependencyObjectHelper.fromMapList(outputMap, "ServiceOrderDependencyList");
  }
  /**
   @deprecated
   */
  public ServiceOrderDependencyObjectData getServiceOrderDependencyObjectData() {
    return ServiceOrderDependencyObjectHelper.fromMap(outputMap, "ServiceOrderDependency");
  }
}
