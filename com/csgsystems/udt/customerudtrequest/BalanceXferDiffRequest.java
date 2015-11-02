/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceXferDiffRequest.java
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
public final class BalanceXferDiffRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BalanceXferDiffRequest (String request, BalanceXferDiffRequestMethod method) {
    initialize(request, "BalanceXferDiff", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BalanceXferDiffRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBalanceXferDiffForBalanceXferDiffCreate(BXDObjectData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(data, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
  public void setBalanceXferDiffForBalanceXferDiffDelete(BXDObjectKeyData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(data, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
  public void setBalanceXferDiffForBalanceXferDiffFind(BXDObjectFilter data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(data, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
  public void setBalanceXferDiffForBalanceXferDiffGet(BXDObjectKeyData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(data, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
  public void setBalanceXferDiffForBalanceXferDiffUpdate(BXDObjectData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(data, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
  public BXDObjectData getBXDObjectDataBalanceXferDiffFromBalanceXferDiffCreate() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
  public BXDObjectData getBXDObjectDataBalanceXferDiffFromBalanceXferDiffDelete() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
  public BXDObjectDataList getBXDObjectDataBalanceXferDiffFromBalanceXferDiffFind() {
    return BXDObjectHelper.fromMapList(outputMap, "BalanceXferDiffList");
  }
  public BXDObjectData getBXDObjectDataBalanceXferDiffFromBalanceXferDiffGet() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
  public BXDObjectData getBXDObjectDataBalanceXferDiffFromBalanceXferDiffUpdate() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
  /**
   @deprecated
   */
  public void setBXDObjectFilter(BXDObjectFilter data) {
    if (data != null) {
      addInput("BXD", BXDObjectHelper.toMap(data, new HashMap()).get("BXDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBXDObjectData(BXDObjectData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(data, new HashMap()).get("BXDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBXDObjectKeyData(BXDObjectKeyData data) {
    if (data != null) {
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(data, new HashMap()).get("BXDObject"));
    }
  }
  /**
   @deprecated
   */
  public BXDObjectDataList getBXDObjectDataList() {
    return BXDObjectHelper.fromMapList(outputMap, "BXDList");
  }
  /**
   @deprecated
   */
  public BXDObjectData getBXDObjectData() {
    return BXDObjectHelper.fromMap(outputMap, "BalanceXferDiff");
  }
}
