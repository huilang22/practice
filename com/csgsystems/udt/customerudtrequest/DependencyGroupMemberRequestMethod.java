/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyGroupMemberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class DependencyGroupMemberRequestMethod implements UdtMethod {
  private String method = null;
  private DependencyGroupMemberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the DependencyGroupMemberFind method */
  public static final DependencyGroupMemberRequestMethod DEPENDENCY_GROUP_MEMBER_FIND = new DependencyGroupMemberRequestMethod("DependencyGroupMemberFind");
}
