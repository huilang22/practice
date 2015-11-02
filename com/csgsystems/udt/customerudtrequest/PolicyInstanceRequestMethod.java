/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PolicyInstanceRequestMethod implements UdtMethod {
  private String method = null;
  private PolicyInstanceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PolicyInstanceCreate method */
  public static final PolicyInstanceRequestMethod POLICY_INSTANCE_CREATE = new PolicyInstanceRequestMethod("PolicyInstanceCreate");
  /** Variable representing the PolicyInstanceFind method */
  public static final PolicyInstanceRequestMethod POLICY_INSTANCE_FIND = new PolicyInstanceRequestMethod("PolicyInstanceFind");
  /** Variable representing the PolicyInstanceGet method */
  public static final PolicyInstanceRequestMethod POLICY_INSTANCE_GET = new PolicyInstanceRequestMethod("PolicyInstanceGet");
  /** Variable representing the PolicyInstanceUpdate method */
  public static final PolicyInstanceRequestMethod POLICY_INSTANCE_UPDATE = new PolicyInstanceRequestMethod("PolicyInstanceUpdate");
}
