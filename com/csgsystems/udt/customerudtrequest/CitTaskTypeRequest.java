/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskTypeRequest.java
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

import com.csgsystems.cit.data.*;
public final class CitTaskTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitTaskTypeRequest (String request, CitTaskTypeRequestMethod method) {
    initialize(request, "CitTaskType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitTaskTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitTaskTypeForCitTaskTypeCreate(CitTaskTypeObjectData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(data, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
  public void setCitTaskTypeForCitTaskTypeDelete(CitTaskTypeObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(data, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
  public void setCitTaskTypeForCitTaskTypeFind(CitTaskTypeObjectFilter data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(data, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
  public void setCitTaskTypeForCitTaskTypeGet(CitTaskTypeObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(data, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
  public void setCitTaskTypeForCitTaskTypeUpdate(CitTaskTypeObjectData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(data, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }
  public CitTaskTypeObjectData getCitTaskTypeObjectDataCitTaskTypeFromCitTaskTypeCreate() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
  public CitTaskTypeObjectData getCitTaskTypeObjectDataCitTaskTypeFromCitTaskTypeDelete() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
  public CitTaskTypeObjectDataList getCitTaskTypeObjectDataCitTaskTypeFromCitTaskTypeFind() {
    return CitTaskTypeObjectHelper.fromMapList(outputMap, "CitTaskTypeList");
  }
  public CitTaskTypeObjectData getCitTaskTypeObjectDataCitTaskTypeFromCitTaskTypeGet() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
  public CitTaskTypeObjectKeyData getCitTaskTypeObjectKeyDataCitTaskTypeFromCitTaskTypeSequenceGet() {
    return CitTaskTypeObjectKeyHelper.fromMap(outputMap, "CitTaskType");
  }
  public CitTaskTypeObjectData getCitTaskTypeObjectDataCitTaskTypeFromCitTaskTypeUpdate() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
  /**
   @deprecated
   */
  public void setCitTaskTypeObjectFilter(CitTaskTypeObjectFilter data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(data, new HashMap()).get("CitTaskTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitTaskTypeObjectData(CitTaskTypeObjectData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(data, new HashMap()).get("CitTaskTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCitTaskTypeObjectKeyData(CitTaskTypeObjectKeyData data) {
    if (data != null) {
      addInput("CitTaskType", CitTaskTypeObjectKeyHelper.toMap(data, new HashMap()).get("CitTaskTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public CitTaskTypeObjectDataList getCitTaskTypeObjectDataList() {
    return CitTaskTypeObjectHelper.fromMapList(outputMap, "CitTaskTypeList");
  }
  /**
   @deprecated
   */
  public CitTaskTypeObjectKeyData getCitTaskTypeObjectKeyData() {
    return CitTaskTypeObjectKeyHelper.fromMap(outputMap, "CitTaskType");
  }
  /**
   @deprecated
   */
  public CitTaskTypeObjectData getCitTaskTypeObjectData() {
    return CitTaskTypeObjectHelper.fromMap(outputMap, "CitTaskType");
  }
}
