/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HqGroupMembersRequestMethod implements UdtMethod {
  private String method = null;
  private HqGroupMembersRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HqGroupMembersCreate method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_CREATE = new HqGroupMembersRequestMethod("HqGroupMembersCreate");
  /** Variable representing the HqGroupMembersDelete method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_DELETE = new HqGroupMembersRequestMethod("HqGroupMembersDelete");
  /** Variable representing the HqGroupMembersDeleteList method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_DELETE_LIST = new HqGroupMembersRequestMethod("HqGroupMembersDeleteList");
  /** Variable representing the HqGroupMembersFind method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_FIND = new HqGroupMembersRequestMethod("HqGroupMembersFind");
  /** Variable representing the HqGroupMembersGet method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_GET = new HqGroupMembersRequestMethod("HqGroupMembersGet");
  /** Variable representing the HqGroupMembersUpdate method */
  public static final HqGroupMembersRequestMethod HQ_GROUP_MEMBERS_UPDATE = new HqGroupMembersRequestMethod("HqGroupMembersUpdate");
}
