/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OpenItemRequestMethod implements UdtMethod {
  private String method = null;
  private OpenItemRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OpenItemCreate method */
  public static final OpenItemRequestMethod OPEN_ITEM_CREATE = new OpenItemRequestMethod("OpenItemCreate");
  /** Variable representing the OpenItemDelete method */
  public static final OpenItemRequestMethod OPEN_ITEM_DELETE = new OpenItemRequestMethod("OpenItemDelete");
  /** Variable representing the OpenItemFind method */
  public static final OpenItemRequestMethod OPEN_ITEM_FIND = new OpenItemRequestMethod("OpenItemFind");
  /** Variable representing the OpenItemGet method */
  public static final OpenItemRequestMethod OPEN_ITEM_GET = new OpenItemRequestMethod("OpenItemGet");
  /** Variable representing the OpenItemUpdate method */
  public static final OpenItemRequestMethod OPEN_ITEM_UPDATE = new OpenItemRequestMethod("OpenItemUpdate");
}
