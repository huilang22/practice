/*
 * Generated code DO NOT EDIT
 * Generated file: ValidMilestoneStatusRequest.java
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

import com.csgsystems.we.data.*;
public final class ValidMilestoneStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ValidMilestoneStatusRequest (String request, ValidMilestoneStatusRequestMethod method) {
    initialize(request, "ValidMilestoneStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ValidMilestoneStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setValidMilestoneStatusForValidMilestoneStatusCreate(ValidMilestoneStatusObjectData data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(data, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
  public void setValidMilestoneStatusForValidMilestoneStatusFind(ValidMilestoneStatusObjectFilter data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(data, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
  public void setValidMilestoneStatusForValidMilestoneStatusGet(ValidMilestoneStatusObjectKeyData data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectKeyHelper.toMap(data, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
  public void setValidMilestoneStatusForValidMilestoneStatusUpdate(ValidMilestoneStatusObjectData data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(data, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }
  public ValidMilestoneStatusObjectData getValidMilestoneStatusObjectDataValidMilestoneStatusFromValidMilestoneStatusCreate() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
  public ValidMilestoneStatusObjectDataList getValidMilestoneStatusObjectDataValidMilestoneStatusFromValidMilestoneStatusFind() {
    return ValidMilestoneStatusObjectHelper.fromMapList(outputMap, "ValidMilestoneStatusList");
  }
  public ValidMilestoneStatusObjectData getValidMilestoneStatusObjectDataValidMilestoneStatusFromValidMilestoneStatusGet() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
  public ValidMilestoneStatusObjectData getValidMilestoneStatusObjectDataValidMilestoneStatusFromValidMilestoneStatusUpdate() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
  /**
   @deprecated
   */
  public void setValidMilestoneStatusObjectFilter(ValidMilestoneStatusObjectFilter data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(data, new HashMap()).get("ValidMilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setValidMilestoneStatusObjectData(ValidMilestoneStatusObjectData data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(data, new HashMap()).get("ValidMilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setValidMilestoneStatusObjectKeyData(ValidMilestoneStatusObjectKeyData data) {
    if (data != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectKeyHelper.toMap(data, new HashMap()).get("ValidMilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public ValidMilestoneStatusObjectDataList getValidMilestoneStatusObjectDataList() {
    return ValidMilestoneStatusObjectHelper.fromMapList(outputMap, "ValidMilestoneStatusList");
  }
  /**
   @deprecated
   */
  public ValidMilestoneStatusObjectData getValidMilestoneStatusObjectData() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
}
