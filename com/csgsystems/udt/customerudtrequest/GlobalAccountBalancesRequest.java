/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesRequest.java
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
public final class GlobalAccountBalancesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GlobalAccountBalancesRequest (String request, GlobalAccountBalancesRequestMethod method) {
    initialize(request, "GlobalAccountBalances", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GlobalAccountBalancesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGlobalAccountBalancesForGlobalAccountBalancesCreate(GlobalAccountBalancesObjectData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(data, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
  public void setGlobalAccountBalancesForGlobalAccountBalancesDelete(GlobalAccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(data, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
  public void setGlobalAccountBalancesForGlobalAccountBalancesFind(GlobalAccountBalancesObjectFilter data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(data, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
  public void setGlobalAccountBalancesForGlobalAccountBalancesGet(GlobalAccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(data, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
  public void setGlobalAccountBalancesForGlobalAccountBalancesUpdate(GlobalAccountBalancesObjectData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(data, new HashMap(), "GlobalAccountBalances").get("GlobalAccountBalances"));
    }
  }
  public GlobalAccountBalancesObjectData getGlobalAccountBalancesObjectDataGlobalAccountBalancesFromGlobalAccountBalancesCreate() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
  public GlobalAccountBalancesObjectData getGlobalAccountBalancesObjectDataGlobalAccountBalancesFromGlobalAccountBalancesDelete() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
  public GlobalAccountBalancesObjectDataList getGlobalAccountBalancesObjectDataGlobalAccountBalancesFromGlobalAccountBalancesFind() {
    return GlobalAccountBalancesObjectHelper.fromMapList(outputMap, "GlobalAccountBalancesList");
  }
  public GlobalAccountBalancesObjectData getGlobalAccountBalancesObjectDataGlobalAccountBalancesFromGlobalAccountBalancesGet() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
  public GlobalAccountBalancesObjectData getGlobalAccountBalancesObjectDataGlobalAccountBalancesFromGlobalAccountBalancesUpdate() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
  /**
   @deprecated
   */
  public void setGlobalAccountBalancesObjectFilter(GlobalAccountBalancesObjectFilter data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(data, new HashMap()).get("GlobalAccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalAccountBalancesObjectData(GlobalAccountBalancesObjectData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectHelper.toMap(data, new HashMap()).get("GlobalAccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGlobalAccountBalancesObjectKeyData(GlobalAccountBalancesObjectKeyData data) {
    if (data != null) {
      addInput("GlobalAccountBalances", GlobalAccountBalancesObjectKeyHelper.toMap(data, new HashMap()).get("GlobalAccountBalancesObject"));
    }
  }
  /**
   @deprecated
   */
  public GlobalAccountBalancesObjectDataList getGlobalAccountBalancesObjectDataList() {
    return GlobalAccountBalancesObjectHelper.fromMapList(outputMap, "GlobalAccountBalancesList");
  }
  /**
   @deprecated
   */
  public GlobalAccountBalancesObjectData getGlobalAccountBalancesObjectData() {
    return GlobalAccountBalancesObjectHelper.fromMap(outputMap, "GlobalAccountBalances");
  }
}
