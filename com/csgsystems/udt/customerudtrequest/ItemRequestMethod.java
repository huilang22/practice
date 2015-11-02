/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemRequestMethod implements UdtMethod {
  private String method = null;
  private ItemRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemCancel method */
  public static final ItemRequestMethod ITEM_CANCEL = new ItemRequestMethod("ItemCancel");
  /** Variable representing the ItemCancelValidate method */
  public static final ItemRequestMethod ITEM_CANCEL_VALIDATE = new ItemRequestMethod("ItemCancelValidate");
  /** Variable representing the ItemClearReviseFlag method */
  public static final ItemRequestMethod ITEM_CLEAR_REVISE_FLAG = new ItemRequestMethod("ItemClearReviseFlag");
  /** Variable representing the ItemCreate method */
  public static final ItemRequestMethod ITEM_CREATE = new ItemRequestMethod("ItemCreate");
  /** Variable representing the ItemFind method */
  public static final ItemRequestMethod ITEM_FIND = new ItemRequestMethod("ItemFind");
  /** Variable representing the ItemGet method */
  public static final ItemRequestMethod ITEM_GET = new ItemRequestMethod("ItemGet");
  /** Variable representing the ItemUpdate method */
  public static final ItemRequestMethod ITEM_UPDATE = new ItemRequestMethod("ItemUpdate");
}
