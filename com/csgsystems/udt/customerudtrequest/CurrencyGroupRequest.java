/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupRequest.java
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
public final class CurrencyGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CurrencyGroupRequest (String request, CurrencyGroupRequestMethod method) {
    initialize(request, "CurrencyGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CurrencyGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCurrencyGroupForCurrencyGroupCreate(CurrencyGroupObjectData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(data, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
  public void setCurrencyGroupForCurrencyGroupDelete(CurrencyGroupObjectKeyData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(data, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
  public void setCurrencyGroupForCurrencyGroupFind(CurrencyGroupObjectFilter data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(data, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
  public void setCurrencyGroupForCurrencyGroupGet(CurrencyGroupObjectKeyData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(data, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
  public void setCurrencyGroupForCurrencyGroupUpdate(CurrencyGroupObjectData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(data, new HashMap(), "CurrencyGroup").get("CurrencyGroup"));
    }
  }
  public CurrencyGroupObjectData getCurrencyGroupObjectDataCurrencyGroupFromCurrencyGroupCreate() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
  public CurrencyGroupObjectData getCurrencyGroupObjectDataCurrencyGroupFromCurrencyGroupDelete() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
  public CurrencyGroupObjectDataList getCurrencyGroupObjectDataCurrencyGroupFromCurrencyGroupFind() {
    return CurrencyGroupObjectHelper.fromMapList(outputMap, "CurrencyGroupList");
  }
  public CurrencyGroupObjectData getCurrencyGroupObjectDataCurrencyGroupFromCurrencyGroupGet() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
  public CurrencyGroupObjectData getCurrencyGroupObjectDataCurrencyGroupFromCurrencyGroupUpdate() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
  /**
   @deprecated
   */
  public void setCurrencyGroupObjectFilter(CurrencyGroupObjectFilter data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(data, new HashMap()).get("CurrencyGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCurrencyGroupObjectData(CurrencyGroupObjectData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectHelper.toMap(data, new HashMap()).get("CurrencyGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCurrencyGroupObjectKeyData(CurrencyGroupObjectKeyData data) {
    if (data != null) {
      addInput("CurrencyGroup", CurrencyGroupObjectKeyHelper.toMap(data, new HashMap()).get("CurrencyGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public CurrencyGroupObjectDataList getCurrencyGroupObjectDataList() {
    return CurrencyGroupObjectHelper.fromMapList(outputMap, "CurrencyGroupList");
  }
  /**
   @deprecated
   */
  public CurrencyGroupObjectData getCurrencyGroupObjectData() {
    return CurrencyGroupObjectHelper.fromMap(outputMap, "CurrencyGroup");
  }
}
