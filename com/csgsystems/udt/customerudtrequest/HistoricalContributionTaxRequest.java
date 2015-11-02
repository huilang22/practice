/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionTaxRequest.java
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
public final class HistoricalContributionTaxRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HistoricalContributionTaxRequest (String request, HistoricalContributionTaxRequestMethod method) {
    initialize(request, "HistoricalContributionTax", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HistoricalContributionTaxRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHistoricalContributionTaxForHistoricalContributionTaxCreate(HistoricalContributionTaxObjectData data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(data, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
  public void setHistoricalContributionTaxForHistoricalContributionTaxFind(HistoricalContributionTaxObjectFilter data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(data, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
  public void setHistoricalContributionTaxForHistoricalContributionTaxGet(HistoricalContributionTaxObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectKeyHelper.toMap(data, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
  public void setHistoricalContributionTaxForHistoricalContributionTaxUpdate(HistoricalContributionTaxObjectData data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(data, new HashMap(), "HistoricalContributionTax").get("HistoricalContributionTax"));
    }
  }
  public HistoricalContributionTaxObjectData getHistoricalContributionTaxObjectDataHistoricalContributionTaxFromHistoricalContributionTaxCreate() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
  public HistoricalContributionTaxObjectDataList getHistoricalContributionTaxObjectDataHistoricalContributionTaxFromHistoricalContributionTaxFind() {
    return HistoricalContributionTaxObjectHelper.fromMapList(outputMap, "HistoricalContributionTaxList");
  }
  public HistoricalContributionTaxObjectData getHistoricalContributionTaxObjectDataHistoricalContributionTaxFromHistoricalContributionTaxGet() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
  public HistoricalContributionTaxObjectData getHistoricalContributionTaxObjectDataHistoricalContributionTaxFromHistoricalContributionTaxUpdate() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionTaxObjectFilter(HistoricalContributionTaxObjectFilter data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(data, new HashMap()).get("HistoricalContributionTaxObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionTaxObjectData(HistoricalContributionTaxObjectData data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectHelper.toMap(data, new HashMap()).get("HistoricalContributionTaxObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionTaxObjectKeyData(HistoricalContributionTaxObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalContributionTax", HistoricalContributionTaxObjectKeyHelper.toMap(data, new HashMap()).get("HistoricalContributionTaxObject"));
    }
  }
  /**
   @deprecated
   */
  public HistoricalContributionTaxObjectDataList getHistoricalContributionTaxObjectDataList() {
    return HistoricalContributionTaxObjectHelper.fromMapList(outputMap, "HistoricalContributionTaxList");
  }
  /**
   @deprecated
   */
  public HistoricalContributionTaxObjectData getHistoricalContributionTaxObjectData() {
    return HistoricalContributionTaxObjectHelper.fromMap(outputMap, "HistoricalContributionTax");
  }
}
