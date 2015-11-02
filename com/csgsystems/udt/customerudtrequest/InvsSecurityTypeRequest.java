/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeRequest.java
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
public final class InvsSecurityTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsSecurityTypeRequest (String request, InvsSecurityTypeRequestMethod method) {
    initialize(request, "InvsSecurityType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsSecurityTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsSecurityTypeForInvsSecurityTypeCreate(InvsSecurityTypeObjectData data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(data, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
  public void setInvsSecurityTypeForInvsSecurityTypeFind(InvsSecurityTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(data, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
  public void setInvsSecurityTypeForInvsSecurityTypeGet(InvsSecurityTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectKeyHelper.toMap(data, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
  public void setInvsSecurityTypeForInvsSecurityTypeUpdate(InvsSecurityTypeObjectData data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(data, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
  public InvsSecurityTypeObjectData getInvsSecurityTypeObjectDataInvsSecurityTypeFromInvsSecurityTypeCreate() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
  public InvsSecurityTypeObjectDataList getInvsSecurityTypeObjectDataInvsSecurityTypeFromInvsSecurityTypeFind() {
    return InvsSecurityTypeObjectHelper.fromMapList(outputMap, "InvsSecurityTypeList");
  }
  public InvsSecurityTypeObjectData getInvsSecurityTypeObjectDataInvsSecurityTypeFromInvsSecurityTypeGet() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
  public InvsSecurityTypeObjectData getInvsSecurityTypeObjectDataInvsSecurityTypeFromInvsSecurityTypeUpdate() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
  /**
   @deprecated
   */
  public void setInvsSecurityTypeObjectFilter(InvsSecurityTypeObjectFilter data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(data, new HashMap()).get("InvsSecurityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSecurityTypeObjectData(InvsSecurityTypeObjectData data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(data, new HashMap()).get("InvsSecurityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsSecurityTypeObjectKeyData(InvsSecurityTypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsSecurityType", InvsSecurityTypeObjectKeyHelper.toMap(data, new HashMap()).get("InvsSecurityTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsSecurityTypeObjectDataList getInvsSecurityTypeObjectDataList() {
    return InvsSecurityTypeObjectHelper.fromMapList(outputMap, "InvsSecurityTypeList");
  }
  /**
   @deprecated
   */
  public InvsSecurityTypeObjectData getInvsSecurityTypeObjectData() {
    return InvsSecurityTypeObjectHelper.fromMap(outputMap, "InvsSecurityType");
  }
}
