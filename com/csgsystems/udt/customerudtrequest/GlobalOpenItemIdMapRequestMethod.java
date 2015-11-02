/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalOpenItemIdMapRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class GlobalOpenItemIdMapRequestMethod implements UdtMethod {
  private String method = null;
  private GlobalOpenItemIdMapRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the GlobalOpenItemIdMapCreate method */
  public static final GlobalOpenItemIdMapRequestMethod GLOBAL_OPEN_ITEM_ID_MAP_CREATE = new GlobalOpenItemIdMapRequestMethod("GlobalOpenItemIdMapCreate");
  /** Variable representing the GlobalOpenItemIdMapDelete method */
  public static final GlobalOpenItemIdMapRequestMethod GLOBAL_OPEN_ITEM_ID_MAP_DELETE = new GlobalOpenItemIdMapRequestMethod("GlobalOpenItemIdMapDelete");
  /** Variable representing the GlobalOpenItemIdMapFind method */
  public static final GlobalOpenItemIdMapRequestMethod GLOBAL_OPEN_ITEM_ID_MAP_FIND = new GlobalOpenItemIdMapRequestMethod("GlobalOpenItemIdMapFind");
  /** Variable representing the GlobalOpenItemIdMapGet method */
  public static final GlobalOpenItemIdMapRequestMethod GLOBAL_OPEN_ITEM_ID_MAP_GET = new GlobalOpenItemIdMapRequestMethod("GlobalOpenItemIdMapGet");
  /** Variable representing the GlobalOpenItemIdMapUpdate method */
  public static final GlobalOpenItemIdMapRequestMethod GLOBAL_OPEN_ITEM_ID_MAP_UPDATE = new GlobalOpenItemIdMapRequestMethod("GlobalOpenItemIdMapUpdate");
}
