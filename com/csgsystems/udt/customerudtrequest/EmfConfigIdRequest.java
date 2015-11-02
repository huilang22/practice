/*
 * Generated code DO NOT EDIT
 * Generated file: EmfConfigIdRequest.java
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
public final class EmfConfigIdRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public EmfConfigIdRequest (String request, EmfConfigIdRequestMethod method) {
    initialize(request, "EmfConfigId", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (EmfConfigIdRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEmfConfigIdForEmfConfigIdCreate(ECIObjectData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(data, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
  public void setEmfConfigIdForEmfConfigIdDelete(ECIObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(data, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
  public void setEmfConfigIdForEmfConfigIdFind(ECIObjectFilter data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(data, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
  public void setEmfConfigIdForEmfConfigIdGet(ECIObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(data, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
  public void setEmfConfigIdForEmfConfigIdUpdate(ECIObjectData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(data, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
  public ECIObjectData getECIObjectDataEmfConfigIdFromEmfConfigIdCreate() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
  public ECIObjectData getECIObjectDataEmfConfigIdFromEmfConfigIdDelete() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
  public ECIObjectDataList getECIObjectDataEmfConfigIdFromEmfConfigIdFind() {
    return ECIObjectHelper.fromMapList(outputMap, "EmfConfigIdList");
  }
  public ECIObjectData getECIObjectDataEmfConfigIdFromEmfConfigIdGet() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
  public ECIObjectData getECIObjectDataEmfConfigIdFromEmfConfigIdUpdate() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
  /**
   @deprecated
   */
  public void setECIObjectFilter(ECIObjectFilter data) {
    if (data != null) {
      addInput("ECI", ECIObjectHelper.toMap(data, new HashMap()).get("ECIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setECIObjectData(ECIObjectData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(data, new HashMap()).get("ECIObject"));
    }
  }
  /**
   @deprecated
   */
  public void setECIObjectKeyData(ECIObjectKeyData data) {
    if (data != null) {
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(data, new HashMap()).get("ECIObject"));
    }
  }
  /**
   @deprecated
   */
  public ECIObjectDataList getECIObjectDataList() {
    return ECIObjectHelper.fromMapList(outputMap, "ECIList");
  }
  /**
   @deprecated
   */
  public ECIObjectData getECIObjectData() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
