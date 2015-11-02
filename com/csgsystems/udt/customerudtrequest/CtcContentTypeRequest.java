/*
 * Generated code DO NOT EDIT
 * Generated file: CtcContentTypeRequest.java
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
public final class CtcContentTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcContentTypeRequest (String request, CtcContentTypeRequestMethod method) {
    initialize(request, "CtcContentType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcContentTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcContentTypeForCtcContentTypeCreate(CtcContentTypeObjectData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(data, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
  public void setCtcContentTypeForCtcContentTypeDelete(CtcContentTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
  public void setCtcContentTypeForCtcContentTypeFind(CtcContentTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(data, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
  public void setCtcContentTypeForCtcContentTypeGet(CtcContentTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
  public void setCtcContentTypeForCtcContentTypeUpdate(CtcContentTypeObjectData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(data, new HashMap(), "CtcContentType").get("CtcContentType"));
    }
  }
  public CtcContentTypeObjectData getCtcContentTypeObjectDataCtcContentTypeFromCtcContentTypeCreate() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
  public CtcContentTypeObjectData getCtcContentTypeObjectDataCtcContentTypeFromCtcContentTypeDelete() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
  public CtcContentTypeObjectDataList getCtcContentTypeObjectDataCtcContentTypeFromCtcContentTypeFind() {
    return CtcContentTypeObjectHelper.fromMapList(outputMap, "CtcContentTypeList");
  }
  public CtcContentTypeObjectData getCtcContentTypeObjectDataCtcContentTypeFromCtcContentTypeGet() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
  public CtcContentTypeObjectData getCtcContentTypeObjectDataCtcContentTypeFromCtcContentTypeUpdate() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
  /**
   @deprecated
   */
  public void setCtcContentTypeObjectFilter(CtcContentTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(data, new HashMap()).get("CtcContentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcContentTypeObjectData(CtcContentTypeObjectData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectHelper.toMap(data, new HashMap()).get("CtcContentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcContentTypeObjectKeyData(CtcContentTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcContentType", CtcContentTypeObjectKeyHelper.toMap(data, new HashMap()).get("CtcContentTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcContentTypeObjectDataList getCtcContentTypeObjectDataList() {
    return CtcContentTypeObjectHelper.fromMapList(outputMap, "CtcContentTypeList");
  }
  /**
   @deprecated
   */
  public CtcContentTypeObjectData getCtcContentTypeObjectData() {
    return CtcContentTypeObjectHelper.fromMap(outputMap, "CtcContentType");
  }
}
