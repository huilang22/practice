/*
 * Generated code DO NOT EDIT
 * Generated file: CtcItemUrlRequest.java
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
public final class CtcItemUrlRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcItemUrlRequest (String request, CtcItemUrlRequestMethod method) {
    initialize(request, "CtcItemUrl", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcItemUrlRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcItemUrlForCtcItemUrlCreate(CtcItemUrlObjectData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(data, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
  public void setCtcItemUrlForCtcItemUrlDelete(CtcItemUrlObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(data, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
  public void setCtcItemUrlForCtcItemUrlFind(CtcItemUrlObjectFilter data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(data, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
  public void setCtcItemUrlForCtcItemUrlGet(CtcItemUrlObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(data, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
  public void setCtcItemUrlForCtcItemUrlUpdate(CtcItemUrlObjectData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(data, new HashMap(), "CtcItemUrl").get("CtcItemUrl"));
    }
  }
  public CtcItemUrlObjectData getCtcItemUrlObjectDataCtcItemUrlFromCtcItemUrlCreate() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
  public CtcItemUrlObjectData getCtcItemUrlObjectDataCtcItemUrlFromCtcItemUrlDelete() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
  public CtcItemUrlObjectDataList getCtcItemUrlObjectDataCtcItemUrlFromCtcItemUrlFind() {
    return CtcItemUrlObjectHelper.fromMapList(outputMap, "CtcItemUrlList");
  }
  public CtcItemUrlObjectData getCtcItemUrlObjectDataCtcItemUrlFromCtcItemUrlGet() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
  public CtcItemUrlObjectData getCtcItemUrlObjectDataCtcItemUrlFromCtcItemUrlUpdate() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
  /**
   @deprecated
   */
  public void setCtcItemUrlObjectFilter(CtcItemUrlObjectFilter data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(data, new HashMap()).get("CtcItemUrlObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemUrlObjectData(CtcItemUrlObjectData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectHelper.toMap(data, new HashMap()).get("CtcItemUrlObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcItemUrlObjectKeyData(CtcItemUrlObjectKeyData data) {
    if (data != null) {
      addInput("CtcItemUrl", CtcItemUrlObjectKeyHelper.toMap(data, new HashMap()).get("CtcItemUrlObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcItemUrlObjectDataList getCtcItemUrlObjectDataList() {
    return CtcItemUrlObjectHelper.fromMapList(outputMap, "CtcItemUrlList");
  }
  /**
   @deprecated
   */
  public CtcItemUrlObjectData getCtcItemUrlObjectData() {
    return CtcItemUrlObjectHelper.fromMap(outputMap, "CtcItemUrl");
  }
}
