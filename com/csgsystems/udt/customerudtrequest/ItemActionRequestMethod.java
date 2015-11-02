/*
 * Generated code DO NOT EDIT
 * Generated file: ItemActionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemActionRequestMethod implements UdtMethod {
  private String method = null;
  private ItemActionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemActionCreate method */
  public static final ItemActionRequestMethod ITEM_ACTION_CREATE = new ItemActionRequestMethod("ItemActionCreate");
  /** Variable representing the ItemActionFind method */
  public static final ItemActionRequestMethod ITEM_ACTION_FIND = new ItemActionRequestMethod("ItemActionFind");
  /** Variable representing the ItemActionGet method */
  public static final ItemActionRequestMethod ITEM_ACTION_GET = new ItemActionRequestMethod("ItemActionGet");
  /** Variable representing the ItemActionUpdate method */
  public static final ItemActionRequestMethod ITEM_ACTION_UPDATE = new ItemActionRequestMethod("ItemActionUpdate");
}
