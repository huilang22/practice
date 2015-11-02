/*
 * Generated code DO NOT EDIT
 * Generated file: AccountStatusRequest.java
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
public final class AccountStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountStatusRequest (String request, AccountStatusRequestMethod method) {
    initialize(request, "AccountStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountStatusForAccountStatusFind(AccountStatusObjectFilter data) {
    if (data != null) {
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(data, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }
  public void setAccountStatusForAccountStatusGet(AccountStatusObjectKeyData data) {
    if (data != null) {
      addInput("AccountStatus", AccountStatusObjectKeyHelper.toMap(data, new HashMap(), "AccountStatus").get("AccountStatus"));
    }
  }
  public AccountStatusObjectDataList getAccountStatusObjectDataAccountStatusFromAccountStatusFind() {
    return AccountStatusObjectHelper.fromMapList(outputMap, "AccountStatusList");
  }
  public AccountStatusObjectData getAccountStatusObjectDataAccountStatusFromAccountStatusGet() {
    return AccountStatusObjectHelper.fromMap(outputMap, "AccountStatus");
  }
  /**
   @deprecated
   */
  public void setAccountStatusObjectFilter(AccountStatusObjectFilter data) {
    if (data != null) {
      addInput("AccountStatus", AccountStatusObjectHelper.toMap(data, new HashMap()).get("AccountStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountStatusObjectKeyData(AccountStatusObjectKeyData data) {
    if (data != null) {
      addInput("AccountStatus", AccountStatusObjectKeyHelper.toMap(data, new HashMap()).get("AccountStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountStatusObjectDataList getAccountStatusObjectDataList() {
    return AccountStatusObjectHelper.fromMapList(outputMap, "AccountStatusList");
  }
  /**
   @deprecated
   */
  public AccountStatusObjectData getAccountStatusObjectData() {
    return AccountStatusObjectHelper.fromMap(outputMap, "AccountStatus");
  }
}
