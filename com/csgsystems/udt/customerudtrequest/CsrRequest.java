/*
 * Generated code DO NOT EDIT
 * Generated file: CsrRequest.java
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
public final class CsrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CsrRequest (String request, CsrRequestMethod method) {
    initialize(request, "Csr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CsrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCsrForCsrFind(CsrObjectFilter data) {
    if (data != null) {
      addInput("Csr", CsrObjectHelper.toMap(data, new HashMap(), "Csr").get("Csr"));
    }
  }
  public void setCsrForCsrGet(CsrObjectKeyData data) {
    if (data != null) {
      addInput("Csr", CsrObjectKeyHelper.toMap(data, new HashMap(), "Csr").get("Csr"));
    }
  }
  public void setUserNameForCsrGroup(String data) {
    if (data != null) {
      addInput("UserName", data);
    }
  }
  public CsrObjectDataList getCsrObjectDataCsrFromCsrFind() {
    return CsrObjectHelper.fromMapList(outputMap, "CsrList");
  }
  public CsrObjectData getCsrObjectDataCsrFromCsrGet() {
    return CsrObjectHelper.fromMap(outputMap, "Csr");
  }
  public CsrGroupOutputData getCsrGroupOutputDataCsrGroupOutputDataFromCsrGroup() {
    return CsrGroupOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public CsrGroupOutputData getCsrGroupOutputData() {
    return CsrGroupOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setCsrObjectFilter(CsrObjectFilter data) {
    if (data != null) {
      addInput("Csr", CsrObjectHelper.toMap(data, new HashMap()).get("CsrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCsrObjectKeyData(CsrObjectKeyData data) {
    if (data != null) {
      addInput("Csr", CsrObjectKeyHelper.toMap(data, new HashMap()).get("CsrObject"));
    }
  }
  /**
   @deprecated
   */
  public CsrObjectDataList getCsrObjectDataList() {
    return CsrObjectHelper.fromMapList(outputMap, "CsrList");
  }
  /**
   @deprecated
   */
  public CsrObjectData getCsrObjectData() {
    return CsrObjectHelper.fromMap(outputMap, "Csr");
  }
  /**
   @deprecated
   */
  public void setUserName(String data) {
    if (data != null) {
      addInput("UserName", data);
    }
  }
}
