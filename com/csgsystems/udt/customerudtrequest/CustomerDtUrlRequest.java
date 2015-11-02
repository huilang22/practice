/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDtUrlRequest.java
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
public final class CustomerDtUrlRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerDtUrlRequest (String request, CustomerDtUrlRequestMethod method) {
    initialize(request, "CustomerDtUrl", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerDtUrlRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCustomerDtUrlFindInForCustomerDtUrlFind(CustomerDtUrlInputObjectFilter data) {
    if (data != null) {
      addInput("CustomerDtUrlFindIn", CustomerDtUrlInputObjectHelper.toMap(data, new HashMap(), "CustomerDtUrlFindIn").get("CustomerDtUrlFindIn"));
    }
  }
  public void setDocumentIdForCustomerDtUrlGet(Integer data) {
    if (data != null) {
      addInput("DocumentId", data);
    }
  }
  public CustomerDtUrlObjectDataList getCustomerDtUrlObjectDataCustomerDtUrlFromCustomerDtUrlFind() {
    return CustomerDtUrlObjectHelper.fromMapList(outputMap, "CustomerDtUrlList");
  }
  public CustomerDtUrlObjectData getCustomerDtUrlObjectDataCustomerDtUrlFromCustomerDtUrlGet() {
    return CustomerDtUrlObjectHelper.fromMap(outputMap, "CustomerDtUrl");
  }
  /**
   @deprecated
   */
  public void setCustomerDtUrlInputObjectFilter(CustomerDtUrlInputObjectFilter data) {
    if (data != null) {
      addInput("CustomerDtUrl", CustomerDtUrlInputObjectHelper.toMap(data, new HashMap()).get("CustomerDtUrlInputObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerDtUrlObjectDataList getCustomerDtUrlObjectDataList() {
    return CustomerDtUrlObjectHelper.fromMapList(outputMap, "CustomerDtUrlList");
  }
  /**
   @deprecated
   */
  public CustomerDtUrlObjectData getCustomerDtUrlObjectData() {
    return CustomerDtUrlObjectHelper.fromMap(outputMap, "CustomerDtUrl");
  }
  /**
   @deprecated
   */
  public void setDocumentId(Integer data) {
    if (data != null) {
      addInput("DocumentId", data);
    }
  }
}
