/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderTypeRequest.java
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
public final class ServiceOrderTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceOrderTypeRequest (String request, ServiceOrderTypeRequestMethod method) {
    initialize(request, "ServiceOrderType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceOrderTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceOrderTypeForServiceOrderTypeCreate(ServiceOrderTypeObjectData data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(data, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
  public void setServiceOrderTypeForServiceOrderTypeFind(ServiceOrderTypeObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(data, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
  public void setServiceOrderTypeForServiceOrderTypeGet(ServiceOrderTypeObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectKeyHelper.toMap(data, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
  public void setServiceOrderTypeForServiceOrderTypeUpdate(ServiceOrderTypeObjectData data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(data, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }
  public ServiceOrderTypeObjectData getServiceOrderTypeObjectDataServiceOrderTypeFromServiceOrderTypeCreate() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
  public ServiceOrderTypeObjectDataList getServiceOrderTypeObjectDataServiceOrderTypeFromServiceOrderTypeFind() {
    return ServiceOrderTypeObjectHelper.fromMapList(outputMap, "ServiceOrderTypeList");
  }
  public ServiceOrderTypeObjectData getServiceOrderTypeObjectDataServiceOrderTypeFromServiceOrderTypeGet() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
  public ServiceOrderTypeObjectData getServiceOrderTypeObjectDataServiceOrderTypeFromServiceOrderTypeUpdate() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
  /**
   @deprecated
   */
  public void setServiceOrderTypeObjectFilter(ServiceOrderTypeObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(data, new HashMap()).get("ServiceOrderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderTypeObjectData(ServiceOrderTypeObjectData data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(data, new HashMap()).get("ServiceOrderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderTypeObjectKeyData(ServiceOrderTypeObjectKeyData data) {
    if (data != null) {
      addInput("ServiceOrderType", ServiceOrderTypeObjectKeyHelper.toMap(data, new HashMap()).get("ServiceOrderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderTypeObjectDataList getServiceOrderTypeObjectDataList() {
    return ServiceOrderTypeObjectHelper.fromMapList(outputMap, "ServiceOrderTypeList");
  }
  /**
   @deprecated
   */
  public ServiceOrderTypeObjectData getServiceOrderTypeObjectData() {
    return ServiceOrderTypeObjectHelper.fromMap(outputMap, "ServiceOrderType");
  }
}
