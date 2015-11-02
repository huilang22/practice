/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefRequest.java
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
public final class InvsLocationRefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationRefRequest (String request, InvsLocationRefRequestMethod method) {
    initialize(request, "InvsLocationRef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationRefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationRefForInvsLocationRefCreate(InvsLocationRefObjectData data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(data, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
  public void setInvsLocationRefForInvsLocationRefFind(InvsLocationRefObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(data, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
  public void setInvsLocationRefForInvsLocationRefGet(InvsLocationRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
  public void setInvsLocationRefForInvsLocationRefUpdate(InvsLocationRefObjectData data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(data, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
  public InvsLocationRefObjectData getInvsLocationRefObjectDataInvsLocationRefFromInvsLocationRefCreate() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
  public InvsLocationRefObjectDataList getInvsLocationRefObjectDataInvsLocationRefFromInvsLocationRefFind() {
    return InvsLocationRefObjectHelper.fromMapList(outputMap, "InvsLocationRefList");
  }
  public InvsLocationRefObjectData getInvsLocationRefObjectDataInvsLocationRefFromInvsLocationRefGet() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
  public InvsLocationRefObjectData getInvsLocationRefObjectDataInvsLocationRefFromInvsLocationRefUpdate() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
  /**
   @deprecated
   */
  public void setInvsLocationRefObjectFilter(InvsLocationRefObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(data, new HashMap()).get("InvsLocationRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationRefObjectData(InvsLocationRefObjectData data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(data, new HashMap()).get("InvsLocationRefObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationRefObjectKeyData(InvsLocationRefObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationRef", InvsLocationRefObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationRefObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationRefObjectDataList getInvsLocationRefObjectDataList() {
    return InvsLocationRefObjectHelper.fromMapList(outputMap, "InvsLocationRefList");
  }
  /**
   @deprecated
   */
  public InvsLocationRefObjectData getInvsLocationRefObjectData() {
    return InvsLocationRefObjectHelper.fromMap(outputMap, "InvsLocationRef");
  }
}
