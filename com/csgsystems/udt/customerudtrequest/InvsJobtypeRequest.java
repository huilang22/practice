/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobtypeRequest.java
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
public final class InvsJobtypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsJobtypeRequest (String request, InvsJobtypeRequestMethod method) {
    initialize(request, "InvsJobtype", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsJobtypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsJobtypeForInvsJobtypeFind(InvsJobtypeObjectFilter data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(data, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }
  public void setInvsJobtypeForInvsJobtypeGet(InvsJobtypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectKeyHelper.toMap(data, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }
  public void setInvsJobtypeForInvsJobtypeUpdate(InvsJobtypeObjectData data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(data, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }
  public InvsJobtypeObjectDataList getInvsJobtypeObjectDataInvsJobtypeFromInvsJobtypeFind() {
    return InvsJobtypeObjectHelper.fromMapList(outputMap, "InvsJobtypeList");
  }
  public InvsJobtypeObjectData getInvsJobtypeObjectDataInvsJobtypeFromInvsJobtypeGet() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
  public InvsJobtypeObjectData getInvsJobtypeObjectDataInvsJobtypeFromInvsJobtypeUpdate() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
  /**
   @deprecated
   */
  public void setInvsJobtypeObjectFilter(InvsJobtypeObjectFilter data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(data, new HashMap()).get("InvsJobtypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsJobtypeObjectData(InvsJobtypeObjectData data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(data, new HashMap()).get("InvsJobtypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsJobtypeObjectKeyData(InvsJobtypeObjectKeyData data) {
    if (data != null) {
      addInput("InvsJobtype", InvsJobtypeObjectKeyHelper.toMap(data, new HashMap()).get("InvsJobtypeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsJobtypeObjectDataList getInvsJobtypeObjectDataList() {
    return InvsJobtypeObjectHelper.fromMapList(outputMap, "InvsJobtypeList");
  }
  /**
   @deprecated
   */
  public InvsJobtypeObjectData getInvsJobtypeObjectData() {
    return InvsJobtypeObjectHelper.fromMap(outputMap, "InvsJobtype");
  }
}
