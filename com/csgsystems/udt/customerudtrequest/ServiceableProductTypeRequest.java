/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableProductTypeRequest.java
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
public final class ServiceableProductTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceableProductTypeRequest (String request, ServiceableProductTypeRequestMethod method) {
    initialize(request, "ServiceableProductType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceableProductTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServiceableProductTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setIndustryTypeIdForServiceableProductTypeFind(Integer data) {
    if (data != null) {
      addInput("IndustryTypeId", data);
    }
  }
  public void setServiceableDtForServiceableProductTypeFind(Date data) {
    if (data != null) {
      addInput("ServiceableDt", data);
    }
  }
  public ProductElementObjectDataList getProductElementObjectDataProductElementFromServiceableProductTypeFind() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
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
  public ProductElementObjectDataList getProductElementObjectDataList() {
    return ProductElementObjectHelper.fromMapList(outputMap, "ProductElementList");
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
