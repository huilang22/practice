/*
 * Generated code DO NOT EDIT
 * Generated file: InvContainerMainRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvContainerMainRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvContainerMainRequest (String request, InvContainerMainRequestMethod method) {
    initialize(request, "InvContainerMain", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvContainerMainRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvContainerMainForInvContainerMainFind(InvContainerMainObjectFilter data) {
    if (data != null) {
      addInput("InvContainerMain", InvContainerMainObjectHelper.toMap(data, new HashMap(), "InvContainerMain").get("InvContainerMain"));
    }
  }
  public InvContainerMainObjectDataList getInvContainerMainObjectDataInvContainerMainFromInvContainerMainFind() {
    return InvContainerMainObjectHelper.fromMapList(outputMap, "InvContainerMainList");
  }
  /**
   @deprecated
   */
  public void setInvContainerMainObjectFilter(InvContainerMainObjectFilter data) {
    if (data != null) {
      addInput("InvContainerMain", InvContainerMainObjectHelper.toMap(data, new HashMap()).get("InvContainerMainObject"));
    }
  }
  /**
   @deprecated
   */
  public InvContainerMainObjectDataList getInvContainerMainObjectDataList() {
    return InvContainerMainObjectHelper.fromMapList(outputMap, "InvContainerMainList");
  }
}
