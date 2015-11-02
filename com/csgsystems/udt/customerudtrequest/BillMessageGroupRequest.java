/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupRequest.java
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
public final class BillMessageGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillMessageGroupRequest (String request, BillMessageGroupRequestMethod method) {
    initialize(request, "BillMessageGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillMessageGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillMessageGroupForBillMessageGroupCreate(BillMessageGroupObjectData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(data, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
  public void setBillMessageGroupForBillMessageGroupDelete(BillMessageGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(data, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
  public void setBillMessageGroupForBillMessageGroupFind(BillMessageGroupObjectFilter data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(data, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
  public void setBillMessageGroupForBillMessageGroupGet(BillMessageGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(data, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
  public void setBillMessageGroupForBillMessageGroupUpdate(BillMessageGroupObjectData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(data, new HashMap(), "BillMessageGroup").get("BillMessageGroup"));
    }
  }
  public BillMessageGroupObjectData getBillMessageGroupObjectDataBillMessageGroupFromBillMessageGroupCreate() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
  public BillMessageGroupObjectData getBillMessageGroupObjectDataBillMessageGroupFromBillMessageGroupDelete() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
  public BillMessageGroupObjectDataList getBillMessageGroupObjectDataBillMessageGroupFromBillMessageGroupFind() {
    return BillMessageGroupObjectHelper.fromMapList(outputMap, "BillMessageGroupList");
  }
  public BillMessageGroupObjectData getBillMessageGroupObjectDataBillMessageGroupFromBillMessageGroupGet() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
  public BillMessageGroupObjectData getBillMessageGroupObjectDataBillMessageGroupFromBillMessageGroupUpdate() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupObjectFilter(BillMessageGroupObjectFilter data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(data, new HashMap()).get("BillMessageGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupObjectData(BillMessageGroupObjectData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectHelper.toMap(data, new HashMap()).get("BillMessageGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupObjectKeyData(BillMessageGroupObjectKeyData data) {
    if (data != null) {
      addInput("BillMessageGroup", BillMessageGroupObjectKeyHelper.toMap(data, new HashMap()).get("BillMessageGroupObject"));
    }
  }
  /**
   @deprecated
   */
  public BillMessageGroupObjectDataList getBillMessageGroupObjectDataList() {
    return BillMessageGroupObjectHelper.fromMapList(outputMap, "BillMessageGroupList");
  }
  /**
   @deprecated
   */
  public BillMessageGroupObjectData getBillMessageGroupObjectData() {
    return BillMessageGroupObjectHelper.fromMap(outputMap, "BillMessageGroup");
  }
}
