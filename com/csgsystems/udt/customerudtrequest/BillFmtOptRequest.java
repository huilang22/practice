/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptRequest.java
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
public final class BillFmtOptRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillFmtOptRequest (String request, BillFmtOptRequestMethod method) {
    initialize(request, "BillFmtOpt", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillFmtOptRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillFmtOptForBillFmtOptCreate(BllFmtOptObjectData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(data, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
  public void setBillFmtOptForBillFmtOptDelete(BllFmtOptObjectKeyData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(data, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
  public void setBillFmtOptForBillFmtOptFind(BllFmtOptObjectFilter data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(data, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
  public void setBillFmtOptForBillFmtOptGet(BllFmtOptObjectKeyData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(data, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
  public void setBillFmtOptForBillFmtOptUpdate(BllFmtOptObjectData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(data, new HashMap(), "BillFmtOpt").get("BillFmtOpt"));
    }
  }
  public BllFmtOptObjectData getBllFmtOptObjectDataBillFmtOptFromBillFmtOptCreate() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
  public BllFmtOptObjectData getBllFmtOptObjectDataBillFmtOptFromBillFmtOptDelete() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
  public BllFmtOptObjectDataList getBllFmtOptObjectDataBillFmtOptFromBillFmtOptFind() {
    return BllFmtOptObjectHelper.fromMapList(outputMap, "BillFmtOptList");
  }
  public BllFmtOptObjectData getBllFmtOptObjectDataBillFmtOptFromBillFmtOptGet() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
  public BllFmtOptObjectData getBllFmtOptObjectDataBillFmtOptFromBillFmtOptUpdate() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
  /**
   @deprecated
   */
  public void setBllFmtOptObjectFilter(BllFmtOptObjectFilter data) {
    if (data != null) {
      addInput("BllFmtOpt", BllFmtOptObjectHelper.toMap(data, new HashMap()).get("BllFmtOptObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBllFmtOptObjectData(BllFmtOptObjectData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectHelper.toMap(data, new HashMap()).get("BllFmtOptObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBllFmtOptObjectKeyData(BllFmtOptObjectKeyData data) {
    if (data != null) {
      addInput("BillFmtOpt", BllFmtOptObjectKeyHelper.toMap(data, new HashMap()).get("BllFmtOptObject"));
    }
  }
  /**
   @deprecated
   */
  public BllFmtOptObjectDataList getBllFmtOptObjectDataList() {
    return BllFmtOptObjectHelper.fromMapList(outputMap, "BllFmtOptList");
  }
  /**
   @deprecated
   */
  public BllFmtOptObjectData getBllFmtOptObjectData() {
    return BllFmtOptObjectHelper.fromMap(outputMap, "BillFmtOpt");
  }
}
