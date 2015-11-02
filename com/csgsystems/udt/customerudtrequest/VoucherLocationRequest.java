/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherLocationRequest.java
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
public final class VoucherLocationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public VoucherLocationRequest (String request, VoucherLocationRequestMethod method) {
    initialize(request, "VoucherLocation", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (VoucherLocationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setVoucherLocationForVoucherLocationCreate(VoucherLocationObjectData data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(data, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
  public void setVoucherLocationForVoucherLocationFind(VoucherLocationObjectFilter data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(data, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
  public void setVoucherLocationForVoucherLocationGet(VoucherLocationObjectKeyData data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectKeyHelper.toMap(data, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
  public void setVoucherLocationForVoucherLocationUpdate(VoucherLocationObjectData data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(data, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }
  public VoucherLocationObjectData getVoucherLocationObjectDataVoucherLocationFromVoucherLocationCreate() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
  public VoucherLocationObjectDataList getVoucherLocationObjectDataVoucherLocationFromVoucherLocationFind() {
    return VoucherLocationObjectHelper.fromMapList(outputMap, "VoucherLocationList");
  }
  public VoucherLocationObjectData getVoucherLocationObjectDataVoucherLocationFromVoucherLocationGet() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
  public VoucherLocationObjectData getVoucherLocationObjectDataVoucherLocationFromVoucherLocationUpdate() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
  /**
   @deprecated
   */
  public void setVoucherLocationObjectFilter(VoucherLocationObjectFilter data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(data, new HashMap()).get("VoucherLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherLocationObjectData(VoucherLocationObjectData data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(data, new HashMap()).get("VoucherLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVoucherLocationObjectKeyData(VoucherLocationObjectKeyData data) {
    if (data != null) {
      addInput("VoucherLocation", VoucherLocationObjectKeyHelper.toMap(data, new HashMap()).get("VoucherLocationObject"));
    }
  }
  /**
   @deprecated
   */
  public VoucherLocationObjectDataList getVoucherLocationObjectDataList() {
    return VoucherLocationObjectHelper.fromMapList(outputMap, "VoucherLocationList");
  }
  /**
   @deprecated
   */
  public VoucherLocationObjectData getVoucherLocationObjectData() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
}
