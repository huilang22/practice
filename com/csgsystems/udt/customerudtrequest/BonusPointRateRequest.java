/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateRequest.java
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
public final class BonusPointRateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BonusPointRateRequest (String request, BonusPointRateRequestMethod method) {
    initialize(request, "BonusPointRate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BonusPointRateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBonusPointRateForBonusPointRateCreate(BonusPointRateObjectData data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(data, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }
  public void setBonusPointRateForBonusPointRateFind(BonusPointRateObjectFilter data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(data, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }
  public void setBonusPointRateForBonusPointRateGet(BonusPointRateObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectKeyHelper.toMap(data, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }
  public BonusPointRateObjectData getBonusPointRateObjectDataBonusPointRateFromBonusPointRateCreate() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
  public BonusPointRateObjectDataList getBonusPointRateObjectDataBonusPointRateFromBonusPointRateFind() {
    return BonusPointRateObjectHelper.fromMapList(outputMap, "BonusPointRateList");
  }
  public BonusPointRateObjectData getBonusPointRateObjectDataBonusPointRateFromBonusPointRateGet() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
  /**
   @deprecated
   */
  public void setBonusPointRateObjectFilter(BonusPointRateObjectFilter data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(data, new HashMap()).get("BonusPointRateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBonusPointRateObjectData(BonusPointRateObjectData data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(data, new HashMap()).get("BonusPointRateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBonusPointRateObjectKeyData(BonusPointRateObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointRate", BonusPointRateObjectKeyHelper.toMap(data, new HashMap()).get("BonusPointRateObject"));
    }
  }
  /**
   @deprecated
   */
  public BonusPointRateObjectDataList getBonusPointRateObjectDataList() {
    return BonusPointRateObjectHelper.fromMapList(outputMap, "BonusPointRateList");
  }
  /**
   @deprecated
   */
  public BonusPointRateObjectData getBonusPointRateObjectData() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
}
