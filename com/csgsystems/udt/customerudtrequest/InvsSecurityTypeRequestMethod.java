/*
 * Generated code DO NOT EDIT
 * Generated file: InvsSecurityTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class InvsSecurityTypeRequestMethod implements UdtMethod {
  private String method = null;
  private InvsSecurityTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the InvsSecurityTypeCreate method */
  public static final InvsSecurityTypeRequestMethod INVS_SECURITY_TYPE_CREATE = new InvsSecurityTypeRequestMethod("InvsSecurityTypeCreate");
  /** Variable representing the InvsSecurityTypeFind method */
  public static final InvsSecurityTypeRequestMethod INVS_SECURITY_TYPE_FIND = new InvsSecurityTypeRequestMethod("InvsSecurityTypeFind");
  /** Variable representing the InvsSecurityTypeGet method */
  public static final InvsSecurityTypeRequestMethod INVS_SECURITY_TYPE_GET = new InvsSecurityTypeRequestMethod("InvsSecurityTypeGet");
  /** Variable representing the InvsSecurityTypeUpdate method */
  public static final InvsSecurityTypeRequestMethod INVS_SECURITY_TYPE_UPDATE = new InvsSecurityTypeRequestMethod("InvsSecurityTypeUpdate");
}
