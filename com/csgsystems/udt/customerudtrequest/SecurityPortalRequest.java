/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityPortalRequest.java
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

import com.csgsystems.sec.data.*;
public final class SecurityPortalRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public SecurityPortalRequest (String request, SecurityPortalRequestMethod method) {
    initialize(request, "SecurityPortal", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (SecurityPortalRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setSecurityPortalForSecurityCall(SecurityPortalObjectData data) {
    if (data != null) {
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(data, new HashMap(), "SecurityPortal").get("SecurityPortal"));
    }
  }
  public SecurityPortalObjectData getSecurityPortalObjectDataSecurityPortalFromSecurityCall() {
    return SecurityPortalObjectHelper.fromMap(outputMap, "SecurityPortal");
  }
  /**
   @deprecated
   */
  public void setSecurityPortalObjectData(SecurityPortalObjectData data) {
    if (data != null) {
      addInput("SecurityPortal", SecurityPortalObjectHelper.toMap(data, new HashMap()).get("SecurityPortalObject"));
    }
  }
  /**
   @deprecated
   */
  public SecurityPortalObjectData getSecurityPortalObjectData() {
    return SecurityPortalObjectHelper.fromMap(outputMap, "SecurityPortal");
  }
}
