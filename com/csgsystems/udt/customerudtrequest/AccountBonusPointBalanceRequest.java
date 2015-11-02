/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointBalanceRequest.java
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
public final class AccountBonusPointBalanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountBonusPointBalanceRequest (String request, AccountBonusPointBalanceRequestMethod method) {
    initialize(request, "AccountBonusPointBalance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountBonusPointBalanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountBonusPointBalanceForAccountBonusPointBalanceFind(AccountBonusPointBalanceObjectFilter data) {
    if (data != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(data, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }
  public void setAccountBonusPointBalanceForAccountBonusPointBalanceGet(AccountBonusPointBalanceObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectKeyHelper.toMap(data, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }
  public AccountBonusPointBalanceObjectDataList getAccountBonusPointBalanceObjectDataAccountBonusPointBalanceFromAccountBonusPointBalanceFind() {
    return AccountBonusPointBalanceObjectHelper.fromMapList(outputMap, "AccountBonusPointBalanceList");
  }
  public AccountBonusPointBalanceObjectData getAccountBonusPointBalanceObjectDataAccountBonusPointBalanceFromAccountBonusPointBalanceGet() {
    return AccountBonusPointBalanceObjectHelper.fromMap(outputMap, "AccountBonusPointBalance");
  }
  /**
   @deprecated
   */
  public void setAccountBonusPointBalanceObjectFilter(AccountBonusPointBalanceObjectFilter data) {
    if (data != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(data, new HashMap()).get("AccountBonusPointBalanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountBonusPointBalanceObjectKeyData(AccountBonusPointBalanceObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectKeyHelper.toMap(data, new HashMap()).get("AccountBonusPointBalanceObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountBonusPointBalanceObjectDataList getAccountBonusPointBalanceObjectDataList() {
    return AccountBonusPointBalanceObjectHelper.fromMapList(outputMap, "AccountBonusPointBalanceList");
  }
  /**
   @deprecated
   */
  public AccountBonusPointBalanceObjectData getAccountBonusPointBalanceObjectData() {
    return AccountBonusPointBalanceObjectHelper.fromMap(outputMap, "AccountBonusPointBalance");
  }
}
