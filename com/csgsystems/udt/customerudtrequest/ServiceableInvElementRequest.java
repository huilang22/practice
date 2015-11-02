/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableInvElementRequest.java
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

import com.csgsystems.iv.data.*;
public final class ServiceableInvElementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceableInvElementRequest (String request, ServiceableInvElementRequestMethod method) {
    initialize(request, "ServiceableInvElement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceableInvElementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAddressIdInForServiceableInvElementFind(BigInteger data) {
    if (data != null) {
      addInput("AddressIdIn", data);
    }
  }
  public void setServiceableInvElementForServiceableInvElementFind(InvElementObjFilter data) {
    if (data != null) {
      addInput("ServiceableInvElement", InvElementObjHelper.toMap(data, new HashMap(), "ServiceableInvElement").get("ServiceableInvElement"));
    }
  }
  public InvElementObjDataList getInvElementObjDataInvElementFromServiceableInvElementFind() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
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
  public void setInvElementObjFilter(InvElementObjFilter data) {
    if (data != null) {
      addInput("InvElementObj", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public InvElementObjDataList getInvElementObjDataList() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementObjList");
  }
}
