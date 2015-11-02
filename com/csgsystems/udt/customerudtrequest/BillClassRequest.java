/*
 * Generated code DO NOT EDIT
 * Generated file: BillClassRequest.java
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
public final class BillClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillClassRequest (String request, BillClassRequestMethod method) {
    initialize(request, "BillClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillClassForBillClassCreate(BCObjectData data) {
    if (data != null) {
      addInput("BillClass", BCObjectHelper.toMap(data, new HashMap(), "BillClass").get("BillClass"));
    }
  }
  public void setBillClassForBillClassDelete(BCObjectKeyData data) {
    if (data != null) {
      addInput("BillClass", BCObjectKeyHelper.toMap(data, new HashMap(), "BillClass").get("BillClass"));
    }
  }
  public void setBillClassForBillClassFind(BCObjectFilter data) {
    if (data != null) {
      addInput("BillClass", BCObjectHelper.toMap(data, new HashMap(), "BillClass").get("BillClass"));
    }
  }
  public void setBillClassForBillClassGet(BCObjectKeyData data) {
    if (data != null) {
      addInput("BillClass", BCObjectKeyHelper.toMap(data, new HashMap(), "BillClass").get("BillClass"));
    }
  }
  public void setBillClassForBillClassUpdate(BCObjectData data) {
    if (data != null) {
      addInput("BillClass", BCObjectHelper.toMap(data, new HashMap(), "BillClass").get("BillClass"));
    }
  }
  public BCObjectData getBCObjectDataBillClassFromBillClassCreate() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
  public BCObjectData getBCObjectDataBillClassFromBillClassDelete() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
  public BCObjectDataList getBCObjectDataBillClassFromBillClassFind() {
    return BCObjectHelper.fromMapList(outputMap, "BillClassList");
  }
  public BCObjectData getBCObjectDataBillClassFromBillClassGet() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
  public BCObjectData getBCObjectDataBillClassFromBillClassUpdate() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
  /**
   @deprecated
   */
  public void setBCObjectFilter(BCObjectFilter data) {
    if (data != null) {
      addInput("BC", BCObjectHelper.toMap(data, new HashMap()).get("BCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBCObjectData(BCObjectData data) {
    if (data != null) {
      addInput("BillClass", BCObjectHelper.toMap(data, new HashMap()).get("BCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBCObjectKeyData(BCObjectKeyData data) {
    if (data != null) {
      addInput("BillClass", BCObjectKeyHelper.toMap(data, new HashMap()).get("BCObject"));
    }
  }
  /**
   @deprecated
   */
  public BCObjectDataList getBCObjectDataList() {
    return BCObjectHelper.fromMapList(outputMap, "BCList");
  }
  /**
   @deprecated
   */
  public BCObjectData getBCObjectData() {
    return BCObjectHelper.fromMap(outputMap, "BillClass");
  }
}
