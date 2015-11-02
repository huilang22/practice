/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrRequest.java
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
public final class InvsHlrRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsHlrRequest (String request, InvsHlrRequestMethod method) {
    initialize(request, "InvsHlr", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsHlrRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsHlrForInvsHlrCreate(InvsHlrObjectData data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(data, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
  public void setInvsHlrForInvsHlrFind(InvsHlrObjectFilter data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(data, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
  public void setInvsHlrForInvsHlrGet(InvsHlrObjectKeyData data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectKeyHelper.toMap(data, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
  public void setInvsHlrForInvsHlrUpdate(InvsHlrObjectData data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(data, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
  public InvsHlrObjectData getInvsHlrObjectDataInvsHlrFromInvsHlrCreate() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
  public InvsHlrObjectDataList getInvsHlrObjectDataInvsHlrFromInvsHlrFind() {
    return InvsHlrObjectHelper.fromMapList(outputMap, "InvsHlrList");
  }
  public InvsHlrObjectData getInvsHlrObjectDataInvsHlrFromInvsHlrGet() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
  public InvsHlrObjectData getInvsHlrObjectDataInvsHlrFromInvsHlrUpdate() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
  /**
   @deprecated
   */
  public void setInvsHlrObjectFilter(InvsHlrObjectFilter data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(data, new HashMap()).get("InvsHlrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsHlrObjectData(InvsHlrObjectData data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(data, new HashMap()).get("InvsHlrObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsHlrObjectKeyData(InvsHlrObjectKeyData data) {
    if (data != null) {
      addInput("InvsHlr", InvsHlrObjectKeyHelper.toMap(data, new HashMap()).get("InvsHlrObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsHlrObjectDataList getInvsHlrObjectDataList() {
    return InvsHlrObjectHelper.fromMapList(outputMap, "InvsHlrList");
  }
  /**
   @deprecated
   */
  public InvsHlrObjectData getInvsHlrObjectData() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
}
