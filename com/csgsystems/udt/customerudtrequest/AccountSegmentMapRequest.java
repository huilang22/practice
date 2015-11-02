/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentMapRequest.java
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
public final class AccountSegmentMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountSegmentMapRequest (String request, AccountSegmentMapRequestMethod method) {
    initialize(request, "AccountSegmentMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountSegmentMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountSegmentMapForAccountSegmentMapCreate(AccountSegmentMapObjectData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(data, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
  public void setAccountSegmentMapForAccountSegmentMapDelete(AccountSegmentMapObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(data, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
  public void setAccountSegmentMapForAccountSegmentMapFind(AccountSegmentMapObjectFilter data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(data, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
  public void setAccountSegmentMapForAccountSegmentMapGet(AccountSegmentMapObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(data, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
  public void setAccountSegmentMapForAccountSegmentMapUpdate(AccountSegmentMapObjectData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(data, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }
  public AccountSegmentMapObjectData getAccountSegmentMapObjectDataAccountSegmentMapFromAccountSegmentMapCreate() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
  public AccountSegmentMapObjectData getAccountSegmentMapObjectDataAccountSegmentMapFromAccountSegmentMapDelete() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
  public AccountSegmentMapObjectDataList getAccountSegmentMapObjectDataAccountSegmentMapFromAccountSegmentMapFind() {
    return AccountSegmentMapObjectHelper.fromMapList(outputMap, "AccountSegmentMapList");
  }
  public AccountSegmentMapObjectData getAccountSegmentMapObjectDataAccountSegmentMapFromAccountSegmentMapGet() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
  public AccountSegmentMapObjectData getAccountSegmentMapObjectDataAccountSegmentMapFromAccountSegmentMapUpdate() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
  /**
   @deprecated
   */
  public void setAccountSegmentMapObjectFilter(AccountSegmentMapObjectFilter data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(data, new HashMap()).get("AccountSegmentMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountSegmentMapObjectData(AccountSegmentMapObjectData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(data, new HashMap()).get("AccountSegmentMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountSegmentMapObjectKeyData(AccountSegmentMapObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(data, new HashMap()).get("AccountSegmentMapObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountSegmentMapObjectDataList getAccountSegmentMapObjectDataList() {
    return AccountSegmentMapObjectHelper.fromMapList(outputMap, "AccountSegmentMapList");
  }
  /**
   @deprecated
   */
  public AccountSegmentMapObjectData getAccountSegmentMapObjectData() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
