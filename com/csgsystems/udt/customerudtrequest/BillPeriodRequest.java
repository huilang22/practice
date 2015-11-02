/*
 * Generated code DO NOT EDIT
 * Generated file: BillPeriodRequest.java
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
public final class BillPeriodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillPeriodRequest (String request, BillPeriodRequestMethod method) {
    initialize(request, "BillPeriod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillPeriodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillPeriodForBillPeriodCreate(BPObjectData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(data, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
  public void setBillPeriodForBillPeriodDelete(BPObjectKeyData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectKeyHelper.toMap(data, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
  public void setBillPeriodForBillPeriodFind(BPObjectFilter data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(data, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
  public void setBillPeriodForBillPeriodGet(BPObjectKeyData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectKeyHelper.toMap(data, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
  public void setBillPeriodForBillPeriodUpdate(BPObjectData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(data, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }
  public BPObjectData getBPObjectDataBillPeriodFromBillPeriodCreate() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
  public BPObjectData getBPObjectDataBillPeriodFromBillPeriodDelete() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
  public BPObjectDataList getBPObjectDataBillPeriodFromBillPeriodFind() {
    return BPObjectHelper.fromMapList(outputMap, "BillPeriodList");
  }
  public BPObjectData getBPObjectDataBillPeriodFromBillPeriodGet() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
  public BPObjectData getBPObjectDataBillPeriodFromBillPeriodUpdate() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
  /**
   @deprecated
   */
  public void setBPObjectFilter(BPObjectFilter data) {
    if (data != null) {
      addInput("BP", BPObjectHelper.toMap(data, new HashMap()).get("BPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBPObjectData(BPObjectData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(data, new HashMap()).get("BPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBPObjectKeyData(BPObjectKeyData data) {
    if (data != null) {
      addInput("BillPeriod", BPObjectKeyHelper.toMap(data, new HashMap()).get("BPObject"));
    }
  }
  /**
   @deprecated
   */
  public BPObjectDataList getBPObjectDataList() {
    return BPObjectHelper.fromMapList(outputMap, "BPList");
  }
  /**
   @deprecated
   */
  public BPObjectData getBPObjectData() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
