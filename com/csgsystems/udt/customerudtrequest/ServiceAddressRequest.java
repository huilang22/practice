/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressRequest.java
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
public final class ServiceAddressRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceAddressRequest (String request, ServiceAddressRequestMethod method) {
    initialize(request, "ServiceAddress", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceAddressRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceAddressForServiceAddressFind(ServiceAddressObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddress", ServiceAddressObjectHelper.toMap(data, new HashMap(), "ServiceAddress").get("ServiceAddress"));
    }
  }
  public ServiceAddressObjectDataList getServiceAddressObjectDataServiceAddressFromServiceAddressFind() {
    return ServiceAddressObjectHelper.fromMapList(outputMap, "ServiceAddressList");
  }
  /**
   @deprecated
   */
  public void setServiceAddressObjectFilter(ServiceAddressObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddress", ServiceAddressObjectHelper.toMap(data, new HashMap()).get("ServiceAddressObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceAddressObjectDataList getServiceAddressObjectDataList() {
    return ServiceAddressObjectHelper.fromMapList(outputMap, "ServiceAddressList");
  }
}
