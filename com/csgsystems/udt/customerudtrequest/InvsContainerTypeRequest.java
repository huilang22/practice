/*
 * Generated code DO NOT EDIT
 * Generated file: InvsContainerTypeRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvsContainerTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsContainerTypeRequest (String request, InvsContainerTypeRequestMethod method) {
    initialize(request, "InvsContainerType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsContainerTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsContainerTypeForInvsContainerTypeCreate(InvsContainerTypeObjectData data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(data, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
  public void setInvsContainerTypeForInvsContainerTypeFind(InvsContainerTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(data, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
  public void setInvsContainerTypeForInvsContainerTypeGet(InvsContainerTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectKeyHelper.toMap(data, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
  public void setInvsContainerTypeForInvsContainerTypeUpdate(InvsContainerTypeObjectData data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(data, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
  public InvsContainerTypeObjectData getInvsContainerTypeObjectDataInvsContainerTypeFromInvsContainerTypeCreate() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
  public InvsContainerTypeObjectDataList getInvsContainerTypeObjectDataInvsContainerTypeFromInvsContainerTypeFind() {
    return InvsContainerTypeObjectHelper.fromMapList(outputMap, "InvsContainerTypeList");
  }
  public InvsContainerTypeObjectData getInvsContainerTypeObjectDataInvsContainerTypeFromInvsContainerTypeGet() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
  public InvsContainerTypeObjectData getInvsContainerTypeObjectDataInvsContainerTypeFromInvsContainerTypeUpdate() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeObjectFilter(InvsContainerTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(data, new HashMap()).get("InvsContainerTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeObjectData(InvsContainerTypeObjectData data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(data, new HashMap()).get("InvsContainerTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsContainerTypeObjectKeyData(InvsContainerTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectKeyHelper.toMap(data, new HashMap()).get("InvsContainerTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsContainerTypeObjectDataList getInvsContainerTypeObjectDataList() {
    return InvsContainerTypeObjectHelper.fromMapList(outputMap, "InvsContainerTypeList");
  }
  /**
   @deprecated
   */
  public InvsContainerTypeObjectData getInvsContainerTypeObjectData() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
}
