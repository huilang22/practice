/*
 * Generated code DO NOT EDIT
 * Generated file: InvModJobRequest.java
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

import com.csgsystems.iv.data.*;
public final class InvModJobRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvModJobRequest (String request, InvModJobRequestMethod method) {
    initialize(request, "InvModJob", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvModJobRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvModJobForInvModJobCount(InvModJobObjectData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
  public void setInvModJobForInvModJobCreate(InvModJobObjectData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
  public void setInvModJobForInvModJobFind(InvModJobObjectFilter data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
  public void setInvModJobForInvModJobGet(InvModJobObjectKeyData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectKeyHelper.toMap(data, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
  public void setInvModJobForInvModJobVector(InvModJobObjectData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap(), "InvModJob").get("InvModJob"));
    }
  }
  public InvModJobCountOutputData getInvModJobCountOutputDataInvModJobCountOutputDataFromInvModJobCount() {
    return InvModJobCountOutputHelper.fromMap(outputMap);
  }
  public InvModJobObjectData getInvModJobObjectDataInvModJobFromInvModJobCreate() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
  public InvModJobObjectDataList getInvModJobObjectDataInvModJobFromInvModJobFind() {
    return InvModJobObjectHelper.fromMapList(outputMap, "InvModJobList");
  }
  public InvModJobObjectData getInvModJobObjectDataInvModJobFromInvModJobGet() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
  public InvModJobVectorOutputData getInvModJobVectorOutputDataInvModJobVectorOutputDataFromInvModJobVector() {
    return InvModJobVectorOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public InvModJobCountOutputData getInvModJobCountOutputData() {
    return InvModJobCountOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvModJobObjectFilter(InvModJobObjectFilter data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap()).get("InvModJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvModJobObjectData(InvModJobObjectData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectHelper.toMap(data, new HashMap()).get("InvModJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvModJobObjectKeyData(InvModJobObjectKeyData data) {
    if (data != null) {
      addInput("InvModJob", InvModJobObjectKeyHelper.toMap(data, new HashMap()).get("InvModJobObject"));
    }
  }
  /**
   @deprecated
   */
  public InvModJobObjectDataList getInvModJobObjectDataList() {
    return InvModJobObjectHelper.fromMapList(outputMap, "InvModJobList");
  }
  /**
   @deprecated
   */
  public InvModJobObjectData getInvModJobObjectData() {
    return InvModJobObjectHelper.fromMap(outputMap, "InvModJob");
  }
  /**
   @deprecated
   */
  public InvModJobVectorOutputData getInvModJobVectorOutputData() {
    return InvModJobVectorOutputHelper.fromMap(outputMap);
  }
}
