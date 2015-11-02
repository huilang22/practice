/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierRequest.java
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
public final class RbrRateTierRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrRateTierRequest (String request, RbrRateTierRequestMethod method) {
    initialize(request, "RbrRateTier", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrRateTierRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrRateTierForRbrRateTierCreate(RbrRteTierObjectData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(data, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
  public void setRbrRateTierForRbrRateTierDelete(RbrRteTierObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(data, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
  public void setRbrRateTierForRbrRateTierFind(RbrRteTierObjectFilter data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(data, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
  public void setRbrRateTierForRbrRateTierGet(RbrRteTierObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(data, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
  public void setRbrRateTierForRbrRateTierUpdate(RbrRteTierObjectData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(data, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
  public RbrRteTierObjectData getRbrRteTierObjectDataRbrRateTierFromRbrRateTierCreate() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
  public RbrRteTierObjectData getRbrRteTierObjectDataRbrRateTierFromRbrRateTierDelete() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
  public RbrRteTierObjectDataList getRbrRteTierObjectDataRbrRateTierFromRbrRateTierFind() {
    return RbrRteTierObjectHelper.fromMapList(outputMap, "RbrRateTierList");
  }
  public RbrRteTierObjectData getRbrRteTierObjectDataRbrRateTierFromRbrRateTierGet() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
  public RbrRteTierObjectData getRbrRteTierObjectDataRbrRateTierFromRbrRateTierUpdate() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
  /**
   @deprecated
   */
  public void setRbrRteTierObjectFilter(RbrRteTierObjectFilter data) {
    if (data != null) {
      addInput("RbrRteTier", RbrRteTierObjectHelper.toMap(data, new HashMap()).get("RbrRteTierObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRteTierObjectData(RbrRteTierObjectData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(data, new HashMap()).get("RbrRteTierObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrRteTierObjectKeyData(RbrRteTierObjectKeyData data) {
    if (data != null) {
      addInput("RbrRateTier", RbrRteTierObjectKeyHelper.toMap(data, new HashMap()).get("RbrRteTierObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrRteTierObjectDataList getRbrRteTierObjectDataList() {
    return RbrRteTierObjectHelper.fromMapList(outputMap, "RbrRteTierList");
  }
  /**
   @deprecated
   */
  public RbrRteTierObjectData getRbrRteTierObjectData() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
