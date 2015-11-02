/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceProviderRequest.java
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
public final class ServiceProviderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceProviderRequest (String request, ServiceProviderRequestMethod method) {
    initialize(request, "ServiceProvider", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceProviderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceProviderForServiceProviderCreate(ServiceProviderObjectData data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(data, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
  public void setServiceProviderForServiceProviderFind(ServiceProviderObjectFilter data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(data, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
  public void setServiceProviderForServiceProviderGet(ServiceProviderObjectKeyData data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectKeyHelper.toMap(data, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
  public void setServiceProviderForServiceProviderUpdate(ServiceProviderObjectData data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(data, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }
  public ServiceProviderObjectData getServiceProviderObjectDataServiceProviderFromServiceProviderCreate() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
  public ServiceProviderObjectDataList getServiceProviderObjectDataServiceProviderFromServiceProviderFind() {
    return ServiceProviderObjectHelper.fromMapList(outputMap, "ServiceProviderList");
  }
  public ServiceProviderObjectData getServiceProviderObjectDataServiceProviderFromServiceProviderGet() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
  public ServiceProviderObjectData getServiceProviderObjectDataServiceProviderFromServiceProviderUpdate() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
  /**
   @deprecated
   */
  public void setServiceProviderObjectFilter(ServiceProviderObjectFilter data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(data, new HashMap()).get("ServiceProviderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceProviderObjectData(ServiceProviderObjectData data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(data, new HashMap()).get("ServiceProviderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceProviderObjectKeyData(ServiceProviderObjectKeyData data) {
    if (data != null) {
      addInput("ServiceProvider", ServiceProviderObjectKeyHelper.toMap(data, new HashMap()).get("ServiceProviderObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceProviderObjectDataList getServiceProviderObjectDataList() {
    return ServiceProviderObjectHelper.fromMapList(outputMap, "ServiceProviderList");
  }
  /**
   @deprecated
   */
  public ServiceProviderObjectData getServiceProviderObjectData() {
    return ServiceProviderObjectHelper.fromMap(outputMap, "ServiceProvider");
  }
}
