/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageRequest.java
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
public final class AccountMessageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountMessageRequest (String request, AccountMessageRequestMethod method) {
    initialize(request, "AccountMessage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountMessageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountMessageForAccountMessageCreate(AccountMessageObjectData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public void setAccountMessageForAccountMessageDelete(AccountMessageObjectKeyData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public void setInactiveDateForAccountMessageDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountMessageForAccountMessageDeleteList(AccountMessageObjectFilter data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public void setInactiveDateForAccountMessageDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountMessageForAccountMessageFind(AccountMessageObjectFilter data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public void setAccountMessageForAccountMessageGet(AccountMessageObjectKeyData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public void setAccountMessageForAccountMessageUpdate(AccountMessageObjectData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }
  public AccountMessageObjectData getAccountMessageObjectDataAccountMessageFromAccountMessageCreate() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
  public AccountMessageObjectData getAccountMessageObjectDataAccountMessageFromAccountMessageDelete() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
  public AccountMessageObjectDataList getAccountMessageObjectDataAccountMessageFromAccountMessageFind() {
    return AccountMessageObjectHelper.fromMapList(outputMap, "AccountMessageList");
  }
  public AccountMessageObjectData getAccountMessageObjectDataAccountMessageFromAccountMessageGet() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
  public AccountMessageObjectData getAccountMessageObjectDataAccountMessageFromAccountMessageUpdate() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
  }
  /**
   @deprecated
   */
  public void setAccountMessageObjectFilter(AccountMessageObjectFilter data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap()).get("AccountMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountMessageObjectData(AccountMessageObjectData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(data, new HashMap()).get("AccountMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountMessageObjectKeyData(AccountMessageObjectKeyData data) {
    if (data != null) {
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(data, new HashMap()).get("AccountMessageObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountMessageObjectDataList getAccountMessageObjectDataList() {
    return AccountMessageObjectHelper.fromMapList(outputMap, "AccountMessageList");
  }
  /**
   @deprecated
   */
  public AccountMessageObjectData getAccountMessageObjectData() {
    return AccountMessageObjectHelper.fromMap(outputMap, "AccountMessage");
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
