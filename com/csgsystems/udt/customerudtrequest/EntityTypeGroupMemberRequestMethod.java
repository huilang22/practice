/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupMemberRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EntityTypeGroupMemberRequestMethod implements UdtMethod {
  private String method = null;
  private EntityTypeGroupMemberRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EntityTypeGroupMemberCreate method */
  public static final EntityTypeGroupMemberRequestMethod ENTITY_TYPE_GROUP_MEMBER_CREATE = new EntityTypeGroupMemberRequestMethod("EntityTypeGroupMemberCreate");
  /** Variable representing the EntityTypeGroupMemberFind method */
  public static final EntityTypeGroupMemberRequestMethod ENTITY_TYPE_GROUP_MEMBER_FIND = new EntityTypeGroupMemberRequestMethod("EntityTypeGroupMemberFind");
  /** Variable representing the EntityTypeGroupMemberGet method */
  public static final EntityTypeGroupMemberRequestMethod ENTITY_TYPE_GROUP_MEMBER_GET = new EntityTypeGroupMemberRequestMethod("EntityTypeGroupMemberGet");
}
