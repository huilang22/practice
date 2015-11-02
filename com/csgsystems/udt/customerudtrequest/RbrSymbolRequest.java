/*
 * Generated code DO NOT EDIT
 * Generated file: RbrSymbolRequest.java
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
public final class RbrSymbolRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrSymbolRequest (String request, RbrSymbolRequestMethod method) {
    initialize(request, "RbrSymbol", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrSymbolRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrSymbolForRbrSymbolCreate(RbrSymbolObjectData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(data, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
  public void setRbrSymbolForRbrSymbolDelete(RbrSymbolObjectKeyData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(data, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
  public void setRbrSymbolForRbrSymbolFind(RbrSymbolObjectFilter data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(data, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
  public void setRbrSymbolForRbrSymbolGet(RbrSymbolObjectKeyData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(data, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
  public void setRbrSymbolForRbrSymbolUpdate(RbrSymbolObjectData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(data, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }
  public RbrSymbolObjectData getRbrSymbolObjectDataRbrSymbolFromRbrSymbolCreate() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
  public RbrSymbolObjectData getRbrSymbolObjectDataRbrSymbolFromRbrSymbolDelete() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
  public RbrSymbolObjectDataList getRbrSymbolObjectDataRbrSymbolFromRbrSymbolFind() {
    return RbrSymbolObjectHelper.fromMapList(outputMap, "RbrSymbolList");
  }
  public RbrSymbolObjectData getRbrSymbolObjectDataRbrSymbolFromRbrSymbolGet() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
  public RbrSymbolObjectData getRbrSymbolObjectDataRbrSymbolFromRbrSymbolUpdate() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
  /**
   @deprecated
   */
  public void setRbrSymbolObjectFilter(RbrSymbolObjectFilter data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(data, new HashMap()).get("RbrSymbolObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrSymbolObjectData(RbrSymbolObjectData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(data, new HashMap()).get("RbrSymbolObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrSymbolObjectKeyData(RbrSymbolObjectKeyData data) {
    if (data != null) {
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(data, new HashMap()).get("RbrSymbolObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrSymbolObjectDataList getRbrSymbolObjectDataList() {
    return RbrSymbolObjectHelper.fromMapList(outputMap, "RbrSymbolList");
  }
  /**
   @deprecated
   */
  public RbrSymbolObjectData getRbrSymbolObjectData() {
    return RbrSymbolObjectHelper.fromMap(outputMap, "RbrSymbol");
  }
}
