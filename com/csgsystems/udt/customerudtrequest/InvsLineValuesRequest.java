/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineValuesRequest.java
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
public final class InvsLineValuesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLineValuesRequest (String request, InvsLineValuesRequestMethod method) {
    initialize(request, "InvsLineValues", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLineValuesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLineValuesForInvsLineValuesCreate(InvsLineValuesObjectData data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(data, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
  public void setInvsLineValuesForInvsLineValuesFind(InvsLineValuesObjectFilter data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(data, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
  public void setInvsLineValuesForInvsLineValuesGet(InvsLineValuesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectKeyHelper.toMap(data, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
  public void setInvsLineValuesForInvsLineValuesUpdate(InvsLineValuesObjectData data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(data, new HashMap(), "InvsLineValues").get("InvsLineValues"));
    }
  }
  public InvsLineValuesObjectData getInvsLineValuesObjectDataInvsLineValuesFromInvsLineValuesCreate() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
  public InvsLineValuesObjectDataList getInvsLineValuesObjectDataInvsLineValuesFromInvsLineValuesFind() {
    return InvsLineValuesObjectHelper.fromMapList(outputMap, "InvsLineValuesList");
  }
  public InvsLineValuesObjectData getInvsLineValuesObjectDataInvsLineValuesFromInvsLineValuesGet() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
  public InvsLineValuesObjectData getInvsLineValuesObjectDataInvsLineValuesFromInvsLineValuesUpdate() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
  /**
   @deprecated
   */
  public void setInvsLineValuesObjectFilter(InvsLineValuesObjectFilter data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(data, new HashMap()).get("InvsLineValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineValuesObjectData(InvsLineValuesObjectData data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectHelper.toMap(data, new HashMap()).get("InvsLineValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLineValuesObjectKeyData(InvsLineValuesObjectKeyData data) {
    if (data != null) {
      addInput("InvsLineValues", InvsLineValuesObjectKeyHelper.toMap(data, new HashMap()).get("InvsLineValuesObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLineValuesObjectDataList getInvsLineValuesObjectDataList() {
    return InvsLineValuesObjectHelper.fromMapList(outputMap, "InvsLineValuesList");
  }
  /**
   @deprecated
   */
  public InvsLineValuesObjectData getInvsLineValuesObjectData() {
    return InvsLineValuesObjectHelper.fromMap(outputMap, "InvsLineValues");
  }
}
