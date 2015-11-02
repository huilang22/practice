/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterRequest.java
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
public final class SystemParameterRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SystemParameterRequest (String request, SystemParameterRequestMethod method) {
    initialize(request, "SystemParameter", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SystemParameterRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSystemParameterForSystemParameterCreate(SPObjectData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(data, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
  public void setSystemParameterForSystemParameterDelete(SPObjectKeyData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectKeyHelper.toMap(data, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
  public void setSystemParameterForSystemParameterFind(SPObjectFilter data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(data, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
  public void setSystemParameterForSystemParameterGet(SPObjectKeyData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectKeyHelper.toMap(data, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
  public void setSystemParameterForSystemParameterUpdate(SPObjectData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(data, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
  public SPObjectData getSPObjectDataSystemParameterFromSystemParameterCreate() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
  public SPObjectData getSPObjectDataSystemParameterFromSystemParameterDelete() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
  public SPObjectDataList getSPObjectDataSystemParameterFromSystemParameterFind() {
    return SPObjectHelper.fromMapList(outputMap, "SystemParameterList");
  }
  public SPObjectData getSPObjectDataSystemParameterFromSystemParameterGet() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
  public SPObjectData getSPObjectDataSystemParameterFromSystemParameterUpdate() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
  /**
   @deprecated
   */
  public void setSPObjectFilter(SPObjectFilter data) {
    if (data != null) {
      addInput("SP", SPObjectHelper.toMap(data, new HashMap()).get("SPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSPObjectData(SPObjectData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectHelper.toMap(data, new HashMap()).get("SPObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSPObjectKeyData(SPObjectKeyData data) {
    if (data != null) {
      addInput("SystemParameter", SPObjectKeyHelper.toMap(data, new HashMap()).get("SPObject"));
    }
  }
  /**
   @deprecated
   */
  public SPObjectDataList getSPObjectDataList() {
    return SPObjectHelper.fromMapList(outputMap, "SPList");
  }
  /**
   @deprecated
   */
  public SPObjectData getSPObjectData() {
    return SPObjectHelper.fromMap(outputMap, "SystemParameter");
  }
}
