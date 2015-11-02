/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeRequest.java
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
public final class UnitsTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public UnitsTypeRequest (String request, UnitsTypeRequestMethod method) {
    initialize(request, "UnitsType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (UnitsTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setUnitsTypeForUnitsTypeCreate(UnitsTypeObjectData data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(data, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
  public void setUnitsTypeForUnitsTypeFind(UnitsTypeObjectFilter data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(data, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
  public void setUnitsTypeForUnitsTypeGet(UnitsTypeObjectKeyData data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectKeyHelper.toMap(data, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
  public void setUnitsTypeForUnitsTypeRateRcFind(UnitsTypeRcObjectFilter data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeRcObjectHelper.toMap(data, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
  public void setUnitsTypeForUnitsTypeUpdate(UnitsTypeObjectData data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(data, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
  public UnitsTypeObjectData getUnitsTypeObjectDataUnitsTypeFromUnitsTypeCreate() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
  public UnitsTypeObjectDataList getUnitsTypeObjectDataUnitsTypeFromUnitsTypeFind() {
    return UnitsTypeObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
  public UnitsTypeObjectData getUnitsTypeObjectDataUnitsTypeFromUnitsTypeGet() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
  public UnitsTypeRcObjectDataList getUnitsTypeRcObjectDataUnitsTypeFromUnitsTypeRateRcFind() {
    return UnitsTypeRcObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
  public UnitsTypeObjectData getUnitsTypeObjectDataUnitsTypeFromUnitsTypeUpdate() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
  /**
   @deprecated
   */
  public void setUnitsTypeObjectFilter(UnitsTypeObjectFilter data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(data, new HashMap()).get("UnitsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitsTypeObjectData(UnitsTypeObjectData data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(data, new HashMap()).get("UnitsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setUnitsTypeObjectKeyData(UnitsTypeObjectKeyData data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeObjectKeyHelper.toMap(data, new HashMap()).get("UnitsTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitsTypeObjectDataList getUnitsTypeObjectDataList() {
    return UnitsTypeObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
  /**
   @deprecated
   */
  public UnitsTypeObjectData getUnitsTypeObjectData() {
    return UnitsTypeObjectHelper.fromMap(outputMap, "UnitsType");
  }
  /**
   @deprecated
   */
  public void setUnitsTypeRcObjectFilter(UnitsTypeRcObjectFilter data) {
    if (data != null) {
      addInput("UnitsType", UnitsTypeRcObjectHelper.toMap(data, new HashMap()).get("UnitsTypeRcObject"));
    }
  }
  /**
   @deprecated
   */
  public UnitsTypeRcObjectDataList getUnitsTypeRcObjectDataList() {
    return UnitsTypeRcObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
}
