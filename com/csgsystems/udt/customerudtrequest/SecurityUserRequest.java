/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityUserRequest.java
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

import com.csgsystems.bp.data.*;
public final class SecurityUserRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityUserRequest (String request, SecurityUserRequestMethod method) {
    initialize(request, "SecurityUser", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityUserRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSecurityUserForSecurityUserFind(SecurityUserObjectFilter data) {
    if (data != null) {
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(data, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }
  public void setSecurityUserForSecurityUserGet(SecurityUserObjectKeyData data) {
    if (data != null) {
      addInput("SecurityUser", SecurityUserObjectKeyHelper.toMap(data, new HashMap(), "SecurityUser").get("SecurityUser"));
    }
  }
  public SecurityUserObjectDataList getSecurityUserObjectDataSecurityUserFromSecurityUserFind() {
    return SecurityUserObjectHelper.fromMapList(outputMap, "SecurityUserList");
  }
  public SecurityUserObjectData getSecurityUserObjectDataSecurityUserFromSecurityUserGet() {
    return SecurityUserObjectHelper.fromMap(outputMap, "SecurityUser");
  }
  /**
   @deprecated
   */
  public void setSecurityUserObjectFilter(SecurityUserObjectFilter data) {
    if (data != null) {
      addInput("SecurityUser", SecurityUserObjectHelper.toMap(data, new HashMap()).get("SecurityUserObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSecurityUserObjectKeyData(SecurityUserObjectKeyData data) {
    if (data != null) {
      addInput("SecurityUser", SecurityUserObjectKeyHelper.toMap(data, new HashMap()).get("SecurityUserObject"));
    }
  }
  /**
   @deprecated
   */
  public SecurityUserObjectDataList getSecurityUserObjectDataList() {
    return SecurityUserObjectHelper.fromMapList(outputMap, "SecurityUserList");
  }
  /**
   @deprecated
   */
  public SecurityUserObjectData getSecurityUserObjectData() {
    return SecurityUserObjectHelper.fromMap(outputMap, "SecurityUser");
  }
}
