/*
 * Generated code DO NOT EDIT
 * Generated file: CsrGroupFunctionRequest.java
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
public final class CsrGroupFunctionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CsrGroupFunctionRequest (String request, CsrGroupFunctionRequestMethod method) {
    initialize(request, "CsrGroupFunction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CsrGroupFunctionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCsrGroupFunctionForCsrGroupFunctionCreate(CsrGroupFunctionObjectData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(data, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
  public void setCsrGroupFunctionForCsrGroupFunctionDelete(CsrGroupFunctionObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(data, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
  public void setCsrGroupFunctionForCsrGroupFunctionFind(CsrGroupFunctionObjectFilter data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(data, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
  public void setCsrGroupFunctionForCsrGroupFunctionGet(CsrGroupFunctionObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(data, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
  public void setCsrGroupFunctionForCsrGroupFunctionUpdate(CsrGroupFunctionObjectData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(data, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }
  public CsrGroupFunctionObjectData getCsrGroupFunctionObjectDataCsrGroupFunctionFromCsrGroupFunctionCreate() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
  public CsrGroupFunctionObjectData getCsrGroupFunctionObjectDataCsrGroupFunctionFromCsrGroupFunctionDelete() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
  public CsrGroupFunctionObjectDataList getCsrGroupFunctionObjectDataCsrGroupFunctionFromCsrGroupFunctionFind() {
    return CsrGroupFunctionObjectHelper.fromMapList(outputMap, "CsrGroupFunctionList");
  }
  public CsrGroupFunctionObjectData getCsrGroupFunctionObjectDataCsrGroupFunctionFromCsrGroupFunctionGet() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
  public CsrGroupFunctionObjectData getCsrGroupFunctionObjectDataCsrGroupFunctionFromCsrGroupFunctionUpdate() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
  /**
   @deprecated
   */
  public void setCsrGroupFunctionObjectFilter(CsrGroupFunctionObjectFilter data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(data, new HashMap()).get("CsrGroupFunctionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrGroupFunctionObjectData(CsrGroupFunctionObjectData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(data, new HashMap()).get("CsrGroupFunctionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrGroupFunctionObjectKeyData(CsrGroupFunctionObjectKeyData data) {
    if (data != null) {
      addInput("CsrGroupFunction", CsrGroupFunctionObjectKeyHelper.toMap(data, new HashMap()).get("CsrGroupFunctionObject"));
    }
  }
  /**
   @deprecated
   */
  public CsrGroupFunctionObjectDataList getCsrGroupFunctionObjectDataList() {
    return CsrGroupFunctionObjectHelper.fromMapList(outputMap, "CsrGroupFunctionList");
  }
  /**
   @deprecated
   */
  public CsrGroupFunctionObjectData getCsrGroupFunctionObjectData() {
    return CsrGroupFunctionObjectHelper.fromMap(outputMap, "CsrGroupFunction");
  }
}
