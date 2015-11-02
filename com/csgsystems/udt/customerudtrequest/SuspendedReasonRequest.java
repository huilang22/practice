/*
 * Generated code DO NOT EDIT
 * Generated file: SuspendedReasonRequest.java
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

import com.csgsystems.ar.data.*;
public final class SuspendedReasonRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SuspendedReasonRequest (String request, SuspendedReasonRequestMethod method) {
    initialize(request, "SuspendedReason", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SuspendedReasonRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSuspendedReasonForSuspendedReasonFind(SuspendedReasonObjectFilter data) {
    if (data != null) {
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(data, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }
  public void setSuspendedReasonForSuspendedReasonGet(SuspendedReasonObjectKeyData data) {
    if (data != null) {
      addInput("SuspendedReason", SuspendedReasonObjectKeyHelper.toMap(data, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }
  public SuspendedReasonObjectDataList getSuspendedReasonObjectDataSuspendedReasonFromSuspendedReasonFind() {
    return SuspendedReasonObjectHelper.fromMapList(outputMap, "SuspendedReasonList");
  }
  public SuspendedReasonObjectData getSuspendedReasonObjectDataSuspendedReasonFromSuspendedReasonGet() {
    return SuspendedReasonObjectHelper.fromMap(outputMap, "SuspendedReason");
  }
  /**
   @deprecated
   */
  public void setSuspendedReasonObjectFilter(SuspendedReasonObjectFilter data) {
    if (data != null) {
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(data, new HashMap()).get("SuspendedReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSuspendedReasonObjectKeyData(SuspendedReasonObjectKeyData data) {
    if (data != null) {
      addInput("SuspendedReason", SuspendedReasonObjectKeyHelper.toMap(data, new HashMap()).get("SuspendedReasonObject"));
    }
  }
  /**
   @deprecated
   */
  public SuspendedReasonObjectDataList getSuspendedReasonObjectDataList() {
    return SuspendedReasonObjectHelper.fromMapList(outputMap, "SuspendedReasonList");
  }
  /**
   @deprecated
   */
  public SuspendedReasonObjectData getSuspendedReasonObjectData() {
    return SuspendedReasonObjectHelper.fromMap(outputMap, "SuspendedReason");
  }
}
