/*
 * Generated code DO NOT EDIT
 * Generated file: OwningCostCenterRequest.java
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
public final class OwningCostCenterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OwningCostCenterRequest (String request, OwningCostCenterRequestMethod method) {
    initialize(request, "OwningCostCenter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OwningCostCenterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOwningCostCenterForOwningCostCenterCreate(OwningCostCenterObjectData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(data, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
  public void setOwningCostCenterForOwningCostCenterDelete(OwningCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(data, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
  public void setOwningCostCenterForOwningCostCenterFind(OwningCostCenterObjectFilter data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(data, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
  public void setOwningCostCenterForOwningCostCenterGet(OwningCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(data, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
  public void setOwningCostCenterForOwningCostCenterUpdate(OwningCostCenterObjectData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(data, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
  public OwningCostCenterObjectData getOwningCostCenterObjectDataOwningCostCenterFromOwningCostCenterCreate() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
  public OwningCostCenterObjectData getOwningCostCenterObjectDataOwningCostCenterFromOwningCostCenterDelete() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
  public OwningCostCenterObjectDataList getOwningCostCenterObjectDataOwningCostCenterFromOwningCostCenterFind() {
    return OwningCostCenterObjectHelper.fromMapList(outputMap, "OwningCostCenterList");
  }
  public OwningCostCenterObjectData getOwningCostCenterObjectDataOwningCostCenterFromOwningCostCenterGet() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
  public OwningCostCenterObjectData getOwningCostCenterObjectDataOwningCostCenterFromOwningCostCenterUpdate() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
  /**
   @deprecated
   */
  public void setOwningCostCenterObjectFilter(OwningCostCenterObjectFilter data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(data, new HashMap()).get("OwningCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOwningCostCenterObjectData(OwningCostCenterObjectData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(data, new HashMap()).get("OwningCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOwningCostCenterObjectKeyData(OwningCostCenterObjectKeyData data) {
    if (data != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectKeyHelper.toMap(data, new HashMap()).get("OwningCostCenterObject"));
    }
  }
  /**
   @deprecated
   */
  public OwningCostCenterObjectDataList getOwningCostCenterObjectDataList() {
    return OwningCostCenterObjectHelper.fromMapList(outputMap, "OwningCostCenterList");
  }
  /**
   @deprecated
   */
  public OwningCostCenterObjectData getOwningCostCenterObjectData() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
