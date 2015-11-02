/*
 * Generated code DO NOT EDIT
 * Generated file: ConditionRequest.java
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

import com.csgsystems.om.data.*;
public final class ConditionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ConditionRequest (String request, ConditionRequestMethod method) {
    initialize(request, "Condition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ConditionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setConditionForConditionCreate(CondObjData data) {
    if (data != null) {
      addInput("Condition", CondObjHelper.toMap(data, new HashMap(), "Condition").get("Condition"));
    }
  }
  public void setConditionForConditionFind(CondObjFilter data) {
    if (data != null) {
      addInput("Condition", CondObjHelper.toMap(data, new HashMap(), "Condition").get("Condition"));
    }
  }
  public void setConditionForConditionGet(CondObjKeyData data) {
    if (data != null) {
      addInput("Condition", CondObjKeyHelper.toMap(data, new HashMap(), "Condition").get("Condition"));
    }
  }
  public void setConditionForConditionUpdate(CondObjData data) {
    if (data != null) {
      addInput("Condition", CondObjHelper.toMap(data, new HashMap(), "Condition").get("Condition"));
    }
  }
  public CondObjData getCondObjDataConditionFromConditionCreate() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
  public CondObjDataList getCondObjDataConditionFromConditionFind() {
    return CondObjHelper.fromMapList(outputMap, "ConditionList");
  }
  public CondObjData getCondObjDataConditionFromConditionGet() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
  public CondObjData getCondObjDataConditionFromConditionUpdate() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
  /**
   @deprecated
   */
  public void setCondObjFilter(CondObjFilter data) {
    if (data != null) {
      addInput("CondObj", CondObjHelper.toMap(data, new HashMap()).get("CondObj"));
    }
  }
  /**
   @deprecated
   */
  public void setCondObjData(CondObjData data) {
    if (data != null) {
      addInput("Condition", CondObjHelper.toMap(data, new HashMap()).get("CondObj"));
    }
  }
  /**
   @deprecated
   */
  public void setCondObjKeyData(CondObjKeyData data) {
    if (data != null) {
      addInput("Condition", CondObjKeyHelper.toMap(data, new HashMap()).get("CondObj"));
    }
  }
  /**
   @deprecated
   */
  public CondObjDataList getCondObjDataList() {
    return CondObjHelper.fromMapList(outputMap, "CondObjList");
  }
  /**
   @deprecated
   */
  public CondObjData getCondObjData() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
}
