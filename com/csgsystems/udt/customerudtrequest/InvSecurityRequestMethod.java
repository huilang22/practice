/*
 * Generated code DO NOT EDIT
 * Generated file: InvSecurityRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvSecurityRequestMethod implements UdtMethod {
  private String method = null;
  private InvSecurityRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvSecurityCreate method */
  public static final InvSecurityRequestMethod INV_SECURITY_CREATE = new InvSecurityRequestMethod("InvSecurityCreate");
  /** Variable representing the InvSecurityDelete method */
  public static final InvSecurityRequestMethod INV_SECURITY_DELETE = new InvSecurityRequestMethod("InvSecurityDelete");
  /** Variable representing the InvSecurityFind method */
  public static final InvSecurityRequestMethod INV_SECURITY_FIND = new InvSecurityRequestMethod("InvSecurityFind");
  /** Variable representing the InvSecurityGet method */
  public static final InvSecurityRequestMethod INV_SECURITY_GET = new InvSecurityRequestMethod("InvSecurityGet");
  /** Variable representing the InvSecurityUpdate method */
  public static final InvSecurityRequestMethod INV_SECURITY_UPDATE = new InvSecurityRequestMethod("InvSecurityUpdate");
}
