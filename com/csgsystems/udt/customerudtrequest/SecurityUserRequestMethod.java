/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityUserRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityUserRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityUserRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SecurityUserFind method */
  public static final SecurityUserRequestMethod SECURITY_USER_FIND = new SecurityUserRequestMethod("SecurityUserFind");
  /** Variable representing the SecurityUserGet method */
  public static final SecurityUserRequestMethod SECURITY_USER_GET = new SecurityUserRequestMethod("SecurityUserGet");
}
