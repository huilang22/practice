/*
 * Generated code DO NOT EDIT
 * Generated file: RbrXmlRuleRequest.java
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
public final class RbrXmlRuleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public RbrXmlRuleRequest (String request, RbrXmlRuleRequestMethod method) {
    initialize(request, "RbrXmlRule", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (RbrXmlRuleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setRbrXmlRuleForRbrXmlRuleCreate(RbrXmlRuleObjectData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(data, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
  public void setRbrXmlRuleForRbrXmlRuleDelete(RbrXmlRuleObjectKeyData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(data, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
  public void setRbrXmlRuleForRbrXmlRuleFind(RbrXmlRuleObjectFilter data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(data, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
  public void setRbrXmlRuleForRbrXmlRuleGet(RbrXmlRuleObjectKeyData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(data, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
  public void setRbrXmlRuleForRbrXmlRuleUpdate(RbrXmlRuleObjectData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(data, new HashMap(), "RbrXmlRule").get("RbrXmlRule"));
    }
  }
  public RbrXmlRuleObjectData getRbrXmlRuleObjectDataRbrXmlRuleFromRbrXmlRuleCreate() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
  public RbrXmlRuleObjectData getRbrXmlRuleObjectDataRbrXmlRuleFromRbrXmlRuleDelete() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
  public RbrXmlRuleObjectDataList getRbrXmlRuleObjectDataRbrXmlRuleFromRbrXmlRuleFind() {
    return RbrXmlRuleObjectHelper.fromMapList(outputMap, "RbrXmlRuleList");
  }
  public RbrXmlRuleObjectData getRbrXmlRuleObjectDataRbrXmlRuleFromRbrXmlRuleGet() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
  public RbrXmlRuleObjectData getRbrXmlRuleObjectDataRbrXmlRuleFromRbrXmlRuleUpdate() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
  /**
   @deprecated
   */
  public void setRbrXmlRuleObjectFilter(RbrXmlRuleObjectFilter data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(data, new HashMap()).get("RbrXmlRuleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrXmlRuleObjectData(RbrXmlRuleObjectData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectHelper.toMap(data, new HashMap()).get("RbrXmlRuleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setRbrXmlRuleObjectKeyData(RbrXmlRuleObjectKeyData data) {
    if (data != null) {
      addInput("RbrXmlRule", RbrXmlRuleObjectKeyHelper.toMap(data, new HashMap()).get("RbrXmlRuleObject"));
    }
  }
  /**
   @deprecated
   */
  public RbrXmlRuleObjectDataList getRbrXmlRuleObjectDataList() {
    return RbrXmlRuleObjectHelper.fromMapList(outputMap, "RbrXmlRuleList");
  }
  /**
   @deprecated
   */
  public RbrXmlRuleObjectData getRbrXmlRuleObjectData() {
    return RbrXmlRuleObjectHelper.fromMap(outputMap, "RbrXmlRule");
  }
}
