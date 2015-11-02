/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertRequest.java
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
public final class AccountInsertRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountInsertRequest (String request, AccountInsertRequestMethod method) {
    initialize(request, "AccountInsert", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountInsertRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInsertForAccountInsertCreate(AccountInsertObjectData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public void setAccountInsertForAccountInsertDelete(AccountInsertObjectKeyData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public void setInactiveDateForAccountInsertDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountInsertForAccountInsertDeleteList(AccountInsertObjectFilter data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public void setInactiveDateForAccountInsertDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setAccountInsertForAccountInsertFind(AccountInsertObjectFilter data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public void setAccountInsertForAccountInsertGet(AccountInsertObjectKeyData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public void setAccountInsertForAccountInsertUpdate(AccountInsertObjectData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }
  public AccountInsertObjectData getAccountInsertObjectDataAccountInsertFromAccountInsertCreate() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
  public AccountInsertObjectData getAccountInsertObjectDataAccountInsertFromAccountInsertDelete() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
  public AccountInsertObjectDataList getAccountInsertObjectDataAccountInsertFromAccountInsertFind() {
    return AccountInsertObjectHelper.fromMapList(outputMap, "AccountInsertList");
  }
  public AccountInsertObjectData getAccountInsertObjectDataAccountInsertFromAccountInsertGet() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
  public AccountInsertObjectData getAccountInsertObjectDataAccountInsertFromAccountInsertUpdate() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
  }
  /**
   @deprecated
   */
  public void setAccountInsertObjectFilter(AccountInsertObjectFilter data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap()).get("AccountInsertObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountInsertObjectData(AccountInsertObjectData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(data, new HashMap()).get("AccountInsertObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountInsertObjectKeyData(AccountInsertObjectKeyData data) {
    if (data != null) {
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(data, new HashMap()).get("AccountInsertObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountInsertObjectDataList getAccountInsertObjectDataList() {
    return AccountInsertObjectHelper.fromMapList(outputMap, "AccountInsertList");
  }
  /**
   @deprecated
   */
  public AccountInsertObjectData getAccountInsertObjectData() {
    return AccountInsertObjectHelper.fromMap(outputMap, "AccountInsert");
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
