/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceStatusRequest.java
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
public final class ServiceStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceStatusRequest (String request, ServiceStatusRequestMethod method) {
    initialize(request, "ServiceStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceStatusRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceStatusRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceStatusRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceStatusRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setServiceStatusForServiceStatusFind(ServiceStatusObjectFilter data) {
    if (data != null) {
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(data, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }
  public void setServiceStatusForServiceStatusGet(ServiceStatusObjectKeyData data) {
    if (data != null) {
      addInput("ServiceStatus", ServiceStatusObjectKeyHelper.toMap(data, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }
  public ServiceStatusObjectDataList getServiceStatusObjectDataServiceStatusFromServiceStatusFind() {
    return ServiceStatusObjectHelper.fromMapList(outputMap, "ServiceStatusList");
  }
  public ServiceStatusObjectData getServiceStatusObjectDataServiceStatusFromServiceStatusGet() {
    return ServiceStatusObjectHelper.fromMap(outputMap, "ServiceStatus");
  }
  /**
   @deprecated
   */
  public void setServiceStatusObjectFilter(ServiceStatusObjectFilter data) {
    if (data != null) {
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(data, new HashMap()).get("ServiceStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceStatusObjectKeyData(ServiceStatusObjectKeyData data) {
    if (data != null) {
      addInput("ServiceStatus", ServiceStatusObjectKeyHelper.toMap(data, new HashMap()).get("ServiceStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceStatusObjectDataList getServiceStatusObjectDataList() {
    return ServiceStatusObjectHelper.fromMapList(outputMap, "ServiceStatusList");
  }
  /**
   @deprecated
   */
  public ServiceStatusObjectData getServiceStatusObjectData() {
    return ServiceStatusObjectHelper.fromMap(outputMap, "ServiceStatus");
  }
}
