/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ItemTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemTypeCreate method */
  public static final ItemTypeRequestMethod ITEM_TYPE_CREATE = new ItemTypeRequestMethod("ItemTypeCreate");
  /** Variable representing the ItemTypeFind method */
  public static final ItemTypeRequestMethod ITEM_TYPE_FIND = new ItemTypeRequestMethod("ItemTypeFind");
  /** Variable representing the ItemTypeGet method */
  public static final ItemTypeRequestMethod ITEM_TYPE_GET = new ItemTypeRequestMethod("ItemTypeGet");
  /** Variable representing the ItemTypeUpdate method */
  public static final ItemTypeRequestMethod ITEM_TYPE_UPDATE = new ItemTypeRequestMethod("ItemTypeUpdate");
}
