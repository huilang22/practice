/*
 * Generated code DO NOT EDIT
 * Generated file: PointClassRequest.java
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
public final class PointClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PointClassRequest (String request, PointClassRequestMethod method) {
    initialize(request, "PointClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PointClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPointClassForPointClassCreate(PointClassObjectData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(data, new HashMap(), "PointClass").get("PointClass"));
    }
  }
  public void setPointClassForPointClassDelete(PointClassObjectKeyData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectKeyHelper.toMap(data, new HashMap(), "PointClass").get("PointClass"));
    }
  }
  public void setPointClassForPointClassFind(PointClassObjectFilter data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(data, new HashMap(), "PointClass").get("PointClass"));
    }
  }
  public void setPointClassForPointClassGet(PointClassObjectKeyData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectKeyHelper.toMap(data, new HashMap(), "PointClass").get("PointClass"));
    }
  }
  public void setPointClassForPointClassUpdate(PointClassObjectData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(data, new HashMap(), "PointClass").get("PointClass"));
    }
  }
  public PointClassObjectData getPointClassObjectDataPointClassFromPointClassCreate() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
  public PointClassObjectData getPointClassObjectDataPointClassFromPointClassDelete() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
  public PointClassObjectDataList getPointClassObjectDataPointClassFromPointClassFind() {
    return PointClassObjectHelper.fromMapList(outputMap, "PointClassList");
  }
  public PointClassObjectData getPointClassObjectDataPointClassFromPointClassGet() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
  public PointClassObjectData getPointClassObjectDataPointClassFromPointClassUpdate() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
  /**
   @deprecated
   */
  public void setPointClassObjectFilter(PointClassObjectFilter data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(data, new HashMap()).get("PointClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointClassObjectData(PointClassObjectData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(data, new HashMap()).get("PointClassObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPointClassObjectKeyData(PointClassObjectKeyData data) {
    if (data != null) {
      addInput("PointClass", PointClassObjectKeyHelper.toMap(data, new HashMap()).get("PointClassObject"));
    }
  }
  /**
   @deprecated
   */
  public PointClassObjectDataList getPointClassObjectDataList() {
    return PointClassObjectHelper.fromMapList(outputMap, "PointClassList");
  }
  /**
   @deprecated
   */
  public PointClassObjectData getPointClassObjectData() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
