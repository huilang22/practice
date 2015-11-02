/*
 * Generated code DO NOT EDIT
 * Generated file: ArmStatusRequest.java
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
public final class ArmStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ArmStatusRequest (String request, ArmStatusRequestMethod method) {
    initialize(request, "ArmStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ArmStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setArmStatusForArmStatusFind(ASObjectFilter data) {
    if (data != null) {
      addInput("ArmStatus", ASObjectHelper.toMap(data, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }
  public void setArmStatusForArmStatusGet(ASObjectKeyData data) {
    if (data != null) {
      addInput("ArmStatus", ASObjectKeyHelper.toMap(data, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }
  public ASObjectDataList getASObjectDataArmStatusFromArmStatusFind() {
    return ASObjectHelper.fromMapList(outputMap, "ArmStatusList");
  }
  public ASObjectData getASObjectDataArmStatusFromArmStatusGet() {
    return ASObjectHelper.fromMap(outputMap, "ArmStatus");
  }
  /**
   @deprecated
   */
  public void setASObjectFilter(ASObjectFilter data) {
    if (data != null) {
      addInput("AS", ASObjectHelper.toMap(data, new HashMap()).get("ASObject"));
    }
  }
  /**
   @deprecated
   */
  public void setASObjectKeyData(ASObjectKeyData data) {
    if (data != null) {
      addInput("ArmStatus", ASObjectKeyHelper.toMap(data, new HashMap()).get("ASObject"));
    }
  }
  /**
   @deprecated
   */
  public ASObjectDataList getASObjectDataList() {
    return ASObjectHelper.fromMapList(outputMap, "ASList");
  }
  /**
   @deprecated
   */
  public ASObjectData getASObjectData() {
    return ASObjectHelper.fromMap(outputMap, "ArmStatus");
  }
}
