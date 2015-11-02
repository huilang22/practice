/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigurationRequest.java
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
public final class EmfConfigurationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EmfConfigurationRequest (String request, EmfConfigurationRequestMethod method) {
    initialize(request, "EmfConfiguration", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EmfConfigurationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, EmfConfigurationRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, EmfConfigurationRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, EmfConfigurationRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, EmfConfigurationRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setEmfConfigurationForEmfConfigurationFind(EmfConfigurationObjectFilter data) {
    if (data != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(data, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }
  public void setEmfConfigurationForEmfConfigurationGet(EmfConfigurationObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectKeyHelper.toMap(data, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }
  public EmfConfigurationObjectDataList getEmfConfigurationObjectDataEmfConfigurationFromEmfConfigurationFind() {
    return EmfConfigurationObjectHelper.fromMapList(outputMap, "EmfConfigurationList");
  }
  public EmfConfigurationObjectData getEmfConfigurationObjectDataEmfConfigurationFromEmfConfigurationGet() {
    return EmfConfigurationObjectHelper.fromMap(outputMap, "EmfConfiguration");
  }
  /**
   @deprecated
   */
  public void setEmfConfigurationObjectFilter(EmfConfigurationObjectFilter data) {
    if (data != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(data, new HashMap()).get("EmfConfigurationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEmfConfigurationObjectKeyData(EmfConfigurationObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectKeyHelper.toMap(data, new HashMap()).get("EmfConfigurationObject"));
    }
  }
  /**
   @deprecated
   */
  public EmfConfigurationObjectDataList getEmfConfigurationObjectDataList() {
    return EmfConfigurationObjectHelper.fromMapList(outputMap, "EmfConfigurationList");
  }
  /**
   @deprecated
   */
  public EmfConfigurationObjectData getEmfConfigurationObjectData() {
    return EmfConfigurationObjectHelper.fromMap(outputMap, "EmfConfiguration");
  }
}
