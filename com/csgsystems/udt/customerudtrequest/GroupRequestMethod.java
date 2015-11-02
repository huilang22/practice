/*
 * Generated code DO NOT EDIT
 * Generated file: GroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GroupRequestMethod implements UdtMethod {
  private String method = null;
  private GroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GroupCreate method */
  public static final GroupRequestMethod GROUP_CREATE = new GroupRequestMethod("GroupCreate");
  /** Variable representing the GroupFind method */
  public static final GroupRequestMethod GROUP_FIND = new GroupRequestMethod("GroupFind");
  /** Variable representing the GroupGet method */
  public static final GroupRequestMethod GROUP_GET = new GroupRequestMethod("GroupGet");
  /** Variable representing the GroupUpdate method */
  public static final GroupRequestMethod GROUP_UPDATE = new GroupRequestMethod("GroupUpdate");
}
