/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRoleRequest.java
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
public final class SecurityRoleRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityRoleRequest (String request, SecurityRoleRequestMethod method) {
    initialize(request, "SecurityRole", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityRoleRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAResIdForSecurityRoleAssign(BigInteger data) {
    if (data != null) {
      addInput("AResId", data);
    }
  }
  public void setAUserNameForSecurityRoleAssign(String data) {
    if (data != null) {
      addInput("AUserName", data);
    }
  }
  public void setSecurityRoleForSecurityRoleAssign(SecurityRoleObjectData data) {
    if (data != null) {
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(data, new HashMap(), "SecurityRole").get("SecurityRole"));
    }
  }
  public void setLanguageCodeForSecurityRoleFindByResourceName(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setResNameForSecurityRoleFindByResourceName(String data) {
    if (data != null) {
      addInput("ResName", data);
    }
  }
  public void setSecurityRoleForSecurityRoleFind(SecurityRoleObjectFilter data) {
    if (data != null) {
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(data, new HashMap(), "SecurityRole").get("SecurityRole"));
    }
  }
  public void setBResIdForSecurityRoleUnassign(BigInteger data) {
    if (data != null) {
      addInput("BResId", data);
    }
  }
  public void setSecurityRoleForSecurityRoleUnassign(SecurityRoleObjectData data) {
    if (data != null) {
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(data, new HashMap(), "SecurityRole").get("SecurityRole"));
    }
  }
  public SecurityRoleObjectDataList getSecurityRoleObjectDataSecurityRoleFromSecurityRoleAssign() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
  public SecurityRoleObjectDataList getSecurityRoleObjectDataSecurityRoleFromSecurityRoleFindByResourceName() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
  public SecurityRoleObjectDataList getSecurityRoleObjectDataSecurityRoleFromSecurityRoleFind() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
  public SecurityRoleObjectDataList getSecurityRoleObjectDataSecurityRoleFromSecurityRoleUnassign() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
  /**
   @deprecated
   */
  public void setAResId(BigInteger data) {
    if (data != null) {
      addInput("AResId", data);
    }
  }
  /**
   @deprecated
   */
  public void setAUserName(String data) {
    if (data != null) {
      addInput("AUserName", data);
    }
  }
  /**
   @deprecated
   */
  public void setBResId(BigInteger data) {
    if (data != null) {
      addInput("BResId", data);
    }
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setResName(String data) {
    if (data != null) {
      addInput("ResName", data);
    }
  }
  /**
   @deprecated
   */
  public void setSecurityRoleObjectFilter(SecurityRoleObjectFilter data) {
    if (data != null) {
      addInput("SecurityRole", SecurityRoleObjectHelper.toMap(data, new HashMap()).get("SecurityRoleObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSecurityRoleObjectDataArray(SecurityRoleObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = SecurityRoleObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityRole");
      }
      addInput("SecurityRoleList", list);
    }
  }
  /**
   @deprecated
   */
  public SecurityRoleObjectDataList getSecurityRoleObjectDataList() {
    return SecurityRoleObjectHelper.fromMapList(outputMap, "SecurityRoleList");
  }
}
