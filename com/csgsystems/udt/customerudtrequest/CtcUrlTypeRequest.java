/*
 * Generated code DO NOT EDIT
 * Generated file: CtcUrlTypeRequest.java
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
public final class CtcUrlTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcUrlTypeRequest (String request, CtcUrlTypeRequestMethod method) {
    initialize(request, "CtcUrlType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcUrlTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcUrlTypeForCtcUrlTypeCreate(CtcUrlTypeObjectData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(data, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
  public void setCtcUrlTypeForCtcUrlTypeDelete(CtcUrlTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
  public void setCtcUrlTypeForCtcUrlTypeFind(CtcUrlTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(data, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
  public void setCtcUrlTypeForCtcUrlTypeGet(CtcUrlTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
  public void setCtcUrlTypeForCtcUrlTypeUpdate(CtcUrlTypeObjectData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(data, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
  public CtcUrlTypeObjectData getCtcUrlTypeObjectDataCtcUrlTypeFromCtcUrlTypeCreate() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
  public CtcUrlTypeObjectData getCtcUrlTypeObjectDataCtcUrlTypeFromCtcUrlTypeDelete() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
  public CtcUrlTypeObjectDataList getCtcUrlTypeObjectDataCtcUrlTypeFromCtcUrlTypeFind() {
    return CtcUrlTypeObjectHelper.fromMapList(outputMap, "CtcUrlTypeList");
  }
  public CtcUrlTypeObjectData getCtcUrlTypeObjectDataCtcUrlTypeFromCtcUrlTypeGet() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
  public CtcUrlTypeObjectData getCtcUrlTypeObjectDataCtcUrlTypeFromCtcUrlTypeUpdate() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
  /**
   @deprecated
   */
  public void setCtcUrlTypeObjectFilter(CtcUrlTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(data, new HashMap()).get("CtcUrlTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcUrlTypeObjectData(CtcUrlTypeObjectData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(data, new HashMap()).get("CtcUrlTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcUrlTypeObjectKeyData(CtcUrlTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcUrlType", CtcUrlTypeObjectKeyHelper.toMap(data, new HashMap()).get("CtcUrlTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcUrlTypeObjectDataList getCtcUrlTypeObjectDataList() {
    return CtcUrlTypeObjectHelper.fromMapList(outputMap, "CtcUrlTypeList");
  }
  /**
   @deprecated
   */
  public CtcUrlTypeObjectData getCtcUrlTypeObjectData() {
    return CtcUrlTypeObjectHelper.fromMap(outputMap, "CtcUrlType");
  }
}
