/*
 * Generated code DO NOT EDIT
 * Generated file: GroupMemberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GroupMemberRequestMethod implements UdtMethod {
  private String method = null;
  private GroupMemberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GroupMemberCreate method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_CREATE = new GroupMemberRequestMethod("GroupMemberCreate");
  /** Variable representing the GroupMemberDelete method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_DELETE = new GroupMemberRequestMethod("GroupMemberDelete");
  /** Variable representing the GroupMemberDeleteList method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_DELETE_LIST = new GroupMemberRequestMethod("GroupMemberDeleteList");
  /** Variable representing the GroupMemberFind method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_FIND = new GroupMemberRequestMethod("GroupMemberFind");
  /** Variable representing the GroupMemberGet method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_GET = new GroupMemberRequestMethod("GroupMemberGet");
  /** Variable representing the GroupMemberUpdate method */
  public static final GroupMemberRequestMethod GROUP_MEMBER_UPDATE = new GroupMemberRequestMethod("GroupMemberUpdate");
}
