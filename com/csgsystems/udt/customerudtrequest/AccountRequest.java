/*
 * Generated code DO NOT EDIT
 * Generated file: AccountRequest.java
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
public final class AccountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountRequest (String request, AccountRequestMethod method) {
    initialize(request, "Account", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBalancesRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountBonusPointTransactionRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountBonusPointTransactionRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountHqContractRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountIdRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountIdRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CollectableRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CollectableRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CreditCardRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CreditCardRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerServiceCenterRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerServiceCenterRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(DepositRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(DepositRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EftTransactionRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InterimBillRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NoteRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NoteRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountBalanceRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(RefundRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(RefundRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(TaxExemptionRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(TaxExemptionRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, AccountRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(UnbilledUsageRequest request, AccountRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountForAccountActivate(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setActiveDateForAccountActivate(Date data) {
    if (data != null) {
      addInput("ActiveDate", data);
    }
  }
  public void setReasonCodeForAccountActivate(Integer data) {
    if (data != null) {
      addInput("ReasonCode", data);
    }
  }
  public void setAccountForAccountActiveChildCount(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setEffectiveDateForAccountActiveChildCount(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setAccountForAccountBalanceSummary(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountChildCount(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountCreate(AccountXIDObjectData data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setBillingServiceCenterIdForAccountCreate(Integer data) {
    if (data != null) {
      addInput("BillingServiceCenterId", data);
    }
  }
  public void setCollectionServiceCenterIdForAccountCreate(Integer data) {
    if (data != null) {
      addInput("CollectionServiceCenterId", data);
    }
  }
  public void setInquiryServiceCenterIdForAccountCreate(Integer data) {
    if (data != null) {
      addInput("InquiryServiceCenterId", data);
    }
  }
  public void setPaymentProfileForAccountCreate(PaymentProfileObjectData data) {
    if (data != null) {
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(data, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }
  public void setPrintServiceCenterIdForAccountCreate(Integer data) {
    if (data != null) {
      addInput("PrintServiceCenterId", data);
    }
  }
  public void setRemitServiceCenterIdForAccountCreate(Integer data) {
    if (data != null) {
      addInput("RemitServiceCenterId", data);
    }
  }
  public void setServerCategoryForAccountCreate(Integer data) {
    if (data != null) {
      addInput("ServerCategory", data);
    }
  }
  public void setAccountForAccountExtendedDataFind(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountFind(AccountXIDObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountFindByOrderNumber(AccountXIDOrderObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDOrderObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountFindCount(AccountXIDObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountFindWithExtendedData(AccountXIDObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountGet(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForAccountReactivate(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setRactDateForAccountReactivate(Date data) {
    if (data != null) {
      addInput("RactDate", data);
    }
  }
  public void setRactReasonForAccountReactivate(Integer data) {
    if (data != null) {
      addInput("RactReason", data);
    }
  }
  public void setAccountForAccountUpdate(AccountObjectData data) {
    if (data != null) {
      addInput("Account", AccountObjectHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountForNetworkStatus(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setEffectiveDateForNetworkStatus(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public AccountXIDObjectData getAccountXIDObjectDataAccountFromAccountActivate() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
  public Integer getIntegerActiveChildCountFromAccountActiveChildCount() {
    return (Integer)outputMap.get("ActiveChildCount");
  }
  public AccountBalanceSummaryOutputData getAccountBalanceSummaryOutputDataAccountBalanceSummaryOutputDataFromAccountBalanceSummary() {
    return AccountBalanceSummaryOutputHelper.fromMap(outputMap);
  }
  public Integer getIntegerCountFromAccountChildCount() {
    return (Integer)outputMap.get("Count");
  }
  public AccountCreateOutputData getAccountCreateOutputDataAccountCreateOutputDataFromAccountCreate() {
    return AccountCreateOutputHelper.fromMap(outputMap);
  }
  public AccountEDObjectDataList getAccountEDObjectDataAccountExtendedDataFromAccountExtendedDataFind() {
    return AccountEDObjectHelper.fromMapList(outputMap, "AccountExtendedDataList");
  }
  public AccountXIDObjectDataList getAccountXIDObjectDataAccountFromAccountFind() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
  public AccountXIDObjectDataList getAccountXIDObjectDataAccountFromAccountFindByOrderNumber() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
  public Integer getIntegerTotalCountFromAccountFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public AccountXIDObjectDataList getAccountXIDObjectDataAccountFromAccountFindWithExtendedData() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
  public AccountXIDObjectData getAccountXIDObjectDataAccountFromAccountGet() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
  public AccountXIDObjectData getAccountXIDObjectDataAccountFromAccountReactivate() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
  public AccountObjectKeyData getAccountObjectKeyDataAccountFromAccountSequenceGet() {
    return AccountObjectKeyHelper.fromMap(outputMap, "Account");
  }
  public AccountXIDObjectData getAccountXIDObjectDataAccountFromAccountUpdate() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
  public NetworkStatusOutputData getNetworkStatusOutputDataNetworkStatusOutputDataFromNetworkStatus() {
    return NetworkStatusOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountBalanceSummaryOutputData getAccountBalanceSummaryOutputData() {
    return AccountBalanceSummaryOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountCreateOutputData getAccountCreateOutputData() {
    return AccountCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public AccountEDObjectDataList getAccountEDObjectDataList() {
    return AccountEDObjectHelper.fromMapList(outputMap, "AccountList");
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
  public void setAccountObjectKeyData(AccountObjectKeyData data) {
    if (data != null) {
      addInput("Account", AccountObjectKeyHelper.toMap(data, new HashMap()).get("AccountObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountObjectKeyData getAccountObjectKeyData() {
    return AccountObjectKeyHelper.fromMap(outputMap, "Account");
  }
  /**
   @deprecated
   */
  public Map  getAccountObjectExtendedData() {
    return AccountObjectHelper.fromMap(outputMap, "Account").extendedData;
  }
  
  /**
   @deprecated
   */
  public void setAccountXIDObjectFilter(AccountXIDObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap()).get("AccountXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountXIDObjectData(AccountXIDObjectData data) {
    if (data != null) {
      addInput("Account", AccountXIDObjectHelper.toMap(data, new HashMap()).get("AccountXIDObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountXIDObjectDataList getAccountXIDObjectDataList() {
    return AccountXIDObjectHelper.fromMapList(outputMap, "AccountList");
  }
  /**
   @deprecated
   */
  public AccountXIDObjectData getAccountXIDObjectData() {
    return AccountXIDObjectHelper.fromMap(outputMap, "Account");
  }
  /**
   @deprecated
   */
  public void setAccountXIDOrderObjectFilter(AccountXIDOrderObjectFilter data) {
    if (data != null) {
      addInput("Account", AccountXIDOrderObjectHelper.toMap(data, new HashMap()).get("AccountXIDOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setActiveDate(Date data) {
    if (data != null) {
      addInput("ActiveDate", data);
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
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
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
  public NetworkStatusOutputData getNetworkStatusOutputData() {
    return NetworkStatusOutputHelper.fromMap(outputMap);
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
  public void setRactDate(Date data) {
    if (data != null) {
      addInput("RactDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setRactReason(Integer data) {
    if (data != null) {
      addInput("RactReason", data);
    }
  }
  /**
   @deprecated
   */
  public void setReasonCode(Integer data) {
    if (data != null) {
      addInput("ReasonCode", data);
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
  public void setServerCategory(Integer data) {
    if (data != null) {
      addInput("ServerCategory", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getCount() {
    return (Integer)outputMap.get("Count");
  }
  /**
   @deprecated
   */
  public Integer getActiveChildCount() {
    return (Integer)outputMap.get("ActiveChildCount");
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
