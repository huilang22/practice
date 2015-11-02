/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PolicyRequestMethod implements UdtMethod {
  private String method = null;
  private PolicyRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the PolicyCreate method */
  public static final PolicyRequestMethod POLICY_CREATE = new PolicyRequestMethod("PolicyCreate");
  /** Variable representing the PolicyFind method */
  public static final PolicyRequestMethod POLICY_FIND = new PolicyRequestMethod("PolicyFind");
  /** Variable representing the PolicyGet method */
  public static final PolicyRequestMethod POLICY_GET = new PolicyRequestMethod("PolicyGet");
  /** Variable representing the PolicyUpdate method */
  public static final PolicyRequestMethod POLICY_UPDATE = new PolicyRequestMethod("PolicyUpdate");
}
