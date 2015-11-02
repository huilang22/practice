/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrRateLimitKeyRequest.java
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
public final class UnitCrRateLimitKeyRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitCrRateLimitKeyRequest (String request, UnitCrRateLimitKeyRequestMethod method) {
    initialize(request, "UnitCrRateLimitKey", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitCrRateLimitKeyRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitCrRateLimitKeyForUnitCrRateLimitKeyCreate(UnitCrRateLimitKeysObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
  public void setUnitCrRateLimitKeyForUnitCrRateLimitKeyDelete(UnitCrRateLimitKeysObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(data, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
  public void setUnitCrRateLimitKeyForUnitCrRateLimitKeyFind(UnitCrRateLimitKeysObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
  public void setUnitCrRateLimitKeyForUnitCrRateLimitKeyGet(UnitCrRateLimitKeysObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(data, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
  public void setUnitCrRateLimitKeyForUnitCrRateLimitKeyUpdate(UnitCrRateLimitKeysObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(data, new HashMap(), "UnitCrRateLimitKey").get("UnitCrRateLimitKey"));
    }
  }
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKeysObjectDataUnitCrRateLimitKeyFromUnitCrRateLimitKeyCreate() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKeysObjectDataUnitCrRateLimitKeyFromUnitCrRateLimitKeyDelete() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
  public UnitCrRateLimitKeysObjectDataList getUnitCrRateLimitKeysObjectDataUnitCrRateLimitKeyFromUnitCrRateLimitKeyFind() {
    return UnitCrRateLimitKeysObjectHelper.fromMapList(outputMap, "UnitCrRateLimitKeyList");
  }
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKeysObjectDataUnitCrRateLimitKeyFromUnitCrRateLimitKeyGet() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKeysObjectDataUnitCrRateLimitKeyFromUnitCrRateLimitKeyUpdate() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitKeysObjectFilter(UnitCrRateLimitKeysObjectFilter data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(data, new HashMap()).get("UnitCrRateLimitKeysObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitKeysObjectData(UnitCrRateLimitKeysObjectData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectHelper.toMap(data, new HashMap()).get("UnitCrRateLimitKeysObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitCrRateLimitKeysObjectKeyData(UnitCrRateLimitKeysObjectKeyData data) {
    if (data != null) {
      addInput("UnitCrRateLimitKey", UnitCrRateLimitKeysObjectKeyHelper.toMap(data, new HashMap()).get("UnitCrRateLimitKeysObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitCrRateLimitKeysObjectDataList getUnitCrRateLimitKeysObjectDataList() {
    return UnitCrRateLimitKeysObjectHelper.fromMapList(outputMap, "UnitCrRateLimitKeyList");
  }
  /**
   @deprecated
   */
  public UnitCrRateLimitKeysObjectData getUnitCrRateLimitKeysObjectData() {
    return UnitCrRateLimitKeysObjectHelper.fromMap(outputMap, "UnitCrRateLimitKey");
  }
}
