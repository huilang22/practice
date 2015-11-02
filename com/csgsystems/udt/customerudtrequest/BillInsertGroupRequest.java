/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupRequest.java
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
public final class BillInsertGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillInsertGroupRequest (String request, BillInsertGroupRequestMethod method) {
    initialize(request, "BillInsertGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillInsertGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillInsertGroupForBillInsertGroupCreate(BillInsertGroupObjectData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(data, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
  public void setBillInsertGroupForBillInsertGroupDelete(BillInsertGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(data, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
  public void setBillInsertGroupForBillInsertGroupFind(BillInsertGroupObjectFilter data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(data, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
  public void setBillInsertGroupForBillInsertGroupGet(BillInsertGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(data, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
  public void setBillInsertGroupForBillInsertGroupUpdate(BillInsertGroupObjectData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(data, new HashMap(), "BillInsertGroup").get("BillInsertGroup"));
    }
  }
  public BillInsertGroupObjectData getBillInsertGroupObjectDataBillInsertGroupFromBillInsertGroupCreate() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
  public BillInsertGroupObjectData getBillInsertGroupObjectDataBillInsertGroupFromBillInsertGroupDelete() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
  public BillInsertGroupObjectDataList getBillInsertGroupObjectDataBillInsertGroupFromBillInsertGroupFind() {
    return BillInsertGroupObjectHelper.fromMapList(outputMap, "BillInsertGroupList");
  }
  public BillInsertGroupObjectData getBillInsertGroupObjectDataBillInsertGroupFromBillInsertGroupGet() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
  public BillInsertGroupObjectData getBillInsertGroupObjectDataBillInsertGroupFromBillInsertGroupUpdate() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupObjectFilter(BillInsertGroupObjectFilter data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(data, new HashMap()).get("BillInsertGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupObjectData(BillInsertGroupObjectData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectHelper.toMap(data, new HashMap()).get("BillInsertGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupObjectKeyData(BillInsertGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroup", BillInsertGroupObjectKeyHelper.toMap(data, new HashMap()).get("BillInsertGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public BillInsertGroupObjectDataList getBillInsertGroupObjectDataList() {
    return BillInsertGroupObjectHelper.fromMapList(outputMap, "BillInsertGroupList");
  }
  /**
   @deprecated
   */
  public BillInsertGroupObjectData getBillInsertGroupObjectData() {
    return BillInsertGroupObjectHelper.fromMap(outputMap, "BillInsertGroup");
  }
}
