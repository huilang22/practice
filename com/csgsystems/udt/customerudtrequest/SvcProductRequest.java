/*
 * Generated code DO NOT EDIT
 * Generated file: SvcProductRequest.java
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
public final class SvcProductRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SvcProductRequest (String request, SvcProductRequestMethod method) {
    initialize(request, "SvcProduct", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SvcProductRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSvcProductForSvcProductFind(SvcProductObjectFilter data) {
    if (data != null) {
      addInput("SvcProduct", SvcProductObjectHelper.toMap(data, new HashMap(), "SvcProduct").get("SvcProduct"));
    }
  }
  public SvcProductObjectDataList getSvcProductObjectDataSvcProductFromSvcProductFind() {
    return SvcProductObjectHelper.fromMapList(outputMap, "SvcProductList");
  }
  /**
   @deprecated
   */
  public void setSvcProductObjectFilter(SvcProductObjectFilter data) {
    if (data != null) {
      addInput("SvcProduct", SvcProductObjectHelper.toMap(data, new HashMap()).get("SvcProductObject"));
    }
  }
  /**
   @deprecated
   */
  public SvcProductObjectDataList getSvcProductObjectDataList() {
    return SvcProductObjectHelper.fromMapList(outputMap, "SvcProductList");
  }
}
