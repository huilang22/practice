/*
 * Generated code DO NOT EDIT
 * Generated file: VipCodeRequest.java
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
public final class VipCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VipCodeRequest (String request, VipCodeRequestMethod method) {
    initialize(request, "VipCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VipCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVipCodeForVipCodeCreate(VipCodeObjectData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(data, new HashMap(), "VipCode").get("VipCode"));
    }
  }
  public void setVipCodeForVipCodeDelete(VipCodeObjectKeyData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(data, new HashMap(), "VipCode").get("VipCode"));
    }
  }
  public void setVipCodeForVipCodeFind(VipCodeObjectFilter data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(data, new HashMap(), "VipCode").get("VipCode"));
    }
  }
  public void setVipCodeForVipCodeGet(VipCodeObjectKeyData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(data, new HashMap(), "VipCode").get("VipCode"));
    }
  }
  public void setVipCodeForVipCodeUpdate(VipCodeObjectData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(data, new HashMap(), "VipCode").get("VipCode"));
    }
  }
  public VipCodeObjectData getVipCodeObjectDataVipCodeFromVipCodeCreate() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
  public VipCodeObjectData getVipCodeObjectDataVipCodeFromVipCodeDelete() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
  public VipCodeObjectDataList getVipCodeObjectDataVipCodeFromVipCodeFind() {
    return VipCodeObjectHelper.fromMapList(outputMap, "VipCodeList");
  }
  public VipCodeObjectData getVipCodeObjectDataVipCodeFromVipCodeGet() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
  public VipCodeObjectData getVipCodeObjectDataVipCodeFromVipCodeUpdate() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
  /**
   @deprecated
   */
  public void setVipCodeObjectFilter(VipCodeObjectFilter data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(data, new HashMap()).get("VipCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVipCodeObjectData(VipCodeObjectData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(data, new HashMap()).get("VipCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVipCodeObjectKeyData(VipCodeObjectKeyData data) {
    if (data != null) {
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(data, new HashMap()).get("VipCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public VipCodeObjectDataList getVipCodeObjectDataList() {
    return VipCodeObjectHelper.fromMapList(outputMap, "VipCodeList");
  }
  /**
   @deprecated
   */
  public VipCodeObjectData getVipCodeObjectData() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
