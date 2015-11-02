/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtServerRequest.java
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
public final class CustomerDtServerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerDtServerRequest (String request, CustomerDtServerRequestMethod method) {
    initialize(request, "CustomerDtServer", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerDtServerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCustomerDtServerForCustomerDtServerFind(CustomerDtServerObjectFilter data) {
    if (data != null) {
      addInput("CustomerDtServer", CustomerDtServerObjectHelper.toMap(data, new HashMap(), "CustomerDtServer").get("CustomerDtServer"));
    }
  }
  public CustomerDtServerObjectDataList getCustomerDtServerObjectDataCustomerDtServerFromCustomerDtServerFind() {
    return CustomerDtServerObjectHelper.fromMapList(outputMap, "CustomerDtServerList");
  }
  /**
   @deprecated
   */
  public void setCustomerDtServerObjectFilter(CustomerDtServerObjectFilter data) {
    if (data != null) {
      addInput("CustomerDtServer", CustomerDtServerObjectHelper.toMap(data, new HashMap()).get("CustomerDtServerObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerDtServerObjectDataList getCustomerDtServerObjectDataList() {
    return CustomerDtServerObjectHelper.fromMapList(outputMap, "CustomerDtServerList");
  }
}
