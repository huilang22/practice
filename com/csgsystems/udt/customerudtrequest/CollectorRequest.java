/*
 * Generated code DO NOT EDIT
 * Generated file: CollectorRequest.java
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

import com.csgsystems.ar.data.*;
public final class CollectorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CollectorRequest (String request, CollectorRequestMethod method) {
    initialize(request, "Collector", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CollectorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCollectorForCollectorFind(CollectorObjectFilter data) {
    if (data != null) {
      addInput("Collector", CollectorObjectHelper.toMap(data, new HashMap(), "Collector").get("Collector"));
    }
  }
  public void setCollectorForCollectorGet(CollectorObjectKeyData data) {
    if (data != null) {
      addInput("Collector", CollectorObjectKeyHelper.toMap(data, new HashMap(), "Collector").get("Collector"));
    }
  }
  public CollectorObjectDataList getCollectorObjectDataCollectorFromCollectorFind() {
    return CollectorObjectHelper.fromMapList(outputMap, "CollectorList");
  }
  public CollectorObjectData getCollectorObjectDataCollectorFromCollectorGet() {
    return CollectorObjectHelper.fromMap(outputMap, "Collector");
  }
  /**
   @deprecated
   */
  public void setCollectorObjectFilter(CollectorObjectFilter data) {
    if (data != null) {
      addInput("Collector", CollectorObjectHelper.toMap(data, new HashMap()).get("CollectorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCollectorObjectKeyData(CollectorObjectKeyData data) {
    if (data != null) {
      addInput("Collector", CollectorObjectKeyHelper.toMap(data, new HashMap()).get("CollectorObject"));
    }
  }
  /**
   @deprecated
   */
  public CollectorObjectDataList getCollectorObjectDataList() {
    return CollectorObjectHelper.fromMapList(outputMap, "CollectorList");
  }
  /**
   @deprecated
   */
  public CollectorObjectData getCollectorObjectData() {
    return CollectorObjectHelper.fromMap(outputMap, "Collector");
  }
}
