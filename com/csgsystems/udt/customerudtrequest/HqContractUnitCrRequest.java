/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrRequest.java
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
public final class HqContractUnitCrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HqContractUnitCrRequest (String request, HqContractUnitCrRequestMethod method) {
    initialize(request, "HqContractUnitCr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HqContractUnitCrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHqContractUnitCrForHqContractUnitCrCreate(HqContractUnitCrObjectData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(data, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
  public void setHqContractUnitCrForHqContractUnitCrDelete(HqContractUnitCrObjectKeyData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(data, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
  public void setHqContractUnitCrForHqContractUnitCrFind(HqContractUnitCrObjectFilter data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(data, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
  public void setHqContractUnitCrForHqContractUnitCrGet(HqContractUnitCrObjectKeyData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(data, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
  public void setHqContractUnitCrForHqContractUnitCrUpdate(HqContractUnitCrObjectData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(data, new HashMap(), "HqContractUnitCr").get("HqContractUnitCr"));
    }
  }
  public HqContractUnitCrObjectData getHqContractUnitCrObjectDataHqContractUnitCrFromHqContractUnitCrCreate() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
  public HqContractUnitCrObjectData getHqContractUnitCrObjectDataHqContractUnitCrFromHqContractUnitCrDelete() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
  public HqContractUnitCrObjectDataList getHqContractUnitCrObjectDataHqContractUnitCrFromHqContractUnitCrFind() {
    return HqContractUnitCrObjectHelper.fromMapList(outputMap, "HqContractUnitCrList");
  }
  public HqContractUnitCrObjectData getHqContractUnitCrObjectDataHqContractUnitCrFromHqContractUnitCrGet() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
  public HqContractUnitCrObjectData getHqContractUnitCrObjectDataHqContractUnitCrFromHqContractUnitCrUpdate() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
  /**
   @deprecated
   */
  public void setHqContractUnitCrObjectFilter(HqContractUnitCrObjectFilter data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(data, new HashMap()).get("HqContractUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqContractUnitCrObjectData(HqContractUnitCrObjectData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectHelper.toMap(data, new HashMap()).get("HqContractUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHqContractUnitCrObjectKeyData(HqContractUnitCrObjectKeyData data) {
    if (data != null) {
      addInput("HqContractUnitCr", HqContractUnitCrObjectKeyHelper.toMap(data, new HashMap()).get("HqContractUnitCrObject"));
    }
  }
  /**
   @deprecated
   */
  public HqContractUnitCrObjectDataList getHqContractUnitCrObjectDataList() {
    return HqContractUnitCrObjectHelper.fromMapList(outputMap, "HqContractUnitCrList");
  }
  /**
   @deprecated
   */
  public HqContractUnitCrObjectData getHqContractUnitCrObjectData() {
    return HqContractUnitCrObjectHelper.fromMap(outputMap, "HqContractUnitCr");
  }
}
