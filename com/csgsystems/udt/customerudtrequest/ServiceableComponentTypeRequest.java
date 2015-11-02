/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableComponentTypeRequest.java
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
import com.csgsystems.om.data.*;
public final class ServiceableComponentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceableComponentTypeRequest (String request, ServiceableComponentTypeRequestMethod method) {
    initialize(request, "ServiceableComponentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceableComponentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServiceableComponentTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setIndustryTypeIdForServiceableComponentTypeFind(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
    }
  }
  public void setServiceableDtForServiceableComponentTypeFind(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
  public CDObjectDataList getCDObjectDataComponentDefinitionFromServiceableComponentTypeFind() {
    return CDObjectHelper.fromMapList(outputMap, "ComponentDefinitionList");
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
  public CDObjectDataList getCDObjectDataList() {
    return CDObjectHelper.fromMapList(outputMap, "CDList");
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
  public void setServiceableDt(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
}
