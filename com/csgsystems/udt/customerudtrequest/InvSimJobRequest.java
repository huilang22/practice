/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimJobRequest.java
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
public final class InvSimJobRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvSimJobRequest (String request, InvSimJobRequestMethod method) {
    initialize(request, "InvSimJob", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvSimJobRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvSimJobForInvSimJobCreate(InvSimJobObjectData data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(data, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
  public void setInvSimJobForInvSimJobFind(InvSimJobObjectFilter data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(data, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
  public void setInvSimJobForInvSimJobGet(InvSimJobObjectKeyData data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectKeyHelper.toMap(data, new HashMap(), "InvSimJob").get("InvSimJob"));
    }
  }
  public InvSimJobObjectData getInvSimJobObjectDataInvSimJobFromInvSimJobCreate() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
  public InvSimJobObjectDataList getInvSimJobObjectDataInvSimJobFromInvSimJobFind() {
    return InvSimJobObjectHelper.fromMapList(outputMap, "InvSimJobList");
  }
  public InvSimJobObjectData getInvSimJobObjectDataInvSimJobFromInvSimJobGet() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
  /**
   @deprecated
   */
  public void setInvSimJobObjectFilter(InvSimJobObjectFilter data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(data, new HashMap()).get("InvSimJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvSimJobObjectData(InvSimJobObjectData data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectHelper.toMap(data, new HashMap()).get("InvSimJobObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvSimJobObjectKeyData(InvSimJobObjectKeyData data) {
    if (data != null) {
      addInput("InvSimJob", InvSimJobObjectKeyHelper.toMap(data, new HashMap()).get("InvSimJobObject"));
    }
  }
  /**
   @deprecated
   */
  public InvSimJobObjectDataList getInvSimJobObjectDataList() {
    return InvSimJobObjectHelper.fromMapList(outputMap, "InvSimJobList");
  }
  /**
   @deprecated
   */
  public InvSimJobObjectData getInvSimJobObjectData() {
    return InvSimJobObjectHelper.fromMap(outputMap, "InvSimJob");
  }
}
