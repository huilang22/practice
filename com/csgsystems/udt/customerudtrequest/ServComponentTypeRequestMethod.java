/*
 * Generated code DO NOT EDIT
 * Generated file: ServComponentTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServComponentTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServComponentTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServComponentTypeFind method */
  public static final ServComponentTypeRequestMethod SERV_COMPONENT_TYPE_FIND = new ServComponentTypeRequestMethod("ServComponentTypeFind");
}
