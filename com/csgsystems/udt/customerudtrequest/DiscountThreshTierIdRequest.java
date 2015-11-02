/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountThreshTierIdRequest.java
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
public final class DiscountThreshTierIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DiscountThreshTierIdRequest (String request, DiscountThreshTierIdRequestMethod method) {
    initialize(request, "DiscountThreshTierId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DiscountThreshTierIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDiscountThreshTierIdForDiscountThreshTierIdCreate(DTTObjectData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(data, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
  public void setDiscountThreshTierIdForDiscountThreshTierIdDelete(DTTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(data, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
  public void setDiscountThreshTierIdForDiscountThreshTierIdFind(DTTObjectFilter data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(data, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
  public void setDiscountThreshTierIdForDiscountThreshTierIdGet(DTTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(data, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
  public void setDiscountThreshTierIdForDiscountThreshTierIdUpdate(DTTObjectData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(data, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
  public DTTObjectData getDTTObjectDataDiscountThreshTierIdFromDiscountThreshTierIdCreate() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
  public DTTObjectData getDTTObjectDataDiscountThreshTierIdFromDiscountThreshTierIdDelete() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
  public DTTObjectDataList getDTTObjectDataDiscountThreshTierIdFromDiscountThreshTierIdFind() {
    return DTTObjectHelper.fromMapList(outputMap, "DiscountThreshTierIdList");
  }
  public DTTObjectData getDTTObjectDataDiscountThreshTierIdFromDiscountThreshTierIdGet() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
  public DTTObjectData getDTTObjectDataDiscountThreshTierIdFromDiscountThreshTierIdUpdate() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
  /**
   @deprecated
   */
  public void setDTTObjectFilter(DTTObjectFilter data) {
    if (data != null) {
      addInput("DTT", DTTObjectHelper.toMap(data, new HashMap()).get("DTTObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDTTObjectData(DTTObjectData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(data, new HashMap()).get("DTTObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDTTObjectKeyData(DTTObjectKeyData data) {
    if (data != null) {
      addInput("DiscountThreshTierId", DTTObjectKeyHelper.toMap(data, new HashMap()).get("DTTObject"));
    }
  }
  /**
   @deprecated
   */
  public DTTObjectDataList getDTTObjectDataList() {
    return DTTObjectHelper.fromMapList(outputMap, "DTTList");
  }
  /**
   @deprecated
   */
  public DTTObjectData getDTTObjectData() {
    return DTTObjectHelper.fromMap(outputMap, "DiscountThreshTierId");
  }
}
