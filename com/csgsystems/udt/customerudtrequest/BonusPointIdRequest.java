/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointIdRequest.java
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
public final class BonusPointIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BonusPointIdRequest (String request, BonusPointIdRequestMethod method) {
    initialize(request, "BonusPointId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BonusPointIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBonusPointIdForBonusPointIdCreate(BPIObjectData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(data, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
  public void setBonusPointIdForBonusPointIdDelete(BPIObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(data, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
  public void setBonusPointIdForBonusPointIdFind(BPIObjectFilter data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(data, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
  public void setBonusPointIdForBonusPointIdGet(BPIObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(data, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
  public void setBonusPointIdForBonusPointIdUpdate(BPIObjectData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(data, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }
  public BPIObjectData getBPIObjectDataBonusPointIdFromBonusPointIdCreate() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
  public BPIObjectData getBPIObjectDataBonusPointIdFromBonusPointIdDelete() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
  public BPIObjectDataList getBPIObjectDataBonusPointIdFromBonusPointIdFind() {
    return BPIObjectHelper.fromMapList(outputMap, "BonusPointIdList");
  }
  public BPIObjectData getBPIObjectDataBonusPointIdFromBonusPointIdGet() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
  public BPIObjectData getBPIObjectDataBonusPointIdFromBonusPointIdUpdate() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
  /**
   @deprecated
   */
  public void setBPIObjectFilter(BPIObjectFilter data) {
    if (data != null) {
      addInput("BPI", BPIObjectHelper.toMap(data, new HashMap()).get("BPIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBPIObjectData(BPIObjectData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(data, new HashMap()).get("BPIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBPIObjectKeyData(BPIObjectKeyData data) {
    if (data != null) {
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(data, new HashMap()).get("BPIObject"));
    }
  }
  /**
   @deprecated
   */
  public BPIObjectDataList getBPIObjectDataList() {
    return BPIObjectHelper.fromMapList(outputMap, "BPIList");
  }
  /**
   @deprecated
   */
  public BPIObjectData getBPIObjectData() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
