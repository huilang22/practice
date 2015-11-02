/*
 * Generated code DO NOT EDIT
 * Generated file: RbrVariableRequest.java
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
public final class RbrVariableRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrVariableRequest (String request, RbrVariableRequestMethod method) {
    initialize(request, "RbrVariable", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrVariableRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrVariableForRbrVariableCreate(RbrVarObjectData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(data, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
  public void setRbrVariableForRbrVariableDelete(RbrVarObjectKeyData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(data, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
  public void setRbrVariableForRbrVariableFind(RbrVarObjectFilter data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(data, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
  public void setRbrVariableForRbrVariableGet(RbrVarObjectKeyData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(data, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
  public void setRbrVariableForRbrVariableUpdate(RbrVarObjectData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(data, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
  public RbrVarObjectData getRbrVarObjectDataRbrVariableFromRbrVariableCreate() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
  public RbrVarObjectData getRbrVarObjectDataRbrVariableFromRbrVariableDelete() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
  public RbrVarObjectDataList getRbrVarObjectDataRbrVariableFromRbrVariableFind() {
    return RbrVarObjectHelper.fromMapList(outputMap, "RbrVariableList");
  }
  public RbrVarObjectData getRbrVarObjectDataRbrVariableFromRbrVariableGet() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
  public RbrVarObjectData getRbrVarObjectDataRbrVariableFromRbrVariableUpdate() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
  /**
   @deprecated
   */
  public void setRbrVarObjectFilter(RbrVarObjectFilter data) {
    if (data != null) {
      addInput("RbrVar", RbrVarObjectHelper.toMap(data, new HashMap()).get("RbrVarObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrVarObjectData(RbrVarObjectData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(data, new HashMap()).get("RbrVarObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrVarObjectKeyData(RbrVarObjectKeyData data) {
    if (data != null) {
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(data, new HashMap()).get("RbrVarObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrVarObjectDataList getRbrVarObjectDataList() {
    return RbrVarObjectHelper.fromMapList(outputMap, "RbrVarList");
  }
  /**
   @deprecated
   */
  public RbrVarObjectData getRbrVarObjectData() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
