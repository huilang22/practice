/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeRequest.java
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
public final class AccountCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountCodeRequest (String request, AccountCodeRequestMethod method) {
    initialize(request, "AccountCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountCodeRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountCodeRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountCodeForAccountCodeCreate(AccountCodeObjectData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public void setAccountCodeForAccountCodeDelete(AccountCodeObjectKeyData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public void setAccountCodeForAccountCodeDeleteList(AccountCodeObjectFilter data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public void setAccountCodeForAccountCodeFind(AccountCodeObjectFilter data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public void setAccountCodeForAccountCodeGet(AccountCodeObjectKeyData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public void setAccountCodeForAccountCodeUpdate(AccountCodeObjectData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }
  public AccountCodeObjectData getAccountCodeObjectDataAccountCodeFromAccountCodeCreate() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
  public AccountCodeObjectDataList getAccountCodeObjectDataAccountCodeFromAccountCodeFind() {
    return AccountCodeObjectHelper.fromMapList(outputMap, "AccountCodeList");
  }
  public AccountCodeObjectData getAccountCodeObjectDataAccountCodeFromAccountCodeGet() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
  public AccountCodeObjectData getAccountCodeObjectDataAccountCodeFromAccountCodeUpdate() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
  /**
   @deprecated
   */
  public void setAccountCodeObjectFilter(AccountCodeObjectFilter data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap()).get("AccountCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountCodeObjectData(AccountCodeObjectData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectHelper.toMap(data, new HashMap()).get("AccountCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountCodeObjectKeyData(AccountCodeObjectKeyData data) {
    if (data != null) {
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(data, new HashMap()).get("AccountCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountCodeObjectDataList getAccountCodeObjectDataList() {
    return AccountCodeObjectHelper.fromMapList(outputMap, "AccountCodeList");
  }
  /**
   @deprecated
   */
  public AccountCodeObjectData getAccountCodeObjectData() {
    return AccountCodeObjectHelper.fromMap(outputMap, "AccountCode");
  }
}
