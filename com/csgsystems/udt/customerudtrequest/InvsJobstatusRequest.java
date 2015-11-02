/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobstatusRequest.java
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
public final class InvsJobstatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsJobstatusRequest (String request, InvsJobstatusRequestMethod method) {
    initialize(request, "InvsJobstatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsJobstatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsJobstatusForInvsJobstatusFind(InvsJobstatusObjectFilter data) {
    if (data != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(data, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }
  public void setInvsJobstatusForInvsJobstatusGet(InvsJobstatusObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectKeyHelper.toMap(data, new HashMap(), "InvsJobstatus").get("InvsJobstatus"));
    }
  }
  public InvsJobstatusObjectDataList getInvsJobstatusObjectDataInvsJobstatusFromInvsJobstatusFind() {
    return InvsJobstatusObjectHelper.fromMapList(outputMap, "InvsJobstatusList");
  }
  public InvsJobstatusObjectData getInvsJobstatusObjectDataInvsJobstatusFromInvsJobstatusGet() {
    return InvsJobstatusObjectHelper.fromMap(outputMap, "InvsJobstatus");
  }
  /**
   @deprecated
   */
  public void setInvsJobstatusObjectFilter(InvsJobstatusObjectFilter data) {
    if (data != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectHelper.toMap(data, new HashMap()).get("InvsJobstatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsJobstatusObjectKeyData(InvsJobstatusObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobstatus", InvsJobstatusObjectKeyHelper.toMap(data, new HashMap()).get("InvsJobstatusObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsJobstatusObjectDataList getInvsJobstatusObjectDataList() {
    return InvsJobstatusObjectHelper.fromMapList(outputMap, "InvsJobstatusList");
  }
  /**
   @deprecated
   */
  public InvsJobstatusObjectData getInvsJobstatusObjectData() {
    return InvsJobstatusObjectHelper.fromMap(outputMap, "InvsJobstatus");
  }
}
