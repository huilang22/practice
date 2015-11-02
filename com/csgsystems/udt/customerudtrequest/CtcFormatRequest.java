/*
 * Generated code DO NOT EDIT
 * Generated file: CtcFormatRequest.java
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
public final class CtcFormatRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcFormatRequest (String request, CtcFormatRequestMethod method) {
    initialize(request, "CtcFormat", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcFormatRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcFormatForCtcFormatCreate(CtcFormatObjectData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(data, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
  public void setCtcFormatForCtcFormatDelete(CtcFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(data, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
  public void setCtcFormatForCtcFormatFind(CtcFormatObjectFilter data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(data, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
  public void setCtcFormatForCtcFormatGet(CtcFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(data, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
  public void setCtcFormatForCtcFormatUpdate(CtcFormatObjectData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(data, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
  public CtcFormatObjectData getCtcFormatObjectDataCtcFormatFromCtcFormatCreate() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
  public CtcFormatObjectData getCtcFormatObjectDataCtcFormatFromCtcFormatDelete() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
  public CtcFormatObjectDataList getCtcFormatObjectDataCtcFormatFromCtcFormatFind() {
    return CtcFormatObjectHelper.fromMapList(outputMap, "CtcFormatList");
  }
  public CtcFormatObjectData getCtcFormatObjectDataCtcFormatFromCtcFormatGet() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
  public CtcFormatObjectData getCtcFormatObjectDataCtcFormatFromCtcFormatUpdate() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
  /**
   @deprecated
   */
  public void setCtcFormatObjectFilter(CtcFormatObjectFilter data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(data, new HashMap()).get("CtcFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFormatObjectData(CtcFormatObjectData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(data, new HashMap()).get("CtcFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcFormatObjectKeyData(CtcFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcFormat", CtcFormatObjectKeyHelper.toMap(data, new HashMap()).get("CtcFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcFormatObjectDataList getCtcFormatObjectDataList() {
    return CtcFormatObjectHelper.fromMapList(outputMap, "CtcFormatList");
  }
  /**
   @deprecated
   */
  public CtcFormatObjectData getCtcFormatObjectData() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
