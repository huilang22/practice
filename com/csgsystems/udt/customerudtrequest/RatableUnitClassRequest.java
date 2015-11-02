/*
 * Generated code DO NOT EDIT
 * Generated file: RatableUnitClassRequest.java
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
public final class RatableUnitClassRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RatableUnitClassRequest (String request, RatableUnitClassRequestMethod method) {
    initialize(request, "RatableUnitClass", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RatableUnitClassRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRatableUnitClassForRatableUnitClassCreate(RUCObjectData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(data, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
  public void setRatableUnitClassForRatableUnitClassDelete(RUCObjectKeyData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(data, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
  public void setRatableUnitClassForRatableUnitClassFind(RUCObjectFilter data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(data, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
  public void setRatableUnitClassForRatableUnitClassGet(RUCObjectKeyData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(data, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
  public void setRatableUnitClassForRatableUnitClassUpdate(RUCObjectData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(data, new HashMap(), "RatableUnitClass").get("RatableUnitClass"));
    }
  }
  public RUCObjectData getRUCObjectDataRatableUnitClassFromRatableUnitClassCreate() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
  public RUCObjectData getRUCObjectDataRatableUnitClassFromRatableUnitClassDelete() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
  public RUCObjectDataList getRUCObjectDataRatableUnitClassFromRatableUnitClassFind() {
    return RUCObjectHelper.fromMapList(outputMap, "RatableUnitClassList");
  }
  public RUCObjectData getRUCObjectDataRatableUnitClassFromRatableUnitClassGet() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
  public RUCObjectData getRUCObjectDataRatableUnitClassFromRatableUnitClassUpdate() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
  /**
   @deprecated
   */
  public void setRUCObjectFilter(RUCObjectFilter data) {
    if (data != null) {
      addInput("RUC", RUCObjectHelper.toMap(data, new HashMap()).get("RUCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUCObjectData(RUCObjectData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectHelper.toMap(data, new HashMap()).get("RUCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRUCObjectKeyData(RUCObjectKeyData data) {
    if (data != null) {
      addInput("RatableUnitClass", RUCObjectKeyHelper.toMap(data, new HashMap()).get("RUCObject"));
    }
  }
  /**
   @deprecated
   */
  public RUCObjectDataList getRUCObjectDataList() {
    return RUCObjectHelper.fromMapList(outputMap, "RUCList");
  }
  /**
   @deprecated
   */
  public RUCObjectData getRUCObjectData() {
    return RUCObjectHelper.fromMap(outputMap, "RatableUnitClass");
  }
}
