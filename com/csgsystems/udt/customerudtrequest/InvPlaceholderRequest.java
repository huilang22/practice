/*
 * Generated code DO NOT EDIT
 * Generated file: InvPlaceholderRequest.java
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

import com.csgsystems.om.data.*;
public final class InvPlaceholderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvPlaceholderRequest (String request, InvPlaceholderRequestMethod method) {
    initialize(request, "InvPlaceholder", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvPlaceholderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvPlaceholderForInvPlaceholderCreate(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setInvPlaceholderForInvPlaceholderFind(InvPlaceholderObjectFilter data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setInvPlaceholderForInvPlaceholderGet(InvPlaceholderObjectKeyData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectKeyHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setInvPlaceholderForInvPlaceholderUpdate(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public InvPlaceholderObjectData getInvPlaceholderObjectDataInvPlaceholderFromInvPlaceholderCreate() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
  public InvPlaceholderObjectDataList getInvPlaceholderObjectDataInvPlaceholderFromInvPlaceholderFind() {
    return InvPlaceholderObjectHelper.fromMapList(outputMap, "InvPlaceholderList");
  }
  public InvPlaceholderObjectData getInvPlaceholderObjectDataInvPlaceholderFromInvPlaceholderGet() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
  public InvPlaceholderObjectData getInvPlaceholderObjectDataInvPlaceholderFromInvPlaceholderUpdate() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
  /**
   @deprecated
   */
  public void setInvPlaceholderObjectFilter(InvPlaceholderObjectFilter data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap()).get("InvPlaceholderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvPlaceholderObjectData(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap()).get("InvPlaceholderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvPlaceholderObjectKeyData(InvPlaceholderObjectKeyData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectKeyHelper.toMap(data, new HashMap()).get("InvPlaceholderObject"));
    }
  }
  /**
   @deprecated
   */
  public InvPlaceholderObjectDataList getInvPlaceholderObjectDataList() {
    return InvPlaceholderObjectHelper.fromMapList(outputMap, "InvPlaceholderList");
  }
  /**
   @deprecated
   */
  public InvPlaceholderObjectData getInvPlaceholderObjectData() {
    return InvPlaceholderObjectHelper.fromMap(outputMap, "InvPlaceholder");
  }
}
