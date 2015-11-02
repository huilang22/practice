/*
 * Generated code DO NOT EDIT
 * Generated file: BillDispatchMethodRequest.java
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
public final class BillDispatchMethodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillDispatchMethodRequest (String request, BillDispatchMethodRequestMethod method) {
    initialize(request, "BillDispatchMethod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillDispatchMethodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillDispatchMethodForBillDispatchMethodCreate(BillDispatchMethodObjectData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(data, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
  public void setBillDispatchMethodForBillDispatchMethodDelete(BillDispatchMethodObjectKeyData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(data, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
  public void setBillDispatchMethodForBillDispatchMethodFind(BillDispatchMethodObjectFilter data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(data, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
  public void setBillDispatchMethodForBillDispatchMethodGet(BillDispatchMethodObjectKeyData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(data, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
  public void setBillDispatchMethodForBillDispatchMethodUpdate(BillDispatchMethodObjectData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(data, new HashMap(), "BillDispatchMethod").get("BillDispatchMethod"));
    }
  }
  public BillDispatchMethodObjectData getBillDispatchMethodObjectDataBillDispatchMethodFromBillDispatchMethodCreate() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
  public BillDispatchMethodObjectData getBillDispatchMethodObjectDataBillDispatchMethodFromBillDispatchMethodDelete() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
  public BillDispatchMethodObjectDataList getBillDispatchMethodObjectDataBillDispatchMethodFromBillDispatchMethodFind() {
    return BillDispatchMethodObjectHelper.fromMapList(outputMap, "BillDispatchMethodList");
  }
  public BillDispatchMethodObjectData getBillDispatchMethodObjectDataBillDispatchMethodFromBillDispatchMethodGet() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
  public BillDispatchMethodObjectData getBillDispatchMethodObjectDataBillDispatchMethodFromBillDispatchMethodUpdate() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
  /**
   @deprecated
   */
  public void setBillDispatchMethodObjectFilter(BillDispatchMethodObjectFilter data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(data, new HashMap()).get("BillDispatchMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillDispatchMethodObjectData(BillDispatchMethodObjectData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectHelper.toMap(data, new HashMap()).get("BillDispatchMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillDispatchMethodObjectKeyData(BillDispatchMethodObjectKeyData data) {
    if (data != null) {
      addInput("BillDispatchMethod", BillDispatchMethodObjectKeyHelper.toMap(data, new HashMap()).get("BillDispatchMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public BillDispatchMethodObjectDataList getBillDispatchMethodObjectDataList() {
    return BillDispatchMethodObjectHelper.fromMapList(outputMap, "BillDispatchMethodList");
  }
  /**
   @deprecated
   */
  public BillDispatchMethodObjectData getBillDispatchMethodObjectData() {
    return BillDispatchMethodObjectHelper.fromMap(outputMap, "BillDispatchMethod");
  }
}
