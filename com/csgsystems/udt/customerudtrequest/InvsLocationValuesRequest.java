/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesRequest.java
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
public final class InvsLocationValuesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationValuesRequest (String request, InvsLocationValuesRequestMethod method) {
    initialize(request, "InvsLocationValues", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationValuesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationValuesForInvsLocationValuesCreate(InvsLocationValuesObjectData data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(data, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
  public void setInvsLocationValuesForInvsLocationValuesFind(InvsLocationValuesObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(data, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
  public void setInvsLocationValuesForInvsLocationValuesGet(InvsLocationValuesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
  public void setInvsLocationValuesForInvsLocationValuesUpdate(InvsLocationValuesObjectData data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(data, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
  public InvsLocationValuesObjectData getInvsLocationValuesObjectDataInvsLocationValuesFromInvsLocationValuesCreate() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
  public InvsLocationValuesObjectDataList getInvsLocationValuesObjectDataInvsLocationValuesFromInvsLocationValuesFind() {
    return InvsLocationValuesObjectHelper.fromMapList(outputMap, "InvsLocationValuesList");
  }
  public InvsLocationValuesObjectData getInvsLocationValuesObjectDataInvsLocationValuesFromInvsLocationValuesGet() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
  public InvsLocationValuesObjectData getInvsLocationValuesObjectDataInvsLocationValuesFromInvsLocationValuesUpdate() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
  /**
   @deprecated
   */
  public void setInvsLocationValuesObjectFilter(InvsLocationValuesObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(data, new HashMap()).get("InvsLocationValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationValuesObjectData(InvsLocationValuesObjectData data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(data, new HashMap()).get("InvsLocationValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationValuesObjectKeyData(InvsLocationValuesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationValues", InvsLocationValuesObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationValuesObjectDataList getInvsLocationValuesObjectDataList() {
    return InvsLocationValuesObjectHelper.fromMapList(outputMap, "InvsLocationValuesList");
  }
  /**
   @deprecated
   */
  public InvsLocationValuesObjectData getInvsLocationValuesObjectData() {
    return InvsLocationValuesObjectHelper.fromMap(outputMap, "InvsLocationValues");
  }
}
