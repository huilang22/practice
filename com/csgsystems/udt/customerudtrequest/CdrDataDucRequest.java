/*
 * Generated code DO NOT EDIT
 * Generated file: CdrDataDucRequest.java
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
public final class CdrDataDucRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CdrDataDucRequest (String request, CdrDataDucRequestMethod method) {
    initialize(request, "CdrDataDuc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CdrDataDucRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCdrDataDucForCdrDataDucFind(CdrDataDucObjectFilter data) {
    if (data != null) {
      addInput("CdrDataDuc", CdrDataDucObjectHelper.toMap(data, new HashMap(), "CdrDataDuc").get("CdrDataDuc"));
    }
  }
  public CdrDataDucObjectDataList getCdrDataDucObjectDataCdrDataDucFromCdrDataDucFind() {
    return CdrDataDucObjectHelper.fromMapList(outputMap, "CdrDataDucList");
  }
  /**
   @deprecated
   */
  public void setCdrDataDucObjectFilter(CdrDataDucObjectFilter data) {
    if (data != null) {
      addInput("CdrDataDuc", CdrDataDucObjectHelper.toMap(data, new HashMap()).get("CdrDataDucObject"));
    }
  }
  /**
   @deprecated
   */
  public CdrDataDucObjectDataList getCdrDataDucObjectDataList() {
    return CdrDataDucObjectHelper.fromMapList(outputMap, "CdrDataDucList");
  }
}
