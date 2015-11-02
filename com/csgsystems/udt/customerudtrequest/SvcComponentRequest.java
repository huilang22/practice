/*
 * Generated code DO NOT EDIT
 * Generated file: SvcComponentRequest.java
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

import com.csgsystems.om.data.*;
public final class SvcComponentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcComponentRequest (String request, SvcComponentRequestMethod method) {
    initialize(request, "SvcComponent", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcComponentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSvcComponentForSvcComponentFind(SvcComponentObjectFilter data) {
    if (data != null) {
      addInput("SvcComponent", SvcComponentObjectHelper.toMap(data, new HashMap(), "SvcComponent").get("SvcComponent"));
    }
  }
  public SvcComponentObjectDataList getSvcComponentObjectDataSvcComponentFromSvcComponentFind() {
    return SvcComponentObjectHelper.fromMapList(outputMap, "SvcComponentList");
  }
  /**
   @deprecated
   */
  public void setSvcComponentObjectFilter(SvcComponentObjectFilter data) {
    if (data != null) {
      addInput("SvcComponent", SvcComponentObjectHelper.toMap(data, new HashMap()).get("SvcComponentObject"));
    }
  }
  /**
   @deprecated
   */
  public SvcComponentObjectDataList getSvcComponentObjectDataList() {
    return SvcComponentObjectHelper.fromMapList(outputMap, "SvcComponentList");
  }
}
