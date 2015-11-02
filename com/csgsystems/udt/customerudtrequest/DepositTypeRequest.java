/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeRequest.java
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
public final class DepositTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DepositTypeRequest (String request, DepositTypeRequestMethod method) {
    initialize(request, "DepositType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DepositTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDepositTypeForDepositTypeCreate(DepositTypeObjectData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(data, new HashMap(), "DepositType").get("DepositType"));
    }
  }
  public void setDepositTypeForDepositTypeDelete(DepositTypeObjectKeyData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(data, new HashMap(), "DepositType").get("DepositType"));
    }
  }
  public void setDepositTypeForDepositTypeFind(DepositTypeObjectFilter data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(data, new HashMap(), "DepositType").get("DepositType"));
    }
  }
  public void setDepositTypeForDepositTypeGet(DepositTypeObjectKeyData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(data, new HashMap(), "DepositType").get("DepositType"));
    }
  }
  public void setDepositTypeForDepositTypeUpdate(DepositTypeObjectData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(data, new HashMap(), "DepositType").get("DepositType"));
    }
  }
  public DepositTypeObjectData getDepositTypeObjectDataDepositTypeFromDepositTypeCreate() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
  public DepositTypeObjectData getDepositTypeObjectDataDepositTypeFromDepositTypeDelete() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
  public DepositTypeObjectDataList getDepositTypeObjectDataDepositTypeFromDepositTypeFind() {
    return DepositTypeObjectHelper.fromMapList(outputMap, "DepositTypeList");
  }
  public DepositTypeObjectData getDepositTypeObjectDataDepositTypeFromDepositTypeGet() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
  public DepositTypeObjectData getDepositTypeObjectDataDepositTypeFromDepositTypeUpdate() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
  /**
   @deprecated
   */
  public void setDepositTypeObjectFilter(DepositTypeObjectFilter data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(data, new HashMap()).get("DepositTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepositTypeObjectData(DepositTypeObjectData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectHelper.toMap(data, new HashMap()).get("DepositTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepositTypeObjectKeyData(DepositTypeObjectKeyData data) {
    if (data != null) {
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(data, new HashMap()).get("DepositTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public DepositTypeObjectDataList getDepositTypeObjectDataList() {
    return DepositTypeObjectHelper.fromMapList(outputMap, "DepositTypeList");
  }
  /**
   @deprecated
   */
  public DepositTypeObjectData getDepositTypeObjectData() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
