/*
 * Generated code DO NOT EDIT
 * Generated file: AccountHqContractRequest.java
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
public final class AccountHqContractRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountHqContractRequest (String request, AccountHqContractRequestMethod method) {
    initialize(request, "AccountHqContract", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountHqContractRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountHqContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountHqContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, AccountHqContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, AccountHqContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountHqContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountHqContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, AccountHqContractRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, AccountHqContractRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountHqContractForAccountHqContractCreate(AccountHqContractObjectData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public void setAHCInactiveDateForAccountHqContractDelete(Date data) {
    if (data != null) {
      addInput("AHCInactiveDate", data);
    }
  }
  public void setAccountHqContractForAccountHqContractDelete(AccountHqContractObjectKeyData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public void setAHCLInactiveDateForAccountHqContractDeleteList(Date data) {
    if (data != null) {
      addInput("AHCLInactiveDate", data);
    }
  }
  public void setAccountHqContractForAccountHqContractDeleteList(AccountHqContractObjectFilter data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public void setAccountHqContractForAccountHqContractFind(AccountHqContractObjectFilter data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public void setAccountHqContractForAccountHqContractGet(AccountHqContractObjectKeyData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public void setAccountHqContractForAccountHqContractUpdate(AccountHqContractObjectData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap(), "AccountHqContract").get("AccountHqContract"));
    }
  }
  public AccountHqContractObjectData getAccountHqContractObjectDataAccountHqContractFromAccountHqContractCreate() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
  public AccountHqContractObjectData getAccountHqContractObjectDataAccountHqContractFromAccountHqContractDelete() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
  public AccountHqContractObjectDataList getAccountHqContractObjectDataAccountHqContractFromAccountHqContractFind() {
    return AccountHqContractObjectHelper.fromMapList(outputMap, "AccountHqContractList");
  }
  public AccountHqContractObjectData getAccountHqContractObjectDataAccountHqContractFromAccountHqContractGet() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
  public AccountHqContractObjectData getAccountHqContractObjectDataAccountHqContractFromAccountHqContractUpdate() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
  /**
   @deprecated
   */
  public void setAHCInactiveDate(Date data) {
    if (data != null) {
      addInput("AHCInactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setAHCLInactiveDate(Date data) {
    if (data != null) {
      addInput("AHCLInactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountHqContractObjectFilter(AccountHqContractObjectFilter data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap()).get("AccountHqContractObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountHqContractObjectData(AccountHqContractObjectData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectHelper.toMap(data, new HashMap()).get("AccountHqContractObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountHqContractObjectKeyData(AccountHqContractObjectKeyData data) {
    if (data != null) {
      addInput("AccountHqContract", AccountHqContractObjectKeyHelper.toMap(data, new HashMap()).get("AccountHqContractObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountHqContractObjectDataList getAccountHqContractObjectDataList() {
    return AccountHqContractObjectHelper.fromMapList(outputMap, "AccountHqContractList");
  }
  /**
   @deprecated
   */
  public AccountHqContractObjectData getAccountHqContractObjectData() {
    return AccountHqContractObjectHelper.fromMap(outputMap, "AccountHqContract");
  }
}
