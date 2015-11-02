/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocRequest.java
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
public final class ServiceAddressAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceAddressAssocRequest (String request, ServiceAddressAssocRequestMethod method) {
    initialize(request, "ServiceAddressAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceAddressAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceAddressAssocForServiceAddressAssocCreate(ServiceAddressAssocObjectData data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(data, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
  public void setServiceAddressAssocForServiceAddressAssocFind(ServiceAddressAssocObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(data, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
  public void setServiceAddressAssocForServiceAddressAssocGet(ServiceAddressAssocObjectKeyData data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectKeyHelper.toMap(data, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
  public void setServiceAddressAssocForServiceAddressAssocUpdate(ServiceAddressAssocObjectData data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(data, new HashMap(), "ServiceAddressAssoc").get("ServiceAddressAssoc"));
    }
  }
  public ServiceAddressAssocObjectData getServiceAddressAssocObjectDataServiceAddressAssocFromServiceAddressAssocCreate() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
  public ServiceAddressAssocObjectDataList getServiceAddressAssocObjectDataServiceAddressAssocFromServiceAddressAssocFind() {
    return ServiceAddressAssocObjectHelper.fromMapList(outputMap, "ServiceAddressAssocList");
  }
  public ServiceAddressAssocObjectData getServiceAddressAssocObjectDataServiceAddressAssocFromServiceAddressAssocGet() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
  public ServiceAddressAssocObjectData getServiceAddressAssocObjectDataServiceAddressAssocFromServiceAddressAssocUpdate() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocObjectFilter(ServiceAddressAssocObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(data, new HashMap()).get("ServiceAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocObjectData(ServiceAddressAssocObjectData data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectHelper.toMap(data, new HashMap()).get("ServiceAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocObjectKeyData(ServiceAddressAssocObjectKeyData data) {
    if (data != null) {
      addInput("ServiceAddressAssoc", ServiceAddressAssocObjectKeyHelper.toMap(data, new HashMap()).get("ServiceAddressAssocObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceAddressAssocObjectDataList getServiceAddressAssocObjectDataList() {
    return ServiceAddressAssocObjectHelper.fromMapList(outputMap, "ServiceAddressAssocList");
  }
  /**
   @deprecated
   */
  public ServiceAddressAssocObjectData getServiceAddressAssocObjectData() {
    return ServiceAddressAssocObjectHelper.fromMap(outputMap, "ServiceAddressAssoc");
  }
}
