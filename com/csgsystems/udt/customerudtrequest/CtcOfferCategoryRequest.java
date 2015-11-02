/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOfferCategoryRequest.java
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
public final class CtcOfferCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CtcOfferCategoryRequest (String request, CtcOfferCategoryRequestMethod method) {
    initialize(request, "CtcOfferCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CtcOfferCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCtcOfferCategoryForCtcOfferCategoryCreate(CtcOfferCategoryObjectData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(data, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
  public void setCtcOfferCategoryForCtcOfferCategoryDelete(CtcOfferCategoryObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
  public void setCtcOfferCategoryForCtcOfferCategoryFind(CtcOfferCategoryObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(data, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
  public void setCtcOfferCategoryForCtcOfferCategoryGet(CtcOfferCategoryObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(data, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
  public void setCtcOfferCategoryForCtcOfferCategoryUpdate(CtcOfferCategoryObjectData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(data, new HashMap(), "CtcOfferCategory").get("CtcOfferCategory"));
    }
  }
  public CtcOfferCategoryObjectData getCtcOfferCategoryObjectDataCtcOfferCategoryFromCtcOfferCategoryCreate() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
  public CtcOfferCategoryObjectData getCtcOfferCategoryObjectDataCtcOfferCategoryFromCtcOfferCategoryDelete() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
  public CtcOfferCategoryObjectDataList getCtcOfferCategoryObjectDataCtcOfferCategoryFromCtcOfferCategoryFind() {
    return CtcOfferCategoryObjectHelper.fromMapList(outputMap, "CtcOfferCategoryList");
  }
  public CtcOfferCategoryObjectData getCtcOfferCategoryObjectDataCtcOfferCategoryFromCtcOfferCategoryGet() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
  public CtcOfferCategoryObjectData getCtcOfferCategoryObjectDataCtcOfferCategoryFromCtcOfferCategoryUpdate() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
  /**
   @deprecated
   */
  public void setCtcOfferCategoryObjectFilter(CtcOfferCategoryObjectFilter data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(data, new HashMap()).get("CtcOfferCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferCategoryObjectData(CtcOfferCategoryObjectData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectHelper.toMap(data, new HashMap()).get("CtcOfferCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCtcOfferCategoryObjectKeyData(CtcOfferCategoryObjectKeyData data) {
    if (data != null) {
      addInput("CtcOfferCategory", CtcOfferCategoryObjectKeyHelper.toMap(data, new HashMap()).get("CtcOfferCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public CtcOfferCategoryObjectDataList getCtcOfferCategoryObjectDataList() {
    return CtcOfferCategoryObjectHelper.fromMapList(outputMap, "CtcOfferCategoryList");
  }
  /**
   @deprecated
   */
  public CtcOfferCategoryObjectData getCtcOfferCategoryObjectData() {
    return CtcOfferCategoryObjectHelper.fromMap(outputMap, "CtcOfferCategory");
  }
}
