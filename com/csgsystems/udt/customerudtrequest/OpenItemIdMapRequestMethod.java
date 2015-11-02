/*
 * Generated code DO NOT EDIT
 * Generated file: OpenItemIdMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OpenItemIdMapRequestMethod implements UdtMethod {
  private String method = null;
  private OpenItemIdMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OpenItemIdMapBestMatch method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_BEST_MATCH = new OpenItemIdMapRequestMethod("OpenItemIdMapBestMatch");
  /** Variable representing the OpenItemIdMapCancel method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_CANCEL = new OpenItemIdMapRequestMethod("OpenItemIdMapCancel");
  /** Variable representing the OpenItemIdMapCreate method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_CREATE = new OpenItemIdMapRequestMethod("OpenItemIdMapCreate");
  /** Variable representing the OpenItemIdMapDelete method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_DELETE = new OpenItemIdMapRequestMethod("OpenItemIdMapDelete");
  /** Variable representing the OpenItemIdMapDeleteList method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_DELETE_LIST = new OpenItemIdMapRequestMethod("OpenItemIdMapDeleteList");
  /** Variable representing the OpenItemIdMapFind method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_FIND = new OpenItemIdMapRequestMethod("OpenItemIdMapFind");
  /** Variable representing the OpenItemIdMapGet method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_GET = new OpenItemIdMapRequestMethod("OpenItemIdMapGet");
  /** Variable representing the OpenItemIdMapPriorityUpdate method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_PRIORITY_UPDATE = new OpenItemIdMapRequestMethod("OpenItemIdMapPriorityUpdate");
  /** Variable representing the OpenItemIdMapUpdate method */
  public static final OpenItemIdMapRequestMethod OPEN_ITEM_ID_MAP_UPDATE = new OpenItemIdMapRequestMethod("OpenItemIdMapUpdate");
  /** Variable representing the OrderLevelDerive method */
  public static final OpenItemIdMapRequestMethod ORDER_LEVEL_DERIVE = new OpenItemIdMapRequestMethod("OrderLevelDerive");
}
