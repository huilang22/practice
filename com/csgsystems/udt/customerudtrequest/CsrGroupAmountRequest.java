/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupAmountRequest.java
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
public final class CsrGroupAmountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CsrGroupAmountRequest (String request, CsrGroupAmountRequestMethod method) {
    initialize(request, "CsrGroupAmount", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CsrGroupAmountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCsrGroupAmountForCsrGroupAmountCreate(CsrGroupAmountObjectData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(data, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
  public void setCsrGroupAmountForCsrGroupAmountDelete(CsrGroupAmountObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(data, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
  public void setCsrGroupAmountForCsrGroupAmountFind(CsrGroupAmountObjectFilter data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(data, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
  public void setCsrGroupAmountForCsrGroupAmountGet(CsrGroupAmountObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(data, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
  public void setCsrGroupAmountForCsrGroupAmountUpdate(CsrGroupAmountObjectData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(data, new HashMap(), "CsrGroupAmount").get("CsrGroupAmount"));
    }
  }
  public CsrGroupAmountObjectData getCsrGroupAmountObjectDataCsrGroupAmountFromCsrGroupAmountCreate() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
  public CsrGroupAmountObjectData getCsrGroupAmountObjectDataCsrGroupAmountFromCsrGroupAmountDelete() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
  public CsrGroupAmountObjectDataList getCsrGroupAmountObjectDataCsrGroupAmountFromCsrGroupAmountFind() {
    return CsrGroupAmountObjectHelper.fromMapList(outputMap, "CsrGroupAmountList");
  }
  public CsrGroupAmountObjectData getCsrGroupAmountObjectDataCsrGroupAmountFromCsrGroupAmountGet() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
  public CsrGroupAmountObjectData getCsrGroupAmountObjectDataCsrGroupAmountFromCsrGroupAmountUpdate() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
  /**
   @deprecated
   */
  public void setCsrGroupAmountObjectFilter(CsrGroupAmountObjectFilter data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(data, new HashMap()).get("CsrGroupAmountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrGroupAmountObjectData(CsrGroupAmountObjectData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectHelper.toMap(data, new HashMap()).get("CsrGroupAmountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrGroupAmountObjectKeyData(CsrGroupAmountObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupAmount", CsrGroupAmountObjectKeyHelper.toMap(data, new HashMap()).get("CsrGroupAmountObject"));
    }
  }
  /**
   @deprecated
   */
  public CsrGroupAmountObjectDataList getCsrGroupAmountObjectDataList() {
    return CsrGroupAmountObjectHelper.fromMapList(outputMap, "CsrGroupAmountList");
  }
  /**
   @deprecated
   */
  public CsrGroupAmountObjectData getCsrGroupAmountObjectData() {
    return CsrGroupAmountObjectHelper.fromMap(outputMap, "CsrGroupAmount");
  }
}
