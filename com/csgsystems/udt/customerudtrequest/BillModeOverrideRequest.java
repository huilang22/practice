/*
 * Generated code DO NOT EDIT
 * Generated file: BillModeOverrideRequest.java
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
public final class BillModeOverrideRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillModeOverrideRequest (String request, BillModeOverrideRequestMethod method) {
    initialize(request, "BillModeOverride", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillModeOverrideRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBillModeOverrideForBillModeOverrideCreate(BMOObjectData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(data, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
  public void setBillModeOverrideForBillModeOverrideDelete(BMOObjectKeyData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(data, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
  public void setBillModeOverrideForBillModeOverrideFind(BMOObjectFilter data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(data, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
  public void setBillModeOverrideForBillModeOverrideGet(BMOObjectKeyData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(data, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
  public void setBillModeOverrideForBillModeOverrideUpdate(BMOObjectData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(data, new HashMap(), "BillModeOverride").get("BillModeOverride"));
    }
  }
  public BMOObjectData getBMOObjectDataBillModeOverrideFromBillModeOverrideCreate() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
  public BMOObjectData getBMOObjectDataBillModeOverrideFromBillModeOverrideDelete() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
  public BMOObjectDataList getBMOObjectDataBillModeOverrideFromBillModeOverrideFind() {
    return BMOObjectHelper.fromMapList(outputMap, "BillModeOverrideList");
  }
  public BMOObjectData getBMOObjectDataBillModeOverrideFromBillModeOverrideGet() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
  public BMOObjectData getBMOObjectDataBillModeOverrideFromBillModeOverrideUpdate() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
  /**
   @deprecated
   */
  public void setBMOObjectFilter(BMOObjectFilter data) {
    if (data != null) {
      addInput("BMO", BMOObjectHelper.toMap(data, new HashMap()).get("BMOObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBMOObjectData(BMOObjectData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectHelper.toMap(data, new HashMap()).get("BMOObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBMOObjectKeyData(BMOObjectKeyData data) {
    if (data != null) {
      addInput("BillModeOverride", BMOObjectKeyHelper.toMap(data, new HashMap()).get("BMOObject"));
    }
  }
  /**
   @deprecated
   */
  public BMOObjectDataList getBMOObjectDataList() {
    return BMOObjectHelper.fromMapList(outputMap, "BMOList");
  }
  /**
   @deprecated
   */
  public BMOObjectData getBMOObjectData() {
    return BMOObjectHelper.fromMap(outputMap, "BillModeOverride");
  }
}
