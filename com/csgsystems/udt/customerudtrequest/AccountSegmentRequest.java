/*
 * Generated code DO NOT EDIT
 * Generated file: AccountSegmentRequest.java
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
public final class AccountSegmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountSegmentRequest (String request, AccountSegmentRequestMethod method) {
    initialize(request, "AccountSegment", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountSegmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountSegmentForAccountSegmentCreate(AccountSegmentObjectData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(data, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
  public void setAccountSegmentForAccountSegmentDelete(AccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(data, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
  public void setAccountSegmentForAccountSegmentFind(AccountSegmentObjectFilter data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(data, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
  public void setAccountSegmentForAccountSegmentGet(AccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(data, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
  public void setASUpdateFilterForAccountSegmentUpdate(AccountSegmentObjectFilter data) {
    if (data != null) {
      addInput("ASUpdateFilter", AccountSegmentObjectHelper.toMap(data, new HashMap(), "ASUpdateFilter").get("ASUpdateFilter"));
    }
  }
  public void setAccountSegmentForAccountSegmentUpdate(AccountSegmentObjectData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(data, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }
  public AccountSegmentObjectData getAccountSegmentObjectDataAccountSegmentFromAccountSegmentCreate() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
  public AccountSegmentObjectData getAccountSegmentObjectDataAccountSegmentFromAccountSegmentDelete() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
  public AccountSegmentObjectDataList getAccountSegmentObjectDataAccountSegmentFromAccountSegmentFind() {
    return AccountSegmentObjectHelper.fromMapList(outputMap, "AccountSegmentList");
  }
  public AccountSegmentObjectData getAccountSegmentObjectDataAccountSegmentFromAccountSegmentGet() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
  public AccountSegmentObjectData getAccountSegmentObjectDataAccountSegmentFromAccountSegmentUpdate() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
  /**
   @deprecated
   */
  public void setAccountSegmentObjectFilter(AccountSegmentObjectFilter data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(data, new HashMap()).get("AccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountSegmentObjectData(AccountSegmentObjectData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(data, new HashMap()).get("AccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountSegmentObjectKeyData(AccountSegmentObjectKeyData data) {
    if (data != null) {
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(data, new HashMap()).get("AccountSegmentObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountSegmentObjectDataList getAccountSegmentObjectDataList() {
    return AccountSegmentObjectHelper.fromMapList(outputMap, "AccountSegmentList");
  }
  /**
   @deprecated
   */
  public AccountSegmentObjectData getAccountSegmentObjectData() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
