/*
 * Generated code DO NOT EDIT
 * Generated file: CtcRatingTypeRequest.java
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
public final class CtcRatingTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcRatingTypeRequest (String request, CtcRatingTypeRequestMethod method) {
    initialize(request, "CtcRatingType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcRatingTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcRatingTypeForCtcRatingTypeCreate(CtcRatingTypeObjectData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(data, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
  public void setCtcRatingTypeForCtcRatingTypeDelete(CtcRatingTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
  public void setCtcRatingTypeForCtcRatingTypeFind(CtcRatingTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(data, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
  public void setCtcRatingTypeForCtcRatingTypeGet(CtcRatingTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(data, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
  public void setCtcRatingTypeForCtcRatingTypeUpdate(CtcRatingTypeObjectData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(data, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
  public CtcRatingTypeObjectData getCtcRatingTypeObjectDataCtcRatingTypeFromCtcRatingTypeCreate() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
  public CtcRatingTypeObjectData getCtcRatingTypeObjectDataCtcRatingTypeFromCtcRatingTypeDelete() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
  public CtcRatingTypeObjectDataList getCtcRatingTypeObjectDataCtcRatingTypeFromCtcRatingTypeFind() {
    return CtcRatingTypeObjectHelper.fromMapList(outputMap, "CtcRatingTypeList");
  }
  public CtcRatingTypeObjectData getCtcRatingTypeObjectDataCtcRatingTypeFromCtcRatingTypeGet() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
  public CtcRatingTypeObjectData getCtcRatingTypeObjectDataCtcRatingTypeFromCtcRatingTypeUpdate() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
  /**
   @deprecated
   */
  public void setCtcRatingTypeObjectFilter(CtcRatingTypeObjectFilter data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(data, new HashMap()).get("CtcRatingTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingTypeObjectData(CtcRatingTypeObjectData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(data, new HashMap()).get("CtcRatingTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcRatingTypeObjectKeyData(CtcRatingTypeObjectKeyData data) {
    if (data != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectKeyHelper.toMap(data, new HashMap()).get("CtcRatingTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcRatingTypeObjectDataList getCtcRatingTypeObjectDataList() {
    return CtcRatingTypeObjectHelper.fromMapList(outputMap, "CtcRatingTypeList");
  }
  /**
   @deprecated
   */
  public CtcRatingTypeObjectData getCtcRatingTypeObjectData() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
