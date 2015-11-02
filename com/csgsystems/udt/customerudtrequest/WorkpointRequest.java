/*
 * Generated code DO NOT EDIT
 * Generated file: WorkpointRequest.java
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

import com.csgsystems.wp.data.*;
public final class WorkpointRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public WorkpointRequest (String request, WorkpointRequestMethod method) {
    initialize(request, "Workpoint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (WorkpointRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setWorkpointUpdateForWorkpointUpdate(WorkpointObjectData data) {
    if (data != null) {
      addInput("WorkpointUpdate", WorkpointObjectHelper.toMap(data, new HashMap(), "WorkpointUpdate").get("WorkpointUpdate"));
    }
  }
  /**
   @deprecated
   */
  public void setWorkpointObjectData(WorkpointObjectData data) {
    if (data != null) {
      addInput("Workpoint", WorkpointObjectHelper.toMap(data, new HashMap()).get("WorkpointObject"));
    }
  }
}
