/*
 * Generated code DO NOT EDIT
 * Generated file: AdjTransGroupRequest.java
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
public final class AdjTransGroupRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AdjTransGroupRequest (String request, AdjTransGroupRequestMethod method) {
    initialize(request, "AdjTransGroup", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AdjTransGroupRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAdjTransGroupForAdjTransGroupCreate(ATGObjectData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(data, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
  public void setAdjTransGroupForAdjTransGroupDelete(ATGObjectKeyData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(data, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
  public void setAdjTransGroupForAdjTransGroupFind(ATGObjectFilter data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(data, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
  public void setAdjTransGroupForAdjTransGroupGet(ATGObjectKeyData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(data, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
  public void setAdjTransGroupForAdjTransGroupUpdate(ATGObjectData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(data, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }
  public ATGObjectData getATGObjectDataAdjTransGroupFromAdjTransGroupCreate() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
  public ATGObjectData getATGObjectDataAdjTransGroupFromAdjTransGroupDelete() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
  public ATGObjectDataList getATGObjectDataAdjTransGroupFromAdjTransGroupFind() {
    return ATGObjectHelper.fromMapList(outputMap, "AdjTransGroupList");
  }
  public ATGObjectData getATGObjectDataAdjTransGroupFromAdjTransGroupGet() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
  public ATGObjectData getATGObjectDataAdjTransGroupFromAdjTransGroupUpdate() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
  /**
   @deprecated
   */
  public void setATGObjectFilter(ATGObjectFilter data) {
    if (data != null) {
      addInput("ATG", ATGObjectHelper.toMap(data, new HashMap()).get("ATGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setATGObjectData(ATGObjectData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(data, new HashMap()).get("ATGObject"));
    }
  }
  /**
   @deprecated
   */
  public void setATGObjectKeyData(ATGObjectKeyData data) {
    if (data != null) {
      addInput("AdjTransGroup", ATGObjectKeyHelper.toMap(data, new HashMap()).get("ATGObject"));
    }
  }
  /**
   @deprecated
   */
  public ATGObjectDataList getATGObjectDataList() {
    return ATGObjectHelper.fromMapList(outputMap, "ATGList");
  }
  /**
   @deprecated
   */
  public ATGObjectData getATGObjectData() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
