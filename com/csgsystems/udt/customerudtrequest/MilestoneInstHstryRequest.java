/*
 * Generated code DO NOT EDIT
 * Generated file: MilestoneInstHstryRequest.java
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
public final class MilestoneInstHstryRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MilestoneInstHstryRequest (String request, MilestoneInstHstryRequestMethod method) {
    initialize(request, "MilestoneInstHstry", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MilestoneInstHstryRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMilestoneInstHstryForMilestoneInstHstryCreate(MilestoneInstHstryObjectData data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(data, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
  public void setMilestoneInstHstryForMilestoneInstHstryFind(MilestoneInstHstryObjectFilter data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(data, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
  public void setMilestoneInstHstryForMilestoneInstHstryGet(MilestoneInstHstryObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectKeyHelper.toMap(data, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
  public void setMilestoneInstHstryForMilestoneInstHstryUpdate(MilestoneInstHstryObjectData data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(data, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }
  public MilestoneInstHstryObjectData getMilestoneInstHstryObjectDataMilestoneInstHstryFromMilestoneInstHstryCreate() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
  public MilestoneInstHstryObjectDataList getMilestoneInstHstryObjectDataMilestoneInstHstryFromMilestoneInstHstryFind() {
    return MilestoneInstHstryObjectHelper.fromMapList(outputMap, "MilestoneInstHstryList");
  }
  public MilestoneInstHstryObjectData getMilestoneInstHstryObjectDataMilestoneInstHstryFromMilestoneInstHstryGet() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
  public MilestoneInstHstryObjectData getMilestoneInstHstryObjectDataMilestoneInstHstryFromMilestoneInstHstryUpdate() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
  /**
   @deprecated
   */
  public void setMilestoneInstHstryObjectFilter(MilestoneInstHstryObjectFilter data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(data, new HashMap()).get("MilestoneInstHstryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneInstHstryObjectData(MilestoneInstHstryObjectData data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(data, new HashMap()).get("MilestoneInstHstryObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMilestoneInstHstryObjectKeyData(MilestoneInstHstryObjectKeyData data) {
    if (data != null) {
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectKeyHelper.toMap(data, new HashMap()).get("MilestoneInstHstryObject"));
    }
  }
  /**
   @deprecated
   */
  public MilestoneInstHstryObjectDataList getMilestoneInstHstryObjectDataList() {
    return MilestoneInstHstryObjectHelper.fromMapList(outputMap, "MilestoneInstHstryList");
  }
  /**
   @deprecated
   */
  public MilestoneInstHstryObjectData getMilestoneInstHstryObjectData() {
    return MilestoneInstHstryObjectHelper.fromMap(outputMap, "MilestoneInstHstry");
  }
}
