/*
 * Generated code DO NOT EDIT
 * Generated file: InvSecurityRequest.java
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
public final class InvSecurityRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvSecurityRequest (String request, InvSecurityRequestMethod method) {
    initialize(request, "InvSecurity", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvSecurityRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setInvSecurityForInvSecurityCreate(InvSecurityObjectData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(data, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
  public void setInvSecurityForInvSecurityDelete(InvSecurityObjectKeyData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(data, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
  public void setInvSecurityForInvSecurityFind(InvSecurityObjectFilter data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(data, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
  public void setInvSecurityForInvSecurityGet(InvSecurityObjectKeyData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(data, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
  public void setInvSecurityForInvSecurityUpdate(InvSecurityObjectData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(data, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }
  public InvSecurityObjectData getInvSecurityObjectDataInvSecurityFromInvSecurityCreate() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
  public InvSecurityObjectDataList getInvSecurityObjectDataInvSecurityFromInvSecurityFind() {
    return InvSecurityObjectHelper.fromMapList(outputMap, "InvSecurityList");
  }
  public InvSecurityObjectData getInvSecurityObjectDataInvSecurityFromInvSecurityGet() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
  public InvSecurityObjectData getInvSecurityObjectDataInvSecurityFromInvSecurityUpdate() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
  /**
   @deprecated
   */
  public void setInvSecurityObjectFilter(InvSecurityObjectFilter data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(data, new HashMap()).get("InvSecurityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvSecurityObjectData(InvSecurityObjectData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(data, new HashMap()).get("InvSecurityObject"));
    }
  }
  /**
   @deprecated
   */
  public void setInvSecurityObjectKeyData(InvSecurityObjectKeyData data) {
    if (data != null) {
      addInput("InvSecurity", InvSecurityObjectKeyHelper.toMap(data, new HashMap()).get("InvSecurityObject"));
    }
  }
  /**
   @deprecated
   */
  public InvSecurityObjectDataList getInvSecurityObjectDataList() {
    return InvSecurityObjectHelper.fromMapList(outputMap, "InvSecurityList");
  }
  /**
   @deprecated
   */
  public InvSecurityObjectData getInvSecurityObjectData() {
    return InvSecurityObjectHelper.fromMap(outputMap, "InvSecurity");
  }
}
