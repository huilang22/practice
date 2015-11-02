/*
 * Generated code DO NOT EDIT
 * Generated file: ServerCategoryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServerCategoryRequestMethod implements UdtMethod {
  private String method = null;
  private ServerCategoryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServerCategoryFind method */
  public static final ServerCategoryRequestMethod SERVER_CATEGORY_FIND = new ServerCategoryRequestMethod("ServerCategoryFind");
  /** Variable representing the ServerCategoryGet method */
  public static final ServerCategoryRequestMethod SERVER_CATEGORY_GET = new ServerCategoryRequestMethod("ServerCategoryGet");
}
