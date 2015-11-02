/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeGroupRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EntityTypeGroupRequestMethod implements UdtMethod {
  private String method = null;
  private EntityTypeGroupRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EntityTypeGroupCreate method */
  public static final EntityTypeGroupRequestMethod ENTITY_TYPE_GROUP_CREATE = new EntityTypeGroupRequestMethod("EntityTypeGroupCreate");
  /** Variable representing the EntityTypeGroupDelete method */
  public static final EntityTypeGroupRequestMethod ENTITY_TYPE_GROUP_DELETE = new EntityTypeGroupRequestMethod("EntityTypeGroupDelete");
  /** Variable representing the EntityTypeGroupFind method */
  public static final EntityTypeGroupRequestMethod ENTITY_TYPE_GROUP_FIND = new EntityTypeGroupRequestMethod("EntityTypeGroupFind");
  /** Variable representing the EntityTypeGroupGet method */
  public static final EntityTypeGroupRequestMethod ENTITY_TYPE_GROUP_GET = new EntityTypeGroupRequestMethod("EntityTypeGroupGet");
  /** Variable representing the EntityTypeGroupUpdate method */
  public static final EntityTypeGroupRequestMethod ENTITY_TYPE_GROUP_UPDATE = new EntityTypeGroupRequestMethod("EntityTypeGroupUpdate");
}
