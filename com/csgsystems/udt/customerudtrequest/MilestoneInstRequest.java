/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstRequest.java
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
public final class MilestoneInstRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MilestoneInstRequest (String request, MilestoneInstRequestMethod method) {
    initialize(request, "MilestoneInst", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MilestoneInstRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMilestoneInstForMilestoneInstCreate(MilestoneInstObjectData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public void setMilestoneInstForMilestoneInstFind(MilestoneInstObjectFilter data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public void setMilestoneInstForMilestoneInstGet(MilestoneInstObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectKeyHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public void setMilestoneInstForMilestoneInstModify(MilestoneInstObjectData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public void setMilestoneInstForMilestoneInstRequeue(MilestoneInstObjectData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public void setMilestoneInstForMilestoneInstUpdate(MilestoneInstObjectData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }
  public MilestoneInstObjectData getMilestoneInstObjectDataMilestoneInstFromMilestoneInstCreate() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
  public MilestoneInstObjectDataList getMilestoneInstObjectDataMilestoneInstFromMilestoneInstFind() {
    return MilestoneInstObjectHelper.fromMapList(outputMap, "MilestoneInstList");
  }
  public MilestoneInstObjectData getMilestoneInstObjectDataMilestoneInstFromMilestoneInstGet() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
  public MilestoneInstObjectData getMilestoneInstObjectDataMilestoneInstFromMilestoneInstModify() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
  public MilestoneInstObjectData getMilestoneInstObjectDataMilestoneInstFromMilestoneInstRequeue() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
  public MilestoneInstObjectData getMilestoneInstObjectDataMilestoneInstFromMilestoneInstUpdate() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
  /**
   @deprecated
   */
  public void setMilestoneInstObjectFilter(MilestoneInstObjectFilter data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap()).get("MilestoneInstObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneInstObjectData(MilestoneInstObjectData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(data, new HashMap()).get("MilestoneInstObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneInstObjectKeyData(MilestoneInstObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneInst", MilestoneInstObjectKeyHelper.toMap(data, new HashMap()).get("MilestoneInstObject"));
    }
  }
  /**
   @deprecated
   */
  public MilestoneInstObjectDataList getMilestoneInstObjectDataList() {
    return MilestoneInstObjectHelper.fromMapList(outputMap, "MilestoneInstList");
  }
  /**
   @deprecated
   */
  public MilestoneInstObjectData getMilestoneInstObjectData() {
    return MilestoneInstObjectHelper.fromMap(outputMap, "MilestoneInst");
  }
}
