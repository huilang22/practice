/*
 * Generated code DO NOT EDIT
 * Generated file: AIRequest.java
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

import com.csgsystems.ai.data.*;
public final class AIRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AIRequest (String request, AIRequestMethod method) {
    initialize(request, "AI", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AIRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPayloadForInvoke(String data) {
    if (data != null) {
      addInput("Payload", data);
    }
  }
  public void setServiceNameForInvoke(String data) {
    if (data != null) {
      addInput("ServiceName", data);
    }
  }
  public InvokeOutputData getInvokeOutputDataInvokeOutputDataFromInvoke() {
    return InvokeOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvokeOutputData getInvokeOutputData() {
    return InvokeOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setPayload(String data) {
    if (data != null) {
      addInput("Payload", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceName(String data) {
    if (data != null) {
      addInput("ServiceName", data);
    }
  }
}
