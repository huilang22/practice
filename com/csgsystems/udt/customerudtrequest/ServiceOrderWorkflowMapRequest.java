/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderWorkflowMapRequest.java
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
public final class ServiceOrderWorkflowMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceOrderWorkflowMapRequest (String request, ServiceOrderWorkflowMapRequestMethod method) {
    initialize(request, "ServiceOrderWorkflowMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceOrderWorkflowMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceOrderWorkflowMapForServiceOrderWorkflowMapFind(ServiceOrderWorkflowMapObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(data, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }
  public void setServiceOrderWorkflowMapForServiceOrderWorkflowMapGet(ServiceOrderWorkflowMapObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectKeyHelper.toMap(data, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }
  public ServiceOrderWorkflowMapObjectDataList getServiceOrderWorkflowMapObjectDataServiceOrderWorkflowMapFromServiceOrderWorkflowMapFind() {
    return ServiceOrderWorkflowMapObjectHelper.fromMapList(outputMap, "ServiceOrderWorkflowMapList");
  }
  public ServiceOrderWorkflowMapObjectData getServiceOrderWorkflowMapObjectDataServiceOrderWorkflowMapFromServiceOrderWorkflowMapGet() {
    return ServiceOrderWorkflowMapObjectHelper.fromMap(outputMap, "ServiceOrderWorkflowMap");
  }
  /**
   @deprecated
   */
  public void setServiceOrderWorkflowMapObjectFilter(ServiceOrderWorkflowMapObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(data, new HashMap()).get("ServiceOrderWorkflowMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderWorkflowMapObjectKeyData(ServiceOrderWorkflowMapObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectKeyHelper.toMap(data, new HashMap()).get("ServiceOrderWorkflowMapObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderWorkflowMapObjectDataList getServiceOrderWorkflowMapObjectDataList() {
    return ServiceOrderWorkflowMapObjectHelper.fromMapList(outputMap, "ServiceOrderWorkflowMapList");
  }
  /**
   @deprecated
   */
  public ServiceOrderWorkflowMapObjectData getServiceOrderWorkflowMapObjectData() {
    return ServiceOrderWorkflowMapObjectHelper.fromMap(outputMap, "ServiceOrderWorkflowMap");
  }
}
