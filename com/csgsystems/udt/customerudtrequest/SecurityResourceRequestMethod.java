/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityResourceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityResourceRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityResourceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SecurityResourceAssign method */
  public static final SecurityResourceRequestMethod SECURITY_RESOURCE_ASSIGN = new SecurityResourceRequestMethod("SecurityResourceAssign");
  /** Variable representing the SecurityResourceCreate method */
  public static final SecurityResourceRequestMethod SECURITY_RESOURCE_CREATE = new SecurityResourceRequestMethod("SecurityResourceCreate");
  /** Variable representing the SecurityResourceFind method */
  public static final SecurityResourceRequestMethod SECURITY_RESOURCE_FIND = new SecurityResourceRequestMethod("SecurityResourceFind");
  /** Variable representing the SecurityResourceGet method */
  public static final SecurityResourceRequestMethod SECURITY_RESOURCE_GET = new SecurityResourceRequestMethod("SecurityResourceGet");
  /** Variable representing the SecurityResourceUnassign method */
  public static final SecurityResourceRequestMethod SECURITY_RESOURCE_UNASSIGN = new SecurityResourceRequestMethod("SecurityResourceUnassign");
}
