/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableInventoryTypeRequest.java
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
import com.csgsystems.iv.data.*;
public final class ServiceableInventoryTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceableInventoryTypeRequest (String request, ServiceableInventoryTypeRequestMethod method) {
    initialize(request, "ServiceableInventoryType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceableInventoryTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServiceableInventoryTypeFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public InvsTypeObjectDataList getInvsTypeObjectDataInvsTypeFromServiceableInventoryTypeFind() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
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
  public InvsTypeObjectDataList getInvsTypeObjectDataList() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}
