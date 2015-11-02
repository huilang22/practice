/*
 * Generated code DO NOT EDIT
 * Generated file: SvcEmfConfigRequest.java
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
public final class SvcEmfConfigRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcEmfConfigRequest (String request, SvcEmfConfigRequestMethod method) {
    initialize(request, "SvcEmfConfig", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcEmfConfigRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSvcEmfConfigForSvcEmfConfigFind(SvcEmfConfigObjectFilter data) {
    if (data != null) {
      addInput("SvcEmfConfig", SvcEmfConfigObjectHelper.toMap(data, new HashMap(), "SvcEmfConfig").get("SvcEmfConfig"));
    }
  }
  public SvcEmfConfigObjectDataList getSvcEmfConfigObjectDataSvcEmfConfigFromSvcEmfConfigFind() {
    return SvcEmfConfigObjectHelper.fromMapList(outputMap, "SvcEmfConfigList");
  }
  /**
   @deprecated
   */
  public void setSvcEmfConfigObjectFilter(SvcEmfConfigObjectFilter data) {
    if (data != null) {
      addInput("SvcEmfConfig", SvcEmfConfigObjectHelper.toMap(data, new HashMap()).get("SvcEmfConfigObject"));
    }
  }
  /**
   @deprecated
   */
  public SvcEmfConfigObjectDataList getSvcEmfConfigObjectDataList() {
    return SvcEmfConfigObjectHelper.fromMapList(outputMap, "SvcEmfConfigList");
  }
}
