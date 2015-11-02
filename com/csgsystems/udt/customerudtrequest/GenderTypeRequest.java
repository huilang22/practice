/*
 * Generated code DO NOT EDIT
 * Generated file: GenderTypeRequest.java
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

import com.csgsystems.bp.data.*;
public final class GenderTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GenderTypeRequest (String request, GenderTypeRequestMethod method) {
    initialize(request, "GenderType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GenderTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGenderTypeForGenderTypeCreate(GenderTypeObjectData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(data, new HashMap(), "GenderType").get("GenderType"));
    }
  }
  public void setGenderTypeForGenderTypeDelete(GenderTypeObjectKeyData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(data, new HashMap(), "GenderType").get("GenderType"));
    }
  }
  public void setGenderTypeForGenderTypeFind(GenderTypeObjectFilter data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(data, new HashMap(), "GenderType").get("GenderType"));
    }
  }
  public void setGenderTypeForGenderTypeGet(GenderTypeObjectKeyData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(data, new HashMap(), "GenderType").get("GenderType"));
    }
  }
  public void setGenderTypeForGenderTypeUpdate(GenderTypeObjectData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(data, new HashMap(), "GenderType").get("GenderType"));
    }
  }
  public GenderTypeObjectData getGenderTypeObjectDataGenderTypeFromGenderTypeCreate() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
  public GenderTypeObjectData getGenderTypeObjectDataGenderTypeFromGenderTypeDelete() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
  public GenderTypeObjectDataList getGenderTypeObjectDataGenderTypeFromGenderTypeFind() {
    return GenderTypeObjectHelper.fromMapList(outputMap, "GenderTypeList");
  }
  public GenderTypeObjectData getGenderTypeObjectDataGenderTypeFromGenderTypeGet() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
  public GenderTypeObjectData getGenderTypeObjectDataGenderTypeFromGenderTypeUpdate() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
  /**
   @deprecated
   */
  public void setGenderTypeObjectFilter(GenderTypeObjectFilter data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(data, new HashMap()).get("GenderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGenderTypeObjectData(GenderTypeObjectData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(data, new HashMap()).get("GenderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGenderTypeObjectKeyData(GenderTypeObjectKeyData data) {
    if (data != null) {
      addInput("GenderType", GenderTypeObjectKeyHelper.toMap(data, new HashMap()).get("GenderTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public GenderTypeObjectDataList getGenderTypeObjectDataList() {
    return GenderTypeObjectHelper.fromMapList(outputMap, "GenderTypeList");
  }
  /**
   @deprecated
   */
  public GenderTypeObjectData getGenderTypeObjectData() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
