/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCategoryRequest.java
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

import com.csgsystems.cf.data.*;
public final class AccountCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountCategoryRequest (String request, AccountCategoryRequestMethod method) {
    initialize(request, "AccountCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountCategoryForAccountCategoryCreate(ACObjectData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(data, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
  public void setAccountCategoryForAccountCategoryDelete(ACObjectKeyData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectKeyHelper.toMap(data, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
  public void setAccountCategoryForAccountCategoryFind(ACObjectFilter data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(data, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
  public void setAccountCategoryForAccountCategoryGet(ACObjectKeyData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectKeyHelper.toMap(data, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
  public void setAccountCategoryForAccountCategoryUpdate(ACObjectData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(data, new HashMap(), "AccountCategory").get("AccountCategory"));
    }
  }
  public ACObjectData getACObjectDataAccountCategoryFromAccountCategoryCreate() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
  public ACObjectData getACObjectDataAccountCategoryFromAccountCategoryDelete() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
  public ACObjectDataList getACObjectDataAccountCategoryFromAccountCategoryFind() {
    return ACObjectHelper.fromMapList(outputMap, "AccountCategoryList");
  }
  public ACObjectData getACObjectDataAccountCategoryFromAccountCategoryGet() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
  public ACObjectData getACObjectDataAccountCategoryFromAccountCategoryUpdate() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
  /**
   @deprecated
   */
  public void setACObjectFilter(ACObjectFilter data) {
    if (data != null) {
      addInput("AC", ACObjectHelper.toMap(data, new HashMap()).get("ACObject"));
    }
  }
  /**
   @deprecated
   */
  public void setACObjectData(ACObjectData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectHelper.toMap(data, new HashMap()).get("ACObject"));
    }
  }
  /**
   @deprecated
   */
  public void setACObjectKeyData(ACObjectKeyData data) {
    if (data != null) {
      addInput("AccountCategory", ACObjectKeyHelper.toMap(data, new HashMap()).get("ACObject"));
    }
  }
  /**
   @deprecated
   */
  public ACObjectDataList getACObjectDataList() {
    return ACObjectHelper.fromMapList(outputMap, "ACList");
  }
  /**
   @deprecated
   */
  public ACObjectData getACObjectData() {
    return ACObjectHelper.fromMap(outputMap, "AccountCategory");
  }
}
