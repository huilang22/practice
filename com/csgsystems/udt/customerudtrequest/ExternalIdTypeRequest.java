/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeRequest.java
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
public final class ExternalIdTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExternalIdTypeRequest (String request, ExternalIdTypeRequestMethod method) {
    initialize(request, "ExternalIdType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExternalIdTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExternalIdTypeForExternalIdTypeCreate(ExternalIdTypeObjectData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public void setExternalIdTypeForExternalIdTypeDelete(ExternalIdTypeObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public void setExternalIdTypeForExternalIdTypeFind(ExternalIdTypeObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public void setExternalIdTypeForExternalIdTypeGet(ExternalIdTypeObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public void setExternalIdTypeForExternalIdTypeUpdate(ExternalIdTypeObjectData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }
  public ExternalIdTypeObjectData getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeCreate() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
  public ExternalIdTypeObjectData getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeDelete() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
  public ExternalIdTypeObjectDataList getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeFind() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
  public ExternalIdTypeObjectData getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeGet() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
  public ExternalIdTypeObjectData getExternalIdTypeObjectDataExternalIdTypeFromExternalIdTypeUpdate() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
  /**
   @deprecated
   */
  public void setExternalIdTypeObjectFilter(ExternalIdTypeObjectFilter data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap()).get("ExternalIdTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExternalIdTypeObjectData(ExternalIdTypeObjectData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(data, new HashMap()).get("ExternalIdTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExternalIdTypeObjectKeyData(ExternalIdTypeObjectKeyData data) {
    if (data != null) {
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(data, new HashMap()).get("ExternalIdTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ExternalIdTypeObjectDataList getExternalIdTypeObjectDataList() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
  /**
   @deprecated
   */
  public ExternalIdTypeObjectData getExternalIdTypeObjectData() {
    return ExternalIdTypeObjectHelper.fromMap(outputMap, "ExternalIdType");
  }
}
