/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeRequest.java
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

import com.csgsystems.om.data.*;
public final class DependencyTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public DependencyTypeRequest (String request, DependencyTypeRequestMethod method) {
    initialize(request, "DependencyType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (DependencyTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setDependencyTypeForDependencyTypeCreate(DependencyTypeObjectData data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(data, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
  public void setDependencyTypeForDependencyTypeFind(DependencyTypeObjectFilter data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(data, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
  public void setDependencyTypeForDependencyTypeGet(DependencyTypeObjectKeyData data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectKeyHelper.toMap(data, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
  public void setDependencyTypeForDependencyTypeUpdate(DependencyTypeObjectData data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(data, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }
  public DependencyTypeObjectData getDependencyTypeObjectDataDependencyTypeFromDependencyTypeCreate() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
  public DependencyTypeObjectDataList getDependencyTypeObjectDataDependencyTypeFromDependencyTypeFind() {
    return DependencyTypeObjectHelper.fromMapList(outputMap, "DependencyTypeList");
  }
  public DependencyTypeObjectData getDependencyTypeObjectDataDependencyTypeFromDependencyTypeGet() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
  public DependencyTypeObjectData getDependencyTypeObjectDataDependencyTypeFromDependencyTypeUpdate() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
  /**
   @deprecated
   */
  public void setDependencyTypeObjectFilter(DependencyTypeObjectFilter data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(data, new HashMap()).get("DependencyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDependencyTypeObjectData(DependencyTypeObjectData data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(data, new HashMap()).get("DependencyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setDependencyTypeObjectKeyData(DependencyTypeObjectKeyData data) {
    if (data != null) {
      addInput("DependencyType", DependencyTypeObjectKeyHelper.toMap(data, new HashMap()).get("DependencyTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public DependencyTypeObjectDataList getDependencyTypeObjectDataList() {
    return DependencyTypeObjectHelper.fromMapList(outputMap, "DependencyTypeList");
  }
  /**
   @deprecated
   */
  public DependencyTypeObjectData getDependencyTypeObjectData() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
}
