/*
 * Generated code DO NOT EDIT
 * Generated file: CtcManagerRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcManagerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcManagerRequest (String request, CtcManagerRequestMethod method) {
    initialize(request, "CtcManager", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcManagerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcManagerLoadInForCtcManagerLoad(CtcManagerLoadObjectData data) {
    if (data != null) {
      addInput("CtcManagerLoadIn", CtcManagerLoadObjectHelper.toMap(data, new HashMap(), "CtcManagerLoadIn").get("CtcManagerLoadIn"));
    }
  }
  public BigInteger getBigIntegerBatchIdFromCtcManagerLoad() {
    return (BigInteger)outputMap.get("BatchId");
  }
  /**
   @deprecated
   */
  public BigInteger getBatchId() {
    return (BigInteger)outputMap.get("BatchId");
  }
  /**
   @deprecated
   */
  public void setCtcManagerLoadObjectData(CtcManagerLoadObjectData data) {
    if (data != null) {
      addInput("CtcManagerLoad", CtcManagerLoadObjectHelper.toMap(data, new HashMap()).get("CtcManagerLoadObject"));
    }
  }
}
