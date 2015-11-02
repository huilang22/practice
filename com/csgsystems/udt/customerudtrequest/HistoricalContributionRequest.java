/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionRequest.java
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
public final class HistoricalContributionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public HistoricalContributionRequest (String request, HistoricalContributionRequestMethod method) {
    initialize(request, "HistoricalContribution", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (HistoricalContributionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setHistoricalContributionForHistoricalContributionCreate(HistoricalContributionObjectData data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(data, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
  public void setHistoricalContributionForHistoricalContributionFind(HistoricalContributionObjectFilter data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(data, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
  public void setHistoricalContributionForHistoricalContributionGet(HistoricalContributionObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectKeyHelper.toMap(data, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
  public void setHistoricalContributionForHistoricalContributionUpdate(HistoricalContributionObjectData data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(data, new HashMap(), "HistoricalContribution").get("HistoricalContribution"));
    }
  }
  public HistoricalContributionObjectData getHistoricalContributionObjectDataHistoricalContributionFromHistoricalContributionCreate() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
  public HistoricalContributionObjectDataList getHistoricalContributionObjectDataHistoricalContributionFromHistoricalContributionFind() {
    return HistoricalContributionObjectHelper.fromMapList(outputMap, "HistoricalContributionList");
  }
  public HistoricalContributionObjectData getHistoricalContributionObjectDataHistoricalContributionFromHistoricalContributionGet() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
  public HistoricalContributionObjectData getHistoricalContributionObjectDataHistoricalContributionFromHistoricalContributionUpdate() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionObjectFilter(HistoricalContributionObjectFilter data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(data, new HashMap()).get("HistoricalContributionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionObjectData(HistoricalContributionObjectData data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectHelper.toMap(data, new HashMap()).get("HistoricalContributionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setHistoricalContributionObjectKeyData(HistoricalContributionObjectKeyData data) {
    if (data != null) {
      addInput("HistoricalContribution", HistoricalContributionObjectKeyHelper.toMap(data, new HashMap()).get("HistoricalContributionObject"));
    }
  }
  /**
   @deprecated
   */
  public HistoricalContributionObjectDataList getHistoricalContributionObjectDataList() {
    return HistoricalContributionObjectHelper.fromMapList(outputMap, "HistoricalContributionList");
  }
  /**
   @deprecated
   */
  public HistoricalContributionObjectData getHistoricalContributionObjectData() {
    return HistoricalContributionObjectHelper.fromMap(outputMap, "HistoricalContribution");
  }
}
