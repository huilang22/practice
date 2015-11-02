/*
 * Generated code DO NOT EDIT
 * Generated file: PrepaymentRequest.java
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
public final class PrepaymentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PrepaymentRequest (String request, PrepaymentRequestMethod method) {
    initialize(request, "Prepayment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PrepaymentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentDistributionRequest request, PrepaymentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentDistributionRequest request, PrepaymentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setPrepaymentForPrepaymentCreate(PrepaymentObjectData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setWaiveEpgForPrepaymentCreate(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
  public void setPrepaymentForPrepaymentDelete(PrepaymentObjectKeyData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setPrepaymentForPrepaymentFind(PrepaymentObjectFilter data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setPrepaymentForPrepaymentGetOld(PrepaymentObjectKeyData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setPrepaymentForPrepaymentGet(PrepaymentObjectKeyData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setPrepaymentForPrepaymentUpdate(PrepaymentObjectData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(data, new HashMap(), "Prepayment").get("Prepayment"));
    }
  }
  public void setWaiveEpgForPrepaymentUpdate(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
  public PrepaymentObjectData getPrepaymentObjectDataPrepaymentFromPrepaymentCreate() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
  public PrepaymentObjectDataList getPrepaymentObjectDataPrepaymentFromPrepaymentFind() {
    return PrepaymentObjectHelper.fromMapList(outputMap, "PrepaymentList");
  }
  public PrepaymentObjectData getPrepaymentObjectDataPrepaymentFromPrepaymentGetOld() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
  public PrepaymentObjectData getPrepaymentObjectDataPrepaymentFromPrepaymentGet() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
  public PrepaymentObjectData getPrepaymentObjectDataPrepaymentFromPrepaymentUpdate() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
  /**
   @deprecated
   */
  public void setPrepaymentObjectFilter(PrepaymentObjectFilter data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(data, new HashMap()).get("PrepaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrepaymentObjectData(PrepaymentObjectData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectHelper.toMap(data, new HashMap()).get("PrepaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrepaymentObjectKeyData(PrepaymentObjectKeyData data) {
    if (data != null) {
      addInput("Prepayment", PrepaymentObjectKeyHelper.toMap(data, new HashMap()).get("PrepaymentObject"));
    }
  }
  /**
   @deprecated
   */
  public PrepaymentObjectDataList getPrepaymentObjectDataList() {
    return PrepaymentObjectHelper.fromMapList(outputMap, "PrepaymentList");
  }
  /**
   @deprecated
   */
  public PrepaymentObjectData getPrepaymentObjectData() {
    return PrepaymentObjectHelper.fromMap(outputMap, "Prepayment");
  }
  /**
   @deprecated
   */
  public void setWaiveEpg(Integer data) {
    if (data != null) {
      addInput("WaiveEpg", data);
    }
  }
}
