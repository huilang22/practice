/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesRequest.java
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
public final class AccountBalancesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountBalancesRequest (String request, AccountBalancesRequestMethod method) {
    initialize(request, "AccountBalances", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountBalancesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PaymentRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PaymentRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(PrepaymentRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, AccountBalancesRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, AccountBalancesRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountBalancesForAccountBalancesAlternateGet(AccountBalancesObjectData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setAccountForAccountBalancesCount(CmfObjectKeyData data) {
    if (data != null) {
      addInput("Account", CmfObjectKeyHelper.toMap(data, new HashMap(), "Account").get("Account"));
    }
  }
  public void setAccountBalancesForAccountBalancesCreate(AccountBalancesObjectData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setAccountBalancesForAccountBalancesDelete(AccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setAccountBalancesForAccountBalancesDeleteByAccount(AccountBalancesObjectData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setInactiveDateForAccountBalancesDeleteByAccount(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setInactiveDateForAccountBalancesDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountBalancesFilterForAccountBalancesDeleteList(AccountBalancesObjectFilter data) {
    if (data != null) {
      addInput("AccountBalancesFilter", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalancesFilter").get("AccountBalancesFilter"));
    }
  }
  public void setInactiveDateForAccountBalancesDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountBalancesForAccountBalancesFind(AccountBalancesObjectFilter data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setAccountBalancesForAccountBalancesGet(AccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public void setAccountBalancesForAccountBalancesUpdate(AccountBalancesObjectData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }
  public AccountBalancesObjectData getAccountBalancesObjectDataAccountBalancesFromAccountBalancesAlternateGet() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  public Integer getIntegerBalanceCountFromAccountBalancesCount() {
    return (Integer)outputMap.get("BalanceCount");
  }
  public AccountBalancesObjectData getAccountBalancesObjectDataAccountBalancesFromAccountBalancesCreate() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  public AccountBalancesObjectData getAccountBalancesObjectDataAccountBalancesFromAccountBalancesDelete() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  public AccountBalancesObjectDataList getAccountBalancesObjectDataAccountBalancesFromAccountBalancesFind() {
    return AccountBalancesObjectHelper.fromMapList(outputMap, "AccountBalancesList");
  }
  public AccountBalancesObjectData getAccountBalancesObjectDataAccountBalancesFromAccountBalancesGet() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  public AccountBalancesObjectData getAccountBalancesObjectDataAccountBalancesFromAccountBalancesUpdate() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  /**
   @deprecated
   */
  public void setAccountBalancesObjectFilter(AccountBalancesObjectFilter data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap()).get("AccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountBalancesObjectData(AccountBalancesObjectData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(data, new HashMap()).get("AccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountBalancesObjectKeyData(AccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(data, new HashMap()).get("AccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountBalancesObjectDataList getAccountBalancesObjectDataList() {
    return AccountBalancesObjectHelper.fromMapList(outputMap, "AccountBalancesList");
  }
  /**
   @deprecated
   */
  public AccountBalancesObjectData getAccountBalancesObjectData() {
    return AccountBalancesObjectHelper.fromMap(outputMap, "AccountBalances");
  }
  /**
   @deprecated
   */
  public Integer getBalanceCount() {
    return (Integer)outputMap.get("BalanceCount");
  }
  /**
   @deprecated
   */
  public void setCmfObjectKeyData(CmfObjectKeyData data) {
    if (data != null) {
      addInput("Cmf", CmfObjectKeyHelper.toMap(data, new HashMap()).get("CmfObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
}
