/*
 * Generated code DO NOT EDIT
 * Generated file: ServInventoryTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServInventoryTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServInventoryTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServInventoryTypeFind method */
  public static final ServInventoryTypeRequestMethod SERV_INVENTORY_TYPE_FIND = new ServInventoryTypeRequestMethod("ServInventoryTypeFind");
}
