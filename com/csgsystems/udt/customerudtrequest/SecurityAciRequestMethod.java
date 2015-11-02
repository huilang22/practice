/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityAciRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityAciRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityAciRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SecurityAciCreateInternal method */
  public static final SecurityAciRequestMethod SECURITY_ACI_CREATE_INTERNAL = new SecurityAciRequestMethod("SecurityAciCreateInternal");
  /** Variable representing the SecurityAciDeleteInternal method */
  public static final SecurityAciRequestMethod SECURITY_ACI_DELETE_INTERNAL = new SecurityAciRequestMethod("SecurityAciDeleteInternal");
  /** Variable representing the SecurityAciFind method */
  public static final SecurityAciRequestMethod SECURITY_ACI_FIND = new SecurityAciRequestMethod("SecurityAciFind");
}
