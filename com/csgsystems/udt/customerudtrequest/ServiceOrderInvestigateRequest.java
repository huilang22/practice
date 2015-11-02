/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateRequest.java
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
public final class ServiceOrderInvestigateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceOrderInvestigateRequest (String request, ServiceOrderInvestigateRequestMethod method) {
    initialize(request, "ServiceOrderInvestigate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceOrderInvestigateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceOrderInvestigateForServiceOrderInvestigateErrorConditionFind(ServiceOrderInvestigateObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(data, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }
  public void setServiceOrderInvestigateForServiceOrderInvestigateExceptionFind(ServiceOrderInvestigateObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(data, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }
  public void setServiceOrderInvestigateForServiceOrderInvestigateSfqExceptionFind(ServiceOrderInvestigateObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(data, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }
  public void setServiceOrderInvestigateForServiceOrderInvestigateWorkflowExceptionFind(ServiceOrderInvestigateObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(data, new HashMap(), "ServiceOrderInvestigate").get("ServiceOrderInvestigate"));
    }
  }
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigateObjectDataServiceOrderInvestigateFromServiceOrderInvestigateErrorConditionFind() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigateObjectDataServiceOrderInvestigateFromServiceOrderInvestigateExceptionFind() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigateObjectDataServiceOrderInvestigateFromServiceOrderInvestigateSfqExceptionFind() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigateObjectDataServiceOrderInvestigateFromServiceOrderInvestigateWorkflowExceptionFind() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
  /**
   @deprecated
   */
  public void setServiceOrderInvestigateObjectFilter(ServiceOrderInvestigateObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrderInvestigate", ServiceOrderInvestigateObjectHelper.toMap(data, new HashMap()).get("ServiceOrderInvestigateObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigateObjectDataList() {
    return ServiceOrderInvestigateObjectHelper.fromMapList(outputMap, "ServiceOrderInvestigateList");
  }
}
