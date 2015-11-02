/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseRequest.java
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
public final class ClearingHouseRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ClearingHouseRequest (String request, ClearingHouseRequestMethod method) {
    initialize(request, "ClearingHouse", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ClearingHouseRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setClearingHouseForClearingHouseCreate(ClearingHouseObjectData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(data, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
  public void setClearingHouseForClearingHouseDelete(ClearingHouseObjectKeyData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(data, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
  public void setClearingHouseForClearingHouseFind(ClearingHouseObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(data, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
  public void setClearingHouseForClearingHouseGet(ClearingHouseObjectKeyData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(data, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
  public void setClearingHouseForClearingHouseUpdate(ClearingHouseObjectData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(data, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }
  public ClearingHouseObjectData getClearingHouseObjectDataClearingHouseFromClearingHouseCreate() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
  public ClearingHouseObjectData getClearingHouseObjectDataClearingHouseFromClearingHouseDelete() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
  public ClearingHouseObjectDataList getClearingHouseObjectDataClearingHouseFromClearingHouseFind() {
    return ClearingHouseObjectHelper.fromMapList(outputMap, "ClearingHouseList");
  }
  public ClearingHouseObjectData getClearingHouseObjectDataClearingHouseFromClearingHouseGet() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
  public ClearingHouseObjectData getClearingHouseObjectDataClearingHouseFromClearingHouseUpdate() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
  /**
   @deprecated
   */
  public void setClearingHouseObjectFilter(ClearingHouseObjectFilter data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(data, new HashMap()).get("ClearingHouseObject"));
    }
  }
  /**
   @deprecated
   */
  public void setClearingHouseObjectData(ClearingHouseObjectData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(data, new HashMap()).get("ClearingHouseObject"));
    }
  }
  /**
   @deprecated
   */
  public void setClearingHouseObjectKeyData(ClearingHouseObjectKeyData data) {
    if (data != null) {
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(data, new HashMap()).get("ClearingHouseObject"));
    }
  }
  /**
   @deprecated
   */
  public ClearingHouseObjectDataList getClearingHouseObjectDataList() {
    return ClearingHouseObjectHelper.fromMapList(outputMap, "ClearingHouseList");
  }
  /**
   @deprecated
   */
  public ClearingHouseObjectData getClearingHouseObjectData() {
    return ClearingHouseObjectHelper.fromMap(outputMap, "ClearingHouse");
  }
}
