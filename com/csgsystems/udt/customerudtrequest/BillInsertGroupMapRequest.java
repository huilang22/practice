/*
 * Generated code DO NOT EDIT
 * Generated file: BillInsertGroupMapRequest.java
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
public final class BillInsertGroupMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillInsertGroupMapRequest (String request, BillInsertGroupMapRequestMethod method) {
    initialize(request, "BillInsertGroupMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillInsertGroupMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillInsertGroupMapForBillInsertGroupMapCreate(BillInsertGroupMapObjectData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(data, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
  public void setBillInsertGroupMapForBillInsertGroupMapDelete(BillInsertGroupMapObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(data, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
  public void setBillInsertGroupMapForBillInsertGroupMapFind(BillInsertGroupMapObjectFilter data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(data, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
  public void setBillInsertGroupMapForBillInsertGroupMapGet(BillInsertGroupMapObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(data, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
  public void setBillInsertGroupMapForBillInsertGroupMapUpdate(BillInsertGroupMapObjectData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(data, new HashMap(), "BillInsertGroupMap").get("BillInsertGroupMap"));
    }
  }
  public BillInsertGroupMapObjectData getBillInsertGroupMapObjectDataBillInsertGroupMapFromBillInsertGroupMapCreate() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
  public BillInsertGroupMapObjectData getBillInsertGroupMapObjectDataBillInsertGroupMapFromBillInsertGroupMapDelete() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
  public BillInsertGroupMapObjectDataList getBillInsertGroupMapObjectDataBillInsertGroupMapFromBillInsertGroupMapFind() {
    return BillInsertGroupMapObjectHelper.fromMapList(outputMap, "BillInsertGroupMapList");
  }
  public BillInsertGroupMapObjectData getBillInsertGroupMapObjectDataBillInsertGroupMapFromBillInsertGroupMapGet() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
  public BillInsertGroupMapObjectData getBillInsertGroupMapObjectDataBillInsertGroupMapFromBillInsertGroupMapUpdate() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupMapObjectFilter(BillInsertGroupMapObjectFilter data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(data, new HashMap()).get("BillInsertGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupMapObjectData(BillInsertGroupMapObjectData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectHelper.toMap(data, new HashMap()).get("BillInsertGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillInsertGroupMapObjectKeyData(BillInsertGroupMapObjectKeyData data) {
    if (data != null) {
      addInput("BillInsertGroupMap", BillInsertGroupMapObjectKeyHelper.toMap(data, new HashMap()).get("BillInsertGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public BillInsertGroupMapObjectDataList getBillInsertGroupMapObjectDataList() {
    return BillInsertGroupMapObjectHelper.fromMapList(outputMap, "BillInsertGroupMapList");
  }
  /**
   @deprecated
   */
  public BillInsertGroupMapObjectData getBillInsertGroupMapObjectData() {
    return BillInsertGroupMapObjectHelper.fromMap(outputMap, "BillInsertGroupMap");
  }
}
