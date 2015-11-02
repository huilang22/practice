/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableServiceTypeRequest.java
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
import com.csgsystems.om.data.*;
public final class ServiceableServiceTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceableServiceTypeRequest (String request, ServiceableServiceTypeRequestMethod method) {
    initialize(request, "ServiceableServiceType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceableServiceTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServiceableServiceTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setIndustryTypeIdForServiceableServiceTypeFind(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
    }
  }
  public void setServiceableDtForServiceableServiceTypeFind(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
  public ServicePricingPlanObjectDataList getServicePricingPlanObjectDataServicePricingPlanFromServiceableServiceTypeFind() {
    return ServicePricingPlanObjectHelper.fromMapList(outputMap, "ServicePricingPlanList");
  }
  /**
   @deprecated
   */
  public void setAddressIdIn(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setIndustryTypeId(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
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
  public void setServiceableDt(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
}
