/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailRequest.java
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
public final class InvsLocationDetailRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsLocationDetailRequest (String request, InvsLocationDetailRequestMethod method) {
    initialize(request, "InvsLocationDetail", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsLocationDetailRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsLocationDetailForInvsLocationDetailCreate(InvsLocationDetailObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(data, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
  public void setInvsLocationDetailForInvsLocationDetailDelete(InvsLocationDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
  public void setInvsLocationDetailForInvsLocationDetailFind(InvsLocationDetailObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(data, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
  public void setInvsLocationDetailForInvsLocationDetailGet(InvsLocationDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(data, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
  public void setInvsLocationDetailForInvsLocationDetailUpdate(InvsLocationDetailObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(data, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
  public InvsLocationDetailObjectData getInvsLocationDetailObjectDataInvsLocationDetailFromInvsLocationDetailCreate() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
  public InvsLocationDetailObjectData getInvsLocationDetailObjectDataInvsLocationDetailFromInvsLocationDetailDelete() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
  public InvsLocationDetailObjectDataList getInvsLocationDetailObjectDataInvsLocationDetailFromInvsLocationDetailFind() {
    return InvsLocationDetailObjectHelper.fromMapList(outputMap, "InvsLocationDetailList");
  }
  public InvsLocationDetailObjectData getInvsLocationDetailObjectDataInvsLocationDetailFromInvsLocationDetailGet() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
  public InvsLocationDetailObjectData getInvsLocationDetailObjectDataInvsLocationDetailFromInvsLocationDetailUpdate() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
  /**
   @deprecated
   */
  public void setInvsLocationDetailObjectFilter(InvsLocationDetailObjectFilter data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(data, new HashMap()).get("InvsLocationDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationDetailObjectData(InvsLocationDetailObjectData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(data, new HashMap()).get("InvsLocationDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsLocationDetailObjectKeyData(InvsLocationDetailObjectKeyData data) {
    if (data != null) {
      addInput("InvsLocationDetail", InvsLocationDetailObjectKeyHelper.toMap(data, new HashMap()).get("InvsLocationDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsLocationDetailObjectDataList getInvsLocationDetailObjectDataList() {
    return InvsLocationDetailObjectHelper.fromMapList(outputMap, "InvsLocationDetailList");
  }
  /**
   @deprecated
   */
  public InvsLocationDetailObjectData getInvsLocationDetailObjectData() {
    return InvsLocationDetailObjectHelper.fromMap(outputMap, "InvsLocationDetail");
  }
}
