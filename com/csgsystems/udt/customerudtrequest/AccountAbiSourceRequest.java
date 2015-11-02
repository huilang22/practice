/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceRequest.java
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
public final class AccountAbiSourceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountAbiSourceRequest (String request, AccountAbiSourceRequestMethod method) {
    initialize(request, "AccountAbiSource", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountAbiSourceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountAbiSourceForAccountAbiSourceCreate(AccountAbiSourceObjectData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public void setAccountAbiSourceForAccountAbiSourceDelete(AccountAbiSourceObjectKeyData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public void setInactiveDateForAccountAbiSourceDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountAbiSourceForAccountAbiSourceDeleteList(AccountAbiSourceObjectFilter data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public void setInactiveDateForAccountAbiSourceDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountAbiSourceForAccountAbiSourceFind(AccountAbiSourceObjectFilter data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public void setAccountAbiSourceForAccountAbiSourceGet(AccountAbiSourceObjectKeyData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public void setAccountAbiSourceForAccountAbiSourceUpdate(AccountAbiSourceObjectData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }
  public AccountAbiSourceObjectData getAccountAbiSourceObjectDataAccountAbiSourceFromAccountAbiSourceCreate() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
  public AccountAbiSourceObjectData getAccountAbiSourceObjectDataAccountAbiSourceFromAccountAbiSourceDelete() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
  public AccountAbiSourceObjectDataList getAccountAbiSourceObjectDataAccountAbiSourceFromAccountAbiSourceFind() {
    return AccountAbiSourceObjectHelper.fromMapList(outputMap, "AccountAbiSourceList");
  }
  public AccountAbiSourceObjectData getAccountAbiSourceObjectDataAccountAbiSourceFromAccountAbiSourceGet() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
  public AccountAbiSourceObjectData getAccountAbiSourceObjectDataAccountAbiSourceFromAccountAbiSourceUpdate() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
  }
  /**
   @deprecated
   */
  public void setAccountAbiSourceObjectFilter(AccountAbiSourceObjectFilter data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap()).get("AccountAbiSourceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountAbiSourceObjectData(AccountAbiSourceObjectData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(data, new HashMap()).get("AccountAbiSourceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountAbiSourceObjectKeyData(AccountAbiSourceObjectKeyData data) {
    if (data != null) {
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(data, new HashMap()).get("AccountAbiSourceObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountAbiSourceObjectDataList getAccountAbiSourceObjectDataList() {
    return AccountAbiSourceObjectHelper.fromMapList(outputMap, "AccountAbiSourceList");
  }
  /**
   @deprecated
   */
  public AccountAbiSourceObjectData getAccountAbiSourceObjectData() {
    return AccountAbiSourceObjectHelper.fromMap(outputMap, "AccountAbiSource");
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
