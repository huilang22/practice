/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountRequest.java
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
import com.csgsystems.om.data.*;
public final class OrderedAccountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedAccountRequest (String request, OrderedAccountRequestMethod method) {
    initialize(request, "OrderedAccount", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedAccountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountIdRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountIdRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CollectableRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CollectableRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CreditCardRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CreditCardRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(DepositRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(DepositRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NoteRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NoteRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefundRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefundRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(TaxExemptionRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(TaxExemptionRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, OrderedAccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, OrderedAccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountForOrderedAccountCreate(AccountXIDObjectData data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setBillingServiceCenterIdForOrderedAccountCreate(Integer data) {
    if (data != null) {
      addInput("BillingServiceCenterId", data);
    }
  }
  public void setCollectionServiceCenterIdForOrderedAccountCreate(Integer data) {
    if (data != null) {
      addInput("CollectionServiceCenterId", data);
    }
  }
  public void setInquiryServiceCenterIdForOrderedAccountCreate(Integer data) {
    if (data != null) {
      addInput("InquiryServiceCenterId", data);
    }
  }
  public void setOrderForOrderedAccountCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setPaymentProfileForOrderedAccountCreate(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPrintServiceCenterIdForOrderedAccountCreate(Integer data) {
    if (data != null) {
      addInput("PrintServiceCenterId", data);
    }
  }
  public void setRemitServiceCenterIdForOrderedAccountCreate(Integer data) {
    if (data != null) {
      addInput("RemitServiceCenterId", data);
    }
  }
  public void setVerboseResponseForOrderedAccountCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAccountForOrderedAccountDisconnect(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAnnotationForOrderedAccountDisconnect(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setInactiveDtForOrderedAccountDisconnect(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  public void setNewBalanceAccountInternalIdForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("NewBalanceAccountInternalId", data);
    }
  }
  public void setNewOpenItemIdForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("NewOpenItemId", data);
    }
  }
  public void setNewPostpaidAccountInternalIdForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("NewPostpaidAccountInternalId", data);
    }
  }
  public void setStatusReasonIdForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  public void setVerboseResponseForOrderedAccountDisconnect(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setWaiveInstallmentNrcForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrc", data);
    }
  }
  public void setWaiveRefinanceNrcForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrc", data);
    }
  }
  public void setWaiveTerminationObligationForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationObligation", data);
    }
  }
  public void setWaiveUnbilledNrcForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrc", data);
    }
  }
  public void setWaiveUnmetObligationForOrderedAccountDisconnect(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
  public void setAccountForOrderedAccountResumeServices(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAnnotationForOrderedAccountResumeServices(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setAutoCommitOrderForOrderedAccountResumeServices(Boolean data) {
    if (data != null) {
      addInput("AutoCommitOrder", data);
    }
  }
  public void setGenerateWorkflowForOrderedAccountResumeServices(Boolean data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setJobIdForOrderedAccountResumeServices(String data) {
    if (data != null) {
      addInput("JobId", data);
    }
  }
  public void setOrderForOrderedAccountResumeServices(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setResumeDtForOrderedAccountResumeServices(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  public void setVerboseResponseForOrderedAccountResumeServices(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setAccountForOrderedAccountSuspendServices(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAnnotationForOrderedAccountSuspendServices(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  public void setAutoCommitOrderForOrderedAccountSuspendServices(Boolean data) {
    if (data != null) {
      addInput("AutoCommitOrder", data);
    }
  }
  public void setEffectiveDtForOrderedAccountSuspendServices(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setGenerateWorkflowForOrderedAccountSuspendServices(Boolean data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  public void setJobIdForOrderedAccountSuspendServices(String data) {
    if (data != null) {
      addInput("JobId", data);
    }
  }
  public void setOrderForOrderedAccountSuspendServices(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setResumeDtForOrderedAccountSuspendServices(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  public void setVerboseResponseForOrderedAccountSuspendServices(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedAccountCreateOutputData getOrderedAccountCreateOutputDataOrderedAccountCreateOutputDataFromOrderedAccountCreate() {
    return OrderedAccountCreateOutputHelper.fromMap(outputMap);
  }
  public OrderedAccountDisconnectOutputData getOrderedAccountDisconnectOutputDataOrderedAccountDisconnectOutputDataFromOrderedAccountDisconnect() {
    return OrderedAccountDisconnectOutputHelper.fromMap(outputMap);
  }
  public OrderedAccountResumeServicesOutputData getOrderedAccountResumeServicesOutputDataOrderedAccountResumeServicesOutputDataFromOrderedAccountResumeServices() {
    return OrderedAccountResumeServicesOutputHelper.fromMap(outputMap);
  }
  public OrderedAccountSuspendServicesOutputData getOrderedAccountSuspendServicesOutputDataOrderedAccountSuspendServicesOutputDataFromOrderedAccountSuspendServices() {
    return OrderedAccountSuspendServicesOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setAccountObjectData(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap()).get("AccountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountXIDObjectData(AccountXIDObjectData data) {
    if (data != null) {
      addInput("AccountXID", AccountXIDObjectHelper.toMap(data, new HashMap()).get("AccountXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAnnotation(String data) {
    if (data != null) {
      addInput("Annotation", data);
    }
  }
  /**
   @deprecated
   */
  public void setAutoCommitOrder(Boolean data) {
    if (data != null) {
      addInput("AutoCommitOrder", data);
    }
  }
  /**
   @deprecated
   */
  public void setBillingServiceCenterId(Integer data) {
    if (data != null) {
      addInput("BillingServiceCenterId", data);
    }
  }
  /**
   @deprecated
   */
  public void setCollectionServiceCenterId(Integer data) {
    if (data != null) {
      addInput("CollectionServiceCenterId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEffectiveDt(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setGenerateWorkflow(Boolean data) {
    if (data != null) {
      addInput("GenerateWorkflow", data);
    }
  }
  /**
   @deprecated
   */
  public void setInactiveDt(Date data) {
    if (data != null) {
      addInput("InactiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setInquiryServiceCenterId(Integer data) {
    if (data != null) {
      addInput("InquiryServiceCenterId", data);
    }
  }
  /**
   @deprecated
   */
  public void setJobId(String data) {
    if (data != null) {
      addInput("JobId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewBalanceAccountInternalId(Integer data) {
    if (data != null) {
      addInput("NewBalanceAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewOpenItemId(Integer data) {
    if (data != null) {
      addInput("NewOpenItemId", data);
    }
  }
  /**
   @deprecated
   */
  public void setNewPostpaidAccountInternalId(Integer data) {
    if (data != null) {
      addInput("NewPostpaidAccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderedAccountCreateOutputData getOrderedAccountCreateOutputData() {
    return OrderedAccountCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedAccountDisconnectOutputData getOrderedAccountDisconnectOutputData() {
    return OrderedAccountDisconnectOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedAccountResumeServicesOutputData getOrderedAccountResumeServicesOutputData() {
    return OrderedAccountResumeServicesOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedAccountSuspendServicesOutputData getOrderedAccountSuspendServicesOutputData() {
    return OrderedAccountSuspendServicesOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setPaymentProfileObjectData(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap()).get("PaymentProfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPrintServiceCenterId(Integer data) {
    if (data != null) {
      addInput("PrintServiceCenterId", data);
    }
  }
  /**
   @deprecated
   */
  public void setRemitServiceCenterId(Integer data) {
    if (data != null) {
      addInput("RemitServiceCenterId", data);
    }
  }
  /**
   @deprecated
   */
  public void setResumeDt(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setStatusReasonId(Integer data) {
    if (data != null) {
      addInput("StatusReasonId", data);
    }
  }
  /**
   @deprecated
   */
  public void setVerboseResponse(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveInstallmentNrc(Integer data) {
    if (data != null) {
      addInput("WaiveInstallmentNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveRefinanceNrc(Integer data) {
    if (data != null) {
      addInput("WaiveRefinanceNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveTerminationObligation(Integer data) {
    if (data != null) {
      addInput("WaiveTerminationObligation", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnbilledNrc(Integer data) {
    if (data != null) {
      addInput("WaiveUnbilledNrc", data);
    }
  }
  /**
   @deprecated
   */
  public void setWaiveUnmetObligation(Integer data) {
    if (data != null) {
      addInput("WaiveUnmetObligation", data);
    }
  }
}
