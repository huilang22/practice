/*
 * Generated code DO NOT EDIT
 * Generated file: CcViewAttributesRequest.java
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
public final class CcViewAttributesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CcViewAttributesRequest (String request, CcViewAttributesRequestMethod method) {
    initialize(request, "CcViewAttributes", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CcViewAttributesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCcViewAttributesForCcViewAttributesCreate(CcViewAttributesObjectData data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(data, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
  public void setCcViewAttributesForCcViewAttributesFind(CcViewAttributesObjectFilter data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(data, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
  public void setCcViewAttributesForCcViewAttributesGet(CcViewAttributesObjectKeyData data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectKeyHelper.toMap(data, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
  public CcViewAttributesObjectData getCcViewAttributesObjectDataCcViewAttributesFromCcViewAttributesCreate() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
  public CcViewAttributesObjectDataList getCcViewAttributesObjectDataCcViewAttributesFromCcViewAttributesFind() {
    return CcViewAttributesObjectHelper.fromMapList(outputMap, "CcViewAttributesList");
  }
  public CcViewAttributesObjectData getCcViewAttributesObjectDataCcViewAttributesFromCcViewAttributesGet() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
  /**
   @deprecated
   */
  public void setCcViewAttributesObjectFilter(CcViewAttributesObjectFilter data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(data, new HashMap()).get("CcViewAttributesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcViewAttributesObjectData(CcViewAttributesObjectData data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(data, new HashMap()).get("CcViewAttributesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCcViewAttributesObjectKeyData(CcViewAttributesObjectKeyData data) {
    if (data != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectKeyHelper.toMap(data, new HashMap()).get("CcViewAttributesObject"));
    }
  }
  /**
   @deprecated
   */
  public CcViewAttributesObjectDataList getCcViewAttributesObjectDataList() {
    return CcViewAttributesObjectHelper.fromMapList(outputMap, "CcViewAttributesList");
  }
  /**
   @deprecated
   */
  public CcViewAttributesObjectData getCcViewAttributesObjectData() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
}
