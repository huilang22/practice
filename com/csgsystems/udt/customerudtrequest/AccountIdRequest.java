/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdRequest.java
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
public final class AccountIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountIdRequest (String request, AccountIdRequestMethod method) {
    initialize(request, "AccountId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountIdRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountIdRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountIdRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountIdRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountIdForAccountIdCreate(AccountIdObjectData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public void setAccountIdForAccountIdDelete(AccountIdObjectKeyData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public void setInactiveDateForAccountIdDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountIdForAccountIdDeleteList(AccountIdObjectFilter data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public void setInactiveDateForAccountIdDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountIdForAccountIdFind(AccountIdObjectFilter data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public void setAccountIdForAccountIdGet(AccountIdObjectKeyData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public void setAccountIdForAccountIdUpdate(AccountIdObjectData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap(), "AccountId").get("AccountId"));
    }
  }
  public AccountIdObjectData getAccountIdObjectDataAccountIdFromAccountIdCreate() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
  public AccountIdObjectData getAccountIdObjectDataAccountIdFromAccountIdDelete() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
  public AccountIdObjectDataList getAccountIdObjectDataAccountIdFromAccountIdFind() {
    return AccountIdObjectHelper.fromMapList(outputMap, "AccountIdList");
  }
  public AccountIdObjectData getAccountIdObjectDataAccountIdFromAccountIdGet() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
  public AccountIdObjectData getAccountIdObjectDataAccountIdFromAccountIdUpdate() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
  }
  /**
   @deprecated
   */
  public void setAccountIdObjectFilter(AccountIdObjectFilter data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap()).get("AccountIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountIdObjectData(AccountIdObjectData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectHelper.toMap(data, new HashMap()).get("AccountIdObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountIdObjectKeyData(AccountIdObjectKeyData data) {
    if (data != null) {
      addInput("AccountId", AccountIdObjectKeyHelper.toMap(data, new HashMap()).get("AccountIdObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountIdObjectDataList getAccountIdObjectDataList() {
    return AccountIdObjectHelper.fromMapList(outputMap, "AccountIdList");
  }
  /**
   @deprecated
   */
  public AccountIdObjectData getAccountIdObjectData() {
    return AccountIdObjectHelper.fromMap(outputMap, "AccountId");
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
