/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemFormatRequest.java
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
public final class CtcItemFormatRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemFormatRequest (String request, CtcItemFormatRequestMethod method) {
    initialize(request, "CtcItemFormat", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemFormatRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemFormatForCtcItemFormatCreate(CtcItemFormatObjectData data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(data, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
  public void setCtcItemFormatForCtcItemFormatDelete(CtcItemFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(data, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
  public void setCtcItemFormatForCtcItemFormatFind(CtcItemFormatObjectFilter data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(data, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
  public void setCtcItemFormatForCtcItemFormatGet(CtcItemFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(data, new HashMap(), "CtcItemFormat").get("CtcItemFormat"));
    }
  }
  public CtcItemFormatObjectData getCtcItemFormatObjectDataCtcItemFormatFromCtcItemFormatCreate() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
  public CtcItemFormatObjectData getCtcItemFormatObjectDataCtcItemFormatFromCtcItemFormatDelete() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
  public CtcItemFormatObjectDataList getCtcItemFormatObjectDataCtcItemFormatFromCtcItemFormatFind() {
    return CtcItemFormatObjectHelper.fromMapList(outputMap, "CtcItemFormatList");
  }
  public CtcItemFormatObjectData getCtcItemFormatObjectDataCtcItemFormatFromCtcItemFormatGet() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
  /**
   @deprecated
   */
  public void setCtcItemFormatObjectFilter(CtcItemFormatObjectFilter data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(data, new HashMap()).get("CtcItemFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemFormatObjectData(CtcItemFormatObjectData data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectHelper.toMap(data, new HashMap()).get("CtcItemFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemFormatObjectKeyData(CtcItemFormatObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemFormat", CtcItemFormatObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemFormatObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemFormatObjectDataList getCtcItemFormatObjectDataList() {
    return CtcItemFormatObjectHelper.fromMapList(outputMap, "CtcItemFormatList");
  }
  /**
   @deprecated
   */
  public CtcItemFormatObjectData getCtcItemFormatObjectData() {
    return CtcItemFormatObjectHelper.fromMap(outputMap, "CtcItemFormat");
  }
}
