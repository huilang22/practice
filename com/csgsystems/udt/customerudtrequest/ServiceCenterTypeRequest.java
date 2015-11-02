/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterTypeRequest.java
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
public final class ServiceCenterTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceCenterTypeRequest (String request, ServiceCenterTypeRequestMethod method) {
    initialize(request, "ServiceCenterType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceCenterTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceCenterTypeForServiceCenterTypeFind(ServiceCenterTypeObjectFilter data) {
    if (data != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(data, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }
  public void setServiceCenterTypeForServiceCenterTypeGet(ServiceCenterTypeObjectKeyData data) {
    if (data != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectKeyHelper.toMap(data, new HashMap(), "ServiceCenterType").get("ServiceCenterType"));
    }
  }
  public ServiceCenterTypeObjectDataList getServiceCenterTypeObjectDataServiceCenterTypeFromServiceCenterTypeFind() {
    return ServiceCenterTypeObjectHelper.fromMapList(outputMap, "ServiceCenterTypeList");
  }
  public ServiceCenterTypeObjectData getServiceCenterTypeObjectDataServiceCenterTypeFromServiceCenterTypeGet() {
    return ServiceCenterTypeObjectHelper.fromMap(outputMap, "ServiceCenterType");
  }
  /**
   @deprecated
   */
  public void setServiceCenterTypeObjectFilter(ServiceCenterTypeObjectFilter data) {
    if (data != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectHelper.toMap(data, new HashMap()).get("ServiceCenterTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceCenterTypeObjectKeyData(ServiceCenterTypeObjectKeyData data) {
    if (data != null) {
      addInput("ServiceCenterType", ServiceCenterTypeObjectKeyHelper.toMap(data, new HashMap()).get("ServiceCenterTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceCenterTypeObjectDataList getServiceCenterTypeObjectDataList() {
    return ServiceCenterTypeObjectHelper.fromMapList(outputMap, "ServiceCenterTypeList");
  }
  /**
   @deprecated
   */
  public ServiceCenterTypeObjectData getServiceCenterTypeObjectData() {
    return ServiceCenterTypeObjectHelper.fromMap(outputMap, "ServiceCenterType");
  }
}
