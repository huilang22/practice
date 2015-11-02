/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobsubstateRequest.java
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
public final class InvsJobsubstateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsJobsubstateRequest (String request, InvsJobsubstateRequestMethod method) {
    initialize(request, "InvsJobsubstate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsJobsubstateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsJobsubstateForInvsJobsubstateFind(InvsJobsubstateObjectFilter data) {
    if (data != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(data, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }
  public void setInvsJobsubstateForInvsJobsubstateGet(InvsJobsubstateObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectKeyHelper.toMap(data, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }
  public InvsJobsubstateObjectDataList getInvsJobsubstateObjectDataInvsJobsubstateFromInvsJobsubstateFind() {
    return InvsJobsubstateObjectHelper.fromMapList(outputMap, "InvsJobsubstateList");
  }
  public InvsJobsubstateObjectData getInvsJobsubstateObjectDataInvsJobsubstateFromInvsJobsubstateGet() {
    return InvsJobsubstateObjectHelper.fromMap(outputMap, "InvsJobsubstate");
  }
  /**
   @deprecated
   */
  public void setInvsJobsubstateObjectFilter(InvsJobsubstateObjectFilter data) {
    if (data != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(data, new HashMap()).get("InvsJobsubstateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsJobsubstateObjectKeyData(InvsJobsubstateObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobsubstate", InvsJobsubstateObjectKeyHelper.toMap(data, new HashMap()).get("InvsJobsubstateObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsJobsubstateObjectDataList getInvsJobsubstateObjectDataList() {
    return InvsJobsubstateObjectHelper.fromMapList(outputMap, "InvsJobsubstateList");
  }
  /**
   @deprecated
   */
  public InvsJobsubstateObjectData getInvsJobsubstateObjectData() {
    return InvsJobsubstateObjectHelper.fromMap(outputMap, "InvsJobsubstate");
  }
}
