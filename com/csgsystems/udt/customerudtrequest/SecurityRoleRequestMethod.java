/*
 * Generated code DO NOT EDIT
 * Generated file: SecurityRoleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class SecurityRoleRequestMethod implements UdtMethod {
  private String method = null;
  private SecurityRoleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the SecurityRoleAssign method */
  public static final SecurityRoleRequestMethod SECURITY_ROLE_ASSIGN = new SecurityRoleRequestMethod("SecurityRoleAssign");
  /** Variable representing the SecurityRoleFind method */
  public static final SecurityRoleRequestMethod SECURITY_ROLE_FIND = new SecurityRoleRequestMethod("SecurityRoleFind");
  /** Variable representing the SecurityRoleFindByResourceName method */
  public static final SecurityRoleRequestMethod SECURITY_ROLE_FIND_BY_RESOURCE_NAME = new SecurityRoleRequestMethod("SecurityRoleFindByResourceName");
  /** Variable representing the SecurityRoleUnassign method */
  public static final SecurityRoleRequestMethod SECURITY_ROLE_UNASSIGN = new SecurityRoleRequestMethod("SecurityRoleUnassign");
}
