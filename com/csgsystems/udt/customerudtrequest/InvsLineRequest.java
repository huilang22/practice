/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRequest.java
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
public final class InvsLineRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLineRequest (String request, InvsLineRequestMethod method) {
    initialize(request, "InvsLine", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLineRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLineForInvsLineCreate(InvsLineObjectData data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(data, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
  public void setInvsLineForInvsLineFind(InvsLineObjectFilter data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(data, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
  public void setInvsLineForInvsLineGet(InvsLineObjectKeyData data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectKeyHelper.toMap(data, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
  public void setInvsLineForInvsLineUpdate(InvsLineObjectData data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(data, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
  public InvsLineObjectData getInvsLineObjectDataInvsLineFromInvsLineCreate() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
  public InvsLineObjectDataList getInvsLineObjectDataInvsLineFromInvsLineFind() {
    return InvsLineObjectHelper.fromMapList(outputMap, "InvsLineList");
  }
  public InvsLineObjectData getInvsLineObjectDataInvsLineFromInvsLineGet() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
  public InvsLineObjectData getInvsLineObjectDataInvsLineFromInvsLineUpdate() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
  /**
   @deprecated
   */
  public void setInvsLineObjectFilter(InvsLineObjectFilter data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(data, new HashMap()).get("InvsLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineObjectData(InvsLineObjectData data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectHelper.toMap(data, new HashMap()).get("InvsLineObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineObjectKeyData(InvsLineObjectKeyData data) {
    if (data != null) {
      addInput("InvsLine", InvsLineObjectKeyHelper.toMap(data, new HashMap()).get("InvsLineObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLineObjectDataList getInvsLineObjectDataList() {
    return InvsLineObjectHelper.fromMapList(outputMap, "InvsLineList");
  }
  /**
   @deprecated
   */
  public InvsLineObjectData getInvsLineObjectData() {
    return InvsLineObjectHelper.fromMap(outputMap, "InvsLine");
  }
}
