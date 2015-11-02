/*
 * Generated code DO NOT EDIT
 * Generated file: ServServiceTypeRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServServiceTypeRequestMethod implements UdtMethod {
  private String method = null;
  private ServServiceTypeRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServServiceTypeFind method */
  public static final ServServiceTypeRequestMethod SERV_SERVICE_TYPE_FIND = new ServServiceTypeRequestMethod("ServServiceTypeFind");
}
