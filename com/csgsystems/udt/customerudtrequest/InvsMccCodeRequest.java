/*
 * Generated code DO NOT EDIT
 * Generated file: InvsMccCodeRequest.java
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
public final class InvsMccCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvsMccCodeRequest (String request, InvsMccCodeRequestMethod method) {
    initialize(request, "InvsMccCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvsMccCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvsMccCodeForInvsMccCodeFind(InvsMccCodeObjectFilter data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(data, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }
  public void setInvsMccCodeForInvsMccCodeGet(InvsMccCodeObjectKeyData data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectKeyHelper.toMap(data, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }
  public void setInvsMccCodeForInvsMccCodeUpdate(InvsMccCodeObjectData data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(data, new HashMap(), "InvsMccCode").get("InvsMccCode"));
    }
  }
  public InvsMccCodeObjectDataList getInvsMccCodeObjectDataInvsMccCodeFromInvsMccCodeFind() {
    return InvsMccCodeObjectHelper.fromMapList(outputMap, "InvsMccCodeList");
  }
  public InvsMccCodeObjectData getInvsMccCodeObjectDataInvsMccCodeFromInvsMccCodeGet() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
  public InvsMccCodeObjectData getInvsMccCodeObjectDataInvsMccCodeFromInvsMccCodeUpdate() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
  /**
   @deprecated
   */
  public void setInvsMccCodeObjectFilter(InvsMccCodeObjectFilter data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(data, new HashMap()).get("InvsMccCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsMccCodeObjectData(InvsMccCodeObjectData data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectHelper.toMap(data, new HashMap()).get("InvsMccCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvsMccCodeObjectKeyData(InvsMccCodeObjectKeyData data) {
    if (data != null) {
      addInput("InvsMccCode", InvsMccCodeObjectKeyHelper.toMap(data, new HashMap()).get("InvsMccCodeObject"));
    }
  }
  /**
   @deprecated
   */
  public InvsMccCodeObjectDataList getInvsMccCodeObjectDataList() {
    return InvsMccCodeObjectHelper.fromMapList(outputMap, "InvsMccCodeList");
  }
  /**
   @deprecated
   */
  public InvsMccCodeObjectData getInvsMccCodeObjectData() {
    return InvsMccCodeObjectHelper.fromMap(outputMap, "InvsMccCode");
  }
}
