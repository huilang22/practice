/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneRequest.java
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
public final class MilestoneRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MilestoneRequest (String request, MilestoneRequestMethod method) {
    initialize(request, "Milestone", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MilestoneRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMilestoneForMilestoneCreate(MilestoneObjectData data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(data, new HashMap(), "Milestone").get("Milestone"));
    }
  }
  public void setMilestoneForMilestoneFind(MilestoneObjectFilter data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(data, new HashMap(), "Milestone").get("Milestone"));
    }
  }
  public void setMilestoneForMilestoneGet(MilestoneObjectKeyData data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectKeyHelper.toMap(data, new HashMap(), "Milestone").get("Milestone"));
    }
  }
  public void setMilestoneForMilestoneUpdate(MilestoneObjectData data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(data, new HashMap(), "Milestone").get("Milestone"));
    }
  }
  public MilestoneObjectData getMilestoneObjectDataMilestoneFromMilestoneCreate() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
  public MilestoneObjectDataList getMilestoneObjectDataMilestoneFromMilestoneFind() {
    return MilestoneObjectHelper.fromMapList(outputMap, "MilestoneList");
  }
  public MilestoneObjectData getMilestoneObjectDataMilestoneFromMilestoneGet() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
  public MilestoneObjectData getMilestoneObjectDataMilestoneFromMilestoneUpdate() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
  /**
   @deprecated
   */
  public void setMilestoneObjectFilter(MilestoneObjectFilter data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(data, new HashMap()).get("MilestoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneObjectData(MilestoneObjectData data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectHelper.toMap(data, new HashMap()).get("MilestoneObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneObjectKeyData(MilestoneObjectKeyData data) {
    if (data != null) {
      addInput("Milestone", MilestoneObjectKeyHelper.toMap(data, new HashMap()).get("MilestoneObject"));
    }
  }
  /**
   @deprecated
   */
  public MilestoneObjectDataList getMilestoneObjectDataList() {
    return MilestoneObjectHelper.fromMapList(outputMap, "MilestoneList");
  }
  /**
   @deprecated
   */
  public MilestoneObjectData getMilestoneObjectData() {
    return MilestoneObjectHelper.fromMap(outputMap, "Milestone");
  }
}
