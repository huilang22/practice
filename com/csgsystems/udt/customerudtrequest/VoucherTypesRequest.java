/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherTypesRequest.java
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
public final class VoucherTypesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherTypesRequest (String request, VoucherTypesRequestMethod method) {
    initialize(request, "VoucherTypes", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherTypesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherTypesForVoucherTypesCreate(VoucherTypesObjectData data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(data, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
  public void setVoucherTypesForVoucherTypesFind(VoucherTypesObjectFilter data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(data, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
  public void setVoucherTypesForVoucherTypesGet(VoucherTypesObjectKeyData data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectKeyHelper.toMap(data, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
  public void setVoucherTypesForVoucherTypesUpdate(VoucherTypesObjectData data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(data, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }
  public VoucherTypesObjectData getVoucherTypesObjectDataVoucherTypesFromVoucherTypesCreate() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
  public VoucherTypesObjectDataList getVoucherTypesObjectDataVoucherTypesFromVoucherTypesFind() {
    return VoucherTypesObjectHelper.fromMapList(outputMap, "VoucherTypesList");
  }
  public VoucherTypesObjectData getVoucherTypesObjectDataVoucherTypesFromVoucherTypesGet() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
  public VoucherTypesObjectData getVoucherTypesObjectDataVoucherTypesFromVoucherTypesUpdate() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
  /**
   @deprecated
   */
  public void setVoucherTypesObjectFilter(VoucherTypesObjectFilter data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(data, new HashMap()).get("VoucherTypesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherTypesObjectData(VoucherTypesObjectData data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(data, new HashMap()).get("VoucherTypesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherTypesObjectKeyData(VoucherTypesObjectKeyData data) {
    if (data != null) {
      addInput("VoucherTypes", VoucherTypesObjectKeyHelper.toMap(data, new HashMap()).get("VoucherTypesObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherTypesObjectDataList getVoucherTypesObjectDataList() {
    return VoucherTypesObjectHelper.fromMapList(outputMap, "VoucherTypesList");
  }
  /**
   @deprecated
   */
  public VoucherTypesObjectData getVoucherTypesObjectData() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
}
