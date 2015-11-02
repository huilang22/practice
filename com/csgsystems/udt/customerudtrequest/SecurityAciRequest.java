/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciRequest.java
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
public final class SecurityAciRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityAciRequest (String request, SecurityAciRequestMethod method) {
    initialize(request, "SecurityAci", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityAciRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSecurityAciForSecurityAciCreateInternal(SecurityAciObjectData data) {
    if (data != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(data, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }
  public void setUserNameForSecurityAciCreateInternal(String data) {
    if (data != null) {
      addInput("UserName", data);
    }
  }
  public void setSecurityAciForSecurityAciDeleteInternal(SecurityAciObjectData data) {
    if (data != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(data, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }
  public void setSecurityAciForSecurityAciFind(SecurityAciObjectFilter data) {
    if (data != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(data, new HashMap(), "SecurityAci").get("SecurityAci"));
    }
  }
  public SecurityAciObjectData getSecurityAciObjectDataSecurityAciFromSecurityAciCreateInternal() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
  public SecurityAciObjectData getSecurityAciObjectDataSecurityAciFromSecurityAciDeleteInternal() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
  public SecurityAciObjectDataList getSecurityAciObjectDataSecurityAciFromSecurityAciFind() {
    return SecurityAciObjectHelper.fromMapList(outputMap, "SecurityAciList");
  }
  /**
   @deprecated
   */
  public void setSecurityAciObjectFilter(SecurityAciObjectFilter data) {
    if (data != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(data, new HashMap()).get("SecurityAciObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSecurityAciObjectData(SecurityAciObjectData data) {
    if (data != null) {
      addInput("SecurityAci", SecurityAciObjectHelper.toMap(data, new HashMap()).get("SecurityAciObject"));
    }
  }
  /**
   @deprecated
   */
  public SecurityAciObjectDataList getSecurityAciObjectDataList() {
    return SecurityAciObjectHelper.fromMapList(outputMap, "SecurityAciList");
  }
  /**
   @deprecated
   */
  public SecurityAciObjectData getSecurityAciObjectData() {
    return SecurityAciObjectHelper.fromMap(outputMap, "SecurityAci");
  }
  /**
   @deprecated
   */
  public void setUserName(String data) {
    if (data != null) {
      addInput("UserName", data);
    }
  }
}
