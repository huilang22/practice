/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class AppNameRequestMethod implements UdtMethod {
  private String method = null;
  private AppNameRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the AppNameCreate method */
  public static final AppNameRequestMethod APP_NAME_CREATE = new AppNameRequestMethod("AppNameCreate");
  /** Variable representing the AppNameFind method */
  public static final AppNameRequestMethod APP_NAME_FIND = new AppNameRequestMethod("AppNameFind");
  /** Variable representing the AppNameGet method */
  public static final AppNameRequestMethod APP_NAME_GET = new AppNameRequestMethod("AppNameGet");
  /** Variable representing the AppNameUpdate method */
  public static final AppNameRequestMethod APP_NAME_UPDATE = new AppNameRequestMethod("AppNameUpdate");
}
