/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusMovementRequest.java
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
public final class VoucherStatusMovementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherStatusMovementRequest (String request, VoucherStatusMovementRequestMethod method) {
    initialize(request, "VoucherStatusMovement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherStatusMovementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherStatusMovementForVoucherStatusMovementCreate(VoucherStatusMovementObjectData data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(data, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
  public void setVoucherStatusMovementForVoucherStatusMovementFind(VoucherStatusMovementObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(data, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
  public void setVoucherStatusMovementForVoucherStatusMovementGet(VoucherStatusMovementObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectKeyHelper.toMap(data, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
  public void setVoucherStatusMovementForVoucherStatusMovementUpdate(VoucherStatusMovementObjectData data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(data, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }
  public VoucherStatusMovementObjectData getVoucherStatusMovementObjectDataVoucherStatusMovementFromVoucherStatusMovementCreate() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
  public VoucherStatusMovementObjectDataList getVoucherStatusMovementObjectDataVoucherStatusMovementFromVoucherStatusMovementFind() {
    return VoucherStatusMovementObjectHelper.fromMapList(outputMap, "VoucherStatusMovementList");
  }
  public VoucherStatusMovementObjectData getVoucherStatusMovementObjectDataVoucherStatusMovementFromVoucherStatusMovementGet() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
  public VoucherStatusMovementObjectData getVoucherStatusMovementObjectDataVoucherStatusMovementFromVoucherStatusMovementUpdate() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
  /**
   @deprecated
   */
  public void setVoucherStatusMovementObjectFilter(VoucherStatusMovementObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(data, new HashMap()).get("VoucherStatusMovementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusMovementObjectData(VoucherStatusMovementObjectData data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(data, new HashMap()).get("VoucherStatusMovementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusMovementObjectKeyData(VoucherStatusMovementObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectKeyHelper.toMap(data, new HashMap()).get("VoucherStatusMovementObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherStatusMovementObjectDataList getVoucherStatusMovementObjectDataList() {
    return VoucherStatusMovementObjectHelper.fromMapList(outputMap, "VoucherStatusMovementList");
  }
  /**
   @deprecated
   */
  public VoucherStatusMovementObjectData getVoucherStatusMovementObjectData() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
}
