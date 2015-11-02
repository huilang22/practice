/*
 * Generated code DO NOT EDIT
 * Generated file: LanguageCodeRequest.java
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
public final class LanguageCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LanguageCodeRequest (String request, LanguageCodeRequestMethod method) {
    initialize(request, "LanguageCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LanguageCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLanguageCodeForLanguageCodeCreate(LCObjectData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(data, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
  public void setLanguageCodeForLanguageCodeDelete(LCObjectKeyData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectKeyHelper.toMap(data, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
  public void setLanguageCodeForLanguageCodeFind(LCObjectFilter data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(data, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
  public void setLanguageCodeForLanguageCodeGet(LCObjectKeyData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectKeyHelper.toMap(data, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
  public void setLanguageCodeForLanguageCodeUpdate(LCObjectData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(data, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }
  public LCObjectData getLCObjectDataLanguageCodeFromLanguageCodeCreate() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
  public LCObjectData getLCObjectDataLanguageCodeFromLanguageCodeDelete() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
  public LCObjectDataList getLCObjectDataLanguageCodeFromLanguageCodeFind() {
    return LCObjectHelper.fromMapList(outputMap, "LanguageCodeList");
  }
  public LCObjectData getLCObjectDataLanguageCodeFromLanguageCodeGet() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
  public LCObjectData getLCObjectDataLanguageCodeFromLanguageCodeUpdate() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
  /**
   @deprecated
   */
  public void setLCObjectFilter(LCObjectFilter data) {
    if (data != null) {
      addInput("LC", LCObjectHelper.toMap(data, new HashMap()).get("LCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLCObjectData(LCObjectData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(data, new HashMap()).get("LCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLCObjectKeyData(LCObjectKeyData data) {
    if (data != null) {
      addInput("LanguageCode", LCObjectKeyHelper.toMap(data, new HashMap()).get("LCObject"));
    }
  }
  /**
   @deprecated
   */
  public LCObjectDataList getLCObjectDataList() {
    return LCObjectHelper.fromMapList(outputMap, "LCList");
  }
  /**
   @deprecated
   */
  public LCObjectData getLCObjectData() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
