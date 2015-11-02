/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimePeriodRequest.java
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
public final class RbrTimePeriodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrTimePeriodRequest (String request, RbrTimePeriodRequestMethod method) {
    initialize(request, "RbrTimePeriod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrTimePeriodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrTimePeriodForRbrTimePeriodCreate(RbrTimePeriodObjectData data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(data, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
  public void setRbrTimePeriodForRbrTimePeriodFind(RbrTimePeriodObjectFilter data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(data, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
  public void setRbrTimePeriodForRbrTimePeriodGet(RbrTimePeriodObjectKeyData data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectKeyHelper.toMap(data, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
  public void setRbrTimePeriodForRbrTimePeriodUpdate(RbrTimePeriodObjectData data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(data, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
  public RbrTimePeriodObjectData getRbrTimePeriodObjectDataRbrTimePeriodFromRbrTimePeriodCreate() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
  public RbrTimePeriodObjectDataList getRbrTimePeriodObjectDataRbrTimePeriodFromRbrTimePeriodFind() {
    return RbrTimePeriodObjectHelper.fromMapList(outputMap, "RbrTimePeriodList");
  }
  public RbrTimePeriodObjectData getRbrTimePeriodObjectDataRbrTimePeriodFromRbrTimePeriodGet() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
  public RbrTimePeriodObjectData getRbrTimePeriodObjectDataRbrTimePeriodFromRbrTimePeriodUpdate() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
  /**
   @deprecated
   */
  public void setRbrTimePeriodObjectFilter(RbrTimePeriodObjectFilter data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(data, new HashMap()).get("RbrTimePeriodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrTimePeriodObjectData(RbrTimePeriodObjectData data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(data, new HashMap()).get("RbrTimePeriodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrTimePeriodObjectKeyData(RbrTimePeriodObjectKeyData data) {
    if (data != null) {
      addInput("RbrTimePeriod", RbrTimePeriodObjectKeyHelper.toMap(data, new HashMap()).get("RbrTimePeriodObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrTimePeriodObjectDataList getRbrTimePeriodObjectDataList() {
    return RbrTimePeriodObjectHelper.fromMapList(outputMap, "RbrTimePeriodList");
  }
  /**
   @deprecated
   */
  public RbrTimePeriodObjectData getRbrTimePeriodObjectData() {
    return RbrTimePeriodObjectHelper.fromMap(outputMap, "RbrTimePeriod");
  }
}
