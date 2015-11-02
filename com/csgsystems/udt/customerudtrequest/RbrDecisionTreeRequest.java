/*
 * Generated code DO NOT EDIT
 * Generated file: RbrDecisionTreeRequest.java
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
public final class RbrDecisionTreeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrDecisionTreeRequest (String request, RbrDecisionTreeRequestMethod method) {
    initialize(request, "RbrDecisionTree", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrDecisionTreeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrDecisionTreeForRbrDecisionTreeCreate(RbrDecTreeObjectData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(data, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
  public void setRbrDecisionTreeForRbrDecisionTreeDelete(RbrDecTreeObjectKeyData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(data, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
  public void setRbrDecisionTreeForRbrDecisionTreeFind(RbrDecTreeObjectFilter data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(data, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
  public void setRbrDecisionTreeForRbrDecisionTreeGet(RbrDecTreeObjectKeyData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(data, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
  public void setRbrDecisionTreeForRbrDecisionTreeUpdate(RbrDecTreeObjectData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(data, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
  public RbrDecTreeObjectData getRbrDecTreeObjectDataRbrDecisionTreeFromRbrDecisionTreeCreate() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
  public RbrDecTreeObjectData getRbrDecTreeObjectDataRbrDecisionTreeFromRbrDecisionTreeDelete() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
  public RbrDecTreeObjectDataList getRbrDecTreeObjectDataRbrDecisionTreeFromRbrDecisionTreeFind() {
    return RbrDecTreeObjectHelper.fromMapList(outputMap, "RbrDecisionTreeList");
  }
  public RbrDecTreeObjectData getRbrDecTreeObjectDataRbrDecisionTreeFromRbrDecisionTreeGet() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
  public RbrDecTreeObjectData getRbrDecTreeObjectDataRbrDecisionTreeFromRbrDecisionTreeUpdate() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
  /**
   @deprecated
   */
  public void setRbrDecTreeObjectFilter(RbrDecTreeObjectFilter data) {
    if (data != null) {
      addInput("RbrDecTree", RbrDecTreeObjectHelper.toMap(data, new HashMap()).get("RbrDecTreeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrDecTreeObjectData(RbrDecTreeObjectData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(data, new HashMap()).get("RbrDecTreeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrDecTreeObjectKeyData(RbrDecTreeObjectKeyData data) {
    if (data != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectKeyHelper.toMap(data, new HashMap()).get("RbrDecTreeObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrDecTreeObjectDataList getRbrDecTreeObjectDataList() {
    return RbrDecTreeObjectHelper.fromMapList(outputMap, "RbrDecTreeList");
  }
  /**
   @deprecated
   */
  public RbrDecTreeObjectData getRbrDecTreeObjectData() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
