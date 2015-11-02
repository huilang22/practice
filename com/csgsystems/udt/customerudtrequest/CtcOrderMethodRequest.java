/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodRequest.java
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

import com.csgsystems.ctc.data.*;
public final class CtcOrderMethodRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOrderMethodRequest (String request, CtcOrderMethodRequestMethod method) {
    initialize(request, "CtcOrderMethod", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOrderMethodRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOrderMethodForCtcOrderMethodCreate(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
  public void setCtcOrderMethodForCtcOrderMethodDelete(CtcOrderMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(data, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
  public void setCtcOrderMethodForCtcOrderMethodFind(CtcOrderMethodObjectFilter data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
  public void setCtcOrderMethodForCtcOrderMethodGet(CtcOrderMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(data, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
  public void setCtcOrderMethodForCtcOrderMethodUpdate(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }
  public CtcOrderMethodObjectData getCtcOrderMethodObjectDataCtcOrderMethodFromCtcOrderMethodCreate() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
  public CtcOrderMethodObjectData getCtcOrderMethodObjectDataCtcOrderMethodFromCtcOrderMethodDelete() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
  public CtcOrderMethodObjectDataList getCtcOrderMethodObjectDataCtcOrderMethodFromCtcOrderMethodFind() {
    return CtcOrderMethodObjectHelper.fromMapList(outputMap, "CtcOrderMethodList");
  }
  public CtcOrderMethodObjectData getCtcOrderMethodObjectDataCtcOrderMethodFromCtcOrderMethodGet() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
  public CtcOrderMethodObjectData getCtcOrderMethodObjectDataCtcOrderMethodFromCtcOrderMethodUpdate() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
  /**
   @deprecated
   */
  public void setCtcOrderMethodObjectFilter(CtcOrderMethodObjectFilter data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap()).get("CtcOrderMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOrderMethodObjectData(CtcOrderMethodObjectData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(data, new HashMap()).get("CtcOrderMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOrderMethodObjectKeyData(CtcOrderMethodObjectKeyData data) {
    if (data != null) {
      addInput("CtcOrderMethod", CtcOrderMethodObjectKeyHelper.toMap(data, new HashMap()).get("CtcOrderMethodObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOrderMethodObjectDataList getCtcOrderMethodObjectDataList() {
    return CtcOrderMethodObjectHelper.fromMapList(outputMap, "CtcOrderMethodList");
  }
  /**
   @deprecated
   */
  public CtcOrderMethodObjectData getCtcOrderMethodObjectData() {
    return CtcOrderMethodObjectHelper.fromMap(outputMap, "CtcOrderMethod");
  }
}
