/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamTypeRequest.java
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
public final class CtmParamTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtmParamTypeRequest (String request, CtmParamTypeRequestMethod method) {
    initialize(request, "CtmParamType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtmParamTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtmParamTypeForCtmParamTypeCreate(CtmParamTypeObjectData data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(data, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
  public void setCtmParamTypeForCtmParamTypeFind(CtmParamTypeObjectFilter data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(data, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
  public void setCtmParamTypeForCtmParamTypeGet(CtmParamTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectKeyHelper.toMap(data, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
  public void setCtmParamTypeForCtmParamTypeUpdate(CtmParamTypeObjectData data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(data, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
  public CtmParamTypeObjectData getCtmParamTypeObjectDataCtmParamTypeFromCtmParamTypeCreate() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
  public CtmParamTypeObjectDataList getCtmParamTypeObjectDataCtmParamTypeFromCtmParamTypeFind() {
    return CtmParamTypeObjectHelper.fromMapList(outputMap, "CtmParamTypeList");
  }
  public CtmParamTypeObjectData getCtmParamTypeObjectDataCtmParamTypeFromCtmParamTypeGet() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
  public CtmParamTypeObjectData getCtmParamTypeObjectDataCtmParamTypeFromCtmParamTypeUpdate() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
  /**
   @deprecated
   */
  public void setCtmParamTypeObjectFilter(CtmParamTypeObjectFilter data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(data, new HashMap()).get("CtmParamTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmParamTypeObjectData(CtmParamTypeObjectData data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(data, new HashMap()).get("CtmParamTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtmParamTypeObjectKeyData(CtmParamTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtmParamType", CtmParamTypeObjectKeyHelper.toMap(data, new HashMap()).get("CtmParamTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CtmParamTypeObjectDataList getCtmParamTypeObjectDataList() {
    return CtmParamTypeObjectHelper.fromMapList(outputMap, "CtmParamTypeList");
  }
  /**
   @deprecated
   */
  public CtmParamTypeObjectData getCtmParamTypeObjectData() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
}
