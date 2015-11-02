/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityPortalRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityPortalRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityPortalRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SecurityCall method */
  public static final SecurityPortalRequestMethod SECURITY_CALL = new SecurityPortalRequestMethod("SecurityCall");
}
