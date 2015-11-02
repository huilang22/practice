/*
 * Generated code DO NOT EDIT
 * Generated file: RtPaymentResponseRequest.java
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
public final class RtPaymentResponseRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RtPaymentResponseRequest (String request, RtPaymentResponseRequestMethod method) {
    initialize(request, "RtPaymentResponse", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RtPaymentResponseRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRtPaymentResponseForRtPaymentResponseFind(RtPaymentResponseObjectFilter data) {
    if (data != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(data, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }
  public void setRtPaymentResponseForRtPaymentResponseGet(RtPaymentResponseObjectData data) {
    if (data != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(data, new HashMap(), "RtPaymentResponse").get("RtPaymentResponse"));
    }
  }
  public RtPaymentResponseObjectDataList getRtPaymentResponseObjectDataRtPaymentResponseFromRtPaymentResponseFind() {
    return RtPaymentResponseObjectHelper.fromMapList(outputMap, "RtPaymentResponseList");
  }
  public RtPaymentResponseObjectData getRtPaymentResponseObjectDataRtPaymentResponseFromRtPaymentResponseGet() {
    return RtPaymentResponseObjectHelper.fromMap(outputMap, "RtPaymentResponse");
  }
  /**
   @deprecated
   */
  public void setRtPaymentResponseObjectFilter(RtPaymentResponseObjectFilter data) {
    if (data != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(data, new HashMap()).get("RtPaymentResponseObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRtPaymentResponseObjectData(RtPaymentResponseObjectData data) {
    if (data != null) {
      addInput("RtPaymentResponse", RtPaymentResponseObjectHelper.toMap(data, new HashMap()).get("RtPaymentResponseObject"));
    }
  }
  /**
   @deprecated
   */
  public RtPaymentResponseObjectDataList getRtPaymentResponseObjectDataList() {
    return RtPaymentResponseObjectHelper.fromMapList(outputMap, "RtPaymentResponseList");
  }
  /**
   @deprecated
   */
  public RtPaymentResponseObjectData getRtPaymentResponseObjectData() {
    return RtPaymentResponseObjectHelper.fromMap(outputMap, "RtPaymentResponse");
  }
}
