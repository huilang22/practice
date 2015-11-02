/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointTransTypeRequest.java
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
public final class BonusPointTransTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BonusPointTransTypeRequest (String request, BonusPointTransTypeRequestMethod method) {
    initialize(request, "BonusPointTransType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BonusPointTransTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBonusPointTransTypeForBonusPointTransTypeCreate(BonusPointTransTypeObjectData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(data, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
  public void setBonusPointTransTypeForBonusPointTransTypeDelete(BonusPointTransTypeObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(data, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
  public void setBonusPointTransTypeForBonusPointTransTypeFind(BonusPointTransTypeObjectFilter data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(data, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
  public void setBonusPointTransTypeForBonusPointTransTypeGet(BonusPointTransTypeObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(data, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
  public void setBonusPointTransTypeForBonusPointTransTypeUpdate(BonusPointTransTypeObjectData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(data, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }
  public BonusPointTransTypeObjectData getBonusPointTransTypeObjectDataBonusPointTransTypeFromBonusPointTransTypeCreate() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
  public BonusPointTransTypeObjectData getBonusPointTransTypeObjectDataBonusPointTransTypeFromBonusPointTransTypeDelete() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
  public BonusPointTransTypeObjectDataList getBonusPointTransTypeObjectDataBonusPointTransTypeFromBonusPointTransTypeFind() {
    return BonusPointTransTypeObjectHelper.fromMapList(outputMap, "BonusPointTransTypeList");
  }
  public BonusPointTransTypeObjectData getBonusPointTransTypeObjectDataBonusPointTransTypeFromBonusPointTransTypeGet() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
  public BonusPointTransTypeObjectData getBonusPointTransTypeObjectDataBonusPointTransTypeFromBonusPointTransTypeUpdate() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
  /**
   @deprecated
   */
  public void setBonusPointTransTypeObjectFilter(BonusPointTransTypeObjectFilter data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(data, new HashMap()).get("BonusPointTransTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBonusPointTransTypeObjectData(BonusPointTransTypeObjectData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(data, new HashMap()).get("BonusPointTransTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBonusPointTransTypeObjectKeyData(BonusPointTransTypeObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(data, new HashMap()).get("BonusPointTransTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public BonusPointTransTypeObjectDataList getBonusPointTransTypeObjectDataList() {
    return BonusPointTransTypeObjectHelper.fromMapList(outputMap, "BonusPointTransTypeList");
  }
  /**
   @deprecated
   */
  public BonusPointTransTypeObjectData getBonusPointTransTypeObjectData() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
