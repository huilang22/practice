/*
 * Generated code DO NOT EDIT
 * Generated file: ItemRouteRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ItemRouteRequestMethod implements UdtMethod {
  private String method = null;
  private ItemRouteRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ItemRouteCreate method */
  public static final ItemRouteRequestMethod ITEM_ROUTE_CREATE = new ItemRouteRequestMethod("ItemRouteCreate");
  /** Variable representing the ItemRouteFind method */
  public static final ItemRouteRequestMethod ITEM_ROUTE_FIND = new ItemRouteRequestMethod("ItemRouteFind");
  /** Variable representing the ItemRouteGet method */
  public static final ItemRouteRequestMethod ITEM_ROUTE_GET = new ItemRouteRequestMethod("ItemRouteGet");
  /** Variable representing the ItemRouteUpdate method */
  public static final ItemRouteRequestMethod ITEM_ROUTE_UPDATE = new ItemRouteRequestMethod("ItemRouteUpdate");
}
