/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapRequest.java
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
public final class AbiAutoPayCmfMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AbiAutoPayCmfMapRequest (String request, AbiAutoPayCmfMapRequestMethod method) {
    initialize(request, "AbiAutoPayCmfMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AbiAutoPayCmfMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAbiAutoPayCmfMapForAbiAutoPayCmfMapCreate(AbiAutoPayCmfMapObjectData data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(data, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
  public void setAbiAutoPayCmfMapForAbiAutoPayCmfMapFind(AbiAutoPayCmfMapObjectFilter data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(data, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
  public void setAbiAutoPayCmfMapForAbiAutoPayCmfMapGet(AbiAutoPayCmfMapObjectKeyData data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectKeyHelper.toMap(data, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
  public void setAbiAutoPayCmfMapForAbiAutoPayCmfMapUpdate(AbiAutoPayCmfMapObjectData data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(data, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }
  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMapObjectDataAbiAutoPayCmfMapFromAbiAutoPayCmfMapCreate() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
  public AbiAutoPayCmfMapObjectDataList getAbiAutoPayCmfMapObjectDataAbiAutoPayCmfMapFromAbiAutoPayCmfMapFind() {
    return AbiAutoPayCmfMapObjectHelper.fromMapList(outputMap, "AbiAutoPayCmfMapList");
  }
  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMapObjectDataAbiAutoPayCmfMapFromAbiAutoPayCmfMapGet() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMapObjectDataAbiAutoPayCmfMapFromAbiAutoPayCmfMapUpdate() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
  /**
   @deprecated
   */
  public void setAbiAutoPayCmfMapObjectFilter(AbiAutoPayCmfMapObjectFilter data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(data, new HashMap()).get("AbiAutoPayCmfMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiAutoPayCmfMapObjectData(AbiAutoPayCmfMapObjectData data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(data, new HashMap()).get("AbiAutoPayCmfMapObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAbiAutoPayCmfMapObjectKeyData(AbiAutoPayCmfMapObjectKeyData data) {
    if (data != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectKeyHelper.toMap(data, new HashMap()).get("AbiAutoPayCmfMapObject"));
    }
  }
  /**
   @deprecated
   */
  public AbiAutoPayCmfMapObjectDataList getAbiAutoPayCmfMapObjectDataList() {
    return AbiAutoPayCmfMapObjectHelper.fromMapList(outputMap, "AbiAutoPayCmfMapList");
  }
  /**
   @deprecated
   */
  public AbiAutoPayCmfMapObjectData getAbiAutoPayCmfMapObjectData() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
}
