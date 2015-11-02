/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeRequest.java
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
public final class TransSourceTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TransSourceTypeRequest (String request, TransSourceTypeRequestMethod method) {
    initialize(request, "TransSourceType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TransSourceTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTransSourceTypeForTransSourceTypeCreate(TransSourceTypeObjectData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(data, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
  public void setTransSourceTypeForTransSourceTypeDelete(TransSourceTypeObjectKeyData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(data, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
  public void setTransSourceTypeForTransSourceTypeFind(TransSourceTypeObjectFilter data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(data, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
  public void setTransSourceTypeForTransSourceTypeGet(TransSourceTypeObjectKeyData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(data, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
  public void setTransSourceTypeForTransSourceTypeUpdate(TransSourceTypeObjectData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(data, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
  public TransSourceTypeObjectData getTransSourceTypeObjectDataTransSourceTypeFromTransSourceTypeCreate() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
  public TransSourceTypeObjectData getTransSourceTypeObjectDataTransSourceTypeFromTransSourceTypeDelete() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
  public TransSourceTypeObjectDataList getTransSourceTypeObjectDataTransSourceTypeFromTransSourceTypeFind() {
    return TransSourceTypeObjectHelper.fromMapList(outputMap, "TransSourceTypeList");
  }
  public TransSourceTypeObjectData getTransSourceTypeObjectDataTransSourceTypeFromTransSourceTypeGet() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
  public TransSourceTypeObjectData getTransSourceTypeObjectDataTransSourceTypeFromTransSourceTypeUpdate() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
  /**
   @deprecated
   */
  public void setTransSourceTypeObjectFilter(TransSourceTypeObjectFilter data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(data, new HashMap()).get("TransSourceTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTransSourceTypeObjectData(TransSourceTypeObjectData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(data, new HashMap()).get("TransSourceTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTransSourceTypeObjectKeyData(TransSourceTypeObjectKeyData data) {
    if (data != null) {
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(data, new HashMap()).get("TransSourceTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public TransSourceTypeObjectDataList getTransSourceTypeObjectDataList() {
    return TransSourceTypeObjectHelper.fromMapList(outputMap, "TransSourceTypeList");
  }
  /**
   @deprecated
   */
  public TransSourceTypeObjectData getTransSourceTypeObjectData() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
