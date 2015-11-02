/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoRequest.java
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
public final class VoucherStatusInfoRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherStatusInfoRequest (String request, VoucherStatusInfoRequestMethod method) {
    initialize(request, "VoucherStatusInfo", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherStatusInfoRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherStatusInfoForVoucherStatusInfoActivate(VoucherStatusInfoObjectData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public void setVoucherStatusInfoForVoucherStatusInfoAssign(VoucherStatusInfoObjectData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public void setVoucherStatusInfoForVoucherStatusInfoConsumed(VoucherStatusInfoObjectData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public void setVoucherStatusInfoForVoucherStatusInfoFind(VoucherStatusInfoObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public void setVoucherStatusInfoForVoucherStatusInfoGet(VoucherStatusInfoObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectKeyHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public void setVoucherStatusInfoForVoucherStatusInfoUpdate(VoucherStatusInfoObjectData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoActivate() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoAssign() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoConsumed() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  public VoucherStatusInfoObjectDataList getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoFind() {
    return VoucherStatusInfoObjectHelper.fromMapList(outputMap, "VoucherStatusInfoList");
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoGet() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectDataVoucherStatusInfoFromVoucherStatusInfoUpdate() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
  /**
   @deprecated
   */
  public void setVoucherStatusInfoObjectFilter(VoucherStatusInfoObjectFilter data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap()).get("VoucherStatusInfoObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusInfoObjectData(VoucherStatusInfoObjectData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(data, new HashMap()).get("VoucherStatusInfoObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherStatusInfoObjectKeyData(VoucherStatusInfoObjectKeyData data) {
    if (data != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectKeyHelper.toMap(data, new HashMap()).get("VoucherStatusInfoObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherStatusInfoObjectDataList getVoucherStatusInfoObjectDataList() {
    return VoucherStatusInfoObjectHelper.fromMapList(outputMap, "VoucherStatusInfoList");
  }
  /**
   @deprecated
   */
  public VoucherStatusInfoObjectData getVoucherStatusInfoObjectData() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
