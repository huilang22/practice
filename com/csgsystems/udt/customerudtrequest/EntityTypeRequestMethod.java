/*
 * Generated code DO NOT EDIT
 * Generated file: EntityTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class EntityTypeRequestMethod implements UdtMethod {
  private String method = null;
  private EntityTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the EntityFind method */
  public static final EntityTypeRequestMethod ENTITY_FIND = new EntityTypeRequestMethod("EntityFind");
  /** Variable representing the EntityTypeCreate method */
  public static final EntityTypeRequestMethod ENTITY_TYPE_CREATE = new EntityTypeRequestMethod("EntityTypeCreate");
  /** Variable representing the EntityTypeDelete method */
  public static final EntityTypeRequestMethod ENTITY_TYPE_DELETE = new EntityTypeRequestMethod("EntityTypeDelete");
  /** Variable representing the EntityTypeFind method */
  public static final EntityTypeRequestMethod ENTITY_TYPE_FIND = new EntityTypeRequestMethod("EntityTypeFind");
  /** Variable representing the EntityTypeGet method */
  public static final EntityTypeRequestMethod ENTITY_TYPE_GET = new EntityTypeRequestMethod("EntityTypeGet");
  /** Variable representing the EntityTypeUpdate method */
  public static final EntityTypeRequestMethod ENTITY_TYPE_UPDATE = new EntityTypeRequestMethod("EntityTypeUpdate");
}
