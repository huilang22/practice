/*
 * Generated code DO NOT EDIT
 * Generated file: ItemTypeAssocRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemTypeAssocRequestMethod implements UdtMethod {
  private String method = null;
  private ItemTypeAssocRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemTypeAssocCreate method */
  public static final ItemTypeAssocRequestMethod ITEM_TYPE_ASSOC_CREATE = new ItemTypeAssocRequestMethod("ItemTypeAssocCreate");
  /** Variable representing the ItemTypeAssocFind method */
  public static final ItemTypeAssocRequestMethod ITEM_TYPE_ASSOC_FIND = new ItemTypeAssocRequestMethod("ItemTypeAssocFind");
  /** Variable representing the ItemTypeAssocGet method */
  public static final ItemTypeAssocRequestMethod ITEM_TYPE_ASSOC_GET = new ItemTypeAssocRequestMethod("ItemTypeAssocGet");
  /** Variable representing the ItemTypeAssocUpdate method */
  public static final ItemTypeAssocRequestMethod ITEM_TYPE_ASSOC_UPDATE = new ItemTypeAssocRequestMethod("ItemTypeAssocUpdate");
}
