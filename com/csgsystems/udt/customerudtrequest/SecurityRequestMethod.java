/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ChangePassword method */
  public static final SecurityRequestMethod CHANGE_PASSWORD = new SecurityRequestMethod("ChangePassword");
  /** Variable representing the UserAuthenticate method */
  public static final SecurityRequestMethod USER_AUTHENTICATE = new SecurityRequestMethod("UserAuthenticate");
}
