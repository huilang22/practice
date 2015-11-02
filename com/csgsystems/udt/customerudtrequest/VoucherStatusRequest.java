/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusRequest.java
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
public final class VoucherStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherStatusRequest (String request, VoucherStatusRequestMethod method) {
    initialize(request, "VoucherStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherStatusForVoucherStatusCreate(VoucherStatusObjectData data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(data, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
  public void setVoucherStatusForVoucherStatusFind(VoucherStatusObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(data, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
  public void setVoucherStatusForVoucherStatusGet(VoucherStatusObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectKeyHelper.toMap(data, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
  public void setVoucherStatusForVoucherStatusUpdate(VoucherStatusObjectData data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(data, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }
  public VoucherStatusObjectData getVoucherStatusObjectDataVoucherStatusFromVoucherStatusCreate() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
  public VoucherStatusObjectDataList getVoucherStatusObjectDataVoucherStatusFromVoucherStatusFind() {
    return VoucherStatusObjectHelper.fromMapList(outputMap, "VoucherStatusList");
  }
  public VoucherStatusObjectData getVoucherStatusObjectDataVoucherStatusFromVoucherStatusGet() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
  public VoucherStatusObjectData getVoucherStatusObjectDataVoucherStatusFromVoucherStatusUpdate() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
  /**
   @deprecated
   */
  public void setVoucherStatusObjectFilter(VoucherStatusObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(data, new HashMap()).get("VoucherStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusObjectData(VoucherStatusObjectData data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(data, new HashMap()).get("VoucherStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusObjectKeyData(VoucherStatusObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatus", VoucherStatusObjectKeyHelper.toMap(data, new HashMap()).get("VoucherStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherStatusObjectDataList getVoucherStatusObjectDataList() {
    return VoucherStatusObjectHelper.fromMapList(outputMap, "VoucherStatusList");
  }
  /**
   @deprecated
   */
  public VoucherStatusObjectData getVoucherStatusObjectData() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
}
