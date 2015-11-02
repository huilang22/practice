/*
 * Generated code DO NOT EDIT
 * Generated file: RatePeriodDistinctRequest.java
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
public final class RatePeriodDistinctRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RatePeriodDistinctRequest (String request, RatePeriodDistinctRequestMethod method) {
    initialize(request, "RatePeriodDistinct", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RatePeriodDistinctRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRatePeriodDistinctForRatePeriodDistinctFind(RatePeriodDistinctObjectFilter data) {
    if (data != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(data, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }
  public void setRatePeriodDistinctForRatePeriodDistinctGet(RatePeriodDistinctObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectKeyHelper.toMap(data, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }
  public RatePeriodDistinctObjectDataList getRatePeriodDistinctObjectDataRatePeriodDistinctFromRatePeriodDistinctFind() {
    return RatePeriodDistinctObjectHelper.fromMapList(outputMap, "RatePeriodDistinctList");
  }
  public RatePeriodDistinctObjectData getRatePeriodDistinctObjectDataRatePeriodDistinctFromRatePeriodDistinctGet() {
    return RatePeriodDistinctObjectHelper.fromMap(outputMap, "RatePeriodDistinct");
  }
  /**
   @deprecated
   */
  public void setRatePeriodDistinctObjectFilter(RatePeriodDistinctObjectFilter data) {
    if (data != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(data, new HashMap()).get("RatePeriodDistinctObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRatePeriodDistinctObjectKeyData(RatePeriodDistinctObjectKeyData data) {
    if (data != null) {
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectKeyHelper.toMap(data, new HashMap()).get("RatePeriodDistinctObject"));
    }
  }
  /**
   @deprecated
   */
  public RatePeriodDistinctObjectDataList getRatePeriodDistinctObjectDataList() {
    return RatePeriodDistinctObjectHelper.fromMapList(outputMap, "RatePeriodDistinctList");
  }
  /**
   @deprecated
   */
  public RatePeriodDistinctObjectData getRatePeriodDistinctObjectData() {
    return RatePeriodDistinctObjectHelper.fromMap(outputMap, "RatePeriodDistinct");
  }
}
