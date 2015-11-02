/*
 * Generated code DO NOT EDIT
 * Generated file: BillMessageGroupMapRequest.java
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
public final class BillMessageGroupMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillMessageGroupMapRequest (String request, BillMessageGroupMapRequestMethod method) {
    initialize(request, "BillMessageGroupMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillMessageGroupMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillMessageGroupMapForBillMessageGroupMapCreate(BillMessageGroupMapObjectData data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(data, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }
  public void setBillMessageGroupMapForBillMessageGroupMapFind(BillMessageGroupMapObjectFilter data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(data, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }
  public void setBillMessageGroupMapForBillMessageGroupMapGet(BillMessageGroupMapObjectKeyData data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectKeyHelper.toMap(data, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }
  public BillMessageGroupMapObjectData getBillMessageGroupMapObjectDataBillMessageGroupMapFromBillMessageGroupMapCreate() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
  public BillMessageGroupMapObjectDataList getBillMessageGroupMapObjectDataBillMessageGroupMapFromBillMessageGroupMapFind() {
    return BillMessageGroupMapObjectHelper.fromMapList(outputMap, "BillMessageGroupMapList");
  }
  public BillMessageGroupMapObjectData getBillMessageGroupMapObjectDataBillMessageGroupMapFromBillMessageGroupMapGet() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupMapObjectFilter(BillMessageGroupMapObjectFilter data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(data, new HashMap()).get("BillMessageGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupMapObjectData(BillMessageGroupMapObjectData data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(data, new HashMap()).get("BillMessageGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillMessageGroupMapObjectKeyData(BillMessageGroupMapObjectKeyData data) {
    if (data != null) {
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectKeyHelper.toMap(data, new HashMap()).get("BillMessageGroupMapObject"));
    }
  }
  /**
   @deprecated
   */
  public BillMessageGroupMapObjectDataList getBillMessageGroupMapObjectDataList() {
    return BillMessageGroupMapObjectHelper.fromMapList(outputMap, "BillMessageGroupMapList");
  }
  /**
   @deprecated
   */
  public BillMessageGroupMapObjectData getBillMessageGroupMapObjectData() {
    return BillMessageGroupMapObjectHelper.fromMap(outputMap, "BillMessageGroupMap");
  }
}
