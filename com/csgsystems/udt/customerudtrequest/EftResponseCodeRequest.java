/*
 * Generated code DO NOT EDIT
 * Generated file: EftResponseCodeRequest.java
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
public final class EftResponseCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EftResponseCodeRequest (String request, EftResponseCodeRequestMethod method) {
    initialize(request, "EftResponseCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EftResponseCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEftResponseCodeForEftResponseCodeCreate(EftResponseCodeObjectData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(data, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
  public void setEftResponseCodeForEftResponseCodeDelete(EftResponseCodeObjectKeyData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(data, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
  public void setEftResponseCodeForEftResponseCodeFind(EftResponseCodeObjectFilter data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(data, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
  public void setEftResponseCodeForEftResponseCodeGet(EftResponseCodeObjectKeyData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(data, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
  public void setEftResponseCodeForEftResponseCodeUpdate(EftResponseCodeObjectData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(data, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }
  public EftResponseCodeObjectData getEftResponseCodeObjectDataEftResponseCodeFromEftResponseCodeCreate() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
  public EftResponseCodeObjectData getEftResponseCodeObjectDataEftResponseCodeFromEftResponseCodeDelete() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
  public EftResponseCodeObjectDataList getEftResponseCodeObjectDataEftResponseCodeFromEftResponseCodeFind() {
    return EftResponseCodeObjectHelper.fromMapList(outputMap, "EftResponseCodeList");
  }
  public EftResponseCodeObjectData getEftResponseCodeObjectDataEftResponseCodeFromEftResponseCodeGet() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
  public EftResponseCodeObjectData getEftResponseCodeObjectDataEftResponseCodeFromEftResponseCodeUpdate() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
  /**
   @deprecated
   */
  public void setEftResponseCodeObjectFilter(EftResponseCodeObjectFilter data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(data, new HashMap()).get("EftResponseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEftResponseCodeObjectData(EftResponseCodeObjectData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(data, new HashMap()).get("EftResponseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setEftResponseCodeObjectKeyData(EftResponseCodeObjectKeyData data) {
    if (data != null) {
      addInput("EftResponseCode", EftResponseCodeObjectKeyHelper.toMap(data, new HashMap()).get("EftResponseCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public EftResponseCodeObjectDataList getEftResponseCodeObjectDataList() {
    return EftResponseCodeObjectHelper.fromMapList(outputMap, "EftResponseCodeList");
  }
  /**
   @deprecated
   */
  public EftResponseCodeObjectData getEftResponseCodeObjectData() {
    return EftResponseCodeObjectHelper.fromMap(outputMap, "EftResponseCode");
  }
}
