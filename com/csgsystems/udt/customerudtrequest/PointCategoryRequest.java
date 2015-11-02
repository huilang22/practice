/*
 * Generated code DO NOT EDIT
 * Generated file: PointCategoryRequest.java
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
public final class PointCategoryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PointCategoryRequest (String request, PointCategoryRequestMethod method) {
    initialize(request, "PointCategory", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PointCategoryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPointCategoryForPointCategoryCreate(PointCategoryObjectData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(data, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
  public void setPointCategoryForPointCategoryDelete(PointCategoryObjectKeyData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(data, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
  public void setPointCategoryForPointCategoryFind(PointCategoryObjectFilter data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(data, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
  public void setPointCategoryForPointCategoryGet(PointCategoryObjectKeyData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(data, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
  public void setPointCategoryForPointCategoryUpdate(PointCategoryObjectData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(data, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
  public PointCategoryObjectData getPointCategoryObjectDataPointCategoryFromPointCategoryCreate() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
  public PointCategoryObjectData getPointCategoryObjectDataPointCategoryFromPointCategoryDelete() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
  public PointCategoryObjectDataList getPointCategoryObjectDataPointCategoryFromPointCategoryFind() {
    return PointCategoryObjectHelper.fromMapList(outputMap, "PointCategoryList");
  }
  public PointCategoryObjectData getPointCategoryObjectDataPointCategoryFromPointCategoryGet() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
  public PointCategoryObjectData getPointCategoryObjectDataPointCategoryFromPointCategoryUpdate() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
  /**
   @deprecated
   */
  public void setPointCategoryObjectFilter(PointCategoryObjectFilter data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(data, new HashMap()).get("PointCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointCategoryObjectData(PointCategoryObjectData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(data, new HashMap()).get("PointCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointCategoryObjectKeyData(PointCategoryObjectKeyData data) {
    if (data != null) {
      addInput("PointCategory", PointCategoryObjectKeyHelper.toMap(data, new HashMap()).get("PointCategoryObject"));
    }
  }
  /**
   @deprecated
   */
  public PointCategoryObjectDataList getPointCategoryObjectDataList() {
    return PointCategoryObjectHelper.fromMapList(outputMap, "PointCategoryList");
  }
  /**
   @deprecated
   */
  public PointCategoryObjectData getPointCategoryObjectData() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
