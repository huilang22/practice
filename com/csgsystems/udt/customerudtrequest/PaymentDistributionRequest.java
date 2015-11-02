/*
 * Generated code DO NOT EDIT
 * Generated file: PaymentDistributionRequest.java
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
public final class PaymentDistributionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PaymentDistributionRequest (String request, PaymentDistributionRequestMethod method) {
    initialize(request, "PaymentDistribution", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PaymentDistributionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, PaymentDistributionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BalanceLineItemRequest request, PaymentDistributionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PaymentDistributionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, PaymentDistributionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentRequest request, PaymentDistributionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentRequest request, PaymentDistributionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setPaymentDistributionForPaymentDistributionFindCount(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public void setPaymentDistributionForPaymentDistributionFind(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public void setPaymentDistributionForPaymentDistributionGet(PaymentDistributionObjectKeyData data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectKeyHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public void setPaymentDistributionForPaymentDistributionSummaryFind(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public void setPaymentDistributionForPaymentDistributionSuspenseFindCount(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public void setPaymentDistributionForPaymentDistributionSuspenseFind(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }
  public Integer getIntegerTotalCountFromPaymentDistributionFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public PaymentDistributionObjectDataList getPaymentDistributionObjectDataPaymentDistributionFromPaymentDistributionFind() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
  public PaymentDistributionObjectData getPaymentDistributionObjectDataPaymentDistributionFromPaymentDistributionGet() {
    return PaymentDistributionObjectHelper.fromMap(outputMap, "PaymentDistribution");
  }
  public PaymentDistributionObjectDataList getPaymentDistributionObjectDataPaymentDistributionFromPaymentDistributionSummaryFind() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
  public Integer getIntegerTotalCountFromPaymentDistributionSuspenseFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public PaymentDistributionObjectDataList getPaymentDistributionObjectDataPaymentDistributionFromPaymentDistributionSuspenseFind() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
  /**
   @deprecated
   */
  public void setPaymentDistributionObjectFilter(PaymentDistributionObjectFilter data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(data, new HashMap()).get("PaymentDistributionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPaymentDistributionObjectKeyData(PaymentDistributionObjectKeyData data) {
    if (data != null) {
      addInput("PaymentDistribution", PaymentDistributionObjectKeyHelper.toMap(data, new HashMap()).get("PaymentDistributionObject"));
    }
  }
  /**
   @deprecated
   */
  public PaymentDistributionObjectDataList getPaymentDistributionObjectDataList() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
  /**
   @deprecated
   */
  public PaymentDistributionObjectData getPaymentDistributionObjectData() {
    return PaymentDistributionObjectHelper.fromMap(outputMap, "PaymentDistribution");
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
