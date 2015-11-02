/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupRequest.java
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
public final class ServiceMasterGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceMasterGroupRequest (String request, ServiceMasterGroupRequestMethod method) {
    initialize(request, "ServiceMasterGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceMasterGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceMasterGroupForServiceMasterGroupCreate(ServiceMasterGroupObjectData data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(data, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
  public void setServiceMasterGroupForServiceMasterGroupFind(ServiceMasterGroupObjectFilter data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(data, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
  public void setServiceMasterGroupForServiceMasterGroupGet(ServiceMasterGroupObjectKeyData data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectKeyHelper.toMap(data, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
  public void setServiceMasterGroupForServiceMasterGroupUpdate(ServiceMasterGroupObjectData data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(data, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
  public ServiceMasterGroupObjectData getServiceMasterGroupObjectDataServiceMasterGroupFromServiceMasterGroupCreate() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
  public ServiceMasterGroupObjectDataList getServiceMasterGroupObjectDataServiceMasterGroupFromServiceMasterGroupFind() {
    return ServiceMasterGroupObjectHelper.fromMapList(outputMap, "ServiceMasterGroupList");
  }
  public ServiceMasterGroupObjectData getServiceMasterGroupObjectDataServiceMasterGroupFromServiceMasterGroupGet() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
  public ServiceMasterGroupObjectData getServiceMasterGroupObjectDataServiceMasterGroupFromServiceMasterGroupUpdate() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
  /**
   @deprecated
   */
  public void setServiceMasterGroupObjectFilter(ServiceMasterGroupObjectFilter data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(data, new HashMap()).get("ServiceMasterGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceMasterGroupObjectData(ServiceMasterGroupObjectData data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(data, new HashMap()).get("ServiceMasterGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceMasterGroupObjectKeyData(ServiceMasterGroupObjectKeyData data) {
    if (data != null) {
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectKeyHelper.toMap(data, new HashMap()).get("ServiceMasterGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceMasterGroupObjectDataList getServiceMasterGroupObjectDataList() {
    return ServiceMasterGroupObjectHelper.fromMapList(outputMap, "ServiceMasterGroupList");
  }
  /**
   @deprecated
   */
  public ServiceMasterGroupObjectData getServiceMasterGroupObjectData() {
    return ServiceMasterGroupObjectHelper.fromMap(outputMap, "ServiceMasterGroup");
  }
}
