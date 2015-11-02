/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstateRequest.java
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
public final class InvsJobstateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsJobstateRequest (String request, InvsJobstateRequestMethod method) {
    initialize(request, "InvsJobstate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsJobstateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsJobstateForInvsJobstateFind(InvsJobstateObjectFilter data) {
    if (data != null) {
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(data, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }
  public void setInvsJobstateForInvsJobstateGet(InvsJobstateObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobstate", InvsJobstateObjectKeyHelper.toMap(data, new HashMap(), "InvsJobstate").get("InvsJobstate"));
    }
  }
  public InvsJobstateObjectDataList getInvsJobstateObjectDataInvsJobstateFromInvsJobstateFind() {
    return InvsJobstateObjectHelper.fromMapList(outputMap, "InvsJobstateList");
  }
  public InvsJobstateObjectData getInvsJobstateObjectDataInvsJobstateFromInvsJobstateGet() {
    return InvsJobstateObjectHelper.fromMap(outputMap, "InvsJobstate");
  }
  /**
   @deprecated
   */
  public void setInvsJobstateObjectFilter(InvsJobstateObjectFilter data) {
    if (data != null) {
      addInput("InvsJobstate", InvsJobstateObjectHelper.toMap(data, new HashMap()).get("InvsJobstateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsJobstateObjectKeyData(InvsJobstateObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobstate", InvsJobstateObjectKeyHelper.toMap(data, new HashMap()).get("InvsJobstateObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsJobstateObjectDataList getInvsJobstateObjectDataList() {
    return InvsJobstateObjectHelper.fromMapList(outputMap, "InvsJobstateList");
  }
  /**
   @deprecated
   */
  public InvsJobstateObjectData getInvsJobstateObjectData() {
    return InvsJobstateObjectHelper.fromMap(outputMap, "InvsJobstate");
  }
}
