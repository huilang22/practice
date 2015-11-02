/*
 * Generated code DO NOT EDIT
 * Generated file: BillCycleRequest.java
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
public final class BillCycleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillCycleRequest (String request, BillCycleRequestMethod method) {
    initialize(request, "BillCycle", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillCycleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillCycleForBillCycleFind(BillCycleObjectFilter data) {
    if (data != null) {
      addInput("BillCycle", BillCycleObjectHelper.toMap(data, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }
  public void setBillCycleForBillCycleGet(BillCycleObjectKeyData data) {
    if (data != null) {
      addInput("BillCycle", BillCycleObjectKeyHelper.toMap(data, new HashMap(), "BillCycle").get("BillCycle"));
    }
  }
  public BillCycleObjectDataList getBillCycleObjectDataBillCycleFromBillCycleFind() {
    return BillCycleObjectHelper.fromMapList(outputMap, "BillCycleList");
  }
  public BillCycleObjectData getBillCycleObjectDataBillCycleFromBillCycleGet() {
    return BillCycleObjectHelper.fromMap(outputMap, "BillCycle");
  }
  /**
   @deprecated
   */
  public void setBillCycleObjectFilter(BillCycleObjectFilter data) {
    if (data != null) {
      addInput("BillCycle", BillCycleObjectHelper.toMap(data, new HashMap()).get("BillCycleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillCycleObjectKeyData(BillCycleObjectKeyData data) {
    if (data != null) {
      addInput("BillCycle", BillCycleObjectKeyHelper.toMap(data, new HashMap()).get("BillCycleObject"));
    }
  }
  /**
   @deprecated
   */
  public BillCycleObjectDataList getBillCycleObjectDataList() {
    return BillCycleObjectHelper.fromMapList(outputMap, "BillCycleList");
  }
  /**
   @deprecated
   */
  public BillCycleObjectData getBillCycleObjectData() {
    return BillCycleObjectHelper.fromMap(outputMap, "BillCycle");
  }
}
