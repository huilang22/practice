/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatTypeRequest.java
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
public final class CtcFormatTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcFormatTypeRequest (String request, CtcFormatTypeRequestMethod method) {
    initialize(request, "CtcFormatType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcFormatTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcFormatTypeForCtcFormatTypeCreate(CtcFormatTypeObjectData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(data, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
  public void setCtcFormatTypeForCtcFormatTypeDelete(CtcFormatTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
  public void setCtcFormatTypeForCtcFormatTypeFind(CtcFormatTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(data, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
  public void setCtcFormatTypeForCtcFormatTypeGet(CtcFormatTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
  public void setCtcFormatTypeForCtcFormatTypeUpdate(CtcFormatTypeObjectData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(data, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
  public CtcFormatTypeObjectData getCtcFormatTypeObjectDataCtcFormatTypeFromCtcFormatTypeCreate() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
  public CtcFormatTypeObjectData getCtcFormatTypeObjectDataCtcFormatTypeFromCtcFormatTypeDelete() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
  public CtcFormatTypeObjectDataList getCtcFormatTypeObjectDataCtcFormatTypeFromCtcFormatTypeFind() {
    return CtcFormatTypeObjectHelper.fromMapList(outputMap, "CtcFormatTypeList");
  }
  public CtcFormatTypeObjectData getCtcFormatTypeObjectDataCtcFormatTypeFromCtcFormatTypeGet() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
  public CtcFormatTypeObjectData getCtcFormatTypeObjectDataCtcFormatTypeFromCtcFormatTypeUpdate() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
  /**
   @deprecated
   */
  public void setCtcFormatTypeObjectFilter(CtcFormatTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(data, new HashMap()).get("CtcFormatTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFormatTypeObjectData(CtcFormatTypeObjectData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(data, new HashMap()).get("CtcFormatTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFormatTypeObjectKeyData(CtcFormatTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectKeyHelper.toMap(data, new HashMap()).get("CtcFormatTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcFormatTypeObjectDataList getCtcFormatTypeObjectDataList() {
    return CtcFormatTypeObjectHelper.fromMapList(outputMap, "CtcFormatTypeList");
  }
  /**
   @deprecated
   */
  public CtcFormatTypeObjectData getCtcFormatTypeObjectData() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
