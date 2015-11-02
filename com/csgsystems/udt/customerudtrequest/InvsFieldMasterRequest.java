/*
 * Generated code DO NOT EDIT
 * Generated file: InvsFieldMasterRequest.java
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
public final class InvsFieldMasterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsFieldMasterRequest (String request, InvsFieldMasterRequestMethod method) {
    initialize(request, "InvsFieldMaster", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsFieldMasterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsFieldMasterForInvsFieldMasterCreate(InvsFieldMasterObjectData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(data, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
  public void setInvsFieldMasterForInvsFieldMasterDelete(InvsFieldMasterObjectKeyData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(data, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
  public void setInvsFieldMasterForInvsFieldMasterFind(InvsFieldMasterObjectFilter data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(data, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
  public void setInvsFieldMasterForInvsFieldMasterGet(InvsFieldMasterObjectKeyData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(data, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
  public void setInvsFieldMasterForInvsFieldMasterUpdate(InvsFieldMasterObjectData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(data, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }
  public InvsFieldMasterObjectData getInvsFieldMasterObjectDataInvsFieldMasterFromInvsFieldMasterCreate() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
  public InvsFieldMasterObjectData getInvsFieldMasterObjectDataInvsFieldMasterFromInvsFieldMasterDelete() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
  public InvsFieldMasterObjectDataList getInvsFieldMasterObjectDataInvsFieldMasterFromInvsFieldMasterFind() {
    return InvsFieldMasterObjectHelper.fromMapList(outputMap, "InvsFieldMasterList");
  }
  public InvsFieldMasterObjectData getInvsFieldMasterObjectDataInvsFieldMasterFromInvsFieldMasterGet() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
  public InvsFieldMasterObjectData getInvsFieldMasterObjectDataInvsFieldMasterFromInvsFieldMasterUpdate() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
  /**
   @deprecated
   */
  public void setInvsFieldMasterObjectFilter(InvsFieldMasterObjectFilter data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(data, new HashMap()).get("InvsFieldMasterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsFieldMasterObjectData(InvsFieldMasterObjectData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(data, new HashMap()).get("InvsFieldMasterObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsFieldMasterObjectKeyData(InvsFieldMasterObjectKeyData data) {
    if (data != null) {
      addInput("InvsFieldMaster", InvsFieldMasterObjectKeyHelper.toMap(data, new HashMap()).get("InvsFieldMasterObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsFieldMasterObjectDataList getInvsFieldMasterObjectDataList() {
    return InvsFieldMasterObjectHelper.fromMapList(outputMap, "InvsFieldMasterList");
  }
  /**
   @deprecated
   */
  public InvsFieldMasterObjectData getInvsFieldMasterObjectData() {
    return InvsFieldMasterObjectHelper.fromMap(outputMap, "InvsFieldMaster");
  }
}
