/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneRequest.java
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
public final class ServiceZoneRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceZoneRequest (String request, ServiceZoneRequestMethod method) {
    initialize(request, "ServiceZone", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceZoneRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceZoneRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceZoneRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceZoneRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceZoneRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCancelDateForServiceZoneCancel(Date data) {
    if (data != null) {
      addInput("CancelDate", data);
    }
  }
  public void setServiceZoneForServiceZoneCancel(ServiceZoneObjectData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public void setServiceZoneForServiceZoneCreate(ServiceZoneObjectData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public void setInactiveDateForServiceZoneDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForServiceZoneDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setServiceZoneFilterForServiceZoneDeleteList(ServiceZoneObjectFilter data) {
    if (data != null) {
      addInput("ServiceZoneFilter", ServiceZoneObjectHelper.toMap(data, new HashMap(), "ServiceZoneFilter").get("ServiceZoneFilter"));
    }
  }
  public void setServiceZoneForServiceZoneDelete(ServiceZoneObjectKeyData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public void setServiceZoneForServiceZoneFind(ServiceZoneObjectFilter data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public void setServiceZoneForServiceZoneGet(ServiceZoneObjectKeyData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public void setServiceZoneForServiceZoneUpdate(ServiceZoneObjectData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
  public ServiceZoneObjectData getServiceZoneObjectDataServiceZoneFromServiceZoneCreate() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
  public ServiceZoneObjectData getServiceZoneObjectDataServiceZoneFromServiceZoneDelete() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
  public ServiceZoneObjectDataList getServiceZoneObjectDataServiceZoneFromServiceZoneFind() {
    return ServiceZoneObjectHelper.fromMapList(outputMap, "ServiceZoneList");
  }
  public ServiceZoneObjectData getServiceZoneObjectDataServiceZoneFromServiceZoneGet() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
  public ServiceZoneObjectData getServiceZoneObjectDataServiceZoneFromServiceZoneUpdate() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
  /**
   @deprecated
   */
  public void setCancelDate(Date data) {
    if (data != null) {
      addInput("CancelDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceZoneObjectFilter(ServiceZoneObjectFilter data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap()).get("ServiceZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceZoneObjectData(ServiceZoneObjectData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(data, new HashMap()).get("ServiceZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceZoneObjectKeyData(ServiceZoneObjectKeyData data) {
    if (data != null) {
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(data, new HashMap()).get("ServiceZoneObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceZoneObjectDataList getServiceZoneObjectDataList() {
    return ServiceZoneObjectHelper.fromMapList(outputMap, "ServiceZoneList");
  }
  /**
   @deprecated
   */
  public ServiceZoneObjectData getServiceZoneObjectData() {
    return ServiceZoneObjectHelper.fromMap(outputMap, "ServiceZone");
  }
}
