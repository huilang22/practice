/*
 * Generated code DO NOT EDIT
 * Generated file: ItemCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private ItemCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemCategoryCreate method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_CREATE = new ItemCategoryRequestMethod("ItemCategoryCreate");
  /** Variable representing the ItemCategoryDelete method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_DELETE = new ItemCategoryRequestMethod("ItemCategoryDelete");
  /** Variable representing the ItemCategoryDeleteAll method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_DELETE_ALL = new ItemCategoryRequestMethod("ItemCategoryDeleteAll");
  /** Variable representing the ItemCategoryFind method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_FIND = new ItemCategoryRequestMethod("ItemCategoryFind");
  /** Variable representing the ItemCategoryGet method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_GET = new ItemCategoryRequestMethod("ItemCategoryGet");
  /** Variable representing the ItemCategoryUpdate method */
  public static final ItemCategoryRequestMethod ITEM_CATEGORY_UPDATE = new ItemCategoryRequestMethod("ItemCategoryUpdate");
}
