/*
 * Generated code DO NOT EDIT
 * Generated file: RbrProcedureRequest.java
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
public final class RbrProcedureRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrProcedureRequest (String request, RbrProcedureRequestMethod method) {
    initialize(request, "RbrProcedure", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrProcedureRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrProcedureForRbrProcedureCreate(RbrProcObjectData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(data, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
  public void setRbrProcedureForRbrProcedureDelete(RbrProcObjectKeyData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(data, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
  public void setRbrProcedureForRbrProcedureFind(RbrProcObjectFilter data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(data, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
  public void setRbrProcedureForRbrProcedureGet(RbrProcObjectKeyData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(data, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
  public void setRbrProcedureForRbrProcedureUpdate(RbrProcObjectData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(data, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
  public RbrProcObjectData getRbrProcObjectDataRbrProcedureFromRbrProcedureCreate() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
  public RbrProcObjectData getRbrProcObjectDataRbrProcedureFromRbrProcedureDelete() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
  public RbrProcObjectDataList getRbrProcObjectDataRbrProcedureFromRbrProcedureFind() {
    return RbrProcObjectHelper.fromMapList(outputMap, "RbrProcedureList");
  }
  public RbrProcObjectData getRbrProcObjectDataRbrProcedureFromRbrProcedureGet() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
  public RbrProcObjectData getRbrProcObjectDataRbrProcedureFromRbrProcedureUpdate() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
  /**
   @deprecated
   */
  public void setRbrProcObjectFilter(RbrProcObjectFilter data) {
    if (data != null) {
      addInput("RbrProc", RbrProcObjectHelper.toMap(data, new HashMap()).get("RbrProcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrProcObjectData(RbrProcObjectData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(data, new HashMap()).get("RbrProcObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrProcObjectKeyData(RbrProcObjectKeyData data) {
    if (data != null) {
      addInput("RbrProcedure", RbrProcObjectKeyHelper.toMap(data, new HashMap()).get("RbrProcObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrProcObjectDataList getRbrProcObjectDataList() {
    return RbrProcObjectHelper.fromMapList(outputMap, "RbrProcList");
  }
  /**
   @deprecated
   */
  public RbrProcObjectData getRbrProcObjectData() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
