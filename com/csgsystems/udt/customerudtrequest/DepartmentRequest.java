/*
 * Generated code DO NOT EDIT
 * Generated file: DepartmentRequest.java
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

import com.csgsystems.we.data.*;
public final class DepartmentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DepartmentRequest (String request, DepartmentRequestMethod method) {
    initialize(request, "Department", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DepartmentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDepartmentForDepartmentCreate(DepartmentObjectData data) {
    if (data != null) {
      addInput("Department", DepartmentObjectHelper.toMap(data, new HashMap(), "Department").get("Department"));
    }
  }
  public void setDepartmentForDepartmentFind(DepartmentObjectFilter data) {
    if (data != null) {
      addInput("Department", DepartmentObjectHelper.toMap(data, new HashMap(), "Department").get("Department"));
    }
  }
  public void setDepartmentForDepartmentGet(DepartmentObjectKeyData data) {
    if (data != null) {
      addInput("Department", DepartmentObjectKeyHelper.toMap(data, new HashMap(), "Department").get("Department"));
    }
  }
  public void setDepartmentForDepartmentUpdate(DepartmentObjectData data) {
    if (data != null) {
      addInput("Department", DepartmentObjectHelper.toMap(data, new HashMap(), "Department").get("Department"));
    }
  }
  public DepartmentObjectData getDepartmentObjectDataDepartmentFromDepartmentCreate() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
  public DepartmentObjectDataList getDepartmentObjectDataDepartmentFromDepartmentFind() {
    return DepartmentObjectHelper.fromMapList(outputMap, "DepartmentList");
  }
  public DepartmentObjectData getDepartmentObjectDataDepartmentFromDepartmentGet() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
  public DepartmentObjectData getDepartmentObjectDataDepartmentFromDepartmentUpdate() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
  /**
   @deprecated
   */
  public void setDepartmentObjectFilter(DepartmentObjectFilter data) {
    if (data != null) {
      addInput("Department", DepartmentObjectHelper.toMap(data, new HashMap()).get("DepartmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepartmentObjectData(DepartmentObjectData data) {
    if (data != null) {
      addInput("Department", DepartmentObjectHelper.toMap(data, new HashMap()).get("DepartmentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDepartmentObjectKeyData(DepartmentObjectKeyData data) {
    if (data != null) {
      addInput("Department", DepartmentObjectKeyHelper.toMap(data, new HashMap()).get("DepartmentObject"));
    }
  }
  /**
   @deprecated
   */
  public DepartmentObjectDataList getDepartmentObjectDataList() {
    return DepartmentObjectHelper.fromMapList(outputMap, "DepartmentList");
  }
  /**
   @deprecated
   */
  public DepartmentObjectData getDepartmentObjectData() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
}
