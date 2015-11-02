/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ComponentPolicyMapRequestMethod implements UdtMethod {
  private String method = null;
  private ComponentPolicyMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ComponentPolicyMapCreate method */
  public static final ComponentPolicyMapRequestMethod COMPONENT_POLICY_MAP_CREATE = new ComponentPolicyMapRequestMethod("ComponentPolicyMapCreate");
  /** Variable representing the ComponentPolicyMapFind method */
  public static final ComponentPolicyMapRequestMethod COMPONENT_POLICY_MAP_FIND = new ComponentPolicyMapRequestMethod("ComponentPolicyMapFind");
  /** Variable representing the ComponentPolicyMapGet method */
  public static final ComponentPolicyMapRequestMethod COMPONENT_POLICY_MAP_GET = new ComponentPolicyMapRequestMethod("ComponentPolicyMapGet");
  /** Variable representing the ComponentPolicyMapUpdate method */
  public static final ComponentPolicyMapRequestMethod COMPONENT_POLICY_MAP_UPDATE = new ComponentPolicyMapRequestMethod("ComponentPolicyMapUpdate");
  /** Variable representing the PolicyTypeFind method */
  public static final ComponentPolicyMapRequestMethod POLICY_TYPE_FIND = new ComponentPolicyMapRequestMethod("PolicyTypeFind");
}
