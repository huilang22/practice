/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterRequest.java
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
public final class CustomerServiceCenterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerServiceCenterRequest (String request, CustomerServiceCenterRequestMethod method) {
    initialize(request, "CustomerServiceCenter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerServiceCenterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, CustomerServiceCenterRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, CustomerServiceCenterRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setCustomerServiceCenterForCustomerServiceCenterCreate(CustomerServiceCenterObjectData data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(data, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
  public void setCustomerServiceCenterForCustomerServiceCenterFind(CustomerServiceCenterObjectFilter data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(data, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
  public void setCustomerServiceCenterForCustomerServiceCenterGet(CustomerServiceCenterObjectKeyData data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectKeyHelper.toMap(data, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
  public void setCustomerServiceCenterForCustomerServiceCenterUpdate(CustomerServiceCenterObjectData data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(data, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
  public CustomerServiceCenterObjectData getCustomerServiceCenterObjectDataCustomerServiceCenterFromCustomerServiceCenterCreate() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
  public CustomerServiceCenterObjectDataList getCustomerServiceCenterObjectDataCustomerServiceCenterFromCustomerServiceCenterFind() {
    return CustomerServiceCenterObjectHelper.fromMapList(outputMap, "CustomerServiceCenterList");
  }
  public CustomerServiceCenterObjectData getCustomerServiceCenterObjectDataCustomerServiceCenterFromCustomerServiceCenterGet() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
  public CustomerServiceCenterObjectData getCustomerServiceCenterObjectDataCustomerServiceCenterFromCustomerServiceCenterUpdate() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
  /**
   @deprecated
   */
  public void setCustomerServiceCenterObjectFilter(CustomerServiceCenterObjectFilter data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(data, new HashMap()).get("CustomerServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerServiceCenterObjectData(CustomerServiceCenterObjectData data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(data, new HashMap()).get("CustomerServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerServiceCenterObjectKeyData(CustomerServiceCenterObjectKeyData data) {
    if (data != null) {
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectKeyHelper.toMap(data, new HashMap()).get("CustomerServiceCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerServiceCenterObjectDataList getCustomerServiceCenterObjectDataList() {
    return CustomerServiceCenterObjectHelper.fromMapList(outputMap, "CustomerServiceCenterList");
  }
  /**
   @deprecated
   */
  public CustomerServiceCenterObjectData getCustomerServiceCenterObjectData() {
    return CustomerServiceCenterObjectHelper.fromMap(outputMap, "CustomerServiceCenter");
  }
}
