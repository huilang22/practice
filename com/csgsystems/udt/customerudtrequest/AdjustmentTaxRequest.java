/*
 * Generated code DO NOT EDIT
 * Generated file: AdjustmentTaxRequest.java
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
public final class AdjustmentTaxRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjustmentTaxRequest (String request, AdjustmentTaxRequestMethod method) {
    initialize(request, "AdjustmentTax", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjustmentTaxRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdjustmentTaxForAdjustmentTaxFind(AdjustmentTaxObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(data, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }
  public void setAdjustmentTaxForAdjustmentTaxGet(AdjustmentTaxObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectKeyHelper.toMap(data, new HashMap(), "AdjustmentTax").get("AdjustmentTax"));
    }
  }
  public AdjustmentTaxObjectDataList getAdjustmentTaxObjectDataAdjustmentTaxFromAdjustmentTaxFind() {
    return AdjustmentTaxObjectHelper.fromMapList(outputMap, "AdjustmentTaxList");
  }
  public AdjustmentTaxObjectData getAdjustmentTaxObjectDataAdjustmentTaxFromAdjustmentTaxGet() {
    return AdjustmentTaxObjectHelper.fromMap(outputMap, "AdjustmentTax");
  }
  /**
   @deprecated
   */
  public void setAdjustmentTaxObjectFilter(AdjustmentTaxObjectFilter data) {
    if (data != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectHelper.toMap(data, new HashMap()).get("AdjustmentTaxObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAdjustmentTaxObjectKeyData(AdjustmentTaxObjectKeyData data) {
    if (data != null) {
      addInput("AdjustmentTax", AdjustmentTaxObjectKeyHelper.toMap(data, new HashMap()).get("AdjustmentTaxObject"));
    }
  }
  /**
   @deprecated
   */
  public AdjustmentTaxObjectDataList getAdjustmentTaxObjectDataList() {
    return AdjustmentTaxObjectHelper.fromMapList(outputMap, "AdjustmentTaxList");
  }
  /**
   @deprecated
   */
  public AdjustmentTaxObjectData getAdjustmentTaxObjectData() {
    return AdjustmentTaxObjectHelper.fromMap(outputMap, "AdjustmentTax");
  }
}
