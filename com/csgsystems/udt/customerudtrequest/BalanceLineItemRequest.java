/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemRequest.java
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
public final class BalanceLineItemRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BalanceLineItemRequest (String request, BalanceLineItemRequestMethod method) {
    initialize(request, "BalanceLineItem", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BalanceLineItemRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AdjustmentRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BilledUsageRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CollectableRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CollectableRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceDetailRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentDistributionRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, BalanceLineItemRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefinancePlanRequest request, BalanceLineItemRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setBalanceLineItemForBalanceLineItemAmountGet(BalanceLineItemObjectKeyData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBalanceLineItemForBalanceLineItemByAccountCount(BalanceLineItemAccountObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setLatestInvoiceForBalanceLineItemByAccountCount(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setBalanceLineItemForBalanceLineItemByAccountFind(BalanceLineItemAccountObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setLatestInvoiceForBalanceLineItemByAccountFind(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  public void setBalanceLineItemForBalanceLineItemFind(BalanceLineItemObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBalanceLineItemForBalanceLineItemFindCount(BalanceLineItemObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public void setBalanceLineItemForBalanceLineItemGet(BalanceLineItemObjectKeyData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(data, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }
  public BigInteger getBigIntegerAdjustmentEligibleAmountFromBalanceLineItemAmountGet() {
    return (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
  public Integer getIntegerTotalCountFromBalanceLineItemByAccountCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BalanceLineItemObjectDataList getBalanceLineItemObjectDataBalanceLineItemFromBalanceLineItemByAccountFind() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
  public BalanceLineItemObjectDataList getBalanceLineItemObjectDataBalanceLineItemFromBalanceLineItemFind() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
  public Integer getIntegerTotalCountFromBalanceLineItemFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public BalanceLineItemObjectData getBalanceLineItemObjectDataBalanceLineItemFromBalanceLineItemGet() {
    return BalanceLineItemObjectHelper.fromMap(outputMap, "BalanceLineItem");
  }
  /**
   @deprecated
   */
  public BigInteger getAdjustmentEligibleAmount() {
    return (BigInteger)outputMap.get("AdjustmentEligibleAmount");
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemAccountObjectFilter(BalanceLineItemAccountObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(data, new HashMap()).get("BalanceLineItemAccountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemObjectFilter(BalanceLineItemObjectFilter data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(data, new HashMap()).get("BalanceLineItemObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBalanceLineItemObjectKeyData(BalanceLineItemObjectKeyData data) {
    if (data != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(data, new HashMap()).get("BalanceLineItemObject"));
    }
  }
  /**
   @deprecated
   */
  public BalanceLineItemObjectDataList getBalanceLineItemObjectDataList() {
    return BalanceLineItemObjectHelper.fromMapList(outputMap, "BalanceLineItemList");
  }
  /**
   @deprecated
   */
  public BalanceLineItemObjectData getBalanceLineItemObjectData() {
    return BalanceLineItemObjectHelper.fromMap(outputMap, "BalanceLineItem");
  }
  /**
   @deprecated
   */
  public void setLatestInvoice(Boolean data) {
    if (data != null) {
      addInput("LatestInvoice", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
