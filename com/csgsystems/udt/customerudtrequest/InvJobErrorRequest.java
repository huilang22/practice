/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobErrorRequest.java
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
public final class InvJobErrorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvJobErrorRequest (String request, InvJobErrorRequestMethod method) {
    initialize(request, "InvJobError", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvJobErrorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvJobErrorForInvJobErrorFind(InvJobErrorObjectFilter data) {
    if (data != null) {
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(data, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
  public void setInvJobErrorForInvJobErrorGet(InvJobErrorObjectKeyData data) {
    if (data != null) {
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(data, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
  public void setInvJobErrorForInvJobErrorMaxErrorCount(InvJobErrorObjectKeyData data) {
    if (data != null) {
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(data, new HashMap(), "InvJobError").get("InvJobError"));
    }
  }
  public InvJobErrorObjectDataList getInvJobErrorObjectDataInvJobErrorFromInvJobErrorFind() {
    return InvJobErrorObjectHelper.fromMapList(outputMap, "InvJobErrorList");
  }
  public InvJobErrorObjectData getInvJobErrorObjectDataInvJobErrorFromInvJobErrorGet() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
  public InvJobErrorObjectData getInvJobErrorObjectDataInvJobErrorFromInvJobErrorMaxErrorCount() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
  /**
   @deprecated
   */
  public void setInvJobErrorObjectFilter(InvJobErrorObjectFilter data) {
    if (data != null) {
      addInput("InvJobError", InvJobErrorObjectHelper.toMap(data, new HashMap()).get("InvJobErrorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvJobErrorObjectKeyData(InvJobErrorObjectKeyData data) {
    if (data != null) {
      addInput("InvJobError", InvJobErrorObjectKeyHelper.toMap(data, new HashMap()).get("InvJobErrorObject"));
    }
  }
  /**
   @deprecated
   */
  public InvJobErrorObjectDataList getInvJobErrorObjectDataList() {
    return InvJobErrorObjectHelper.fromMapList(outputMap, "InvJobErrorList");
  }
  /**
   @deprecated
   */
  public InvJobErrorObjectData getInvJobErrorObjectData() {
    return InvJobErrorObjectHelper.fromMap(outputMap, "InvJobError");
  }
}
