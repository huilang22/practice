/*
 * Generated code DO NOT EDIT
 * Generated file: InvsOperatorRequest.java
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
public final class InvsOperatorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsOperatorRequest (String request, InvsOperatorRequestMethod method) {
    initialize(request, "InvsOperator", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsOperatorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsOperatorForInvsOperatorCreate(InvsOperatorObjectData data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(data, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
  public void setInvsOperatorForInvsOperatorFind(InvsOperatorObjectFilter data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(data, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
  public void setInvsOperatorForInvsOperatorGet(InvsOperatorObjectKeyData data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectKeyHelper.toMap(data, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
  public void setInvsOperatorForInvsOperatorUpdate(InvsOperatorObjectData data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(data, new HashMap(), "InvsOperator").get("InvsOperator"));
    }
  }
  public InvsOperatorObjectData getInvsOperatorObjectDataInvsOperatorFromInvsOperatorCreate() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
  public InvsOperatorObjectDataList getInvsOperatorObjectDataInvsOperatorFromInvsOperatorFind() {
    return InvsOperatorObjectHelper.fromMapList(outputMap, "InvsOperatorList");
  }
  public InvsOperatorObjectData getInvsOperatorObjectDataInvsOperatorFromInvsOperatorGet() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
  public InvsOperatorObjectData getInvsOperatorObjectDataInvsOperatorFromInvsOperatorUpdate() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
  /**
   @deprecated
   */
  public void setInvsOperatorObjectFilter(InvsOperatorObjectFilter data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(data, new HashMap()).get("InvsOperatorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsOperatorObjectData(InvsOperatorObjectData data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectHelper.toMap(data, new HashMap()).get("InvsOperatorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsOperatorObjectKeyData(InvsOperatorObjectKeyData data) {
    if (data != null) {
      addInput("InvsOperator", InvsOperatorObjectKeyHelper.toMap(data, new HashMap()).get("InvsOperatorObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsOperatorObjectDataList getInvsOperatorObjectDataList() {
    return InvsOperatorObjectHelper.fromMapList(outputMap, "InvsOperatorList");
  }
  /**
   @deprecated
   */
  public InvsOperatorObjectData getInvsOperatorObjectData() {
    return InvsOperatorObjectHelper.fromMap(outputMap, "InvsOperator");
  }
}
