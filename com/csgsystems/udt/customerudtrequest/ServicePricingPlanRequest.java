/*
 * Generated code DO NOT EDIT
 * Generated file: ServicePricingPlanRequest.java
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
public final class ServicePricingPlanRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServicePricingPlanRequest (String request, ServicePricingPlanRequestMethod method) {
    initialize(request, "ServicePricingPlan", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServicePricingPlanRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForServicePricingPlanFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForServicePricingPlanFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setHierarchyIdForServicePricingPlanFindByHierarchy(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  public void setLanguageCodeForServicePricingPlanFindByHierarchy(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServicePricingPlanForServicePricingPlanFind(ServicePricingPlanObjectFilter data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(data, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }
  public void setServicePricingPlanForServicePricingPlanGet(ServicePricingPlanObjectKeyData data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectKeyHelper.toMap(data, new HashMap(), "ServicePricingPlan").get("ServicePricingPlan"));
    }
  }
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataServicePricingPlanFromServicePricingPlanFindByAccount() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataServicePricingPlanFromServicePricingPlanFindByHierarchy() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataServicePricingPlanFromServicePricingPlanFind() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  public ServicePricingPlanObjectData getServicePricingPlanObjectDataServicePricingPlanFromServicePricingPlanGet() {
    return ServicePricingPlanObjectHelper.fromMap(outputMap, "ServicePricingPlan");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setHierarchyId(Integer data) {
    if (data != null) {
      addInput("HierarchyId", data);
    }
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setServicePricingPlanObjectFilter(ServicePricingPlanObjectFilter data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectHelper.toMap(data, new HashMap()).get("ServicePricingPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServicePricingPlanObjectKeyData(ServicePricingPlanObjectKeyData data) {
    if (data != null) {
      addInput("ServicePricingPlan", ServicePricingPlanObjectKeyHelper.toMap(data, new HashMap()).get("ServicePricingPlanObject"));
    }
  }
  /**
   @deprecated
   */
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataList() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  /**
   @deprecated
   */
  public ServicePricingPlanObjectData getServicePricingPlanObjectData() {
    return ServicePricingPlanObjectHelper.fromMap(outputMap, "ServicePricingPlan");
  }
}
