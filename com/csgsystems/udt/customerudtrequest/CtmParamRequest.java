/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamRequest.java
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

import com.csgsystems.cf.data.*;
public final class CtmParamRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtmParamRequest (String request, CtmParamRequestMethod method) {
    initialize(request, "CtmParam", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtmParamRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtmParamForCtmParamCreate(CtmParamBaseObjectData data) {
    if (data != null) {
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(data, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
  public void setCtmParamForCtmParamFind(CtmParamObjectFilter data) {
    if (data != null) {
      addInput("CtmParam", CtmParamObjectHelper.toMap(data, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
  public void setCtmParamForCtmParamGet(CtmParamBaseObjectKeyData data) {
    if (data != null) {
      addInput("CtmParam", CtmParamBaseObjectKeyHelper.toMap(data, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
  public void setCtmParamForCtmParamUpdate(CtmParamBaseObjectData data) {
    if (data != null) {
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(data, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
  public CtmParamObjectData getCtmParamObjectDataCtmParamFromCtmParamCreate() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
  public CtmParamObjectDataList getCtmParamObjectDataCtmParamFromCtmParamFind() {
    return CtmParamObjectHelper.fromMapList(outputMap, "CtmParamList");
  }
  public CtmParamObjectData getCtmParamObjectDataCtmParamFromCtmParamGet() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
  public CtmParamObjectData getCtmParamObjectDataCtmParamFromCtmParamUpdate() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
  /**
   @deprecated
   */
  public void setCtmParamBaseObjectData(CtmParamBaseObjectData data) {
    if (data != null) {
      addInput("CtmParam", CtmParamBaseObjectHelper.toMap(data, new HashMap()).get("CtmParamBaseObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmParamBaseObjectKeyData(CtmParamBaseObjectKeyData data) {
    if (data != null) {
      addInput("CtmParam", CtmParamBaseObjectKeyHelper.toMap(data, new HashMap()).get("CtmParamBaseObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmParamObjectFilter(CtmParamObjectFilter data) {
    if (data != null) {
      addInput("CtmParam", CtmParamObjectHelper.toMap(data, new HashMap()).get("CtmParamObject"));
    }
  }
  /**
   @deprecated
   */
  public CtmParamObjectDataList getCtmParamObjectDataList() {
    return CtmParamObjectHelper.fromMapList(outputMap, "CtmParamList");
  }
  /**
   @deprecated
   */
  public CtmParamObjectData getCtmParamObjectData() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
}
