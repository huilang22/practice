/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupRequest.java
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
public final class AccountCodeGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountCodeGroupRequest (String request, AccountCodeGroupRequestMethod method) {
    initialize(request, "AccountCodeGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountCodeGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountCodeGroupRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountCodeGroupRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountCodeRequest request, AccountCodeGroupRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountCodeRequest request, AccountCodeGroupRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountCodeGroupRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountCodeGroupRequest request, AccountCodeGroupRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountCodeGroupRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, AccountCodeGroupRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountCodeGroupForAccountCodeGroupCreate(AccountCodeGroupObjectData data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(data, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
  public void setAccountCodeGroupForAccountCodeGroupFind(AccountCodeGroupObjectFilter data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(data, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
  public void setAccountCodeGroupForAccountCodeGroupGet(AccountCodeGroupObjectKeyData data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectKeyHelper.toMap(data, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
  public void setAccountCodeGroupForAccountCodeGroupUpdate(AccountCodeGroupObjectData data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(data, new HashMap(), "AccountCodeGroup").get("AccountCodeGroup"));
    }
  }
  public AccountCodeGroupObjectData getAccountCodeGroupObjectDataAccountCodeGroupFromAccountCodeGroupCreate() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
  public AccountCodeGroupObjectDataList getAccountCodeGroupObjectDataAccountCodeGroupFromAccountCodeGroupFind() {
    return AccountCodeGroupObjectHelper.fromMapList(outputMap, "AccountCodeGroupList");
  }
  public AccountCodeGroupObjectData getAccountCodeGroupObjectDataAccountCodeGroupFromAccountCodeGroupGet() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
  public AccountCodeGroupObjectData getAccountCodeGroupObjectDataAccountCodeGroupFromAccountCodeGroupUpdate() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
  /**
   @deprecated
   */
  public void setAccountCodeGroupObjectFilter(AccountCodeGroupObjectFilter data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(data, new HashMap()).get("AccountCodeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountCodeGroupObjectData(AccountCodeGroupObjectData data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectHelper.toMap(data, new HashMap()).get("AccountCodeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountCodeGroupObjectKeyData(AccountCodeGroupObjectKeyData data) {
    if (data != null) {
      addInput("AccountCodeGroup", AccountCodeGroupObjectKeyHelper.toMap(data, new HashMap()).get("AccountCodeGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountCodeGroupObjectDataList getAccountCodeGroupObjectDataList() {
    return AccountCodeGroupObjectHelper.fromMapList(outputMap, "AccountCodeGroupList");
  }
  /**
   @deprecated
   */
  public AccountCodeGroupObjectData getAccountCodeGroupObjectData() {
    return AccountCodeGroupObjectHelper.fromMap(outputMap, "AccountCodeGroup");
  }
}
