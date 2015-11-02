/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherHistoryRequest.java
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
public final class VoucherHistoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherHistoryRequest (String request, VoucherHistoryRequestMethod method) {
    initialize(request, "VoucherHistory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherHistoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherHistoryForVoucherHistoryFind(VoucherHistoryObjectFilter data) {
    if (data != null) {
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(data, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }
  public void setVoucherHistoryForVoucherHistoryGet(VoucherHistoryObjectKeyData data) {
    if (data != null) {
      addInput("VoucherHistory", VoucherHistoryObjectKeyHelper.toMap(data, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }
  public VoucherHistoryObjectDataList getVoucherHistoryObjectDataVoucherHistoryFromVoucherHistoryFind() {
    return VoucherHistoryObjectHelper.fromMapList(outputMap, "VoucherHistoryList");
  }
  public VoucherHistoryObjectData getVoucherHistoryObjectDataVoucherHistoryFromVoucherHistoryGet() {
    return VoucherHistoryObjectHelper.fromMap(outputMap, "VoucherHistory");
  }
  /**
   @deprecated
   */
  public void setVoucherHistoryObjectFilter(VoucherHistoryObjectFilter data) {
    if (data != null) {
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(data, new HashMap()).get("VoucherHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherHistoryObjectKeyData(VoucherHistoryObjectKeyData data) {
    if (data != null) {
      addInput("VoucherHistory", VoucherHistoryObjectKeyHelper.toMap(data, new HashMap()).get("VoucherHistoryObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherHistoryObjectDataList getVoucherHistoryObjectDataList() {
    return VoucherHistoryObjectHelper.fromMapList(outputMap, "VoucherHistoryList");
  }
  /**
   @deprecated
   */
  public VoucherHistoryObjectData getVoucherHistoryObjectData() {
    return VoucherHistoryObjectHelper.fromMap(outputMap, "VoucherHistory");
  }
}
