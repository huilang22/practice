/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneStatusRequest.java
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
public final class MilestoneStatusRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MilestoneStatusRequest (String request, MilestoneStatusRequestMethod method) {
    initialize(request, "MilestoneStatus", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MilestoneStatusRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMilestoneStatusForMilestoneStatusCreate(MilestoneStatusObjectData data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(data, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
  public void setMilestoneStatusForMilestoneStatusFind(MilestoneStatusObjectFilter data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(data, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
  public void setMilestoneStatusForMilestoneStatusGet(MilestoneStatusObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectKeyHelper.toMap(data, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
  public void setMilestoneStatusForMilestoneStatusUpdate(MilestoneStatusObjectData data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(data, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }
  public MilestoneStatusObjectData getMilestoneStatusObjectDataMilestoneStatusFromMilestoneStatusCreate() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
  public MilestoneStatusObjectDataList getMilestoneStatusObjectDataMilestoneStatusFromMilestoneStatusFind() {
    return MilestoneStatusObjectHelper.fromMapList(outputMap, "MilestoneStatusList");
  }
  public MilestoneStatusObjectData getMilestoneStatusObjectDataMilestoneStatusFromMilestoneStatusGet() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
  public MilestoneStatusObjectData getMilestoneStatusObjectDataMilestoneStatusFromMilestoneStatusUpdate() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
  /**
   @deprecated
   */
  public void setMilestoneStatusObjectFilter(MilestoneStatusObjectFilter data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(data, new HashMap()).get("MilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneStatusObjectData(MilestoneStatusObjectData data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(data, new HashMap()).get("MilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneStatusObjectKeyData(MilestoneStatusObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneStatus", MilestoneStatusObjectKeyHelper.toMap(data, new HashMap()).get("MilestoneStatusObject"));
    }
  }
  /**
   @deprecated
   */
  public MilestoneStatusObjectDataList getMilestoneStatusObjectDataList() {
    return MilestoneStatusObjectHelper.fromMapList(outputMap, "MilestoneStatusList");
  }
  /**
   @deprecated
   */
  public MilestoneStatusObjectData getMilestoneStatusObjectData() {
    return MilestoneStatusObjectHelper.fromMap(outputMap, "MilestoneStatus");
  }
}
