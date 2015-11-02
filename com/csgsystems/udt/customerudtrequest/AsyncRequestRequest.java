/*
 * Generated code DO NOT EDIT
 * Generated file: AsyncRequestRequest.java
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

import com.csgsystems.utl.data.*;
public final class AsyncRequestRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AsyncRequestRequest (String request, AsyncRequestRequestMethod method) {
    initialize(request, "AsyncRequest", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AsyncRequestRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAsyncRequestForAsyncRequestCreate(AsyncRequestObjectData data) {
    if (data != null) {
      addInput("AsyncRequest", AsyncRequestObjectHelper.toMap(data, new HashMap(), "AsyncRequest").get("AsyncRequest"));
    }
  }
  public BigInteger getBigIntegerBatchIdFromAsyncRequestCreate() {
    return (BigInteger)outputMap.get("BatchId");
  }
  /**
   @deprecated
   */
  public void setAsyncRequestObjectData(AsyncRequestObjectData data) {
    if (data != null) {
      addInput("AsyncRequest", AsyncRequestObjectHelper.toMap(data, new HashMap()).get("AsyncRequestObject"));
    }
  }
  /**
   @deprecated
   */
  public BigInteger getBatchId() {
    return (BigInteger)outputMap.get("BatchId");
  }
}
