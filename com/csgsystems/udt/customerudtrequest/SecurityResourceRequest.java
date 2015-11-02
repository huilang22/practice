/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityResourceRequest.java
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
public final class SecurityResourceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityResourceRequest (String request, SecurityResourceRequestMethod method) {
    initialize(request, "SecurityResource", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityResourceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setARoleIdForSecurityResourceAssign(BigInteger data) {
    if (data != null) {
      addInput("ARoleId", data);
    }
  }
  public void setAUserNameForSecurityResourceAssign(String data) {
    if (data != null) {
      addInput("AUserName", data);
    }
  }
  public void setSecurityResourceForSecurityResourceAssign(SecurityResourceObjectData data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
  public void setSecurityResourceForSecurityResourceCreate(SecurityResourceObjectData data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
  public void setSecurityResourceForSecurityResourceFind(SecurityResourceObjectFilter data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
  public void setSecurityResourceForSecurityResourceGet(SecurityResourceObjectData data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
  public void setBRoleIdForSecurityResourceUnassign(BigInteger data) {
    if (data != null) {
      addInput("BRoleId", data);
    }
  }
  public void setSecurityResourceForSecurityResourceUnassign(SecurityResourceObjectData data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }
  public SecurityResourceObjectDataList getSecurityResourceObjectDataSecurityResourceFromSecurityResourceAssign() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
  public SecurityResourceObjectData getSecurityResourceObjectDataSecurityResourceFromSecurityResourceCreate() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
  public SecurityResourceObjectDataList getSecurityResourceObjectDataSecurityResourceFromSecurityResourceFind() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
  public SecurityResourceObjectData getSecurityResourceObjectDataSecurityResourceFromSecurityResourceGet() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
  public SecurityResourceObjectDataList getSecurityResourceObjectDataSecurityResourceFromSecurityResourceUnassign() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
  /**
   @deprecated
   */
  public void setARoleId(BigInteger data) {
    if (data != null) {
      addInput("ARoleId", data);
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
  public void setBRoleId(BigInteger data) {
    if (data != null) {
      addInput("BRoleId", data);
    }
  }
  /**
   @deprecated
   */
  public void setSecurityResourceObjectFilter(SecurityResourceObjectFilter data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap()).get("SecurityResourceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSecurityResourceObjectData(SecurityResourceObjectData data) {
    if (data != null) {
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(data, new HashMap()).get("SecurityResourceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setSecurityResourceObjectDataArray(SecurityResourceObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = SecurityResourceObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "SecurityResource");
      }
      addInput("SecurityResourceList", list);
    }
  }
  /**
   @deprecated
   */
  public SecurityResourceObjectDataList getSecurityResourceObjectDataList() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
  /**
   @deprecated
   */
  public SecurityResourceObjectData getSecurityResourceObjectData() {
    return SecurityResourceObjectHelper.fromMap(outputMap, "SecurityResource");
  }
}
